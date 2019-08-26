package ovgu.pave.handler.shortestPath;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.graphhopper.GHRequest;
import com.graphhopper.GHResponse;
import com.graphhopper.reader.osm.GraphHopperOSM;
import com.graphhopper.routing.util.EncodingManager;
import com.graphhopper.util.Instruction;

import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.model.input.WayPoint;

public class GraphHopperShortestPath implements ShortestPath {

	private GraphHopperOSM gHopper;
	private String weighting;
	private String vehicleType;
	private GHResponse ghResponse;

	public GraphHopperShortestPath(ovgu.pave.model.config.GraphHopper graphHopperConfig) {
		gHopper = new GraphHopperOSM();
		gHopper.setOSMFile(graphHopperConfig.getOsmFilePath());
		gHopper.setGraphHopperLocation(graphHopperConfig.getGraphFolder());
		weighting = graphHopperConfig.getWeighting();
		vehicleType = graphHopperConfig.getVehicleType();
		gHopper.setEncodingManager(EncodingManager.create(vehicleType));
		gHopper.importOrLoad();
	}

	@Override
	public void generateShortestPath(double fromLat, double fromLon, double toLat, double toLon) {
		GHRequest req = new GHRequest(fromLat, fromLon, toLat, toLon).setWeighting(weighting).setVehicle(vehicleType)
				.setLocale(Locale.GERMAN);
		ghResponse = gHopper.route(req);

		if (ghResponse.hasErrors()) {
			for (Throwable error : ghResponse.getErrors())
				System.out.println("Routing Error: " + error.getMessage());
		}
	}

	@Override
	public double getDistance() {
		return ghResponse.getBest().getDistance();
	}

	@Override
	public long getDuration() {
		return ghResponse.getBest().getTime();
	}

	@Override
	public List<WayPoint> getWayPoints(String idPrefix) {
		List<WayPoint> wayPoints = new ArrayList<WayPoint>();

		for (int i = 0; i < ghResponse.getBest().getInstructions().size() - 1; i++) {
			Instruction instruction = ghResponse.getBest().getInstructions().get(i);
			double distance = instruction.getDistance();
			long duration = instruction.getTime();
			double lat = instruction.getPoints().getLat(0);
			double lon = instruction.getPoints().getLon(0);
			wayPoints.add(InputHandler.createWayPoint(idPrefix, i, lat, lon, distance, duration));
		}
		return wayPoints;
	}
}
