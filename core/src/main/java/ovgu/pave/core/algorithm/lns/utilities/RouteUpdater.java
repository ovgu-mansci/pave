package ovgu.pave.core.algorithm.lns.utilities;

import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

public class RouteUpdater {

	public static void updateServiceBeginnAll(String callingClass, Route route, int index) {

		for (int i = index; i < route.getRouteElements().size(); i++) {
			updateServiceBeginn(callingClass, route, i);
		}
	}

	private static void updateServiceBeginn(String callingClass, Route route, int index) {

		RouteElement prevElement = route.getRouteElements().get(index - 1);
		RouteElement currentElement = route.getRouteElements().get(index);
		boolean isRequestActivity = SolutionHandler.isRequestActivityRouteElement(currentElement);

		long newServiceBegin = SolutionHandler.getServiceEnd(route, index - 1)
				+ Handler.getNetwork().getTravelDuration(prevElement, currentElement);

		if (!isRequestActivity)
			currentElement.setServiceBegin(newServiceBegin);
		else {
			if (callingClass == "REMOVAL" && currentElement.getServiceBegin() > 0
					&& newServiceBegin > currentElement.getServiceBegin()) {
				System.out.println("ERROR: Travel time increases after removal of a request");
			}

			if (newServiceBegin < SolutionHandler.getRequestActivity(currentElement).getEarliestArrival()) {
				currentElement.setServiceBegin(SolutionHandler.getRequestActivity(currentElement).getEarliestArrival());
			} else {
				currentElement.setServiceBegin(newServiceBegin);
			}

			if (currentElement.getServiceBegin() > SolutionHandler.getRequestActivity(currentElement)
					.getLatestArrival()) {
				System.out.println("ERROR: Time windows are not respected by "
						+ (currentElement.getServiceBegin()
								- SolutionHandler.getRequestActivity(currentElement).getLatestArrival()) / 1000
						+ " seconds after " + callingClass + ".");
			}
		}
	}
}
