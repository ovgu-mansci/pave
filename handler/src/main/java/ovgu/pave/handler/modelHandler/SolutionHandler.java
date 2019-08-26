package ovgu.pave.handler.modelHandler;

import java.util.List;

import ovgu.pave.handler.Handler;
import ovgu.pave.model.input.Location;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.solution.SolutionFactory;
import ovgu.pave.model.solution.SupportRouteElement;
import ovgu.pave.model.solution.UseVehicleType;
import ovgu.pave.model.solution.WayPointRouteElement;
import ovgu.pave.model.solution.RequestActivityRouteElement;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;
import ovgu.pave.model.solution.Solution;
import ovgu.pave.model.input.Vehicle;
import ovgu.pave.model.input.VehicleType;
import ovgu.pave.model.input.WayPoint;

public class SolutionHandler {

	/*
	 * 
	 * getter and setter
	 * 
	 */

	private Solution solution;

	public SolutionHandler() {
		resetSolution();
	}

	public void resetSolution() {
		solution = SolutionFactory.eINSTANCE.createSolution();
		solution.setUseVehicleType(SolutionFactory.eINSTANCE.createUseVehicleType());
	}

	public List<Request> getUnintegratedRequests() {
		return solution.getUnintegratedRequests();
	}

	public List<Request> getIntegratedRequests() {
		return solution.getIntegratedRequests();
	}

	public List<Route> getRoutes() {
		return solution.getRoutes();
	}

	public void initEmptyRoutesForVehicles(List<Vehicle> vehicles) {
		for (Vehicle vehicle : vehicles)
			solution.getRoutes().add(SolutionHandler.createRoute(vehicle));
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}

	public void setScore(long value) {
		this.solution.setScore(value);
	}

	public long getScore() {
		return this.solution.getScore();
	}

	public void saveSolution(String configOutputFolder, String filename) {
		IOHandler.saveSolution(solution, configOutputFolder, filename);
	}

	public void loadSolution(String configOutputFolder, String filename, InputHandler inputHandler) {
		solution = IOHandler.loadSolution(configOutputFolder, filename, inputHandler.getInput());
	}

	public boolean areVehicleTypesUsed() {
		return solution.getUseVehicleType().isUseVehicleTypeInsteadVehicle();
	}

	/*
	 * 
	 * instance methods
	 * 
	 */

	public void initVehicleTypes(List<VehicleType> vehicleTypes) {
		for (VehicleType vehicleType : vehicleTypes) {
			solution.getUseVehicleType().getVehicleTypes().add(vehicleType);
			solution.getUseVehicleType().getVehicleTypeIDs().add(vehicleType.getId());
			solution.getUseVehicleType().getQuantities().add(0);
		}
		solution.getUseVehicleType().setUseVehicleTypeInsteadVehicle(true);
	}

	public List<VehicleType> getVehicleTypes() {
		return solution.getUseVehicleType().getVehicleTypes();
	}

	public int getVehicleTypeQuantity(VehicleType vehicleType) {
		for (int i = 0; i < solution.getUseVehicleType().getVehicleTypes().size(); i++) {
			if (solution.getUseVehicleType().getVehicleTypes().get(i).equals(vehicleType)) {
				return solution.getUseVehicleType().getQuantities().get(i);
			}
		}
		return -1;
	}

	public void changeVehicleTypeQuantity(VehicleType vehicleType, int quantity) {
		for (int i = 0; i < solution.getUseVehicleType().getVehicleTypes().size(); i++) {
			if (solution.getUseVehicleType().getVehicleTypes().get(i).equals(vehicleType)) {
				solution.getUseVehicleType().getQuantities().set(i, quantity);
			}
		}
	}

	public Solution copySolution() {
		return copySolution(false);
	}

	public Solution copyEmptySolution() {
		return copySolution(true);
	}

	private Solution copySolution(boolean reset) {
		Solution copy = SolutionFactory.eINSTANCE.createSolution();
		copy.setUseVehicleType(copyUseVehicleType(solution.getUseVehicleType()));

		for (Route route : solution.getRoutes())
			copy.getRoutes().add(copyRoute(route, copy.getUseVehicleType().isUseVehicleTypeInsteadVehicle(), reset));

		if (!reset) {
			copy.setScore(solution.getScore());
			copy.getUnintegratedRequests().addAll(solution.getUnintegratedRequests());
			copy.getIntegratedRequests().addAll(solution.getIntegratedRequests());
		}
		return copy;
	}

	private UseVehicleType copyUseVehicleType(UseVehicleType useVehicleType) {
		UseVehicleType copy = SolutionFactory.eINSTANCE.createUseVehicleType();
		copy.setUseVehicleTypeInsteadVehicle(useVehicleType.isUseVehicleTypeInsteadVehicle());
		copy.getVehicleTypes().addAll(useVehicleType.getVehicleTypes());
		copy.getVehicleTypeIDs().addAll(useVehicleType.getVehicleTypeIDs());
		copy.getQuantities().addAll(useVehicleType.getQuantities());
		return copy;
	}

	/*
	 * 
	 * static methods
	 * 
	 */

	public static Route createRoute(Vehicle vehicle) {
		Route route = SolutionFactory.eINSTANCE.createRoute();
		route.setVehicle(vehicle);
		route.setVehicleID(vehicle.getId());
		return route;
	}

	public static Route createRoute(VehicleType vehicleType) {
		Route route = SolutionFactory.eINSTANCE.createRoute();
		route.setVehicleType(vehicleType);
		route.setVehicleTypeID(vehicleType.getId());
		return route;
	}

	public static RequestActivityRouteElement createRequestActivityRouteElement(RequestActivity activity) {
		RequestActivityRouteElement routeElement = SolutionFactory.eINSTANCE.createRequestActivityRouteElement();
		routeElement.setRequestActivity(activity);
		routeElement.setServiceDuration(activity.getServiceDuration());
		routeElement.setRequestActivityID(activity.getId());
		return routeElement;
	}

	public static SupportRouteElement createSupportRouteElement(Location location) {
		SupportRouteElement routeElement = SolutionFactory.eINSTANCE.createSupportRouteElement();
		routeElement.setLocation(location);
		if (location == null)
			routeElement.setLocationID(0);
		else
			routeElement.setLocationID(location.getId());
		return routeElement;
	}

	public static WayPointRouteElement createWaypointRouteElement(WayPoint wayPoint) {
		WayPointRouteElement routeElement = SolutionFactory.eINSTANCE.createWayPointRouteElement();
		routeElement.setWayPoint(wayPoint);
		routeElement.setWayPointID(wayPoint.getId());
		return routeElement;
	}

	protected static Route copyRoute(Route route, boolean useVehicleType, boolean reset) {
		Route copy;
		if (useVehicleType)
			copy = createRoute(route.getVehicleType());
		else
			copy = createRoute(route.getVehicle());

		if (!reset) {
			for (RouteElement routeElement : route.getRouteElements())
				copy.getRouteElements().add(copyRouteElement(routeElement));
		}
		return copy;
	}

	private static RouteElement copyRouteElement(RouteElement routeElement) {
		RouteElement copy = SolutionFactory.eINSTANCE.createRouteElement();
		if (isRequestActivityRouteElement(routeElement)) {
			RequestActivity activity = ((RequestActivityRouteElement) routeElement).getRequestActivity();
			copy = createRequestActivityRouteElement(activity);
		} else if (isSupportRouteElement(routeElement)) {
			Location location = ((SupportRouteElement) routeElement).getLocation();
			copy = createSupportRouteElement(location);
		} else if (isWayPointRouteElement(routeElement)) {
			WayPoint wayPoint = ((WayPointRouteElement) routeElement).getWayPoint();
			copy = createWaypointRouteElement(wayPoint);
		}

		copy.setServiceBegin(routeElement.getServiceBegin());
		copy.setServiceDuration(routeElement.getServiceDuration());
		return copy;
	}

	public static int getRouteElementIndex(Route route, RouteElement routeElement) {
		for (int i = 0; i < route.getRouteElements().size(); i++)
			if (route.getRouteElements().get(i) == routeElement)
				return i;
		return -1;
	}

	public static void insertActivity(Route route, RequestActivity activity, int index) {
		route.getRouteElements().add(index, createRequestActivityRouteElement(activity));
	}

	public static void insertRouteElement(Route route, RouteElement routeElement, int index) {
		route.getRouteElements().add(index, routeElement);
	}
	
	public static void insertRequest(Route route, Request request, int indexFirstActivity, int indexSecondActivity) {

		if (request.getSecondActivity() != null) {
			insertActivity(route, request.getSecondActivity(), indexSecondActivity);
		}
		insertActivity(route, request.getFirstActivity(), indexFirstActivity);
	}

	public static int findRouteElementIndex(Route route, RequestActivity requestActivity) {

		for (int i = 0; i < route.getRouteElements().size(); i++) {
			RouteElement routeElement = route.getRouteElements().get(i);
			if (isRequestActivityRouteElement(routeElement)) {
				RequestActivity foundRequestActivity = ((RequestActivityRouteElement) routeElement)
						.getRequestActivity();
				if (foundRequestActivity == requestActivity)
					return i;
			}
		}
		return -1;
	}

	public static RouteElement findRouteElement(Route route, RequestActivity requestActivity) {
		int index = findRouteElementIndex(route, requestActivity);
		if (index == -1)
			return null;
		else
			return route.getRouteElements().get(index);
	}

	public static int removeRequestFromRoute(Request request, Route route) {

		int indexFirstActivity = findRouteElementIndex(route, request.getFirstActivity());
		route.getRouteElements().remove(indexFirstActivity);

		if (request.getSecondActivity() != null) {
			int indexSecondActivity = findRouteElementIndex(route, request.getSecondActivity());
			route.getRouteElements().remove(indexSecondActivity);
		}
		return indexFirstActivity;
	}

	public static WayPoint getWayPoint(RouteElement routeElement) {
		return ((WayPointRouteElement) routeElement).getWayPoint();

	}

	public static RequestActivity getRequestActivity(RouteElement routeElement) {
		return ((RequestActivityRouteElement) routeElement).getRequestActivity();
	}

	public static Request getRequest(RouteElement routeElement) {
		return getRequestActivity(routeElement).getRequest();
	}

	public static Location getLocation(RouteElement routeElement) {
		if (isRequestActivityRouteElement(routeElement))
			return ((RequestActivityRouteElement) routeElement).getRequestActivity().getLocation();
		else if (isSupportRouteElement(routeElement))
			return ((SupportRouteElement) routeElement).getLocation();
		else
			return null;
	}

	public static double getLatitude(RouteElement routeElement) {
		if (isRequestActivityRouteElement(routeElement))
			return ((RequestActivityRouteElement) routeElement).getRequestActivity().getLocation().getLat();
		else if (isSupportRouteElement(routeElement))
			return ((SupportRouteElement) routeElement).getLocation().getLat();
		else if (isWayPointRouteElement(routeElement))
			return ((WayPointRouteElement) routeElement).getWayPoint().getLat();
		else
			return -1;
	}

	public static double getLongitude(RouteElement routeElement) {
		if (isRequestActivityRouteElement(routeElement))
			return ((RequestActivityRouteElement) routeElement).getRequestActivity().getLocation().getLon();
		else if (isSupportRouteElement(routeElement))
			return ((SupportRouteElement) routeElement).getLocation().getLon();
		else if (isWayPointRouteElement(routeElement))
			return ((WayPointRouteElement) routeElement).getWayPoint().getLon();
		else
			return -1;
	}

	public static <T> boolean isRouteElement(T object) {
		return object instanceof RouteElement;
	}

	public static <T> boolean isRequestActivityRouteElement(T object) {
		return object instanceof RequestActivityRouteElement;
	}

	public static <T> boolean isSupportRouteElement(T object) {
		return object instanceof SupportRouteElement;
	}

	public static <T> boolean isWayPointRouteElement(T object) {
		return object instanceof WayPointRouteElement;
	}

	public static <T> boolean isRequestActivity(T object) {
		return object instanceof RequestActivity;
	}

	public static long getServiceEnd(Route route, int index) {
		return route.getRouteElements().get(index).getServiceBegin()
				+ route.getRouteElements().get(index).getServiceDuration();
	}

	public static <T1, T2> long getArrivalTime(T1 from, T2 to, Long serviceEnd) {				
		return serviceEnd + Handler.getNetwork().getTravelDuration(from, to);
	}
	
	public static <T1, T2> long getServiceBegin(T1 from, T2 to, Long serviceEnd) { 
		
		long arrivalTime = getArrivalTime(from, to, serviceEnd);
		
		RequestActivity requestActivity;
		if (isRequestActivityRouteElement(to))
			requestActivity = getRequestActivity((RouteElement) to);
		else if (isRequestActivity(to)) {
			requestActivity = (RequestActivity) to;
		} else {
			return arrivalTime;
		}
		
		if (arrivalTime < requestActivity.getEarliestArrival())
			arrivalTime = requestActivity.getEarliestArrival();
		return arrivalTime;
	}

	public static int getChangeInQuantity(RequestActivity requestActivity) {
		int quantity = 0;
		if (InputHandler.isFirstRequestActivity(requestActivity))
			quantity = ((RequestActivity) requestActivity).getRequest().getQuantity();
		else
			quantity = -((RequestActivity) requestActivity).getRequest().getQuantity();

		return quantity;
	}
}
