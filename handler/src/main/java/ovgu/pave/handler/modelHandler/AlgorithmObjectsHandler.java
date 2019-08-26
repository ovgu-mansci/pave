package ovgu.pave.handler.modelHandler;

import java.util.HashMap;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsFactory;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.algorithmObjects.RemovalInformation;
import ovgu.pave.model.algorithmObjects.RemovalOption;
import ovgu.pave.model.algorithmObjects.SearchStatistics;

public class AlgorithmObjectsHandler {

	SearchStatistics searchStatistics = AlgorithmObjectsFactory.eINSTANCE.createSearchStatistics();
	RemovalInformation removalInformation;

	public void resetSearchStatistics() {
		searchStatistics = AlgorithmObjectsFactory.eINSTANCE.createSearchStatistics();
	}

	public void updateIterationsBeforAcceptance(int numberOfIterations) {
		searchStatistics.setNumberOfAcceptances(searchStatistics.getNumberOfAcceptances() + 1);
		searchStatistics
				.setIterationsBeforeAcceptance(searchStatistics.getIterationsBeforeAcceptance() + numberOfIterations);
	}

	public void updateNumberOfReschedulableRequests(int numberOfReschedulableRequests) {
		searchStatistics.setRemovalIterations(searchStatistics.getRemovalIterations() + 1);
		searchStatistics.setNumberOfReschedulableRequests(
				searchStatistics.getNumberOfReschedulableRequests() + numberOfReschedulableRequests);
	}
	
	public void updateSearchDuration(long searchDuration) {
		searchStatistics.setSearchDuration(searchDuration);
	}
	
	public long getSearchDuration() {
		return searchStatistics.getSearchDuration();
	}
	
	public double getAverageIterationsBeforeAcceptance() {
		if (searchStatistics.getNumberOfAcceptances() == 0)
			return -1;
		return (double) searchStatistics.getIterationsBeforeAcceptance() / searchStatistics.getNumberOfAcceptances();
	}

	public double getAverageNumberOfReschedulableRequests() {

		if (searchStatistics.getRemovalIterations() == 0)
			return -1;
		return (double) searchStatistics.getNumberOfReschedulableRequests() / searchStatistics.getRemovalIterations();
	}
	
	public void increaseInvalidDueCapacity() {
		searchStatistics.setInvalidDueCapacity(searchStatistics.getInvalidDueCapacity() +  1);
	}
	
	public double getInvalidDueCapacity() {
		return (double) searchStatistics.getInvalidDueCapacity();
	}
	
	public void increaseInvalidDueTime() {
		searchStatistics.setInvalidDueTime(searchStatistics.getInvalidDueTime() +  1);
	} 
	
	public double getInvalidDueTime() {
		return (double) searchStatistics.getInvalidDueTime();
	}

	public void increaseWayPoints() {
		searchStatistics.setWayPoints(searchStatistics.getWayPoints() +  1);
	} 
	
	public double getWayPoints() {
		return (double) searchStatistics.getWayPoints();
	}
	
	public void increaseOnTheFlyRescheduling() {
		searchStatistics.setOnTheFlyRescheduling(searchStatistics.getOnTheFlyRescheduling() +  1);
	} 
	
	public double getOnTheFlyRescheduling() {
		return (double) searchStatistics.getOnTheFlyRescheduling();
	}
	
	public void createRemovalInformation() {
		removalInformation = AlgorithmObjectsFactory.eINSTANCE.createRemovalInformation();
	}

	public static InsertionInformation createInsertionInformation(Request request) {
		InsertionInformation insertionInformation = AlgorithmObjectsFactory.eINSTANCE.createInsertionInformation();
		insertionInformation.setRequest(request);
		return insertionInformation;
	}

	public static InsertionOption createInsertionOption() {
		return AlgorithmObjectsFactory.eINSTANCE.createInsertionOption();
	}

	public static RemovalOption createRemovalOption() {
		return AlgorithmObjectsFactory.eINSTANCE.createRemovalOption();
	}

	public HashMap<Request, Long> getNumberOfRemovalsPerRequest() {
		if (removalInformation.getNumberOfRemovalsPerRequest() == null) {
			removalInformation.setNumberOfRemovalsPerRequest(new HashMap<Request, Long>());
		}
		return removalInformation.getNumberOfRemovalsPerRequest();
	}

	public long getNumberOfRemovals(Request request) {
		if (removalInformation.getNumberOfRemovalsPerRequest() == null
				|| !removalInformation.getNumberOfRemovalsPerRequest().containsKey(request)) {
			return 0;
		}
		return removalInformation.getNumberOfRemovalsPerRequest().get(request);
	}
}
