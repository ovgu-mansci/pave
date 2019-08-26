package ovgu.pave.handler;

import java.util.Random;

import ovgu.pave.handler.modelHandler.AlgorithmObjectsHandler;
import ovgu.pave.handler.modelHandler.InputHandler;
import ovgu.pave.handler.modelHandler.NetworkHandler;
import ovgu.pave.handler.modelHandler.SolutionHandler;;

public class Handler {

	private Handler() {
	}

	private static boolean initialized = false;
	private static Random random;

	public static Random getRandom() {
		return random;
	}

	private static InputHandler _localInputHandler = null;
	private static NetworkHandler _localNetworkHandler = null;
	private static SolutionHandler _localSolutionHandler = null;
	private static AlgorithmObjectsHandler _localAlgorithmObjectsHandler = null;

	public static InputHandler getInput() {
		initHandlers();
		return _localInputHandler;
	}

	public static NetworkHandler getNetwork() {
		initHandlers();
		return _localNetworkHandler;
	}

	public static SolutionHandler getSolution() {
		initHandlers();
		return _localSolutionHandler;
	}

	public static AlgorithmObjectsHandler getAlgorithmObjects() {
		initHandlers();
		return _localAlgorithmObjectsHandler;
	}

	public static void resetRandom() {
		random = new Random(_localInputHandler.getConfig().getAlgorithm().getRandomSeet());
	}

	private static void initHandlers() {
		if (!initialized) {
			_localInputHandler = new InputHandler();
			_localNetworkHandler = new NetworkHandler();
			_localSolutionHandler = new SolutionHandler();
			_localAlgorithmObjectsHandler = new AlgorithmObjectsHandler();
			initialized = true;
			random = new Random(_localInputHandler.getConfig().getAlgorithm().getRandomSeet());
		}
	}
}
