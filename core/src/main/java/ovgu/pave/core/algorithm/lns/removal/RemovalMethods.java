package ovgu.pave.core.algorithm.lns.removal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import ovgu.pave.core.algorithm.lns.utilities.RouteUpdater;
import ovgu.pave.core.algorithm.lns.utilities.RunThreads;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.RemovalOption;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;

public class RemovalMethods {
	public static ArrayList<RemovalOption> collectRemovalInformation() {

		List<Callable<Object>> removalOptionFinders = new ArrayList<Callable<Object>>();
		ArrayList<RemovalOption> removelInformation = new ArrayList<RemovalOption>();

		for (Route route : Handler.getSolution().getRoutes()) {
			removalOptionFinders.add(new RemovalOptionFinder(route));
		}
		RunThreads.run(removalOptionFinders);
		for (Object removalOptionFinder : removalOptionFinders) {
			removelInformation.addAll(((RemovalOptionFinder) removalOptionFinder).getRemovalInformation());
		}
		return removelInformation;
	}

	public static int calculateNumberOfRequestsToBeRemoved(int numberOfIntegratedRequests) {

		if (numberOfIntegratedRequests == 0)
			return 0;
		double minSmallRequestSet = Handler.getInput().getConfig().getAlgorithm().getLns().getMinSmallRequestSet();
		double maxSmallRequestSet = Handler.getInput().getConfig().getAlgorithm().getLns().getMaxSmallRequestSet();

		int minLargeRequestSet = Handler.getInput().getConfig().getAlgorithm().getLns().getMinLargeRequestSet();
		int maxLargeRequestSet = Handler.getInput().getConfig().getAlgorithm().getLns().getMaxLargeRequestSet();

		int lowerBound;
		int upperBound;

		if (minLargeRequestSet <= numberOfIntegratedRequests * minSmallRequestSet)
			lowerBound = minLargeRequestSet;
		else {
			lowerBound = (int) Math.floor(numberOfIntegratedRequests * minSmallRequestSet);
		}
		if (maxLargeRequestSet <= numberOfIntegratedRequests * maxSmallRequestSet)
			upperBound = maxLargeRequestSet;
		else {
			upperBound = (int) Math.ceil(numberOfIntegratedRequests * maxSmallRequestSet);
		}
		if (lowerBound == upperBound) {
			return lowerBound;
		}
		return (Handler.getRandom().nextInt(upperBound - lowerBound) + lowerBound);
	}

	public static void removeRequests(ArrayList<RemovalOption> removeInformation, int numberToRemove, boolean random,
			int noise) {

		HashMap<Request, Long> removalsPerRequest = Handler.getAlgorithmObjects().getNumberOfRemovalsPerRequest();
		HashMap<Route, Integer> updateRoutes = new HashMap<Route, Integer>();

		for (int i = 0; i < numberToRemove && i < removeInformation.size(); i++) {
			int index = 0;
			if (random)
				index = Handler.getRandom().nextInt(removeInformation.size());
			else if (noise > 0)
				index = (int) (Math.pow(Handler.getRandom().nextDouble(), (10 - noise)) * removeInformation.size());

			Request request = SolutionHandler.getRequest(removeInformation.get(index).getFirstActivityRouteElement());
			if (removalsPerRequest.putIfAbsent(request, 1l) != null)
				removalsPerRequest.put(request, removalsPerRequest.get(request) + 1);
			Handler.getSolution().getUnintegratedRequests().add(request);
			Handler.getSolution().getIntegratedRequests().remove(request);

			Route route = removeInformation.get(index).getRoute();

			if (removeInformation.get(index).getSecondActivityRouteElement() != null) {
				route.getRouteElements().remove(removeInformation.get(index).getSecondActivityRouteElement());
			}

			int firstActivityIndex = SolutionHandler.getRouteElementIndex(route,
					removeInformation.get(index).getFirstActivityRouteElement());
			route.getRouteElements().remove(firstActivityIndex);

			if (!updateRoutes.containsKey(route) || updateRoutes.get(route) > firstActivityIndex)
				updateRoutes.put(route, firstActivityIndex);

			removeInformation.remove(index);
		}

		for (Entry<Route, Integer> entry : updateRoutes.entrySet())
			RouteUpdater.updateServiceBeginnAll("removal", entry.getKey(), entry.getValue());
	}
}
