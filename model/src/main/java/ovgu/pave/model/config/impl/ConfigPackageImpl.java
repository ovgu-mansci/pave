/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ovgu.pave.model.config.Algorithm;
import ovgu.pave.model.config.Config;
import ovgu.pave.model.config.ConfigFactory;
import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.Experiment;
import ovgu.pave.model.config.GraphHopper;
import ovgu.pave.model.config.Heuristic;
import ovgu.pave.model.config.Offline;
import ovgu.pave.model.config.Online;
import ovgu.pave.model.config.ShortestPath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigPackageImpl extends EPackageImpl implements ConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortestPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphHopperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heuristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rwsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lmnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ortoolsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ovgu.pave.model.config.ConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigPackageImpl() {
		super(eNS_URI, ConfigFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigPackage init() {
		if (isInited) return (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConfigPackageImpl theConfigPackage = registeredConfigPackage instanceof ConfigPackageImpl ? (ConfigPackageImpl)registeredConfigPackage : new ConfigPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigPackage.eNS_URI, theConfigPackage);
		return theConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_Algorithm() {
		return (EAttribute)algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Lns() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_RandomSeet() {
		return (EAttribute)algorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Ortools() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_InputFolder() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_ShortestPath() {
		return (EReference)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Experiment() {
		return (EReference)configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_InputFilename() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Algorithm() {
		return (EReference)configEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_ConfigPath() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortestPath() {
		return shortestPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortestPath_Use() {
		return (EAttribute)shortestPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortestPath_Graphhopper() {
		return (EReference)shortestPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExperiment() {
		return experimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_PlanningType() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_NumberOfRequests() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_NumberOfVehicles() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_ServiceDuration() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_MaxDelayValue() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_InsideRepetitions() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_OutputFolder() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_OutsideRepetitions() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_VehicleCapacity() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExperiment_FactorOnTravelTime() {
		return (EAttribute)experimentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperiment_Offline() {
		return (EReference)experimentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExperiment_Online() {
		return (EReference)experimentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphHopper() {
		return graphHopperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphHopper_OsmFilePath() {
		return (EAttribute)graphHopperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphHopper_GraphFolder() {
		return (EAttribute)graphHopperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphHopper_Weighting() {
		return (EAttribute)graphHopperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphHopper_VehicleType() {
		return (EAttribute)graphHopperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLNS() {
		return lnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLNS_MinSmallRequestSet() {
		return (EAttribute)lnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLNS_MaxLargeRequestSet() {
		return (EAttribute)lnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLNS_MaxSmallRequestSet() {
		return (EAttribute)lnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLNS_MinLargeRequestSet() {
		return (EAttribute)lnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLNS_InsertionHeuristics() {
		return (EReference)lnsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLNS_RemovalHeuristics() {
		return (EReference)lnsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLNS_ShawDistanceWeight() {
		return (EAttribute)lnsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLNS_ShawBeginWeight() {
		return (EAttribute)lnsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLNS_Alns() {
		return (EReference)lnsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLNS_Lmns() {
		return (EReference)lnsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeuristic() {
		return heuristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeuristic_HeuristicName() {
		return (EAttribute)heuristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeuristic_Noise() {
		return (EAttribute)heuristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWS() {
		return rwsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWS_Case1() {
		return (EAttribute)rwsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWS_Case2() {
		return (EAttribute)rwsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWS_Case3() {
		return (EAttribute)rwsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWS_LastScoreInfluence() {
		return (EAttribute)rwsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALNS() {
		return alnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALNS_PenaltyTerm() {
		return (EAttribute)alnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALNS_TemperatureControlParameter() {
		return (EAttribute)alnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALNS_CoolingRate() {
		return (EAttribute)alnsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALNS_MaxCalculationTime() {
		return (EAttribute)alnsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALNS_MaxInsertionIterations() {
		return (EAttribute)alnsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALNS_Rws() {
		return (EReference)alnsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLMNS() {
		return lmnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLMNS_MaxInsertionIterations() {
		return (EAttribute)lmnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLMNS_MaxImprovementIterations() {
		return (EAttribute)lmnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORTOOLS() {
		return ortoolsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORTOOLS_FirstSolutionStrategy() {
		return (EAttribute)ortoolsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORTOOLS_LocalSearchMetaheuristic() {
		return (EAttribute)ortoolsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORTOOLS_MaxCalculationTime() {
		return (EAttribute)ortoolsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffline() {
		return offlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffline_Objective() {
		return (EAttribute)offlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnline() {
		return onlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnline_VehicleMovementType() {
		return (EAttribute)onlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnline_PreAcceptanceDecisions() {
		return (EAttribute)onlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactory getConfigFactory() {
		return (ConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		algorithmEClass = createEClass(ALGORITHM);
		createEAttribute(algorithmEClass, ALGORITHM__ALGORITHM);
		createEReference(algorithmEClass, ALGORITHM__LNS);
		createEAttribute(algorithmEClass, ALGORITHM__RANDOM_SEET);
		createEReference(algorithmEClass, ALGORITHM__ORTOOLS);

		configEClass = createEClass(CONFIG);
		createEAttribute(configEClass, CONFIG__INPUT_FOLDER);
		createEReference(configEClass, CONFIG__SHORTEST_PATH);
		createEReference(configEClass, CONFIG__EXPERIMENT);
		createEAttribute(configEClass, CONFIG__INPUT_FILENAME);
		createEReference(configEClass, CONFIG__ALGORITHM);
		createEAttribute(configEClass, CONFIG__CONFIG_PATH);

		shortestPathEClass = createEClass(SHORTEST_PATH);
		createEAttribute(shortestPathEClass, SHORTEST_PATH__USE);
		createEReference(shortestPathEClass, SHORTEST_PATH__GRAPHHOPPER);

		experimentEClass = createEClass(EXPERIMENT);
		createEAttribute(experimentEClass, EXPERIMENT__PLANNING_TYPE);
		createEAttribute(experimentEClass, EXPERIMENT__NUMBER_OF_REQUESTS);
		createEAttribute(experimentEClass, EXPERIMENT__NUMBER_OF_VEHICLES);
		createEAttribute(experimentEClass, EXPERIMENT__SERVICE_DURATION);
		createEAttribute(experimentEClass, EXPERIMENT__MAX_DELAY_VALUE);
		createEAttribute(experimentEClass, EXPERIMENT__INSIDE_REPETITIONS);
		createEAttribute(experimentEClass, EXPERIMENT__OUTPUT_FOLDER);
		createEAttribute(experimentEClass, EXPERIMENT__OUTSIDE_REPETITIONS);
		createEAttribute(experimentEClass, EXPERIMENT__VEHICLE_CAPACITY);
		createEAttribute(experimentEClass, EXPERIMENT__FACTOR_ON_TRAVEL_TIME);
		createEReference(experimentEClass, EXPERIMENT__OFFLINE);
		createEReference(experimentEClass, EXPERIMENT__ONLINE);

		graphHopperEClass = createEClass(GRAPH_HOPPER);
		createEAttribute(graphHopperEClass, GRAPH_HOPPER__OSM_FILE_PATH);
		createEAttribute(graphHopperEClass, GRAPH_HOPPER__GRAPH_FOLDER);
		createEAttribute(graphHopperEClass, GRAPH_HOPPER__WEIGHTING);
		createEAttribute(graphHopperEClass, GRAPH_HOPPER__VEHICLE_TYPE);

		lnsEClass = createEClass(LNS);
		createEAttribute(lnsEClass, LNS__MIN_SMALL_REQUEST_SET);
		createEAttribute(lnsEClass, LNS__MAX_LARGE_REQUEST_SET);
		createEAttribute(lnsEClass, LNS__MAX_SMALL_REQUEST_SET);
		createEAttribute(lnsEClass, LNS__MIN_LARGE_REQUEST_SET);
		createEReference(lnsEClass, LNS__INSERTION_HEURISTICS);
		createEReference(lnsEClass, LNS__REMOVAL_HEURISTICS);
		createEAttribute(lnsEClass, LNS__SHAW_DISTANCE_WEIGHT);
		createEAttribute(lnsEClass, LNS__SHAW_BEGIN_WEIGHT);
		createEReference(lnsEClass, LNS__ALNS);
		createEReference(lnsEClass, LNS__LMNS);

		heuristicEClass = createEClass(HEURISTIC);
		createEAttribute(heuristicEClass, HEURISTIC__HEURISTIC_NAME);
		createEAttribute(heuristicEClass, HEURISTIC__NOISE);

		rwsEClass = createEClass(RWS);
		createEAttribute(rwsEClass, RWS__CASE1);
		createEAttribute(rwsEClass, RWS__CASE2);
		createEAttribute(rwsEClass, RWS__CASE3);
		createEAttribute(rwsEClass, RWS__LAST_SCORE_INFLUENCE);

		alnsEClass = createEClass(ALNS);
		createEAttribute(alnsEClass, ALNS__PENALTY_TERM);
		createEAttribute(alnsEClass, ALNS__TEMPERATURE_CONTROL_PARAMETER);
		createEAttribute(alnsEClass, ALNS__COOLING_RATE);
		createEAttribute(alnsEClass, ALNS__MAX_CALCULATION_TIME);
		createEAttribute(alnsEClass, ALNS__MAX_INSERTION_ITERATIONS);
		createEReference(alnsEClass, ALNS__RWS);

		lmnsEClass = createEClass(LMNS);
		createEAttribute(lmnsEClass, LMNS__MAX_INSERTION_ITERATIONS);
		createEAttribute(lmnsEClass, LMNS__MAX_IMPROVEMENT_ITERATIONS);

		ortoolsEClass = createEClass(ORTOOLS);
		createEAttribute(ortoolsEClass, ORTOOLS__FIRST_SOLUTION_STRATEGY);
		createEAttribute(ortoolsEClass, ORTOOLS__LOCAL_SEARCH_METAHEURISTIC);
		createEAttribute(ortoolsEClass, ORTOOLS__MAX_CALCULATION_TIME);

		offlineEClass = createEClass(OFFLINE);
		createEAttribute(offlineEClass, OFFLINE__OBJECTIVE);

		onlineEClass = createEClass(ONLINE);
		createEAttribute(onlineEClass, ONLINE__VEHICLE_MOVEMENT_TYPE);
		createEAttribute(onlineEClass, ONLINE__PRE_ACCEPTANCE_DECISIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(algorithmEClass, Algorithm.class, "Algorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithm_Algorithm(), ecorePackage.getEString(), "algorithm", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Lns(), this.getLNS(), null, "lns", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithm_RandomSeet(), ecorePackage.getEInt(), "randomSeet", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Ortools(), this.getORTOOLS(), null, "ortools", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfig_InputFolder(), ecorePackage.getEString(), "inputFolder", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_ShortestPath(), this.getShortestPath(), null, "shortestPath", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Experiment(), this.getExperiment(), null, "experiment", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_InputFilename(), ecorePackage.getEString(), "inputFilename", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Algorithm(), this.getAlgorithm(), null, "algorithm", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_ConfigPath(), ecorePackage.getEString(), "configPath", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortestPathEClass, ShortestPath.class, "ShortestPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortestPath_Use(), ecorePackage.getEString(), "use", null, 0, 1, ShortestPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortestPath_Graphhopper(), this.getGraphHopper(), null, "graphhopper", null, 0, 1, ShortestPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(experimentEClass, Experiment.class, "Experiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExperiment_PlanningType(), ecorePackage.getEString(), "planningType", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_NumberOfRequests(), ecorePackage.getEInt(), "numberOfRequests", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_NumberOfVehicles(), ecorePackage.getEInt(), "numberOfVehicles", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_ServiceDuration(), ecorePackage.getEInt(), "serviceDuration", "0", 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_MaxDelayValue(), ecorePackage.getELong(), "maxDelayValue", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_InsideRepetitions(), ecorePackage.getEInt(), "insideRepetitions", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_OutputFolder(), ecorePackage.getEString(), "outputFolder", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_OutsideRepetitions(), ecorePackage.getEInt(), "outsideRepetitions", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_VehicleCapacity(), ecorePackage.getEInt(), "vehicleCapacity", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExperiment_FactorOnTravelTime(), ecorePackage.getEDouble(), "factorOnTravelTime", "1", 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperiment_Offline(), this.getOffline(), null, "offline", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExperiment_Online(), this.getOnline(), null, "online", null, 0, 1, Experiment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphHopperEClass, GraphHopper.class, "GraphHopper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphHopper_OsmFilePath(), ecorePackage.getEString(), "osmFilePath", null, 0, 1, GraphHopper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphHopper_GraphFolder(), ecorePackage.getEString(), "graphFolder", null, 0, 1, GraphHopper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphHopper_Weighting(), ecorePackage.getEString(), "weighting", null, 0, 1, GraphHopper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphHopper_VehicleType(), ecorePackage.getEString(), "vehicleType", null, 0, 1, GraphHopper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lnsEClass, ovgu.pave.model.config.LNS.class, "LNS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLNS_MinSmallRequestSet(), ecorePackage.getEDouble(), "minSmallRequestSet", null, 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLNS_MaxLargeRequestSet(), ecorePackage.getEInt(), "maxLargeRequestSet", "999999", 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLNS_MaxSmallRequestSet(), ecorePackage.getEDouble(), "maxSmallRequestSet", null, 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLNS_MinLargeRequestSet(), ecorePackage.getEInt(), "minLargeRequestSet", "999999", 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLNS_InsertionHeuristics(), this.getHeuristic(), null, "insertionHeuristics", null, 0, -1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLNS_RemovalHeuristics(), this.getHeuristic(), null, "removalHeuristics", null, 0, -1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLNS_ShawDistanceWeight(), ecorePackage.getEDouble(), "shawDistanceWeight", "1", 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLNS_ShawBeginWeight(), ecorePackage.getEDouble(), "shawBeginWeight", "1", 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLNS_Alns(), this.getALNS(), null, "alns", null, 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLNS_Lmns(), this.getLMNS(), null, "lmns", null, 0, 1, ovgu.pave.model.config.LNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(heuristicEClass, Heuristic.class, "Heuristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeuristic_HeuristicName(), ecorePackage.getEString(), "heuristicName", null, 0, 1, Heuristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeuristic_Noise(), ecorePackage.getEInt(), "noise", null, 0, 1, Heuristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rwsEClass, ovgu.pave.model.config.RWS.class, "RWS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWS_Case1(), ecorePackage.getEInt(), "Case1", null, 0, 1, ovgu.pave.model.config.RWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWS_Case2(), ecorePackage.getEInt(), "Case2", null, 0, 1, ovgu.pave.model.config.RWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWS_Case3(), ecorePackage.getEInt(), "Case3", null, 0, 1, ovgu.pave.model.config.RWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWS_LastScoreInfluence(), ecorePackage.getEDouble(), "lastScoreInfluence", null, 0, 1, ovgu.pave.model.config.RWS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alnsEClass, ovgu.pave.model.config.ALNS.class, "ALNS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getALNS_PenaltyTerm(), ecorePackage.getEInt(), "penaltyTerm", null, 0, 1, ovgu.pave.model.config.ALNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getALNS_TemperatureControlParameter(), ecorePackage.getEDouble(), "temperatureControlParameter", null, 0, 1, ovgu.pave.model.config.ALNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getALNS_CoolingRate(), ecorePackage.getEDouble(), "coolingRate", null, 0, 1, ovgu.pave.model.config.ALNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getALNS_MaxCalculationTime(), ecorePackage.getELong(), "maxCalculationTime", null, 0, 1, ovgu.pave.model.config.ALNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getALNS_MaxInsertionIterations(), ecorePackage.getEInt(), "maxInsertionIterations", null, 0, 1, ovgu.pave.model.config.ALNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getALNS_Rws(), this.getRWS(), null, "rws", null, 1, 1, ovgu.pave.model.config.ALNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lmnsEClass, ovgu.pave.model.config.LMNS.class, "LMNS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLMNS_MaxInsertionIterations(), ecorePackage.getEInt(), "maxInsertionIterations", null, 0, 1, ovgu.pave.model.config.LMNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLMNS_MaxImprovementIterations(), ecorePackage.getEInt(), "maxImprovementIterations", null, 0, 1, ovgu.pave.model.config.LMNS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ortoolsEClass, ovgu.pave.model.config.ORTOOLS.class, "ORTOOLS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getORTOOLS_FirstSolutionStrategy(), ecorePackage.getEString(), "firstSolutionStrategy", null, 0, 1, ovgu.pave.model.config.ORTOOLS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORTOOLS_LocalSearchMetaheuristic(), ecorePackage.getEString(), "localSearchMetaheuristic", null, 0, 1, ovgu.pave.model.config.ORTOOLS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORTOOLS_MaxCalculationTime(), ecorePackage.getELong(), "maxCalculationTime", null, 0, 1, ovgu.pave.model.config.ORTOOLS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offlineEClass, Offline.class, "Offline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffline_Objective(), ecorePackage.getEString(), "objective", null, 0, 1, Offline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onlineEClass, Online.class, "Online", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnline_VehicleMovementType(), ecorePackage.getEString(), "vehicleMovementType", null, 0, 1, Online.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnline_PreAcceptanceDecisions(), ecorePackage.getEBoolean(), "preAcceptanceDecisions", null, 0, 1, Online.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigPackageImpl
