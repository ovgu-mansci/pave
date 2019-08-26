/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.RemovalOption;

import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removal Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl#getScore <em>Score</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl#getFirstActivityRouteElement <em>First Activity Route Element</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl#getSecondActivityRouteElement <em>Second Activity Route Element</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl#getShawDistance <em>Shaw Distance</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.RemovalOptionImpl#getShawServiceBegin <em>Shaw Service Begin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemovalOptionImpl extends MinimalEObjectImpl.Container implements RemovalOption {
	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final long SCORE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected long score = SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected static final Route ROUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route = ROUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstActivityRouteElement() <em>First Activity Route Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstActivityRouteElement()
	 * @generated
	 * @ordered
	 */
	protected static final RouteElement FIRST_ACTIVITY_ROUTE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstActivityRouteElement() <em>First Activity Route Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstActivityRouteElement()
	 * @generated
	 * @ordered
	 */
	protected RouteElement firstActivityRouteElement = FIRST_ACTIVITY_ROUTE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondActivityRouteElement() <em>Second Activity Route Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondActivityRouteElement()
	 * @generated
	 * @ordered
	 */
	protected static final RouteElement SECOND_ACTIVITY_ROUTE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondActivityRouteElement() <em>Second Activity Route Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondActivityRouteElement()
	 * @generated
	 * @ordered
	 */
	protected RouteElement secondActivityRouteElement = SECOND_ACTIVITY_ROUTE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShawDistance() <em>Shaw Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawDistance()
	 * @generated
	 * @ordered
	 */
	protected static final long SHAW_DISTANCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getShawDistance() <em>Shaw Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawDistance()
	 * @generated
	 * @ordered
	 */
	protected long shawDistance = SHAW_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShawServiceBegin() <em>Shaw Service Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawServiceBegin()
	 * @generated
	 * @ordered
	 */
	protected static final long SHAW_SERVICE_BEGIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getShawServiceBegin() <em>Shaw Service Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawServiceBegin()
	 * @generated
	 * @ordered
	 */
	protected long shawServiceBegin = SHAW_SERVICE_BEGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovalOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmObjectsPackage.Literals.REMOVAL_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(long newScore) {
		long oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.REMOVAL_OPTION__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.REMOVAL_OPTION__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement getFirstActivityRouteElement() {
		return firstActivityRouteElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstActivityRouteElement(RouteElement newFirstActivityRouteElement) {
		RouteElement oldFirstActivityRouteElement = firstActivityRouteElement;
		firstActivityRouteElement = newFirstActivityRouteElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT, oldFirstActivityRouteElement, firstActivityRouteElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteElement getSecondActivityRouteElement() {
		return secondActivityRouteElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondActivityRouteElement(RouteElement newSecondActivityRouteElement) {
		RouteElement oldSecondActivityRouteElement = secondActivityRouteElement;
		secondActivityRouteElement = newSecondActivityRouteElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT, oldSecondActivityRouteElement, secondActivityRouteElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getShawDistance() {
		return shawDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShawDistance(long newShawDistance) {
		long oldShawDistance = shawDistance;
		shawDistance = newShawDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_DISTANCE, oldShawDistance, shawDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getShawServiceBegin() {
		return shawServiceBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShawServiceBegin(long newShawServiceBegin) {
		long oldShawServiceBegin = shawServiceBegin;
		shawServiceBegin = newShawServiceBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_SERVICE_BEGIN, oldShawServiceBegin, shawServiceBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SCORE:
				return getScore();
			case AlgorithmObjectsPackage.REMOVAL_OPTION__ROUTE:
				return getRoute();
			case AlgorithmObjectsPackage.REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT:
				return getFirstActivityRouteElement();
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT:
				return getSecondActivityRouteElement();
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_DISTANCE:
				return getShawDistance();
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_SERVICE_BEGIN:
				return getShawServiceBegin();
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
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SCORE:
				setScore((Long)newValue);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__ROUTE:
				setRoute((Route)newValue);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT:
				setFirstActivityRouteElement((RouteElement)newValue);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT:
				setSecondActivityRouteElement((RouteElement)newValue);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_DISTANCE:
				setShawDistance((Long)newValue);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_SERVICE_BEGIN:
				setShawServiceBegin((Long)newValue);
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
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__ROUTE:
				setRoute(ROUTE_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT:
				setFirstActivityRouteElement(FIRST_ACTIVITY_ROUTE_ELEMENT_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT:
				setSecondActivityRouteElement(SECOND_ACTIVITY_ROUTE_ELEMENT_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_DISTANCE:
				setShawDistance(SHAW_DISTANCE_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_SERVICE_BEGIN:
				setShawServiceBegin(SHAW_SERVICE_BEGIN_EDEFAULT);
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
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SCORE:
				return score != SCORE_EDEFAULT;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__ROUTE:
				return ROUTE_EDEFAULT == null ? route != null : !ROUTE_EDEFAULT.equals(route);
			case AlgorithmObjectsPackage.REMOVAL_OPTION__FIRST_ACTIVITY_ROUTE_ELEMENT:
				return FIRST_ACTIVITY_ROUTE_ELEMENT_EDEFAULT == null ? firstActivityRouteElement != null : !FIRST_ACTIVITY_ROUTE_ELEMENT_EDEFAULT.equals(firstActivityRouteElement);
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SECOND_ACTIVITY_ROUTE_ELEMENT:
				return SECOND_ACTIVITY_ROUTE_ELEMENT_EDEFAULT == null ? secondActivityRouteElement != null : !SECOND_ACTIVITY_ROUTE_ELEMENT_EDEFAULT.equals(secondActivityRouteElement);
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_DISTANCE:
				return shawDistance != SHAW_DISTANCE_EDEFAULT;
			case AlgorithmObjectsPackage.REMOVAL_OPTION__SHAW_SERVICE_BEGIN:
				return shawServiceBegin != SHAW_SERVICE_BEGIN_EDEFAULT;
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
		result.append(" (score: ");
		result.append(score);
		result.append(", route: ");
		result.append(route);
		result.append(", firstActivityRouteElement: ");
		result.append(firstActivityRouteElement);
		result.append(", secondActivityRouteElement: ");
		result.append(secondActivityRouteElement);
		result.append(", shawDistance: ");
		result.append(shawDistance);
		result.append(", shawServiceBegin: ");
		result.append(shawServiceBegin);
		result.append(')');
		return result.toString();
	}

} //RemovalOptionImpl
