package ovgu.pave.handler.modelHandler;

import java.util.List;

import ovgu.pave.model.config.Config;
import ovgu.pave.model.config.ConfigFactory;
import ovgu.pave.model.config.Heuristic;
import ovgu.pave.model.input.SecondRequestActivity;
import ovgu.pave.model.input.Edge;
import ovgu.pave.model.input.Input;
import ovgu.pave.model.input.Location;
import ovgu.pave.model.input.FirstRequestActivity;
import ovgu.pave.model.input.InputFactory;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.input.Vehicle;
import ovgu.pave.model.input.VehicleType;
import ovgu.pave.model.input.WayPoint;
import ovgu.pave.model.solution.Solution;

public class InputHandler {

	/*
	 * 
	 * getter and setter
	 * 
	 */

	private Input input = InputFactory.eINSTANCE.createInput();
	private Config config = ConfigFactory.eINSTANCE.createConfig();

	public InputHandler() {
		input.setRequests(InputFactory.eINSTANCE.createRequests()); 
		config.setExperiment(ConfigFactory.eINSTANCE.createExperiment());
		config.getExperiment().setOffline(ConfigFactory.eINSTANCE.createOffline());
		config.getExperiment().setOnline(ConfigFactory.eINSTANCE.createOnline());
		config.setAlgorithm(ConfigFactory.eINSTANCE.createAlgorithm());
		config.getAlgorithm().setOrtools(ConfigFactory.eINSTANCE.createORTOOLS());
		config.getAlgorithm().setLns(ConfigFactory.eINSTANCE.createLNS());
		config.getAlgorithm().getLns().setAlns(ConfigFactory.eINSTANCE.createALNS());
		config.getAlgorithm().getLns().setLmns(ConfigFactory.eINSTANCE.createLMNS());
		config.getAlgorithm().getLns().getAlns().setRws(ConfigFactory.eINSTANCE.createRWS());
		config.setShortestPath(ConfigFactory.eINSTANCE.createShortestPath());
		config.getShortestPath().setGraphhopper(ConfigFactory.eINSTANCE.createGraphHopper());
	}

	public Config getConfig() {
		return config;
	}

	public List<Location> getLocations() {
		return input.getLocations();
	}

	public List<Request> getNewRequests() {
		return input.getRequests().getNew();
	}

	public List<Request> getAcceptedRequests() {
		return input.getRequests().getAccepted();
	}
	
	public List<Request> getRejectedRequests() {
		return input.getRequests().getRejected();
	}
		
	public List<Vehicle> getVehicles() {
		return input.getVehicles();
	}
	
	public Solution getSolution() {
		return input.getSolution();
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public void clearEdges() {
		this.input.getEdges().clear();
	}

	public void addEdge(Edge edge) {
		this.input.getEdges().add(edge);
	}

	public List<VehicleType> getVehicleTypes() {
		return input.getVehicleTypes();
	}

	protected List<Edge> getEdges() {
		return this.input.getEdges();
	}

	protected Input getInput() {
		return this.input;
	}

	/*
	 * 
	 * instance methods
	 * 
	 */

	public void saveConfig(String path) {
		IOHandler.saveConfig(config, path);
	}

	public void loadConfig(String path) {
		config = IOHandler.loadConfig(path);
	}

	public void saveInput(String filename) {
		IOHandler.saveInput(input, config.getInputFolder(), filename);
	}

	public void loadInput(String filename) {
		input = IOHandler.loadInput(config.getInputFolder(), filename);
	}

	public void loadInput() {
		input = IOHandler.loadInput(config.getInputFolder(), config.getInputFilename());
	}

	/*
	 * 
	 * static methods
	 * 
	 */

	public static Heuristic createHeuristic(String heuristicName, int noise) {
		Heuristic heuristic = ConfigFactory.eINSTANCE.createHeuristic();
		heuristic.setHeuristicName(heuristicName);
		heuristic.setNoise(noise);
		return heuristic;
	}

	public static Location createLocation(int id, double lat, double lon) {
		Location location = InputFactory.eINSTANCE.createLocation();
		location.setId(id);
		location.setLat(lat);
		location.setLon(lon);
		return location;
	}

	public static Edge createEdge(Location startLocation, Location endLoccation) {
		Edge edge = InputFactory.eINSTANCE.createEdge();
		edge.setId("f." + startLocation.getId() + ".t." + endLoccation.getId());
		edge.setStartLocation(startLocation);
		edge.setEndLocation(endLoccation);
		return edge;
	}

	public static WayPoint createWayPoint(String idOfEdge, int idInEdge, double lat, double lon, double distance,
			long duration) {
		WayPoint wayPoint = InputFactory.eINSTANCE.createWayPoint();
		wayPoint.setId(idOfEdge + "-wp-" + idInEdge);
		wayPoint.setDistance(distance);
		wayPoint.setDuration(duration);
		wayPoint.setLat(lat);
		wayPoint.setLon(lon);
		return wayPoint;
	}

	@SuppressWarnings("unchecked")
	protected static <T extends RequestActivity> T createRequestActivity(Class<T> activityClass) {
		RequestActivity activity = InputFactory.eINSTANCE.createRequestActivity();
		if (activityClass.equals(FirstRequestActivity.class))
			activity = InputFactory.eINSTANCE.createFirstRequestActivity();
		else if (activityClass.equals(SecondRequestActivity.class))
			activity = InputFactory.eINSTANCE.createSecondRequestActivity();
		return (T) activity;
	}

	public static Request createRequest(int id, Location firstActivityLocation, Location secondActivityLocation, int quantity) {
		Request request = createRequest(id, firstActivityLocation, secondActivityLocation);
		request.setQuantity(quantity);
		return request;
	}

	public static Request createRequest(int id, Location firstActivityLocation, Location secondActivityLocation) {
		Request request = InputFactory.eINSTANCE.createRequest();
		request.setId(id);
		if (firstActivityLocation != null)
			request.setFirstActivity(createRequestActivity(FirstRequestActivity.class, request, firstActivityLocation));
		if (secondActivityLocation != null)
			request.setSecondActivity(
					createRequestActivity(SecondRequestActivity.class, request, secondActivityLocation));
		return request;
	}

	@SuppressWarnings("unchecked")
	protected static <T extends RequestActivity> T createRequestActivity(Class<T> activityClass, Request request,
			Location location) {

		RequestActivity activity = createRequestActivity(activityClass);
		if (isFirstRequestActivity(activity))
			activity.setId("" + request.getId() + "-o");
		if (isSecondRequestActivity(activity))
			activity.setId(request.getId() + "-d");

		activity.setLocation(location);
		activity.setRequest(request);

		return (T) activity;
	}

	public static VehicleType createVehicleType(int id, int capacity) {
		VehicleType vehicleType = InputFactory.eINSTANCE.createVehicleType();
		vehicleType.setId(id);
		vehicleType.setCapacity(capacity);
		return vehicleType;
	}

	public static Vehicle createVehicle(int id, VehicleType vehicleType, Location startLocation, Location endLocation) {
		Vehicle vehicle = InputFactory.eINSTANCE.createVehicle();
		vehicle.setId(id);
		vehicle.setType(vehicleType);
		vehicle.setStartLocation(startLocation);
		vehicle.setEndLocation(endLocation);
		return vehicle;
	}
	
	public static Vehicle createVehicle(int id, VehicleType vehicleType, Location startLocation, Location endLocation,
			long latestArrival) {
		Vehicle vehicle = InputFactory.eINSTANCE.createVehicle();
		vehicle.setId(id);
		vehicle.setType(vehicleType);
		vehicle.setStartLocation(startLocation);
		vehicle.setEndLocation(endLocation);
		vehicle.setLatestArrival(latestArrival);
		return vehicle;
	}
	
	public static <T> boolean isRequest(T object) {
		return object instanceof Request;
	}

	public static <T> boolean isRequestActivity(T object) {
		return object instanceof RequestActivity;
	}

	public static <T> boolean isFirstRequestActivity(T object) {
		return object instanceof FirstRequestActivity;
	}

	public static <T> boolean isSecondRequestActivity(T object) {
		return object instanceof SecondRequestActivity;
	}

	public VehicleType findVehicleType(int id) {
		return findVehicleType(this.getVehicleTypes(), id);
	}

	public Vehicle findVehicle(int id) {
		return findVehicle(this.getVehicles(), id);
	}

	public Location findLocation(int id) {
		return findLocation(this.getLocations(), id);
	}

	public RequestActivity findAcceptedRequestActivity(String id) {
		return findRequestActivity(this.getAcceptedRequests() , id);
	}

	public Request findAcceptedRequest(int id) {
		return findRequest(this.getAcceptedRequests(), id);
	}

	public WayPoint findWayPoint(String id) {
		return findWayPoint(this.getEdges(), id);
	}

	public static VehicleType findVehicleType(List<VehicleType> vehicleTypes, int id) {
		if (id < vehicleTypes.size() && vehicleTypes.get(id).getId() == id)
			return vehicleTypes.get(id);

		for (VehicleType vehicleType : vehicleTypes)
			if (vehicleType.getId() == id)
				return vehicleType;

		return null;
	}

	public static Vehicle findVehicle(List<Vehicle> vehicles, int id) {
		if (id < vehicles.size() && vehicles.get(id).getId() == id)
			return vehicles.get(id);

		for (Vehicle vehicle : vehicles)
			if (vehicle.getId() == id)
				return vehicle;

		return null;
	}

	public static Location findLocation(List<Location> locations, int id) {
		if (id < locations.size() && locations.get(id).getId() == id)
			return locations.get(id);

		for (Location location : locations)
			if (location.getId() == id)
				return location;

		return null;
	}

	public static RequestActivity findRequestActivity(List<Request> requests, String id) {
		String[] idParts = id.split("-");
		Request request;
		try {
			request = findRequest(requests, Integer.parseInt(idParts[0]));
			if (idParts[1].equals("o"))
				if (request.getFirstActivity().getId().equals(id))
					return request.getFirstActivity();
			if (idParts[1].equals("d"))
				if (request.getSecondActivity().getId().equals(id))
					return request.getSecondActivity();
			return null;
		} catch (NumberFormatException e) {
			return null;
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	public static Request findRequest(List<Request> requests, int id) {
		if (id < requests.size() && requests.get(id).getId() == id)
			return requests.get(id);

		for (Request request : requests)
			if (request.getId() == id)
				return request;

		return null;
	}
	
	protected static WayPoint findWayPoint(List<Edge> edges, String id) {
		String[] idParts = id.split("-");
		Edge edge = findEdge(edges, idParts[0]);

		try {
			if (edge == null || Integer.parseInt(idParts[2]) >= edge.getWaypoints().size())
				return null;

			if (id.equals(edge.getWaypoints().get(Integer.parseInt(idParts[2])).getId()))
				return edge.getWaypoints().get(Integer.parseInt(idParts[2]));

			for (WayPoint wayPoint : edge.getWaypoints())
				if (id.equals(wayPoint.getId()))
					return wayPoint;

			return null;
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	private static Edge findEdge(List<Edge> edges, String id) {
		for (Edge edge : edges)
			if (edge.getId().equals(id))
				return edge;
		return null;
	}
}
