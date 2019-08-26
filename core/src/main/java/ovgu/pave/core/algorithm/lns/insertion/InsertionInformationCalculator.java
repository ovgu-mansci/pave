package ovgu.pave.core.algorithm.lns.insertion;

import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.util.ECollections;

import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.AlgorithmObjectsHandler;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;

public class InsertionInformationCalculator implements Callable<Object> {

	int regretValue;
	List<Callable<Object>> slackCalculators;
	Request request;
	InsertionInformation insertionInformation;
	Route updatedRoute;
	InsertionOptionCalculator insertionOptionCalculator = new InsertionOptionCalculator();

	public InsertionInformationCalculator(int regretValue, List<Callable<Object>> slackCalculators, Request request,
			InsertionInformation insertionInformation, Route updatedRoute) {

		this.regretValue = regretValue;
		this.slackCalculators = slackCalculators;
		this.request = request;
		this.insertionInformation = insertionInformation;
		this.updatedRoute = updatedRoute;
	}

	@Override
	public Object call() {
		if (request != null) {
			computeInsertionInformation();
		} else if(insertionInformation != null && updatedRoute != null ) {
			request = insertionInformation.getRequest();
			updateInsertionInformation();
		} else {
			System.out.println("Error in InsertionInformationCalculator");
		}
			
		if (insertionInformation.getInsertionOptions().isEmpty())
			insertionInformation = null;
		else {
			ECollections.sort(insertionInformation.getInsertionOptions(), new InsertionMethods().new CostsComparator());
			insertionInformation.setScoreForRegretHeuristic(regretValue);
		}
		return null;
	}

	public InsertionInformation getInsertionInformation() {
		return insertionInformation;
	}

	private void computeInsertionInformation() {

		insertionInformation = AlgorithmObjectsHandler.createInsertionInformation(request);
		List<Route> routes = Handler.getSolution().getRoutes();

		for (int i = 0; i < routes.size(); i++) {
			InsertionOption insertionOption = insertionOptionCalculator.calculateOption(request, routes.get(i),
					(SlackCalculator) slackCalculators.get(i));
			if (insertionOption != null) {
				insertionInformation.getInsertionOptions().add(insertionOption);
			}
		}
	}

	private void updateInsertionInformation() {

		for (int i = 0; i < insertionInformation.getInsertionOptions().size(); i++) {
			if (insertionInformation.getInsertionOptions().get(i).getRoute() == updatedRoute) {
				insertionInformation.getInsertionOptions().remove(i);
				InsertionOption insertionOption = insertionOptionCalculator.calculateOption(request, updatedRoute,
						(SlackCalculator) slackCalculators.get(0));
				if (insertionOption != null) {
					insertionInformation.getInsertionOptions().add((InsertionOption) insertionOption);
				}
			}
		}
	}
}
