package ovgu.pave.core.algorithm.lns.utilities;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class RunThreads {

	private static ExecutorService threadPool = null; 
		
	public static void createThreadPool() {
			threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());   
	}
	
	public static void shutDownThreadPool() {
		threadPool.shutdown();
	}
	
	public static List<Future<Object>> run(List<Callable<Object>> callableTasks) {

		try {
			List<Future<Object>> futures = threadPool.invokeAll(callableTasks);
			return futures;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		return null;
	}
}
