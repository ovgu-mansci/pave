package ovgu.pave.core.algorithm;

import org.eclipse.emf.common.util.EList;

import ovgu.pave.core.algorithm.lns.LMNS;
import ovgu.pave.core.algorithm.lns.insertion.InsertionHeuristics;
import ovgu.pave.core.algorithm.lns.utilities.InitializeRoutes;
import ovgu.pave.core.algorithm.lns.utilities.RouteUpdater;
import ovgu.pave.core.algorithm.lns.utilities.RunThreads;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.WayPoint;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.Solution;

public class AlgorithmsOnlineHandler {

	private enum Algorithm {
		INSERTION, LMNS
	}

	private enum VehicleMovementType {
		NONE, CUSTOMERS, WAYPOINTS
	}

	private static String algorithm;
	private static String vehicleMovementType;
	private static Solution lastSolution;
	private static Solution finalSolution;

	public static void run() {

		algorithm = Handler.getInput().getConfig().getAlgorithm().getAlgorithm();
		vehicleMovementType = Handler.getInput().getConfig().getExperiment().getOnline().getVehicleMovementType();
		 boolean minAcceptanceProbability = Handler.getInput().getConfig().getExperiment().getOnline().isPreAcceptanceDecisions();

		initializeRoutes();
		lastSolution = Handler.getSolution().copySolution();

		if (VehicleMovementType.valueOf(vehicleMovementType) != VehicleMovementType.NONE) {
			finalSolution = Handler.getSolution().copyEmptySolution();
		}

		if (VehicleMovementType.valueOf(vehicleMovementType) == VehicleMovementType.WAYPOINTS) {
			Handler.getNetwork().initShortestPath(Handler.getInput().getConfig().getShortestPath());
		}

		RunThreads.createThreadPool();
		Handler.getAlgorithmObjects().updateSearchDuration(System.nanoTime());

		while (!Handler.getInput().getNewRequests().isEmpty()) {
			
			Request request = Handler.getInput().getNewRequests().remove(0);

			if (minAcceptanceProbability && request.isPreRejected())
				Handler.getInput().getRejectedRequests().add(request);
			else {
				if (VehicleMovementType.valueOf(vehicleMovementType) != VehicleMovementType.NONE) {
					updateVehicleLocations(request);
				}
				lastSolution = Handler.getSolution().copySolution();
				Handler.getSolution().getUnintegratedRequests().add(request);
				switch (Algorithm.valueOf(algorithm)) {
				case INSERTION:
					requestAcceptance(request, runInsertion());
					break;
				case LMNS:
					requestAcceptance(request, runLMNS());
					break;
				default:
					System.out.println("The selected algorithm is not available for an online VRP");
					break;
				}
			}
		}

		Handler.getAlgorithmObjects()
				.updateSearchDuration(System.nanoTime() - Handler.getAlgorithmObjects().getSearchDuration());
		RunThreads.shutDownThreadPool();

		if (VehicleMovementType.valueOf(vehicleMovementType) != VehicleMovementType.NONE) {
			finalizeSolution(finalSolution);
		}
	}

	private static void requestAcceptance(Request request, boolean accepted) {
		if (accepted) {
			Handler.getInput().getAcceptedRequests().add(request);
		} else {
			Handler.getInput().getRejectedRequests().add(request);
			Handler.getSolution().setSolution(lastSolution);
		}
	}

	private static void initializeRoutes() {
		InitializeRoutes.depotStartEnd();
		Handler.getAlgorithmObjects().createRemovalInformation();
	}

	private static boolean runInsertion() {
		InsertionHeuristics.insertRequests(InputHandler.createHeuristic("GLOBALMINCOST", 0));
		if (Handler.getSolution().getUnintegratedRequests().isEmpty())
			return true;
		return false;
	}

	private static boolean runLMNS() {
		return LMNS.performInsertion();
	}

	private static void updateVehicleLocations(Request request) {

		for (int i = 0; i < Handler.getSolution().getRoutes().size(); i++) {
			Route route = Handler.getSolution().getRoutes().get(i);

			if (SolutionHandler.isWayPointRouteElement(route.getElement(0)) && route.getRouteElements().size() > 2
					&& lastSolution.getRoutes().get(i).getRouteElements().size() > 2
					&& SolutionHandler.getRequestActivity(route.getElement(1)) != SolutionHandler
							.getRequestActivity(lastSolution.getRoutes().get(i).getElement(1))) {
				Handler.getAlgorithmObjects().increaseOnTheFlyRescheduling();
			}

			while (route.getRouteElements().size() > 2
					&& route.getElement(1).getServiceBegin() < request.getRequestTime()) {
				finalSolution.getRoutes().get(i).getRouteElements().add(route.getRouteElements().remove(0));
			}

			if (SolutionHandler.getServiceEnd(route, 0) < request.getRequestTime()) {
				if (route.getRouteElements().size() == 2) {
					if (SolutionHandler.isRequestActivityRouteElement(route.getElement(0))) {
						route.getRouteElements().add(1, SolutionHandler.createSupportRouteElement(
								SolutionHandler.getRequestActivity(route.getElement(0)).getLocation()));
						route.getElement(1).setServiceBegin(SolutionHandler.getServiceEnd(route, 0));
						finalSolution.getRoutes().get(i).getRouteElements().add(route.getRouteElements().remove(0));
					}
					route.getElement(0).setServiceDuration(route.getElement(0).getServiceDuration()
							+ (request.getRequestTime() - SolutionHandler.getServiceEnd(route, 0)));
				} else {
					if (VehicleMovementType.valueOf(vehicleMovementType) == VehicleMovementType.WAYPOINTS)
						insertWayPointElement(route, request.getRequestTime());
					finalSolution.getRoutes().get(i).getRouteElements().add(route.getRouteElements().remove(0));
				}
			}
		}
	}

	private static void insertWayPointElement(Route route, long time) {
		EList<WayPoint> waypoints = Handler.getNetwork().getEdge(route.getElement(0), route.getElement(1))
				.getWaypoints();
		for (int i = 1; i < waypoints.size() - 1; i++) {
			if (SolutionHandler.getServiceEnd(route, 0)
					+ Handler.getNetwork().getTravelDuration(route.getElement(0), waypoints.get(i)) > time) {
				Handler.getAlgorithmObjects().increaseWayPoints();
				route.getRouteElements().add(1, SolutionHandler.createWaypointRouteElement(waypoints.get(i)));
				route.getElement(1).setServiceBegin(SolutionHandler.getServiceEnd(route, 0)
						+ Handler.getNetwork().getTravelDuration(route.getElement(0), route.getElement(1)));
				RouteUpdater.updateServiceBeginnAll("wayPoint insertion", route, 1);
				break;
			}
		}
	}

	private static void finalizeSolution(Solution solution) {
		for (int i = 0; i < Handler.getSolution().getRoutes().size(); i++) {
			Route route = Handler.getSolution().getRoutes().get(i);
			while (route.getRouteElements().size() > 0) {
				solution.getRoutes().get(i).getRouteElements().add(route.getRouteElements().remove(0));
			}
		}
		Handler.getSolution().setSolution(solution);
	}
}
