package ovgu.pave.core.algorithm.lns;

import ovgu.pave.core.algorithm.lns.insertion.InsertionHeuristics;
import ovgu.pave.core.algorithm.lns.removal.RemovalHeuristics;
import ovgu.pave.core.algorithm.lns.utilities.SolutionEvaluator;
import ovgu.pave.handler.Handler;
import ovgu.pave.model.solution.Solution;

public class LMNS {
	public static Solution performLMNS() {

		ovgu.pave.model.config.LNS configLNS = Handler.getInput().getConfig().getAlgorithm().getLns();

		Solution bestSolution = Handler.getSolution().copySolution();
		for (int iteration = 1; iteration <= configLNS.getLmns().getMaxInsertionIterations(); iteration++) {

			RemovalHeuristics.removeRequests(configLNS.getRemovalHeuristics()
					.get(Handler.getRandom().nextInt(configLNS.getRemovalHeuristics().size())));
			InsertionHeuristics.insertRequests(configLNS.getInsertionHeuristics()
					.get(Handler.getRandom().nextInt(configLNS.getInsertionHeuristics().size())));

			if (Handler.getSolution().getUnintegratedRequests().isEmpty()) {
				Handler.getAlgorithmObjects().updateIterationsBeforAcceptance(iteration);
				return performImprovment();
			}
			
			else if (Handler.getSolution().getUnintegratedRequests().size() <= bestSolution.getUnintegratedRequests().size()) {
				bestSolution = Handler.getSolution().copySolution();
			} else {
				Handler.getSolution().setSolution(bestSolution);
				bestSolution = Handler.getSolution().copySolution();
			}
		}
		return bestSolution;
	}
	
	
	public static boolean performInsertion() {

		ovgu.pave.model.config.LNS lnsConfig = Handler.getInput().getConfig().getAlgorithm().getLns();
		Solution backupSolution = Handler.getSolution().copySolution();
	
		for(int iteration = 1; iteration <= lnsConfig.getLmns().getMaxInsertionIterations(); iteration++) { 

			RemovalHeuristics.removeRequests(lnsConfig.getRemovalHeuristics()
					.get(Handler.getRandom().nextInt(lnsConfig.getRemovalHeuristics().size())));
			InsertionHeuristics.insertRequests(lnsConfig.getInsertionHeuristics()
					.get(Handler.getRandom().nextInt(lnsConfig.getInsertionHeuristics().size())));

			if (Handler.getSolution().getUnintegratedRequests().isEmpty()) {
				Handler.getAlgorithmObjects().updateIterationsBeforAcceptance(iteration);
				Handler.getSolution().setSolution(performImprovment());
				return true;
				}
			else if(Handler.getSolution().getUnintegratedRequests().size() == 1)	
				backupSolution = Handler.getSolution().copySolution();
			else {
				Handler.getSolution().setSolution(backupSolution);
				backupSolution = Handler.getSolution().copySolution();
			}
		}

		return false;
	}
	
	public static Solution performImprovment() {

		ovgu.pave.model.config.LNS lnsConfig = Handler.getInput().getConfig().getAlgorithm().getLns();
		Handler.getSolution().setScore(SolutionEvaluator.getTotalTravelTime());
		Solution backupSolution = Handler.getSolution().copySolution();
		Solution bestSolution = Handler.getSolution().copySolution();

		for(int iteration = 0; iteration < lnsConfig.getLmns().getMaxImprovementIterations(); iteration++) { 

			RemovalHeuristics.removeRequests(lnsConfig.getRemovalHeuristics()
					.get(Handler.getRandom().nextInt(lnsConfig.getRemovalHeuristics().size())));
			InsertionHeuristics.insertRequests(lnsConfig.getInsertionHeuristics()
					.get(Handler.getRandom().nextInt(lnsConfig.getInsertionHeuristics().size())));

			if (Handler.getSolution().getUnintegratedRequests().isEmpty()) {
				Handler.getSolution().setScore(SolutionEvaluator.getTotalTravelTime());
				backupSolution = Handler.getSolution().copySolution();
				if(bestSolution.getScore() > Handler.getSolution().getScore()) 				
					bestSolution = Handler.getSolution().copySolution();
			}
			else {
				Handler.getSolution().setSolution(backupSolution);
				backupSolution = Handler.getSolution().copySolution();
			}
		}
		return bestSolution;
	}
}
