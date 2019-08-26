package ovgu.pave.core.algorithm;

import ovgu.pave.core.algorithm.lns.ALNS;
import ovgu.pave.core.algorithm.lns.LMNS;
import ovgu.pave.core.algorithm.lns.insertion.InsertionHeuristics;
import ovgu.pave.core.algorithm.lns.utilities.InitializeRoutes;
import ovgu.pave.core.algorithm.lns.utilities.RunThreads;
import ovgu.pave.core.algorithm.lns.utilities.SolutionEvaluator;
import ovgu.pave.core.algorithm.ortools.CapacitatedDialARideProblemWithTimeWindows;
import ovgu.pave.handler.Handler;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.Solution;

public class AlgorithmsOfflineHandler {

	private static enum Objectiv {
		MINVEHICLES, MINDURATION
	}

	private static enum Algorithm {
		LOCALMINCOST, GLOBALMINCOST, REGRET2INSERTION, LMNS, ALNS, ORTOOLS
	}

	private static String objectiv = Handler.getInput().getConfig().getExperiment().getOffline().getObjective();
	private static String algorithm = Handler.getInput().getConfig().getAlgorithm().getAlgorithm();

	public static void run() {
		switch (Objectiv.valueOf(objectiv)) {
		case MINVEHICLES:
			minimizeVehicles();
			break;
		case MINDURATION:
			minimizeDuration();
			break;
		}
	}

	public static void minimizeDuration() {

		Handler.getSolution().getUnintegratedRequests().addAll(Handler.getInput().getNewRequests());
		Handler.getInput().getNewRequests().clear();

		Handler.getAlgorithmObjects().createRemovalInformation();
		
		if (Algorithm.valueOf(algorithm) != Algorithm.ORTOOLS) {
			InitializeRoutes.depotStartEnd();
			RunThreads.createThreadPool();
		}
		
		Handler.getAlgorithmObjects().updateSearchDuration(System.nanoTime());
		runAlgorithm();
		Handler.getAlgorithmObjects()
				.updateSearchDuration(System.nanoTime() - Handler.getAlgorithmObjects().getSearchDuration());
		
		if (Algorithm.valueOf(algorithm) != Algorithm.ORTOOLS) 
			RunThreads.shutDownThreadPool();
		
		Handler.getSolution().setScore(SolutionEvaluator.getTotalTravelTime());
		Handler.getInput().getAcceptedRequests().addAll(Handler.getSolution().getIntegratedRequests());
		Handler.getInput().getRejectedRequests().addAll(Handler.getSolution().getUnintegratedRequests());
	}

	private static void minimizeVehicles() {

		Handler.getSolution().getUnintegratedRequests().addAll(Handler.getInput().getNewRequests());
		Handler.getInput().getNewRequests().clear();

		Handler.getAlgorithmObjects().createRemovalInformation();
		InitializeRoutes.depotStartEnd();
		RunThreads.createThreadPool();

		Handler.getAlgorithmObjects().updateSearchDuration(System.nanoTime());
		runAlgorithm();
		Solution bestSolution = Handler.getSolution().copySolution();

		for (int i = 0; i < Handler.getSolution().getRoutes().size(); i++) {
			Route route = Handler.getSolution().getRoutes().get(i);
			for (int j = 1; j < route.getRouteElements().size() - 1; j++) {
				if (SolutionHandler.isRequestActivityRouteElement(route.getElement(j)) && InputHandler
						.isFirstRequestActivity(SolutionHandler.getRequestActivity(route.getElement(j)))) {
					Request request = SolutionHandler.getRequest(route.getElement(j));
					Handler.getSolution().getIntegratedRequests().remove(request);
					Handler.getSolution().getUnintegratedRequests().add(request);
				}
			}

			Handler.getSolution().getRoutes().remove(i);
			runAlgorithm();

			if (Handler.getSolution().getUnintegratedRequests().isEmpty()) {
				bestSolution = Handler.getSolution().copySolution();
				i--;
			} else {
				break;
			}
		}

		Handler.getSolution().setSolution(bestSolution);
		Handler.getAlgorithmObjects()
				.updateSearchDuration(System.nanoTime() - Handler.getAlgorithmObjects().getSearchDuration());
		RunThreads.shutDownThreadPool();
		Handler.getSolution().setScore(SolutionEvaluator.getTotalTravelTime());
		Handler.getInput().getAcceptedRequests().addAll(Handler.getSolution().getIntegratedRequests());
		Handler.getInput().getRejectedRequests().addAll(Handler.getSolution().getUnintegratedRequests());
	}

	private static void runAlgorithm() {

	
		switch (Algorithm.valueOf(algorithm)) {
		case LOCALMINCOST:
			InsertionHeuristics.insertRequests(InputHandler.createHeuristic("LOCALMINCOST", 0));
			break;
		case GLOBALMINCOST:
			InsertionHeuristics.insertRequests(InputHandler.createHeuristic("GLOBALMINCOST", 0));
			break;
		case REGRET2INSERTION:
			InsertionHeuristics.insertRequests(InputHandler.createHeuristic("REGRET2", 0));
			break;
		case LMNS:
			Handler.getSolution().setSolution(LMNS.performLMNS());
			break;
		case ALNS:
			Handler.getSolution().setSolution(ALNS.performALNS());
			break;
		case ORTOOLS:
			if (Objectiv.valueOf(objectiv) != Objectiv.MINDURATION)
				System.out.println("ORTOOLS can only minimize duration.");
			else
				CapacitatedDialARideProblemWithTimeWindows.solveCDARPTW();
			break;
		default:
			System.out.println("The selected algorithm is not available for an offline VRP");
			break;
		}
	}
}
