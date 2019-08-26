package ovgu.pave.core.algorithm.lns.removal;

import java.util.ArrayList;
import java.util.Comparator;

import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.RemovalOption;
import ovgu.pave.model.config.Heuristic;
import ovgu.pave.model.solution.RouteElement;

public class RemovalHeuristics {

	public enum Heuristics {
		RANDOMREMOVAL, SYSTEMATICREMOVAL, TIMEWINDOWREMOVAL, WORSTREMOVAL, SHAWREMOVAL
	}

	private final static Comparator<RemovalOption> scoreComparator = Comparator.comparing(RemovalOption::getScore);
	private final static Comparator<RemovalOption> rankingComparatorReversed = scoreComparator.reversed();

	public static void removeRequests(Heuristic heuristic) {

		ArrayList<RemovalOption> removalInformation = RemovalMethods.collectRemovalInformation();
		Handler.getAlgorithmObjects().updateNumberOfReschedulableRequests(removalInformation.size());
		int numberToRemove = RemovalMethods.calculateNumberOfRequestsToBeRemoved(removalInformation.size());

		if (numberToRemove > 0) {
			switch (Heuristics.valueOf(heuristic.getHeuristicName())) {
			case RANDOMREMOVAL:
				randomRemoval(removalInformation, numberToRemove);
				break;
			case SYSTEMATICREMOVAL:
				systematicRemoval(removalInformation, numberToRemove);
				break;
			case TIMEWINDOWREMOVAL:
				timeWindowRemoval(removalInformation, numberToRemove);
				break;
			case WORSTREMOVAL:
				worstRemoval(removalInformation, numberToRemove, heuristic.getNoise());
				break;
			case SHAWREMOVAL:
				shawRemoval(removalInformation, numberToRemove, heuristic.getNoise());
				break;
			}
		}
	}

	private static void randomRemoval(ArrayList<RemovalOption> removalInformation, int numberToRemove) {
		RemovalMethods.removeRequests(removalInformation, numberToRemove, true, -1);
	}

	private static void timeWindowRemoval(ArrayList<RemovalOption> removalInformation, int numberToRemove) {
		RemovalOption removalOption = removalInformation.get(Handler.getRandom().nextInt(removalInformation.size()));

		long selectedEarliestArrival = SolutionHandler.getRequestActivity(removalOption.getFirstActivityRouteElement())
				.getEarliestArrival();
		long selectedLatestArrival = SolutionHandler.getRequestActivity(removalOption.getSecondActivityRouteElement())
				.getLatestArrival();

		for (int i = 0; i < removalInformation.size(); i++) {
			removalOption = removalInformation.get(i);
			if (selectedLatestArrival <= SolutionHandler
					.getRequestActivity(removalOption.getFirstActivityRouteElement()).getEarliestArrival()
					|| selectedEarliestArrival >= SolutionHandler
							.getRequestActivity(removalOption.getSecondActivityRouteElement()).getLatestArrival()) {
				removalInformation.remove(i);
				i--;
			}
		}
		RemovalMethods.removeRequests(removalInformation, numberToRemove, true, -1);
	}

	private static void systematicRemoval(ArrayList<RemovalOption> removalInformation, int numberToRemove) {
		for (RemovalOption removalOption : removalInformation) {
			removalOption.setScore(Handler.getAlgorithmObjects()
					.getNumberOfRemovals(SolutionHandler.getRequest(removalOption.getFirstActivityRouteElement())));
		}
		removalInformation.sort(rankingComparatorReversed);
		while (removalInformation.size() > numberToRemove
				&& removalInformation.get(0).getScore() > removalInformation.get(1).getScore()) {
			removalInformation.remove(0);
		}
		RemovalMethods.removeRequests(removalInformation, numberToRemove, true, -1);
	}

	private static void worstRemoval(ArrayList<RemovalOption> removalInformation, int numberToRemove, int noise) {
		removalInformation.sort(rankingComparatorReversed);
		RemovalMethods.removeRequests(removalInformation, numberToRemove, false, noise);
	}

	private static void shawRemoval(ArrayList<RemovalOption> removalInformation, int numberToRemove, int noise) {

		double distanceWeight = Handler.getInput().getConfig().getAlgorithm().getLns().getShawDistanceWeight();
		double serviceBeginWeight = Handler.getInput().getConfig().getAlgorithm().getLns().getShawBeginWeight();

		RemovalOption selectedRemovalOption = removalInformation
				.get(Handler.getRandom().nextInt(removalInformation.size()));

		RouteElement selectedFirstActivity = selectedRemovalOption.getFirstActivityRouteElement();
		RouteElement selectedSecondActivity = selectedRemovalOption.getSecondActivityRouteElement();

		long maxDistance = 0;
		long maxAbsServiceBegin = 0;

		for (RemovalOption removalOption : removalInformation) {

			long distance = Handler.getNetwork().getTravelDuration(selectedFirstActivity,
					removalOption.getFirstActivityRouteElement());
			long absServiceBegin = Math.abs(selectedFirstActivity.getServiceBegin()
					- removalOption.getFirstActivityRouteElement().getServiceBegin());

			if (selectedSecondActivity != null) {
				distance += Handler.getNetwork().getTravelDuration(selectedSecondActivity,
						removalOption.getSecondActivityRouteElement());
				absServiceBegin += Math.abs(selectedSecondActivity.getServiceBegin()
						- removalOption.getSecondActivityRouteElement().getServiceBegin());
			}

			removalOption.setShawDistance(distance);
			removalOption.setShawServiceBegin(absServiceBegin);

			if (maxAbsServiceBegin < absServiceBegin)
				maxAbsServiceBegin = absServiceBegin;
			if (maxDistance < distance)
				maxDistance = distance;
		}

		for (RemovalOption removalOption : removalInformation) {
			double distance = ((double) removalOption.getShawDistance() / maxDistance) * distanceWeight;
			double absServiceBegin = ((double) removalOption.getShawServiceBegin() / maxAbsServiceBegin)
					* serviceBeginWeight;

			long Score = (long) ((distance + absServiceBegin) * 1000);
			removalOption.setScore(Score);
		}

		removalInformation.sort(scoreComparator);
		RemovalMethods.removeRequests(removalInformation, numberToRemove, false, noise);
	}
}
