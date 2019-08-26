/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ovgu.pave.model.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ovgu.pave.config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "con";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = ovgu.pave.model.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.AlgorithmImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Lns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__LNS = 1;

	/**
	 * The feature id for the '<em><b>Random Seet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__RANDOM_SEET = 2;

	/**
	 * The feature id for the '<em><b>Ortools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__ORTOOLS = 3;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.ConfigImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Input Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__INPUT_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Shortest Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SHORTEST_PATH = 1;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__EXPERIMENT = 2;

	/**
	 * The feature id for the '<em><b>Input Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__INPUT_FILENAME = 3;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ALGORITHM = 4;

	/**
	 * The feature id for the '<em><b>Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONFIG_PATH = 5;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.ShortestPathImpl <em>Shortest Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.ShortestPathImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getShortestPath()
	 * @generated
	 */
	int SHORTEST_PATH = 2;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTEST_PATH__USE = 0;

	/**
	 * The feature id for the '<em><b>Graphhopper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTEST_PATH__GRAPHHOPPER = 1;

	/**
	 * The number of structural features of the '<em>Shortest Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTEST_PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Shortest Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTEST_PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.ExperimentImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 3;

	/**
	 * The feature id for the '<em><b>Planning Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__PLANNING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__NUMBER_OF_REQUESTS = 1;

	/**
	 * The feature id for the '<em><b>Number Of Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__NUMBER_OF_VEHICLES = 2;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__SERVICE_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Max Delay Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__MAX_DELAY_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Inside Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__INSIDE_REPETITIONS = 5;

	/**
	 * The feature id for the '<em><b>Output Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__OUTPUT_FOLDER = 6;

	/**
	 * The feature id for the '<em><b>Outside Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__OUTSIDE_REPETITIONS = 7;

	/**
	 * The feature id for the '<em><b>Vehicle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__VEHICLE_CAPACITY = 8;

	/**
	 * The feature id for the '<em><b>Factor On Travel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__FACTOR_ON_TRAVEL_TIME = 9;

	/**
	 * The feature id for the '<em><b>Offline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__OFFLINE = 10;

	/**
	 * The feature id for the '<em><b>Online</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__ONLINE = 11;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.GraphHopperImpl <em>Graph Hopper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.GraphHopperImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getGraphHopper()
	 * @generated
	 */
	int GRAPH_HOPPER = 4;

	/**
	 * The feature id for the '<em><b>Osm File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_HOPPER__OSM_FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Graph Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_HOPPER__GRAPH_FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Weighting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_HOPPER__WEIGHTING = 2;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_HOPPER__VEHICLE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Graph Hopper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_HOPPER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Graph Hopper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_HOPPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.LNSImpl <em>LNS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.LNSImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getLNS()
	 * @generated
	 */
	int LNS = 5;

	/**
	 * The feature id for the '<em><b>Min Small Request Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__MIN_SMALL_REQUEST_SET = 0;

	/**
	 * The feature id for the '<em><b>Max Large Request Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__MAX_LARGE_REQUEST_SET = 1;

	/**
	 * The feature id for the '<em><b>Max Small Request Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__MAX_SMALL_REQUEST_SET = 2;

	/**
	 * The feature id for the '<em><b>Min Large Request Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__MIN_LARGE_REQUEST_SET = 3;

	/**
	 * The feature id for the '<em><b>Insertion Heuristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__INSERTION_HEURISTICS = 4;

	/**
	 * The feature id for the '<em><b>Removal Heuristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__REMOVAL_HEURISTICS = 5;

	/**
	 * The feature id for the '<em><b>Shaw Distance Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__SHAW_DISTANCE_WEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Shaw Begin Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__SHAW_BEGIN_WEIGHT = 7;

	/**
	 * The feature id for the '<em><b>Alns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__ALNS = 8;

	/**
	 * The feature id for the '<em><b>Lmns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS__LMNS = 9;

	/**
	 * The number of structural features of the '<em>LNS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>LNS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.HeuristicImpl <em>Heuristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.HeuristicImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getHeuristic()
	 * @generated
	 */
	int HEURISTIC = 6;

	/**
	 * The feature id for the '<em><b>Heuristic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__HEURISTIC_NAME = 0;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC__NOISE = 1;

	/**
	 * The number of structural features of the '<em>Heuristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Heuristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEURISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.RWSImpl <em>RWS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.RWSImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getRWS()
	 * @generated
	 */
	int RWS = 7;

	/**
	 * The feature id for the '<em><b>Case1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWS__CASE1 = 0;

	/**
	 * The feature id for the '<em><b>Case2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWS__CASE2 = 1;

	/**
	 * The feature id for the '<em><b>Case3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWS__CASE3 = 2;

	/**
	 * The feature id for the '<em><b>Last Score Influence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWS__LAST_SCORE_INFLUENCE = 3;

	/**
	 * The number of structural features of the '<em>RWS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>RWS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.ALNSImpl <em>ALNS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.ALNSImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getALNS()
	 * @generated
	 */
	int ALNS = 8;

	/**
	 * The feature id for the '<em><b>Penalty Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS__PENALTY_TERM = 0;

	/**
	 * The feature id for the '<em><b>Temperature Control Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS__TEMPERATURE_CONTROL_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Cooling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS__COOLING_RATE = 2;

	/**
	 * The feature id for the '<em><b>Max Calculation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS__MAX_CALCULATION_TIME = 3;

	/**
	 * The feature id for the '<em><b>Max Insertion Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS__MAX_INSERTION_ITERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Rws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS__RWS = 5;

	/**
	 * The number of structural features of the '<em>ALNS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ALNS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALNS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.LMNSImpl <em>LMNS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.LMNSImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getLMNS()
	 * @generated
	 */
	int LMNS = 9;

	/**
	 * The feature id for the '<em><b>Max Insertion Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMNS__MAX_INSERTION_ITERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Max Improvement Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMNS__MAX_IMPROVEMENT_ITERATIONS = 1;

	/**
	 * The number of structural features of the '<em>LMNS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMNS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LMNS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LMNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.ORTOOLSImpl <em>ORTOOLS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.ORTOOLSImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getORTOOLS()
	 * @generated
	 */
	int ORTOOLS = 10;

	/**
	 * The feature id for the '<em><b>First Solution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTOOLS__FIRST_SOLUTION_STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Local Search Metaheuristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTOOLS__LOCAL_SEARCH_METAHEURISTIC = 1;

	/**
	 * The feature id for the '<em><b>Max Calculation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTOOLS__MAX_CALCULATION_TIME = 2;

	/**
	 * The number of structural features of the '<em>ORTOOLS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTOOLS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ORTOOLS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORTOOLS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.OfflineImpl <em>Offline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.OfflineImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getOffline()
	 * @generated
	 */
	int OFFLINE = 11;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE__OBJECTIVE = 0;

	/**
	 * The number of structural features of the '<em>Offline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Offline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.OnlineImpl <em>Online</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.OnlineImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getOnline()
	 * @generated
	 */
	int ONLINE = 12;

	/**
	 * The feature id for the '<em><b>Vehicle Movement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__VEHICLE_MOVEMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Pre Acceptance Decisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE__PRE_ACCEPTANCE_DECISIONS = 1;

	/**
	 * The number of structural features of the '<em>Online</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Online</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see ovgu.pave.model.config.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Algorithm#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algorithm</em>'.
	 * @see ovgu.pave.model.config.Algorithm#getAlgorithm()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Algorithm();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Algorithm#getLns <em>Lns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lns</em>'.
	 * @see ovgu.pave.model.config.Algorithm#getLns()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Lns();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Algorithm#getRandomSeet <em>Random Seet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Seet</em>'.
	 * @see ovgu.pave.model.config.Algorithm#getRandomSeet()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_RandomSeet();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Algorithm#getOrtools <em>Ortools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ortools</em>'.
	 * @see ovgu.pave.model.config.Algorithm#getOrtools()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Ortools();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see ovgu.pave.model.config.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getInputFolder <em>Input Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Folder</em>'.
	 * @see ovgu.pave.model.config.Config#getInputFolder()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_InputFolder();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Config#getShortestPath <em>Shortest Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shortest Path</em>'.
	 * @see ovgu.pave.model.config.Config#getShortestPath()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_ShortestPath();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Config#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Experiment</em>'.
	 * @see ovgu.pave.model.config.Config#getExperiment()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Experiment();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getInputFilename <em>Input Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Filename</em>'.
	 * @see ovgu.pave.model.config.Config#getInputFilename()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_InputFilename();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Config#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm</em>'.
	 * @see ovgu.pave.model.config.Config#getAlgorithm()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getConfigPath <em>Config Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Path</em>'.
	 * @see ovgu.pave.model.config.Config#getConfigPath()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ConfigPath();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.ShortestPath <em>Shortest Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shortest Path</em>'.
	 * @see ovgu.pave.model.config.ShortestPath
	 * @generated
	 */
	EClass getShortestPath();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ShortestPath#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see ovgu.pave.model.config.ShortestPath#getUse()
	 * @see #getShortestPath()
	 * @generated
	 */
	EAttribute getShortestPath_Use();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.ShortestPath#getGraphhopper <em>Graphhopper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Graphhopper</em>'.
	 * @see ovgu.pave.model.config.ShortestPath#getGraphhopper()
	 * @see #getShortestPath()
	 * @generated
	 */
	EReference getShortestPath_Graphhopper();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see ovgu.pave.model.config.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getPlanningType <em>Planning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planning Type</em>'.
	 * @see ovgu.pave.model.config.Experiment#getPlanningType()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_PlanningType();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getNumberOfRequests <em>Number Of Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Requests</em>'.
	 * @see ovgu.pave.model.config.Experiment#getNumberOfRequests()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_NumberOfRequests();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getNumberOfVehicles <em>Number Of Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Vehicles</em>'.
	 * @see ovgu.pave.model.config.Experiment#getNumberOfVehicles()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_NumberOfVehicles();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getServiceDuration <em>Service Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Duration</em>'.
	 * @see ovgu.pave.model.config.Experiment#getServiceDuration()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_ServiceDuration();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getMaxDelayValue <em>Max Delay Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Delay Value</em>'.
	 * @see ovgu.pave.model.config.Experiment#getMaxDelayValue()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_MaxDelayValue();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getInsideRepetitions <em>Inside Repetitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inside Repetitions</em>'.
	 * @see ovgu.pave.model.config.Experiment#getInsideRepetitions()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_InsideRepetitions();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getOutputFolder <em>Output Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Folder</em>'.
	 * @see ovgu.pave.model.config.Experiment#getOutputFolder()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_OutputFolder();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getOutsideRepetitions <em>Outside Repetitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outside Repetitions</em>'.
	 * @see ovgu.pave.model.config.Experiment#getOutsideRepetitions()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_OutsideRepetitions();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getVehicleCapacity <em>Vehicle Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Capacity</em>'.
	 * @see ovgu.pave.model.config.Experiment#getVehicleCapacity()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_VehicleCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Experiment#getFactorOnTravelTime <em>Factor On Travel Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor On Travel Time</em>'.
	 * @see ovgu.pave.model.config.Experiment#getFactorOnTravelTime()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_FactorOnTravelTime();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Experiment#getOffline <em>Offline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offline</em>'.
	 * @see ovgu.pave.model.config.Experiment#getOffline()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Offline();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Experiment#getOnline <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Online</em>'.
	 * @see ovgu.pave.model.config.Experiment#getOnline()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Online();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.GraphHopper <em>Graph Hopper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Hopper</em>'.
	 * @see ovgu.pave.model.config.GraphHopper
	 * @generated
	 */
	EClass getGraphHopper();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.GraphHopper#getOsmFilePath <em>Osm File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osm File Path</em>'.
	 * @see ovgu.pave.model.config.GraphHopper#getOsmFilePath()
	 * @see #getGraphHopper()
	 * @generated
	 */
	EAttribute getGraphHopper_OsmFilePath();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.GraphHopper#getGraphFolder <em>Graph Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Folder</em>'.
	 * @see ovgu.pave.model.config.GraphHopper#getGraphFolder()
	 * @see #getGraphHopper()
	 * @generated
	 */
	EAttribute getGraphHopper_GraphFolder();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.GraphHopper#getWeighting <em>Weighting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weighting</em>'.
	 * @see ovgu.pave.model.config.GraphHopper#getWeighting()
	 * @see #getGraphHopper()
	 * @generated
	 */
	EAttribute getGraphHopper_Weighting();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.GraphHopper#getVehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Type</em>'.
	 * @see ovgu.pave.model.config.GraphHopper#getVehicleType()
	 * @see #getGraphHopper()
	 * @generated
	 */
	EAttribute getGraphHopper_VehicleType();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.LNS <em>LNS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LNS</em>'.
	 * @see ovgu.pave.model.config.LNS
	 * @generated
	 */
	EClass getLNS();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LNS#getMinSmallRequestSet <em>Min Small Request Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Small Request Set</em>'.
	 * @see ovgu.pave.model.config.LNS#getMinSmallRequestSet()
	 * @see #getLNS()
	 * @generated
	 */
	EAttribute getLNS_MinSmallRequestSet();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LNS#getMaxLargeRequestSet <em>Max Large Request Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Large Request Set</em>'.
	 * @see ovgu.pave.model.config.LNS#getMaxLargeRequestSet()
	 * @see #getLNS()
	 * @generated
	 */
	EAttribute getLNS_MaxLargeRequestSet();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LNS#getMaxSmallRequestSet <em>Max Small Request Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Small Request Set</em>'.
	 * @see ovgu.pave.model.config.LNS#getMaxSmallRequestSet()
	 * @see #getLNS()
	 * @generated
	 */
	EAttribute getLNS_MaxSmallRequestSet();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LNS#getMinLargeRequestSet <em>Min Large Request Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Large Request Set</em>'.
	 * @see ovgu.pave.model.config.LNS#getMinLargeRequestSet()
	 * @see #getLNS()
	 * @generated
	 */
	EAttribute getLNS_MinLargeRequestSet();

	/**
	 * Returns the meta object for the containment reference list '{@link ovgu.pave.model.config.LNS#getInsertionHeuristics <em>Insertion Heuristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insertion Heuristics</em>'.
	 * @see ovgu.pave.model.config.LNS#getInsertionHeuristics()
	 * @see #getLNS()
	 * @generated
	 */
	EReference getLNS_InsertionHeuristics();

	/**
	 * Returns the meta object for the containment reference list '{@link ovgu.pave.model.config.LNS#getRemovalHeuristics <em>Removal Heuristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Removal Heuristics</em>'.
	 * @see ovgu.pave.model.config.LNS#getRemovalHeuristics()
	 * @see #getLNS()
	 * @generated
	 */
	EReference getLNS_RemovalHeuristics();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LNS#getShawDistanceWeight <em>Shaw Distance Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaw Distance Weight</em>'.
	 * @see ovgu.pave.model.config.LNS#getShawDistanceWeight()
	 * @see #getLNS()
	 * @generated
	 */
	EAttribute getLNS_ShawDistanceWeight();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LNS#getShawBeginWeight <em>Shaw Begin Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaw Begin Weight</em>'.
	 * @see ovgu.pave.model.config.LNS#getShawBeginWeight()
	 * @see #getLNS()
	 * @generated
	 */
	EAttribute getLNS_ShawBeginWeight();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.LNS#getAlns <em>Alns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alns</em>'.
	 * @see ovgu.pave.model.config.LNS#getAlns()
	 * @see #getLNS()
	 * @generated
	 */
	EReference getLNS_Alns();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.LNS#getLmns <em>Lmns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lmns</em>'.
	 * @see ovgu.pave.model.config.LNS#getLmns()
	 * @see #getLNS()
	 * @generated
	 */
	EReference getLNS_Lmns();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Heuristic <em>Heuristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heuristic</em>'.
	 * @see ovgu.pave.model.config.Heuristic
	 * @generated
	 */
	EClass getHeuristic();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Heuristic#getHeuristicName <em>Heuristic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heuristic Name</em>'.
	 * @see ovgu.pave.model.config.Heuristic#getHeuristicName()
	 * @see #getHeuristic()
	 * @generated
	 */
	EAttribute getHeuristic_HeuristicName();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Heuristic#getNoise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noise</em>'.
	 * @see ovgu.pave.model.config.Heuristic#getNoise()
	 * @see #getHeuristic()
	 * @generated
	 */
	EAttribute getHeuristic_Noise();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.RWS <em>RWS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWS</em>'.
	 * @see ovgu.pave.model.config.RWS
	 * @generated
	 */
	EClass getRWS();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RWS#getCase1 <em>Case1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case1</em>'.
	 * @see ovgu.pave.model.config.RWS#getCase1()
	 * @see #getRWS()
	 * @generated
	 */
	EAttribute getRWS_Case1();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RWS#getCase2 <em>Case2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case2</em>'.
	 * @see ovgu.pave.model.config.RWS#getCase2()
	 * @see #getRWS()
	 * @generated
	 */
	EAttribute getRWS_Case2();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RWS#getCase3 <em>Case3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case3</em>'.
	 * @see ovgu.pave.model.config.RWS#getCase3()
	 * @see #getRWS()
	 * @generated
	 */
	EAttribute getRWS_Case3();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RWS#getLastScoreInfluence <em>Last Score Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Score Influence</em>'.
	 * @see ovgu.pave.model.config.RWS#getLastScoreInfluence()
	 * @see #getRWS()
	 * @generated
	 */
	EAttribute getRWS_LastScoreInfluence();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.ALNS <em>ALNS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALNS</em>'.
	 * @see ovgu.pave.model.config.ALNS
	 * @generated
	 */
	EClass getALNS();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ALNS#getPenaltyTerm <em>Penalty Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Penalty Term</em>'.
	 * @see ovgu.pave.model.config.ALNS#getPenaltyTerm()
	 * @see #getALNS()
	 * @generated
	 */
	EAttribute getALNS_PenaltyTerm();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ALNS#getTemperatureControlParameter <em>Temperature Control Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature Control Parameter</em>'.
	 * @see ovgu.pave.model.config.ALNS#getTemperatureControlParameter()
	 * @see #getALNS()
	 * @generated
	 */
	EAttribute getALNS_TemperatureControlParameter();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ALNS#getCoolingRate <em>Cooling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooling Rate</em>'.
	 * @see ovgu.pave.model.config.ALNS#getCoolingRate()
	 * @see #getALNS()
	 * @generated
	 */
	EAttribute getALNS_CoolingRate();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ALNS#getMaxCalculationTime <em>Max Calculation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Calculation Time</em>'.
	 * @see ovgu.pave.model.config.ALNS#getMaxCalculationTime()
	 * @see #getALNS()
	 * @generated
	 */
	EAttribute getALNS_MaxCalculationTime();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ALNS#getMaxInsertionIterations <em>Max Insertion Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Insertion Iterations</em>'.
	 * @see ovgu.pave.model.config.ALNS#getMaxInsertionIterations()
	 * @see #getALNS()
	 * @generated
	 */
	EAttribute getALNS_MaxInsertionIterations();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.ALNS#getRws <em>Rws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rws</em>'.
	 * @see ovgu.pave.model.config.ALNS#getRws()
	 * @see #getALNS()
	 * @generated
	 */
	EReference getALNS_Rws();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.LMNS <em>LMNS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LMNS</em>'.
	 * @see ovgu.pave.model.config.LMNS
	 * @generated
	 */
	EClass getLMNS();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LMNS#getMaxInsertionIterations <em>Max Insertion Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Insertion Iterations</em>'.
	 * @see ovgu.pave.model.config.LMNS#getMaxInsertionIterations()
	 * @see #getLMNS()
	 * @generated
	 */
	EAttribute getLMNS_MaxInsertionIterations();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.LMNS#getMaxImprovementIterations <em>Max Improvement Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Improvement Iterations</em>'.
	 * @see ovgu.pave.model.config.LMNS#getMaxImprovementIterations()
	 * @see #getLMNS()
	 * @generated
	 */
	EAttribute getLMNS_MaxImprovementIterations();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.ORTOOLS <em>ORTOOLS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORTOOLS</em>'.
	 * @see ovgu.pave.model.config.ORTOOLS
	 * @generated
	 */
	EClass getORTOOLS();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ORTOOLS#getFirstSolutionStrategy <em>First Solution Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Solution Strategy</em>'.
	 * @see ovgu.pave.model.config.ORTOOLS#getFirstSolutionStrategy()
	 * @see #getORTOOLS()
	 * @generated
	 */
	EAttribute getORTOOLS_FirstSolutionStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ORTOOLS#getLocalSearchMetaheuristic <em>Local Search Metaheuristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Search Metaheuristic</em>'.
	 * @see ovgu.pave.model.config.ORTOOLS#getLocalSearchMetaheuristic()
	 * @see #getORTOOLS()
	 * @generated
	 */
	EAttribute getORTOOLS_LocalSearchMetaheuristic();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.ORTOOLS#getMaxCalculationTime <em>Max Calculation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Calculation Time</em>'.
	 * @see ovgu.pave.model.config.ORTOOLS#getMaxCalculationTime()
	 * @see #getORTOOLS()
	 * @generated
	 */
	EAttribute getORTOOLS_MaxCalculationTime();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Offline <em>Offline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offline</em>'.
	 * @see ovgu.pave.model.config.Offline
	 * @generated
	 */
	EClass getOffline();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Offline#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objective</em>'.
	 * @see ovgu.pave.model.config.Offline#getObjective()
	 * @see #getOffline()
	 * @generated
	 */
	EAttribute getOffline_Objective();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Online <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online</em>'.
	 * @see ovgu.pave.model.config.Online
	 * @generated
	 */
	EClass getOnline();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Online#getVehicleMovementType <em>Vehicle Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Movement Type</em>'.
	 * @see ovgu.pave.model.config.Online#getVehicleMovementType()
	 * @see #getOnline()
	 * @generated
	 */
	EAttribute getOnline_VehicleMovementType();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Online#isPreAcceptanceDecisions <em>Pre Acceptance Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Acceptance Decisions</em>'.
	 * @see ovgu.pave.model.config.Online#isPreAcceptanceDecisions()
	 * @see #getOnline()
	 * @generated
	 */
	EAttribute getOnline_PreAcceptanceDecisions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.AlgorithmImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__ALGORITHM = eINSTANCE.getAlgorithm_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Lns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__LNS = eINSTANCE.getAlgorithm_Lns();

		/**
		 * The meta object literal for the '<em><b>Random Seet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__RANDOM_SEET = eINSTANCE.getAlgorithm_RandomSeet();

		/**
		 * The meta object literal for the '<em><b>Ortools</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__ORTOOLS = eINSTANCE.getAlgorithm_Ortools();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.ConfigImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Input Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__INPUT_FOLDER = eINSTANCE.getConfig_InputFolder();

		/**
		 * The meta object literal for the '<em><b>Shortest Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__SHORTEST_PATH = eINSTANCE.getConfig_ShortestPath();

		/**
		 * The meta object literal for the '<em><b>Experiment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__EXPERIMENT = eINSTANCE.getConfig_Experiment();

		/**
		 * The meta object literal for the '<em><b>Input Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__INPUT_FILENAME = eINSTANCE.getConfig_InputFilename();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__ALGORITHM = eINSTANCE.getConfig_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Config Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__CONFIG_PATH = eINSTANCE.getConfig_ConfigPath();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.ShortestPathImpl <em>Shortest Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.ShortestPathImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getShortestPath()
		 * @generated
		 */
		EClass SHORTEST_PATH = eINSTANCE.getShortestPath();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORTEST_PATH__USE = eINSTANCE.getShortestPath_Use();

		/**
		 * The meta object literal for the '<em><b>Graphhopper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTEST_PATH__GRAPHHOPPER = eINSTANCE.getShortestPath_Graphhopper();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.ExperimentImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Planning Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__PLANNING_TYPE = eINSTANCE.getExperiment_PlanningType();

		/**
		 * The meta object literal for the '<em><b>Number Of Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__NUMBER_OF_REQUESTS = eINSTANCE.getExperiment_NumberOfRequests();

		/**
		 * The meta object literal for the '<em><b>Number Of Vehicles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__NUMBER_OF_VEHICLES = eINSTANCE.getExperiment_NumberOfVehicles();

		/**
		 * The meta object literal for the '<em><b>Service Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__SERVICE_DURATION = eINSTANCE.getExperiment_ServiceDuration();

		/**
		 * The meta object literal for the '<em><b>Max Delay Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__MAX_DELAY_VALUE = eINSTANCE.getExperiment_MaxDelayValue();

		/**
		 * The meta object literal for the '<em><b>Inside Repetitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__INSIDE_REPETITIONS = eINSTANCE.getExperiment_InsideRepetitions();

		/**
		 * The meta object literal for the '<em><b>Output Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__OUTPUT_FOLDER = eINSTANCE.getExperiment_OutputFolder();

		/**
		 * The meta object literal for the '<em><b>Outside Repetitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__OUTSIDE_REPETITIONS = eINSTANCE.getExperiment_OutsideRepetitions();

		/**
		 * The meta object literal for the '<em><b>Vehicle Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__VEHICLE_CAPACITY = eINSTANCE.getExperiment_VehicleCapacity();

		/**
		 * The meta object literal for the '<em><b>Factor On Travel Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__FACTOR_ON_TRAVEL_TIME = eINSTANCE.getExperiment_FactorOnTravelTime();

		/**
		 * The meta object literal for the '<em><b>Offline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__OFFLINE = eINSTANCE.getExperiment_Offline();

		/**
		 * The meta object literal for the '<em><b>Online</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__ONLINE = eINSTANCE.getExperiment_Online();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.GraphHopperImpl <em>Graph Hopper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.GraphHopperImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getGraphHopper()
		 * @generated
		 */
		EClass GRAPH_HOPPER = eINSTANCE.getGraphHopper();

		/**
		 * The meta object literal for the '<em><b>Osm File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_HOPPER__OSM_FILE_PATH = eINSTANCE.getGraphHopper_OsmFilePath();

		/**
		 * The meta object literal for the '<em><b>Graph Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_HOPPER__GRAPH_FOLDER = eINSTANCE.getGraphHopper_GraphFolder();

		/**
		 * The meta object literal for the '<em><b>Weighting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_HOPPER__WEIGHTING = eINSTANCE.getGraphHopper_Weighting();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_HOPPER__VEHICLE_TYPE = eINSTANCE.getGraphHopper_VehicleType();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.LNSImpl <em>LNS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.LNSImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getLNS()
		 * @generated
		 */
		EClass LNS = eINSTANCE.getLNS();

		/**
		 * The meta object literal for the '<em><b>Min Small Request Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LNS__MIN_SMALL_REQUEST_SET = eINSTANCE.getLNS_MinSmallRequestSet();

		/**
		 * The meta object literal for the '<em><b>Max Large Request Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LNS__MAX_LARGE_REQUEST_SET = eINSTANCE.getLNS_MaxLargeRequestSet();

		/**
		 * The meta object literal for the '<em><b>Max Small Request Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LNS__MAX_SMALL_REQUEST_SET = eINSTANCE.getLNS_MaxSmallRequestSet();

		/**
		 * The meta object literal for the '<em><b>Min Large Request Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LNS__MIN_LARGE_REQUEST_SET = eINSTANCE.getLNS_MinLargeRequestSet();

		/**
		 * The meta object literal for the '<em><b>Insertion Heuristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LNS__INSERTION_HEURISTICS = eINSTANCE.getLNS_InsertionHeuristics();

		/**
		 * The meta object literal for the '<em><b>Removal Heuristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LNS__REMOVAL_HEURISTICS = eINSTANCE.getLNS_RemovalHeuristics();

		/**
		 * The meta object literal for the '<em><b>Shaw Distance Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LNS__SHAW_DISTANCE_WEIGHT = eINSTANCE.getLNS_ShawDistanceWeight();

		/**
		 * The meta object literal for the '<em><b>Shaw Begin Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LNS__SHAW_BEGIN_WEIGHT = eINSTANCE.getLNS_ShawBeginWeight();

		/**
		 * The meta object literal for the '<em><b>Alns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LNS__ALNS = eINSTANCE.getLNS_Alns();

		/**
		 * The meta object literal for the '<em><b>Lmns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LNS__LMNS = eINSTANCE.getLNS_Lmns();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.HeuristicImpl <em>Heuristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.HeuristicImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getHeuristic()
		 * @generated
		 */
		EClass HEURISTIC = eINSTANCE.getHeuristic();

		/**
		 * The meta object literal for the '<em><b>Heuristic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEURISTIC__HEURISTIC_NAME = eINSTANCE.getHeuristic_HeuristicName();

		/**
		 * The meta object literal for the '<em><b>Noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEURISTIC__NOISE = eINSTANCE.getHeuristic_Noise();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.RWSImpl <em>RWS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.RWSImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getRWS()
		 * @generated
		 */
		EClass RWS = eINSTANCE.getRWS();

		/**
		 * The meta object literal for the '<em><b>Case1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWS__CASE1 = eINSTANCE.getRWS_Case1();

		/**
		 * The meta object literal for the '<em><b>Case2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWS__CASE2 = eINSTANCE.getRWS_Case2();

		/**
		 * The meta object literal for the '<em><b>Case3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWS__CASE3 = eINSTANCE.getRWS_Case3();

		/**
		 * The meta object literal for the '<em><b>Last Score Influence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWS__LAST_SCORE_INFLUENCE = eINSTANCE.getRWS_LastScoreInfluence();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.ALNSImpl <em>ALNS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.ALNSImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getALNS()
		 * @generated
		 */
		EClass ALNS = eINSTANCE.getALNS();

		/**
		 * The meta object literal for the '<em><b>Penalty Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALNS__PENALTY_TERM = eINSTANCE.getALNS_PenaltyTerm();

		/**
		 * The meta object literal for the '<em><b>Temperature Control Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALNS__TEMPERATURE_CONTROL_PARAMETER = eINSTANCE.getALNS_TemperatureControlParameter();

		/**
		 * The meta object literal for the '<em><b>Cooling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALNS__COOLING_RATE = eINSTANCE.getALNS_CoolingRate();

		/**
		 * The meta object literal for the '<em><b>Max Calculation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALNS__MAX_CALCULATION_TIME = eINSTANCE.getALNS_MaxCalculationTime();

		/**
		 * The meta object literal for the '<em><b>Max Insertion Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALNS__MAX_INSERTION_ITERATIONS = eINSTANCE.getALNS_MaxInsertionIterations();

		/**
		 * The meta object literal for the '<em><b>Rws</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALNS__RWS = eINSTANCE.getALNS_Rws();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.LMNSImpl <em>LMNS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.LMNSImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getLMNS()
		 * @generated
		 */
		EClass LMNS = eINSTANCE.getLMNS();

		/**
		 * The meta object literal for the '<em><b>Max Insertion Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMNS__MAX_INSERTION_ITERATIONS = eINSTANCE.getLMNS_MaxInsertionIterations();

		/**
		 * The meta object literal for the '<em><b>Max Improvement Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LMNS__MAX_IMPROVEMENT_ITERATIONS = eINSTANCE.getLMNS_MaxImprovementIterations();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.ORTOOLSImpl <em>ORTOOLS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.ORTOOLSImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getORTOOLS()
		 * @generated
		 */
		EClass ORTOOLS = eINSTANCE.getORTOOLS();

		/**
		 * The meta object literal for the '<em><b>First Solution Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORTOOLS__FIRST_SOLUTION_STRATEGY = eINSTANCE.getORTOOLS_FirstSolutionStrategy();

		/**
		 * The meta object literal for the '<em><b>Local Search Metaheuristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORTOOLS__LOCAL_SEARCH_METAHEURISTIC = eINSTANCE.getORTOOLS_LocalSearchMetaheuristic();

		/**
		 * The meta object literal for the '<em><b>Max Calculation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORTOOLS__MAX_CALCULATION_TIME = eINSTANCE.getORTOOLS_MaxCalculationTime();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.OfflineImpl <em>Offline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.OfflineImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getOffline()
		 * @generated
		 */
		EClass OFFLINE = eINSTANCE.getOffline();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFLINE__OBJECTIVE = eINSTANCE.getOffline_Objective();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.OnlineImpl <em>Online</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.OnlineImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getOnline()
		 * @generated
		 */
		EClass ONLINE = eINSTANCE.getOnline();

		/**
		 * The meta object literal for the '<em><b>Vehicle Movement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE__VEHICLE_MOVEMENT_TYPE = eINSTANCE.getOnline_VehicleMovementType();

		/**
		 * The meta object literal for the '<em><b>Pre Acceptance Decisions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE__PRE_ACCEPTANCE_DECISIONS = eINSTANCE.getOnline_PreAcceptanceDecisions();

	}

} //ConfigPackage
