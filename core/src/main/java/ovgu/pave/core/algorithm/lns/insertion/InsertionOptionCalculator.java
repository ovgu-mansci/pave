package ovgu.pave.core.algorithm.lns.insertion;

import java.util.ArrayList;

import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.AlgorithmObjectsHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.RequestActivity;
import ovgu.pave.model.solution.Route;

public class InsertionOptionCalculator {

	Route route;
	ArrayList<Long> timeSlack;
	ArrayList<Integer> utilizationSlack;

	public InsertionOption calculateOption(Request request, Route route, SlackCalculator slackCalculator) {

		this.route = route;
		this.timeSlack = slackCalculator.getTimeSlack();
		this.utilizationSlack = slackCalculator.getUtilizationSlack();

		InsertionOption insertionOption = AlgorithmObjectsHandler.createInsertionOption();
		insertionOption.setRoute(route);
		insertionOption.setCosts(Long.MAX_VALUE);

		RequestActivity firstActivity = request.getFirstActivity();
		RequestActivity secondActivity = request.getSecondActivity();

		long insertionCosts = Long.MAX_VALUE;
		for (int firstActivityIndex = 1; firstActivityIndex < route.getRouteElements().size(); firstActivityIndex++) {
			firstActivityIndex = getNextInsertionIndex(firstActivity, firstActivityIndex);
			if (firstActivityIndex == -1)
				break;
			if (checkFirstActivity(firstActivity, firstActivityIndex)) {
				long firstActivityInsertionCosts = Handler.getNetwork().getInsertionDuration(
						route.getElement(firstActivityIndex - 1), firstActivity,
						route.getElement(firstActivityIndex));
				if (secondActivity == null && insertionOption.getCosts() > firstActivityInsertionCosts) {
					insertionOption.setFirstActivityIndex(firstActivityIndex);
					insertionOption.setCosts(firstActivityInsertionCosts);
				} else {
					for (int secondActivityIndex = firstActivityIndex; secondActivityIndex < route.getRouteElements()
							.size(); secondActivityIndex++) {
						secondActivityIndex = getNextInsertionIndex(secondActivity, secondActivityIndex);
						if (secondActivityIndex == -1)
							break;
						if (checkSecondActivity(firstActivity, secondActivity, firstActivityIndex,
								secondActivityIndex)) {
							if (firstActivityIndex == secondActivityIndex) {
								insertionCosts = Handler.getNetwork().getInsertionDurationIfIndexesEqual(
										route.getElement(firstActivityIndex - 1), firstActivity, secondActivity,
										route.getElement(firstActivityIndex));
							} else {
								insertionCosts = firstActivityInsertionCosts + Handler.getNetwork()
										.getInsertionDuration(route.getElement(secondActivityIndex - 1),
												secondActivity, route.getElement(secondActivityIndex));
							}
							if (insertionOption.getCosts() > insertionCosts) {
								insertionOption.setCosts(insertionCosts);
								insertionOption.setFirstActivityIndex(firstActivityIndex);
								insertionOption.setSecondActivityIndex(secondActivityIndex);
							}
						}
					}
				}
			}
		}
		if (insertionOption.getCosts() == Long.MAX_VALUE) {
			return null;
		}
		return insertionOption;
	}

	private int getNextInsertionIndex(RequestActivity requestActivity, int startIndex) {

		for (int i = startIndex; i < route.getRouteElements().size(); i++) {
			if (!SolutionHandler.isRequestActivityRouteElement(route.getElement(i))
					|| requestActivity.getEarliestArrival() < SolutionHandler
							.getRequestActivity(route.getElement(i)).getLatestArrival()) {
				return i;
			} else if (SolutionHandler.isRequestActivityRouteElement(route.getElement(i - 1))
					&& SolutionHandler.getRequestActivity(route.getElement(i - 1))
							.getEarliestArrival() > requestActivity.getLatestArrival()) {
				break;
			}
		}
		return -1;
	}

	private boolean checkFirstActivity(RequestActivity firstRequestActivity, int firstIndex) {

		long beginAtFirstActivity = SolutionHandler.getServiceBegin(route.getElement(firstIndex - 1),
				firstRequestActivity, SolutionHandler.getServiceEnd(route, firstIndex - 1));
		long newSerivceBegin = SolutionHandler.getArrivalTime(firstRequestActivity, route.getElement(firstIndex),
				(beginAtFirstActivity + firstRequestActivity.getServiceDuration()));
		long additionalTime = newSerivceBegin - SolutionHandler.getArrivalTime(route.getElement(firstIndex - 1),
				route.getElement(firstIndex), SolutionHandler.getServiceEnd(route, firstIndex - 1));

		int secondIndex;
		if (firstRequestActivity.getRequest().getSecondActivity() != null)
			secondIndex = firstIndex;
		else
			secondIndex = route.getRouteElements().size() - 1;

		if (ckeckTimes(firstIndex, additionalTime, firstRequestActivity, beginAtFirstActivity)
				&& checkUtilizationSlack(firstIndex, secondIndex, firstRequestActivity))
			return true;

		return false;
	}

	private boolean checkSecondActivity(RequestActivity firstRequestActivity, RequestActivity secondRequestActivity,
			int firstIndex, int secondIndex) {
				
		long newSerivceBegin = SolutionHandler.getServiceBegin(route.getElement(firstIndex - 1),
				firstRequestActivity, SolutionHandler.getServiceEnd(route, firstIndex - 1));
		long beginAtSecondActivity;

		if (firstIndex == secondIndex) {
			beginAtSecondActivity = SolutionHandler.getServiceBegin(firstRequestActivity, secondRequestActivity,
					(newSerivceBegin + firstRequestActivity.getServiceDuration()));
		} else {
			newSerivceBegin = newSerivceBegin + firstRequestActivity.getServiceDuration()
					+ Handler.getNetwork().getTravelDuration(firstRequestActivity, route.getElement(firstIndex));
			for (int i = firstIndex; i < secondIndex - 1; i++) {
				if (newSerivceBegin <= route.getElement(i).getServiceBegin()) {
					newSerivceBegin = -1;
					break;
				}
				newSerivceBegin = newSerivceBegin + route.getElement(i).getServiceDuration() + Handler.getNetwork()
						.getTravelDuration(route.getElement(i), route.getElement(i + 1));
			}

			if (newSerivceBegin == -1 || newSerivceBegin < route.getElement(secondIndex - 1).getServiceBegin())
				beginAtSecondActivity = SolutionHandler.getServiceBegin(route.getElement(secondIndex - 1),
						secondRequestActivity, SolutionHandler.getServiceEnd(route, secondIndex - 1));
			else
				beginAtSecondActivity = SolutionHandler.getServiceBegin(route.getElement(secondIndex - 1),
						secondRequestActivity,
						(newSerivceBegin + route.getElement(secondIndex - 1).getServiceDuration()));
		}

		long additionalTime = SolutionHandler.getArrivalTime(secondRequestActivity, route.getElement(secondIndex),
				(beginAtSecondActivity + secondRequestActivity.getServiceDuration()))
				- SolutionHandler.getArrivalTime(route.getElement(secondIndex - 1),
						route.getElement(secondIndex), SolutionHandler.getServiceEnd(route, secondIndex - 1));

		if (ckeckTimes(secondIndex, additionalTime, secondRequestActivity, beginAtSecondActivity)
				&& checkUtilizationSlack(firstIndex, secondIndex, firstRequestActivity))
			return true;

		return false;
	}

	private boolean ckeckTimes(int index, Long additionalTime, RequestActivity requestActivity, Long arrivalTime) {
		if (timeSlack.get(index) >= additionalTime && requestActivity.getLatestArrival() >= arrivalTime)
			return true;

		Handler.getAlgorithmObjects().increaseInvalidDueTime();
		return false;
	}

	private boolean checkUtilizationSlack(int startIndex, int endIndex, RequestActivity requestActivity) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (utilizationSlack.get(i) < SolutionHandler.getChangeInQuantity(requestActivity)) {
				Handler.getAlgorithmObjects().increaseInvalidDueCapacity();
				return false;
			}		
		}
		return true;
	}
}
