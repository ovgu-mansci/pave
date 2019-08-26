/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import java.util.HashMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsFactory;
import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.algorithmObjects.RemovalInformation;
import ovgu.pave.model.algorithmObjects.RemovalOption;
import ovgu.pave.model.algorithmObjects.SearchStatistics;

import ovgu.pave.model.input.Request;

import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmObjectsPackageImpl extends EPackageImpl implements AlgorithmObjectsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchStatisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removalOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removalInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType routeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType routeElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reuqestsHashMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requestsEDataType = null;

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
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmObjectsPackageImpl() {
		super(eNS_URI, AlgorithmObjectsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlgorithmObjectsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmObjectsPackage init() {
		if (isInited) return (AlgorithmObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmObjectsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgorithmObjectsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgorithmObjectsPackageImpl theAlgorithmObjectsPackage = registeredAlgorithmObjectsPackage instanceof AlgorithmObjectsPackageImpl ? (AlgorithmObjectsPackageImpl)registeredAlgorithmObjectsPackage : new AlgorithmObjectsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAlgorithmObjectsPackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmObjectsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmObjectsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmObjectsPackage.eNS_URI, theAlgorithmObjectsPackage);
		return theAlgorithmObjectsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchStatistics() {
		return searchStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_IterationsBeforeAcceptance() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_NumberOfAcceptances() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_NumberOfReschedulableRequests() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_SearchDuration() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_InvalidDueCapacity() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_InvalidDueTime() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_OnTheFlyRescheduling() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_WayPoints() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchStatistics_RemovalIterations() {
		return (EAttribute)searchStatisticsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertionInformation() {
		return insertionInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionInformation_InsertionOptions() {
		return (EReference)insertionInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionInformation_Request() {
		return (EAttribute)insertionInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionInformation_Score() {
		return (EAttribute)insertionInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInsertionInformation__SetScoreForRegretHeuristic__int() {
		return insertionInformationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertionOption() {
		return insertionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_Costs() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_FirstActivityIndex() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_SecondActivityIndex() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_Route() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovalOption() {
		return removalOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemovalOption_Score() {
		return (EAttribute)removalOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemovalOption_Route() {
		return (EAttribute)removalOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemovalOption_FirstActivityRouteElement() {
		return (EAttribute)removalOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemovalOption_SecondActivityRouteElement() {
		return (EAttribute)removalOptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemovalOption_ShawDistance() {
		return (EAttribute)removalOptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemovalOption_ShawServiceBegin() {
		return (EAttribute)removalOptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovalInformation() {
		return removalInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemovalInformation_NumberOfRemovalsPerRequest() {
		return (EAttribute)removalInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoute() {
		return routeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRouteElement() {
		return routeElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReuqestsHashMap() {
		return reuqestsHashMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequests() {
		return requestsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmObjectsFactory getAlgorithmObjectsFactory() {
		return (AlgorithmObjectsFactory)getEFactoryInstance();
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
		searchStatisticsEClass = createEClass(SEARCH_STATISTICS);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__SEARCH_DURATION);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__INVALID_DUE_CAPACITY);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__INVALID_DUE_TIME);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__WAY_POINTS);
		createEAttribute(searchStatisticsEClass, SEARCH_STATISTICS__REMOVAL_ITERATIONS);

		insertionInformationEClass = createEClass(INSERTION_INFORMATION);
		createEReference(insertionInformationEClass, INSERTION_INFORMATION__INSERTION_OPTIONS);
		createEAttribute(insertionInformationEClass, INSERTION_INFORMATION__REQUEST);
		createEAttribute(insertionInformationEClass, INSERTION_INFORMATION__SCORE);
		createEOperation(insertionInformationEClass, INSERTION_INFORMATION___SET_SCORE_FOR_REGRET_HEURISTIC__INT);

		insertionOptionEClass = createEClass(INSERTION_OPTION);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__COSTS);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__FIRST_ACTIVITY_INDEX);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__SECOND_ACTIVITY_INDEX);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__ROUTE);

		removalOptionEClass = createEClass(REMOVAL_OPTION);
		createEAttribute(removalOptionEClass, REMOVAL_OPTION__SCORE);
		createEAttribute(removalOptionEClass, REMOVAL_OPTION__ROUTE);
		createEAttribute(removalOptionEClass, REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT);
		createEAttribute(removalOptionEClass, REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT);
		createEAttribute(removalOptionEClass, REMOVAL_OPTION__SHAW_DISTANCE);
		createEAttribute(removalOptionEClass, REMOVAL_OPTION__SHAW_SERVICE_BEGIN);

		removalInformationEClass = createEClass(REMOVAL_INFORMATION);
		createEAttribute(removalInformationEClass, REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST);

		// Create data types
		routeEDataType = createEDataType(ROUTE);
		routeElementEDataType = createEDataType(ROUTE_ELEMENT);
		reuqestsHashMapEDataType = createEDataType(REUQESTS_HASH_MAP);
		requestsEDataType = createEDataType(REQUESTS);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(searchStatisticsEClass, SearchStatistics.class, "SearchStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSearchStatistics_IterationsBeforeAcceptance(), theXMLTypePackage.getInt(), "iterationsBeforeAcceptance", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_NumberOfAcceptances(), ecorePackage.getEInt(), "numberOfAcceptances", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_NumberOfReschedulableRequests(), ecorePackage.getEInt(), "numberOfReschedulableRequests", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_SearchDuration(), ecorePackage.getELong(), "searchDuration", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_InvalidDueCapacity(), ecorePackage.getEInt(), "invalidDueCapacity", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_InvalidDueTime(), ecorePackage.getEInt(), "invalidDueTime", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_OnTheFlyRescheduling(), ecorePackage.getEInt(), "onTheFlyRescheduling", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_WayPoints(), ecorePackage.getEInt(), "wayPoints", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSearchStatistics_RemovalIterations(), ecorePackage.getEInt(), "removalIterations", null, 0, 1, SearchStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertionInformationEClass, InsertionInformation.class, "InsertionInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsertionInformation_InsertionOptions(), this.getInsertionOption(), null, "insertionOptions", null, 0, -1, InsertionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionInformation_Request(), this.getRequests(), "request", null, 1, 1, InsertionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionInformation_Score(), ecorePackage.getELong(), "score", null, 0, 1, InsertionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getInsertionInformation__SetScoreForRegretHeuristic__int(), null, "setScoreForRegretHeuristic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "regretValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(insertionOptionEClass, InsertionOption.class, "InsertionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertionOption_Costs(), ecorePackage.getELong(), "costs", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionOption_FirstActivityIndex(), ecorePackage.getEInt(), "firstActivityIndex", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionOption_SecondActivityIndex(), ecorePackage.getEInt(), "secondActivityIndex", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionOption_Route(), this.getRoute(), "route", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removalOptionEClass, RemovalOption.class, "RemovalOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemovalOption_Score(), ecorePackage.getELong(), "score", null, 0, 1, RemovalOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalOption_Route(), this.getRoute(), "route", null, 0, 1, RemovalOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalOption_FirstActivityRouteElement(), this.getRouteElement(), "firstActivityRouteElement", null, 0, 1, RemovalOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalOption_SecondActivityRouteElement(), this.getRouteElement(), "secondActivityRouteElement", null, 0, 1, RemovalOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalOption_ShawDistance(), ecorePackage.getELong(), "shawDistance", null, 0, 1, RemovalOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemovalOption_ShawServiceBegin(), ecorePackage.getELong(), "shawServiceBegin", null, 0, 1, RemovalOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removalInformationEClass, RemovalInformation.class, "RemovalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemovalInformation_NumberOfRemovalsPerRequest(), this.getReuqestsHashMap(), "numberOfRemovalsPerRequest", null, 0, 1, RemovalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(routeEDataType, Route.class, "Route", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(routeElementEDataType, RouteElement.class, "RouteElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reuqestsHashMapEDataType, HashMap.class, "ReuqestsHashMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.HashMap<ovgu.pave.model.input.Request, java.lang.Long>");
		initEDataType(requestsEDataType, Request.class, "Requests", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AlgorithmObjectsPackageImpl
