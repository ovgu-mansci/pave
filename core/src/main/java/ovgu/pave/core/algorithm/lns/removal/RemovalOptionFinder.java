package ovgu.pave.core.algorithm.lns.removal;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.AlgorithmObjectsHandler;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.RemovalOption;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

public class RemovalOptionFinder implements Callable<Object> {

	Route route;
	ArrayList<RemovalOption> removelInformation = new ArrayList<RemovalOption>();

	public RemovalOptionFinder(Route route) {
		this.route = route;
	}

	@Override
	public Object call() throws Exception {

		RouteElement routeElement;
		RemovalOption removalOption;

		for (int i = 1; i < route.getRouteElements().size() - 1; i++) {
			routeElement = route.getElement(i);
			if (SolutionHandler.isRequestActivityRouteElement(routeElement)) {
				if (InputHandler.isFirstRequestActivity(SolutionHandler.getRequestActivity(routeElement))) {
					removalOption = AlgorithmObjectsHandler.createRemovalOption();
					removalOption.setRoute(route);
					removalOption.setFirstActivityRouteElement(routeElement);
					removalOption.setScore(Handler.getNetwork().getInsertionDuration(route.getElement(i - 1),
							routeElement, route.getElement(i + 1)));
					removelInformation.add(removalOption);
				} else {
					removalOption = collectRemoveSecondActivityInformation(routeElement);
					if (removalOption != null) {
						removalOption.setSecondActivityRouteElement(routeElement);
						if (SolutionHandler.getRequest(route.getElement(i - 1)) == SolutionHandler
								.getRequest(routeElement))
							removalOption.setScore(Handler.getNetwork().getInsertionDurationIfIndexesEqual(
									route.getElement(i - 2), removalOption.getFirstActivityRouteElement(),
									routeElement, route.getElement(i + 1)));
						else
							removalOption.setScore(removalOption.getScore()
									+ (Handler.getNetwork().getInsertionDuration(route.getElement(i - 1),
											routeElement, route.getElement(i + 1))));
					}
				}
			}
		}
		return null;
	}

	public ArrayList<RemovalOption> getRemovalInformation() {
		return removelInformation;
	}

	private RemovalOption collectRemoveSecondActivityInformation(RouteElement routeElement) {
		for (int i = 0; i < removelInformation.size(); i++) {
			if (SolutionHandler.getRequest(routeElement) == SolutionHandler
					.getRequest(removelInformation.get(i).getFirstActivityRouteElement())) {
				return removelInformation.get(i);
			}
		}
		return null;
	}
}
