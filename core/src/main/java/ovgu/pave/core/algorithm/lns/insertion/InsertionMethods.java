package ovgu.pave.core.algorithm.lns.insertion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

import ovgu.pave.core.algorithm.lns.utilities.RouteUpdater;
import ovgu.pave.core.algorithm.lns.utilities.RunThreads;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;

public class InsertionMethods {

	static Comparator<InsertionInformation> rankingValueComparator = Comparator
			.comparing(InsertionInformation::getScore);
	static Comparator<InsertionInformation> rankingComparatorReversed = rankingValueComparator.reversed();

	public static ArrayList<InsertionInformation> collectInsertionInformation(int regretValue, List<Request> requests) {

		List<Callable<Object>> slackCalculators = new ArrayList<Callable<Object>>();
		List<Callable<Object>> insertionInformationCalculators = new ArrayList<Callable<Object>>();

		for (Route route : Handler.getSolution().getRoutes()) {
			slackCalculators.add(new SlackCalculator(route));
		}
		RunThreads.run(slackCalculators);

		for (Request request : requests) {
			insertionInformationCalculators
					.add(new InsertionInformationCalculator(regretValue, slackCalculators, request, null, null));
		}
		RunThreads.run(insertionInformationCalculators);

		ArrayList<InsertionInformation> insertionInformationList = new ArrayList<InsertionInformation>();
		for (Callable<Object> insertionInformationCalculator : insertionInformationCalculators) {
			InsertionInformation insertionInformation = ((InsertionInformationCalculator) insertionInformationCalculator)
					.getInsertionInformation();
			if (insertionInformation != null) {
				insertionInformationList.add(insertionInformation);
			}
		}
		insertionInformationList.sort(rankingComparatorReversed);
		return insertionInformationList;
	}

	public static ArrayList<InsertionInformation> updateInsertionInformation(int regretValue,
			ArrayList<InsertionInformation> insertionInformationList, Route route) {

		List<Callable<Object>> slackCalculators = new ArrayList<Callable<Object>>();
		List<Callable<Object>> insertionInformationCalculators = new ArrayList<Callable<Object>>();

		slackCalculators.add(new SlackCalculator(route));
		RunThreads.run(slackCalculators);

		for (InsertionInformation insertionInformation : insertionInformationList) {
			insertionInformationCalculators.add(new InsertionInformationCalculator(regretValue, slackCalculators, null,
					insertionInformation, route));
		}
		RunThreads.run(insertionInformationCalculators);

		insertionInformationList.clear();
		for (Callable<Object> insertionInformationCalculator : insertionInformationCalculators) {
			InsertionInformation insertionInformation = ((InsertionInformationCalculator) insertionInformationCalculator)
					.getInsertionInformation();
			if (insertionInformation != null) {
				insertionInformationList.add(insertionInformation);
			}
		}
		insertionInformationList.sort(rankingComparatorReversed);
		return insertionInformationList;
	}

	public static void insertRequest(InsertionInformation insertionInformation) {

		Request request = insertionInformation.getRequest();
		Route route = insertionInformation.getInsertionOptions().get(0).getRoute();

		int indexOrigin = insertionInformation.getInsertionOptions().get(0).getFirstActivityIndex();
		int indexDestination = insertionInformation.getInsertionOptions().get(0).getSecondActivityIndex();

		SolutionHandler.insertRequest(route, request, indexOrigin, indexDestination);
		Handler.getSolution().getIntegratedRequests().add(request);
		Handler.getSolution().getUnintegratedRequests().remove(request);

		RouteUpdater.updateServiceBeginnAll("insertion", route, indexOrigin);
	}

	class CostsComparator implements Comparator<InsertionOption> {
		@Override
		public int compare(InsertionOption rs1, InsertionOption rs2) {
			return Long.compare(rs1.getCosts(), rs2.getCosts());
		}
	}
}
