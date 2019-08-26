/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.SearchStatistics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getIterationsBeforeAcceptance <em>Iterations Before Acceptance</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getNumberOfAcceptances <em>Number Of Acceptances</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getNumberOfReschedulableRequests <em>Number Of Reschedulable Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getSearchDuration <em>Search Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getInvalidDueCapacity <em>Invalid Due Capacity</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getInvalidDueTime <em>Invalid Due Time</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getOnTheFlyRescheduling <em>On The Fly Rescheduling</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getWayPoints <em>Way Points</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SearchStatisticsImpl#getRemovalIterations <em>Removal Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchStatisticsImpl extends MinimalEObjectImpl.Container implements SearchStatistics {
	/**
	 * The default value of the '{@link #getIterationsBeforeAcceptance() <em>Iterations Before Acceptance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationsBeforeAcceptance()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_BEFORE_ACCEPTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterationsBeforeAcceptance() <em>Iterations Before Acceptance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationsBeforeAcceptance()
	 * @generated
	 * @ordered
	 */
	protected int iterationsBeforeAcceptance = ITERATIONS_BEFORE_ACCEPTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfAcceptances() <em>Number Of Acceptances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfAcceptances()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ACCEPTANCES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfAcceptances() <em>Number Of Acceptances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfAcceptances()
	 * @generated
	 * @ordered
	 */
	protected int numberOfAcceptances = NUMBER_OF_ACCEPTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfReschedulableRequests() <em>Number Of Reschedulable Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReschedulableRequests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_RESCHEDULABLE_REQUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfReschedulableRequests() <em>Number Of Reschedulable Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfReschedulableRequests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfReschedulableRequests = NUMBER_OF_RESCHEDULABLE_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchDuration() <em>Search Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long SEARCH_DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSearchDuration() <em>Search Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchDuration()
	 * @generated
	 * @ordered
	 */
	protected long searchDuration = SEARCH_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidDueCapacity() <em>Invalid Due Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidDueCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int INVALID_DUE_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInvalidDueCapacity() <em>Invalid Due Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidDueCapacity()
	 * @generated
	 * @ordered
	 */
	protected int invalidDueCapacity = INVALID_DUE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidDueTime() <em>Invalid Due Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidDueTime()
	 * @generated
	 * @ordered
	 */
	protected static final int INVALID_DUE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInvalidDueTime() <em>Invalid Due Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidDueTime()
	 * @generated
	 * @ordered
	 */
	protected int invalidDueTime = INVALID_DUE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnTheFlyRescheduling() <em>On The Fly Rescheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTheFlyRescheduling()
	 * @generated
	 * @ordered
	 */
	protected static final int ON_THE_FLY_RESCHEDULING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOnTheFlyRescheduling() <em>On The Fly Rescheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTheFlyRescheduling()
	 * @generated
	 * @ordered
	 */
	protected int onTheFlyRescheduling = ON_THE_FLY_RESCHEDULING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWayPoints() <em>Way Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int WAY_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWayPoints() <em>Way Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPoints()
	 * @generated
	 * @ordered
	 */
	protected int wayPoints = WAY_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemovalIterations() <em>Removal Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int REMOVAL_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRemovalIterations() <em>Removal Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalIterations()
	 * @generated
	 * @ordered
	 */
	protected int removalIterations = REMOVAL_ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmObjectsPackage.Literals.SEARCH_STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterationsBeforeAcceptance() {
		return iterationsBeforeAcceptance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterationsBeforeAcceptance(int newIterationsBeforeAcceptance) {
		int oldIterationsBeforeAcceptance = iterationsBeforeAcceptance;
		iterationsBeforeAcceptance = newIterationsBeforeAcceptance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE, oldIterationsBeforeAcceptance, iterationsBeforeAcceptance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfAcceptances() {
		return numberOfAcceptances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfAcceptances(int newNumberOfAcceptances) {
		int oldNumberOfAcceptances = numberOfAcceptances;
		numberOfAcceptances = newNumberOfAcceptances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES, oldNumberOfAcceptances, numberOfAcceptances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfReschedulableRequests() {
		return numberOfReschedulableRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfReschedulableRequests(int newNumberOfReschedulableRequests) {
		int oldNumberOfReschedulableRequests = numberOfReschedulableRequests;
		numberOfReschedulableRequests = newNumberOfReschedulableRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS, oldNumberOfReschedulableRequests, numberOfReschedulableRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSearchDuration() {
		return searchDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchDuration(long newSearchDuration) {
		long oldSearchDuration = searchDuration;
		searchDuration = newSearchDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__SEARCH_DURATION, oldSearchDuration, searchDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInvalidDueCapacity() {
		return invalidDueCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidDueCapacity(int newInvalidDueCapacity) {
		int oldInvalidDueCapacity = invalidDueCapacity;
		invalidDueCapacity = newInvalidDueCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_CAPACITY, oldInvalidDueCapacity, invalidDueCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInvalidDueTime() {
		return invalidDueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidDueTime(int newInvalidDueTime) {
		int oldInvalidDueTime = invalidDueTime;
		invalidDueTime = newInvalidDueTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_TIME, oldInvalidDueTime, invalidDueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOnTheFlyRescheduling() {
		return onTheFlyRescheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnTheFlyRescheduling(int newOnTheFlyRescheduling) {
		int oldOnTheFlyRescheduling = onTheFlyRescheduling;
		onTheFlyRescheduling = newOnTheFlyRescheduling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING, oldOnTheFlyRescheduling, onTheFlyRescheduling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWayPoints() {
		return wayPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWayPoints(int newWayPoints) {
		int oldWayPoints = wayPoints;
		wayPoints = newWayPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__WAY_POINTS, oldWayPoints, wayPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemovalIterations() {
		return removalIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovalIterations(int newRemovalIterations) {
		int oldRemovalIterations = removalIterations;
		removalIterations = newRemovalIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SEARCH_STATISTICS__REMOVAL_ITERATIONS, oldRemovalIterations, removalIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE:
				return getIterationsBeforeAcceptance();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES:
				return getNumberOfAcceptances();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS:
				return getNumberOfReschedulableRequests();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__SEARCH_DURATION:
				return getSearchDuration();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_CAPACITY:
				return getInvalidDueCapacity();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_TIME:
				return getInvalidDueTime();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING:
				return getOnTheFlyRescheduling();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__WAY_POINTS:
				return getWayPoints();
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__REMOVAL_ITERATIONS:
				return getRemovalIterations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE:
				setIterationsBeforeAcceptance((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES:
				setNumberOfAcceptances((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS:
				setNumberOfReschedulableRequests((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__SEARCH_DURATION:
				setSearchDuration((Long)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_CAPACITY:
				setInvalidDueCapacity((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_TIME:
				setInvalidDueTime((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING:
				setOnTheFlyRescheduling((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__WAY_POINTS:
				setWayPoints((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__REMOVAL_ITERATIONS:
				setRemovalIterations((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE:
				setIterationsBeforeAcceptance(ITERATIONS_BEFORE_ACCEPTANCE_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES:
				setNumberOfAcceptances(NUMBER_OF_ACCEPTANCES_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS:
				setNumberOfReschedulableRequests(NUMBER_OF_RESCHEDULABLE_REQUESTS_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__SEARCH_DURATION:
				setSearchDuration(SEARCH_DURATION_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_CAPACITY:
				setInvalidDueCapacity(INVALID_DUE_CAPACITY_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_TIME:
				setInvalidDueTime(INVALID_DUE_TIME_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING:
				setOnTheFlyRescheduling(ON_THE_FLY_RESCHEDULING_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__WAY_POINTS:
				setWayPoints(WAY_POINTS_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__REMOVAL_ITERATIONS:
				setRemovalIterations(REMOVAL_ITERATIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ITERATIONS_BEFORE_ACCEPTANCE:
				return iterationsBeforeAcceptance != ITERATIONS_BEFORE_ACCEPTANCE_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_ACCEPTANCES:
				return numberOfAcceptances != NUMBER_OF_ACCEPTANCES_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__NUMBER_OF_RESCHEDULABLE_REQUESTS:
				return numberOfReschedulableRequests != NUMBER_OF_RESCHEDULABLE_REQUESTS_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__SEARCH_DURATION:
				return searchDuration != SEARCH_DURATION_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_CAPACITY:
				return invalidDueCapacity != INVALID_DUE_CAPACITY_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__INVALID_DUE_TIME:
				return invalidDueTime != INVALID_DUE_TIME_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__ON_THE_FLY_RESCHEDULING:
				return onTheFlyRescheduling != ON_THE_FLY_RESCHEDULING_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__WAY_POINTS:
				return wayPoints != WAY_POINTS_EDEFAULT;
			case AlgorithmObjectsPackage.SEARCH_STATISTICS__REMOVAL_ITERATIONS:
				return removalIterations != REMOVAL_ITERATIONS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (iterationsBeforeAcceptance: ");
		result.append(iterationsBeforeAcceptance);
		result.append(", numberOfAcceptances: ");
		result.append(numberOfAcceptances);
		result.append(", numberOfReschedulableRequests: ");
		result.append(numberOfReschedulableRequests);
		result.append(", searchDuration: ");
		result.append(searchDuration);
		result.append(", invalidDueCapacity: ");
		result.append(invalidDueCapacity);
		result.append(", invalidDueTime: ");
		result.append(invalidDueTime);
		result.append(", onTheFlyRescheduling: ");
		result.append(onTheFlyRescheduling);
		result.append(", wayPoints: ");
		result.append(wayPoints);
		result.append(", removalIterations: ");
		result.append(removalIterations);
		result.append(')');
		return result.toString();
	}

} //SearchStatisticsImpl
