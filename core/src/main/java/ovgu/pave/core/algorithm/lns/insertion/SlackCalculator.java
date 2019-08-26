package ovgu.pave.core.algorithm.lns.insertion;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import ovgu.pave.handler.modelHandler.SolutionHandler;
import ovgu.pave.model.solution.Route;

public class SlackCalculator implements Callable<Object> {
		
	ArrayList<Long> timeSlack;
	ArrayList<Integer> utilizationSlack;
	Route route;
	
	public SlackCalculator(Route route) {
		this.route = route;
	}
	
	 @Override
	public Object call() {
	
		timeSlack = new ArrayList<Long>();
		utilizationSlack = new ArrayList<Integer>();

		if(route.getVehicle().getLatestArrival() == 0) 
			timeSlack.add(0, Long.MAX_VALUE);
		else	
			timeSlack.add(0, route.getVehicle().getLatestArrival() - route.getElement(route.getRouteElements().size()-1).getServiceBegin()); 
								
		utilizationSlack.add(0, route.getVehicle().getType().getCapacity());

		long slack = 0;
		long hiddenSlack = 0;

		for (int i = route.getRouteElements().size() - 2; i > 0; i--) {

			hiddenSlack = route.getElement(i).getServiceBegin() - SolutionHandler.getArrivalTime(route.getElement(i - 1), route.getElement(i), SolutionHandler.getServiceEnd(route, i - 1));
			slack = SolutionHandler.getRequestActivity(route.getElement(i)).getLatestArrival()
					- route.getElement(i).getServiceBegin();

			if (slack < timeSlack.get(0) ) {
				timeSlack.add(0, slack + hiddenSlack);
			} else {
				timeSlack.add(0, timeSlack.get(0) + hiddenSlack);
			}

			utilizationSlack.add(0, utilizationSlack.get(0) + SolutionHandler
					.getChangeInQuantity(SolutionHandler.getRequestActivity(route.getElement(i))));
		}

		timeSlack.add(0, -1l);
		utilizationSlack.add(0, -1);	
		return null;
	}
	
	public ArrayList<Long> getTimeSlack() {
		return timeSlack;
	}

	public ArrayList<Integer> getUtilizationSlack() {
		return utilizationSlack;
	}
}
