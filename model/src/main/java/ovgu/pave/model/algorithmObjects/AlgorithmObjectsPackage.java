/**
 */
package ovgu.pave.model.algorithmObjects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmObjectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithmObjects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ovgu.pave.algorithmObjects";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmObjectsPackage eINSTANCE = ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl <em>Search Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getSearchStatistics()
	 * @generated
	 */
	int SEARCH_STATISTICS = 0;

	/**
	 * The feature id for the '<em><b>Iterations Before Acceptance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE = 0;

	/**
	 * The feature id for the '<em><b>Number Of Acceptances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES = 1;

	/**
	 * The feature id for the '<em><b>Number Of Reschedulable Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS = 2;

	/**
	 * The feature id for the '<em><b>Search Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__SEARCH_DURATION = 3;

	/**
	 * The feature id for the '<em><b>Invalid Due Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__INVALID_DUE_CAPACITY = 4;

	/**
	 * The feature id for the '<em><b>Invalid Due Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__INVALID_DUE_TIME = 5;

	/**
	 * The feature id for the '<em><b>On The Fly Rescheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING = 6;

	/**
	 * The feature id for the '<em><b>Way Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__WAY_POINTS = 7;

	/**
	 * The feature id for the '<em><b>Removal Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS__REMOVAL_ITERATIONS = 8;

	/**
	 * The number of structural features of the '<em>Search Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Search Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl <em>Insertion Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionInformation()
	 * @generated
	 */
	int INSERTION_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Insertion Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION__INSERTION_OPTIONS = 0;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION__REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION__SCORE = 2;

	/**
	 * The number of structural features of the '<em>Insertion Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set Score For Regret Heuristic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION___SET_SCORE_FOR_REGRET_HEURISTIC__INT = 0;

	/**
	 * The number of operations of the '<em>Insertion Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl <em>Insertion Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionOption()
	 * @generated
	 */
	int INSERTION_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__COSTS = 0;

	/**
	 * The feature id for the '<em><b>First Activity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__FIRST_ACTIVITY_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Second Activity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__SECOND_ACTIVITY_INDEX = 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__ROUTE = 3;

	/**
	 * The number of structural features of the '<em>Insertion Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Insertion Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl <em>Removal Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRemovalOption()
	 * @generated
	 */
	int REMOVAL_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION__SCORE = 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION__ROUTE = 1;

	/**
	 * The feature id for the '<em><b>First Activity Route Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Second Activity Route Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Shaw Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION__SHAW_DISTANCE = 4;

	/**
	 * The feature id for the '<em><b>Shaw Service Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION__SHAW_SERVICE_BEGIN = 5;

	/**
	 * The number of structural features of the '<em>Removal Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Removal Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.RemovalInformationImpl <em>Removal Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.RemovalInformationImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRemovalInformation()
	 * @generated
	 */
	int REMOVAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Number Of Removals Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST = 0;

	/**
	 * The number of structural features of the '<em>Removal Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_INFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Removal Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Route</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.Route
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 5;

	/**
	 * The meta object id for the '<em>Route Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.RouteElement
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRouteElement()
	 * @generated
	 */
	int ROUTE_ELEMENT = 6;

	/**
	 * The meta object id for the '<em>Reuqests Hash Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getReuqestsHashMap()
	 * @generated
	 */
	int REUQESTS_HASH_MAP = 7;

	/**
	 * The meta object id for the '<em>Requests</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.Request
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRequests()
	 * @generated
	 */
	int REQUESTS = 8;


	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.SearchStatistics <em>Search Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Statistics</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics
	 * @generated
	 */
	EClass getSearchStatistics();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getIterationsBeforeAcceptance <em>Iterations Before Acceptance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations Before Acceptance</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getIterationsBeforeAcceptance()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_IterationsBeforeAcceptance();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfAcceptances <em>Number Of Acceptances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Acceptances</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfAcceptances()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_NumberOfAcceptances();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfReschedulableRequests <em>Number Of Reschedulable Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Reschedulable Requests</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfReschedulableRequests()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_NumberOfReschedulableRequests();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getSearchDuration <em>Search Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Duration</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getSearchDuration()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_SearchDuration();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueCapacity <em>Invalid Due Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Due Capacity</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueCapacity()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_InvalidDueCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueTime <em>Invalid Due Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invalid Due Time</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueTime()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_InvalidDueTime();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getOnTheFlyRescheduling <em>On The Fly Rescheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On The Fly Rescheduling</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getOnTheFlyRescheduling()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_OnTheFlyRescheduling();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getWayPoints <em>Way Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Way Points</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getWayPoints()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_WayPoints();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getRemovalIterations <em>Removal Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Iterations</em>'.
	 * @see ovgu.pave.model.algorithmObjects.SearchStatistics#getRemovalIterations()
	 * @see #getSearchStatistics()
	 * @generated
	 */
	EAttribute getSearchStatistics_RemovalIterations();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.InsertionInformation <em>Insertion Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Information</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation
	 * @generated
	 */
	EClass getInsertionInformation();

	/**
	 * Returns the meta object for the reference list '{@link ovgu.pave.model.algorithmObjects.InsertionInformation#getInsertionOptions <em>Insertion Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Insertion Options</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation#getInsertionOptions()
	 * @see #getInsertionInformation()
	 * @generated
	 */
	EReference getInsertionInformation_InsertionOptions();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionInformation#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation#getRequest()
	 * @see #getInsertionInformation()
	 * @generated
	 */
	EAttribute getInsertionInformation_Request();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionInformation#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation#getScore()
	 * @see #getInsertionInformation()
	 * @generated
	 */
	EAttribute getInsertionInformation_Score();

	/**
	 * Returns the meta object for the '{@link ovgu.pave.model.algorithmObjects.InsertionInformation#setScoreForRegretHeuristic(int) <em>Set Score For Regret Heuristic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Score For Regret Heuristic</em>' operation.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation#setScoreForRegretHeuristic(int)
	 * @generated
	 */
	EOperation getInsertionInformation__SetScoreForRegretHeuristic__int();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.InsertionOption <em>Insertion Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Option</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption
	 * @generated
	 */
	EClass getInsertionOption();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getCosts()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_Costs();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getFirstActivityIndex <em>First Activity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Activity Index</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getFirstActivityIndex()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_FirstActivityIndex();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getSecondActivityIndex <em>Second Activity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Activity Index</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getSecondActivityIndex()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_SecondActivityIndex();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getRoute()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_Route();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.RemovalOption <em>Removal Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removal Option</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption
	 * @generated
	 */
	EClass getRemovalOption();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption#getScore()
	 * @see #getRemovalOption()
	 * @generated
	 */
	EAttribute getRemovalOption_Score();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption#getRoute()
	 * @see #getRemovalOption()
	 * @generated
	 */
	EAttribute getRemovalOption_Route();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getFirstActivityRouteElement <em>First Activity Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Activity Route Element</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption#getFirstActivityRouteElement()
	 * @see #getRemovalOption()
	 * @generated
	 */
	EAttribute getRemovalOption_FirstActivityRouteElement();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getSecondActivityRouteElement <em>Second Activity Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Activity Route Element</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption#getSecondActivityRouteElement()
	 * @see #getRemovalOption()
	 * @generated
	 */
	EAttribute getRemovalOption_SecondActivityRouteElement();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getShawDistance <em>Shaw Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaw Distance</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption#getShawDistance()
	 * @see #getRemovalOption()
	 * @generated
	 */
	EAttribute getRemovalOption_ShawDistance();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getShawServiceBegin <em>Shaw Service Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shaw Service Begin</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalOption#getShawServiceBegin()
	 * @see #getRemovalOption()
	 * @generated
	 */
	EAttribute getRemovalOption_ShawServiceBegin();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.RemovalInformation <em>Removal Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removal Information</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalInformation
	 * @generated
	 */
	EClass getRemovalInformation();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.RemovalInformation#getNumberOfRemovalsPerRequest <em>Number Of Removals Per Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Removals Per Request</em>'.
	 * @see ovgu.pave.model.algorithmObjects.RemovalInformation#getNumberOfRemovalsPerRequest()
	 * @see #getRemovalInformation()
	 * @generated
	 */
	EAttribute getRemovalInformation_NumberOfRemovalsPerRequest();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.solution.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Route</em>'.
	 * @see ovgu.pave.model.solution.Route
	 * @model instanceClass="ovgu.pave.model.solution.Route"
	 * @generated
	 */
	EDataType getRoute();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.solution.RouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Route Element</em>'.
	 * @see ovgu.pave.model.solution.RouteElement
	 * @model instanceClass="ovgu.pave.model.solution.RouteElement"
	 * @generated
	 */
	EDataType getRouteElement();

	/**
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Reuqests Hash Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reuqests Hash Map</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap&lt;ovgu.pave.model.input.Request, java.lang.Long&gt;"
	 * @generated
	 */
	EDataType getReuqestsHashMap();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.input.Request <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Requests</em>'.
	 * @see ovgu.pave.model.input.Request
	 * @model instanceClass="ovgu.pave.model.input.Request"
	 * @generated
	 */
	EDataType getRequests();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmObjectsFactory getAlgorithmObjectsFactory();

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
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl <em>Search Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getSearchStatistics()
		 * @generated
		 */
		EClass SEARCH_STATISTICS = eINSTANCE.getSearchStatistics();

		/**
		 * The meta object literal for the '<em><b>Iterations Before Acceptance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE = eINSTANCE.getSearchStatistics_IterationsBeforeAcceptance();

		/**
		 * The meta object literal for the '<em><b>Number Of Acceptances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES = eINSTANCE.getSearchStatistics_NumberOfAcceptances();

		/**
		 * The meta object literal for the '<em><b>Number Of Reschedulable Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS = eINSTANCE.getSearchStatistics_NumberOfReschedulableRequests();

		/**
		 * The meta object literal for the '<em><b>Search Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__SEARCH_DURATION = eINSTANCE.getSearchStatistics_SearchDuration();

		/**
		 * The meta object literal for the '<em><b>Invalid Due Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__INVALID_DUE_CAPACITY = eINSTANCE.getSearchStatistics_InvalidDueCapacity();

		/**
		 * The meta object literal for the '<em><b>Invalid Due Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__INVALID_DUE_TIME = eINSTANCE.getSearchStatistics_InvalidDueTime();

		/**
		 * The meta object literal for the '<em><b>On The Fly Rescheduling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING = eINSTANCE.getSearchStatistics_OnTheFlyRescheduling();

		/**
		 * The meta object literal for the '<em><b>Way Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__WAY_POINTS = eINSTANCE.getSearchStatistics_WayPoints();

		/**
		 * The meta object literal for the '<em><b>Removal Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_STATISTICS__REMOVAL_ITERATIONS = eINSTANCE.getSearchStatistics_RemovalIterations();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl <em>Insertion Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionInformation()
		 * @generated
		 */
		EClass INSERTION_INFORMATION = eINSTANCE.getInsertionInformation();

		/**
		 * The meta object literal for the '<em><b>Insertion Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_INFORMATION__INSERTION_OPTIONS = eINSTANCE.getInsertionInformation_InsertionOptions();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_INFORMATION__REQUEST = eINSTANCE.getInsertionInformation_Request();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_INFORMATION__SCORE = eINSTANCE.getInsertionInformation_Score();

		/**
		 * The meta object literal for the '<em><b>Set Score For Regret Heuristic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSERTION_INFORMATION___SET_SCORE_FOR_REGRET_HEURISTIC__INT = eINSTANCE.getInsertionInformation__SetScoreForRegretHeuristic__int();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl <em>Insertion Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionOption()
		 * @generated
		 */
		EClass INSERTION_OPTION = eINSTANCE.getInsertionOption();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__COSTS = eINSTANCE.getInsertionOption_Costs();

		/**
		 * The meta object literal for the '<em><b>First Activity Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__FIRST_ACTIVITY_INDEX = eINSTANCE.getInsertionOption_FirstActivityIndex();

		/**
		 * The meta object literal for the '<em><b>Second Activity Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__SECOND_ACTIVITY_INDEX = eINSTANCE.getInsertionOption_SecondActivityIndex();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__ROUTE = eINSTANCE.getInsertionOption_Route();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl <em>Removal Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRemovalOption()
		 * @generated
		 */
		EClass REMOVAL_OPTION = eINSTANCE.getRemovalOption();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_OPTION__SCORE = eINSTANCE.getRemovalOption_Score();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_OPTION__ROUTE = eINSTANCE.getRemovalOption_Route();

		/**
		 * The meta object literal for the '<em><b>First Activity Route Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT = eINSTANCE.getRemovalOption_FirstActivityRouteElement();

		/**
		 * The meta object literal for the '<em><b>Second Activity Route Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT = eINSTANCE.getRemovalOption_SecondActivityRouteElement();

		/**
		 * The meta object literal for the '<em><b>Shaw Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_OPTION__SHAW_DISTANCE = eINSTANCE.getRemovalOption_ShawDistance();

		/**
		 * The meta object literal for the '<em><b>Shaw Service Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_OPTION__SHAW_SERVICE_BEGIN = eINSTANCE.getRemovalOption_ShawServiceBegin();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.RemovalInformationImpl <em>Removal Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.RemovalInformationImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRemovalInformation()
		 * @generated
		 */
		EClass REMOVAL_INFORMATION = eINSTANCE.getRemovalInformation();

		/**
		 * The meta object literal for the '<em><b>Number Of Removals Per Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST = eINSTANCE.getRemovalInformation_NumberOfRemovalsPerRequest();

		/**
		 * The meta object literal for the '<em>Route</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.Route
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRoute()
		 * @generated
		 */
		EDataType ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em>Route Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.RouteElement
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRouteElement()
		 * @generated
		 */
		EDataType ROUTE_ELEMENT = eINSTANCE.getRouteElement();

		/**
		 * The meta object literal for the '<em>Reuqests Hash Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getReuqestsHashMap()
		 * @generated
		 */
		EDataType REUQESTS_HASH_MAP = eINSTANCE.getReuqestsHashMap();

		/**
		 * The meta object literal for the '<em>Requests</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.Request
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRequests()
		 * @generated
		 */
		EDataType REQUESTS = eINSTANCE.getRequests();

	}

} //AlgorithmObjectsPackage
