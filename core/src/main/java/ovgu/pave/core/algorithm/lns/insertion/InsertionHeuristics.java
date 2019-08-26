package ovgu.pave.core.algorithm.lns.insertion;

import java.util.ArrayList;
import java.util.List;

import ovgu.pave.handler.Handler;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.config.Heuristic;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.solution.Route;

public class InsertionHeuristics {
	
	public enum Heuristics {
		LOCALMINCOST, GLOBALMINCOST, GLOBALMINCOSTNOISE, REGRET2, REGRET2NOISE, REGRET3, REGRET3NOISE, REGRET4, REGRET4NOISE
	}

	public static void insertRequests(Heuristic insertionHeurstic) {
		switch (Heuristics.valueOf(insertionHeurstic.getHeuristicName())) {
		case LOCALMINCOST:
			localMinCost();
			break;
		case GLOBALMINCOST:
			regretInsertion(-1, 0);
			break;
		case GLOBALMINCOSTNOISE:
			regretInsertion(-1, insertionHeurstic.getNoise());
			break;
		case REGRET2:
			regretInsertion(1, 0);
			break;
		case REGRET2NOISE:
			regretInsertion(1, insertionHeurstic.getNoise());
			break;
		case REGRET3:
			regretInsertion(2, 0);
			break;
		case REGRET3NOISE:
			regretInsertion(2, insertionHeurstic.getNoise());
			break;
		case REGRET4:
			regretInsertion(3, 0);
			break;
		case REGRET4NOISE:
			regretInsertion(3, insertionHeurstic.getNoise());
			break;
		}
	}

	private static void regretInsertion(int regretValue, int noise) {

		List<Request> requests = Handler.getSolution().getUnintegratedRequests();
		ArrayList<InsertionInformation> insertionInformationList = new ArrayList<InsertionInformation>();

		// compute insertion costs for all requests		
		insertionInformationList = InsertionMethods.collectInsertionInformation(regretValue, requests);

		// insert requests and update positions
		while (!insertionInformationList.isEmpty()) {

			int index = 0;
			if (noise > 0) {
				index = (int) (Math.pow(Handler.getRandom().nextDouble(), (10 - noise)) * insertionInformationList.size());
			}
			InsertionMethods.insertRequest(insertionInformationList.get(index));
			Route updatedRoute = insertionInformationList.get(index).getInsertionOptions().get(0).getRoute();
			insertionInformationList.remove(index);

			// Update insertion positions
			insertionInformationList = InsertionMethods.updateInsertionInformation(regretValue, insertionInformationList, updatedRoute);
		}
	}
	
	private static void localMinCost() {

		List<Request> requests = Handler.getSolution().getUnintegratedRequests();

		int index;
		for (int i = 0; i < requests.size(); i++) {
			if (requests.size() == 1)
				index = 0;
			else
				index = Handler.getRandom().nextInt(requests.size());

			ArrayList<Request> selectedRequests = new ArrayList<Request>();
			selectedRequests.add(requests.get(index));	
			requests.remove(index);
			
			ArrayList<InsertionInformation> insertionInformationList = InsertionMethods.collectInsertionInformation(0, selectedRequests);
		
			if (!insertionInformationList.isEmpty()) {
				InsertionMethods.insertRequest(insertionInformationList.get(0));
			}
		}
	}
}
