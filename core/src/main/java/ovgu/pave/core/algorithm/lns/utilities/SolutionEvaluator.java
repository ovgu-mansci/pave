package ovgu.pave.core.algorithm.lns.utilities;

import ovgu.pave.handler.Handler;
import ovgu.pave.model.solution.Route;

public class SolutionEvaluator {

	public static long getTotalTravelTime() {
		long totalTravelTime = 0;
		for (Route currentRoute : Handler.getSolution().getRoutes()) {
			for (int i = 1; i < currentRoute.getRouteElements().size(); i++) {
				totalTravelTime += Handler.getNetwork().getTravelDuration(currentRoute.getElement(i - 1),
						currentRoute.getElement(i));
			}
		}
		return totalTravelTime;
	}
}
