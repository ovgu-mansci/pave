package ovgu.pave.core.algorithm.ortools;

import com.google.ortools.constraintsolver.Assignment;
import com.google.ortools.constraintsolver.FirstSolutionStrategy;
import com.google.ortools.constraintsolver.LocalSearchMetaheuristic;
import com.google.ortools.constraintsolver.RoutingDimension;
import com.google.ortools.constraintsolver.RoutingIndexManager;
import com.google.ortools.constraintsolver.RoutingModel;
import com.google.ortools.constraintsolver.RoutingSearchParameters;
import com.google.ortools.constraintsolver.Solver;
import com.google.ortools.constraintsolver.main;
import com.google.protobuf.Duration;

import ovgu.pave.core.algorithm.lns.utilities.RouteUpdater;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.config.ORTOOLS;
import ovgu.pave.model.input.Location;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.solution.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.logging.Logger;

//A pair class

class Pair<K, V> {
	final K first;
	final V second;

	public static <K, V> Pair<K, V> of(K element0, V element1) {
		return new Pair<K, V>(element0, element1);
	}

	public Pair(K element0, V element1) {
		this.first = element0;
		this.second = element1;
	}
}

/**
 * Solves a capacitated dial a ride problem
 * with time windows using the swig-wrapped version of the vehicle routing
 * library in src/constraint_solver.
 */
public class CapacitatedDialARideProblemWithTimeWindows {

	static {
		System.loadLibrary("jniortools");
	}

	private static Logger logger = Logger.getLogger(CapacitatedDialARideProblemWithTimeWindows.class.getName());
	// Locations representing either an activity location or a vehicle route
	// start/end.
	private List<Location> locations = new ArrayList<Location>();
	private List<RequestActivity> activities = new ArrayList<RequestActivity>();

	// Quantity to be picked up for each activity.
	private List<Integer> activityDemands = new ArrayList<Integer>();
	// Time window in which each activity must be performed.
	private List<Pair<Integer, Integer>> activityTimeWindows = new ArrayList<Pair<Integer, Integer>>();
	// Penalty cost "paid" for dropping an activity.
	private List<Integer> activityPenalties = new ArrayList<Integer>();

	// Capacity of the vehicles.
	private int vehicleCapacity = 0;
	// Latest time at which each vehicle must end its tour.
	private List<Integer> vehicleEndTime = new ArrayList<Integer>();
	// Vehicle start and end indices. They have to be implemented as int[] due
	// to the available SWIG-ed interface.
	private int vehicleStarts[];
	private int vehicleEnds[];

	/**
	 * Creates a Manhattan Distance evaluator with 'costCoefficient'.
	 *
	 * @param manager         Node Index Manager.
	 * @param costCoefficient The coefficient to apply to the evaluator.
	 */
	private LongBinaryOperator buildNetworkCallback(RoutingIndexManager manager) {
		return new LongBinaryOperator() {
			public long applyAsLong(long firstIndex, long secondIndex) {
				try {
					int firstNode = manager.indexToNode(firstIndex);
					int secondNode = manager.indexToNode(secondIndex);

					Location firstLocation = locations.get(firstNode);
					Location secondLocation = locations.get(secondNode);

					if (secondNode >= activities.size())
						return 0;
					else if (firstNode < activities.size())
						return activities.get(firstNode).getServiceDuration()
								+ Handler.getNetwork().getTravelDuration(firstLocation, secondLocation);

					return Handler.getNetwork().getTravelDuration(firstLocation, secondLocation);
				} catch (Throwable throwed) {
					logger.warning(throwed.getMessage());
					return 0;
				}
			}
		};
	}

	/**
	 * Creates request data.
	 */
	private void buildRequests() {
		logger.info("Building requests.");

		List<Request> requests = Handler.getSolution().getUnintegratedRequests();

		for (Request request : requests) {
			buildActivity(request.getFirstActivity());
			buildActivity(request.getSecondActivity());
		}
	}

	private void buildActivity(RequestActivity requestActivity) {

		locations.add(requestActivity.getLocation());
		activityDemands.add(SolutionHandler.getChangeInQuantity(requestActivity));
		activityTimeWindows
				.add(Pair.of((int) requestActivity.getEarliestArrival(), (int) requestActivity.getLatestArrival()));
		activityPenalties.add(requestActivity.getRequest().getPenaltie());
		activities.add(requestActivity);
	}

	/**
	 * Creates fleet data.
	 */
	private void buildFleet() {
		logger.info("Building fleet.");
		int numberOfVehicles = Handler.getInput().getVehicles().size();
		vehicleCapacity = Handler.getInput().getVehicleTypes().get(0).getCapacity();
		vehicleStarts = new int[numberOfVehicles];
		vehicleEnds = new int[numberOfVehicles];
		for (int i = 0; i < numberOfVehicles; ++i) {
			vehicleStarts[i] = locations.size();
			locations.add(Handler.getInput().getVehicles().get(i).getStartLocation());
			vehicleEnds[i] = locations.size();
			locations.add(Handler.getInput().getVehicles().get(i).getStartLocation());
			vehicleEndTime.add(Integer.MAX_VALUE);
		}
	}

	/** Solves the current routing problem. */
	private void solve() {
		logger.info("Creating model");
		
	   ORTOOLS config = Handler.getInput().getConfig().getAlgorithm().getOrtools();
		
		// Finalizing model
		final int numberOfActivities = activities.size();
		final int numberOfVehicles = Handler.getInput().getVehicles().size();
		final int numberOfLocations = locations.size();

		RoutingIndexManager manager = new RoutingIndexManager(numberOfLocations, numberOfVehicles, vehicleStarts,
				vehicleEnds);
		RoutingModel model = new RoutingModel(manager);

		// Setting up dimensions
		final int bigNumber = Integer.MAX_VALUE;
		final LongBinaryOperator callback = buildNetworkCallback(manager);
		final String timeStr = "time";
		model.addDimension(model.registerTransitCallback(callback), bigNumber, bigNumber, false, timeStr);
		RoutingDimension timeDimension = model.getMutableDimension(timeStr);

		LongUnaryOperator demandCallback = new LongUnaryOperator() {
			public long applyAsLong(long index) {
				try {
					int node = manager.indexToNode(index);
					if (node < numberOfActivities) {
						return activityDemands.get(node);
					}
					return 0;
				} catch (Throwable throwed) {
					logger.warning(throwed.getMessage());
					return 0;
				}
			}
		};
		final String capacityStr = "capacity";
		model.addDimension(model.registerUnaryTransitCallback(demandCallback), 0, vehicleCapacity, true, capacityStr);

		// Setting up vehicles
		LongBinaryOperator[] callbacks = new LongBinaryOperator[numberOfVehicles];
		for (int vehicle = 0; vehicle < numberOfVehicles; ++vehicle) {
			callbacks[vehicle] = buildNetworkCallback(manager);
			final int vehicleCost = model.registerTransitCallback(callbacks[vehicle]);
			model.setArcCostEvaluatorOfVehicle(vehicleCost, vehicle);
			timeDimension.cumulVar(model.end(vehicle)).setMax(vehicleEndTime.get(vehicle));
		}

		// Setting up activities
		for (int activity = 0; activity < numberOfActivities; ++activity) {
			timeDimension.cumulVar(activity).setRange(activityTimeWindows.get(activity).first,
					activityTimeWindows.get(activity).second);
			long[] activityIndices = { manager.nodeToIndex(activity) };
			model.addDisjunction(activityIndices, activityPenalties.get(activity));
		}

		// Define Transportation Requests.
		// [START pickup_delivery_constraint]
		Solver solver = model.solver();

		for (int i = 0; i < numberOfActivities; i++) {
			if (i % 2 == 0) {
				long pickupIndex = manager.nodeToIndex(i);
				long deliveryIndex = manager.nodeToIndex(i + 1);
				model.addPickupAndDelivery(pickupIndex, deliveryIndex);
				solver.addConstraint(
						solver.makeEquality(model.vehicleVar(pickupIndex), model.vehicleVar(deliveryIndex)));
			}
		}
		// [END pickup_delivery_constraint]

		// Setting first solution heuristic.
		// [START parameters]
		RoutingSearchParameters searchParameters = main.defaultRoutingSearchParameters().toBuilder()		
				.setFirstSolutionStrategy(FirstSolutionStrategy.Value.valueOf(config.getFirstSolutionStrategy()))
				.setLocalSearchMetaheuristic(LocalSearchMetaheuristic.Value.valueOf(config.getLocalSearchMetaheuristic()))
				.setTimeLimit(Duration.newBuilder().setSeconds(config.getMaxCalculationTime()).build())
				.setLogSearch(false).build(); 
		// [END parameters]

		// Solve the problem.
		// [START solve]
		logger.info("Search");
		Assignment solution = model.solveWithParameters(searchParameters);
		// [END solve]

		// Translate solution
		Handler.getSolution().initEmptyRoutesForVehicles(Handler.getInput().getVehicles());
		if (solution != null) {
			for (int i = 0; i < Handler.getInput().getVehicles().size(); i++) {
				Route route = Handler.getSolution().getRoutes().get(i);
				long activity = model.start(i);
				int node;
				
				for (; !model.isEnd(activity); activity = solution.value(model.nextVar(activity))) {
					node = manager.indexToNode(activity);
					if (node < activities.size()) {
						route.getRouteElements().add(SolutionHandler.createRequestActivityRouteElement(activities.get(node)));
						Handler.getSolution().getIntegratedRequests().add(activities.get(node).getRequest());
						Handler.getSolution().getUnintegratedRequests().remove(activities.get(node).getRequest());
					} else {
						route.getRouteElements().add(SolutionHandler.createSupportRouteElement(locations.get(node)));
					}
				}
				RouteUpdater.updateServiceBeginnAll("using ortools", route, 1);
			}
		} else
			System.out.println("Solution equals null");
	}

	public static void solveCDARPTW() {

		CapacitatedDialARideProblemWithTimeWindows problem = new CapacitatedDialARideProblemWithTimeWindows();

		problem.buildRequests();
		problem.buildFleet();
		problem.solve();
	}
}
