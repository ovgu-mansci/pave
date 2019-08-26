/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.InsertionOption;

import ovgu.pave.model.solution.Route;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insertion Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl#getCosts <em>Costs</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl#getFirstActivityIndex <em>First Activity Index</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl#getSecondActivityIndex <em>Second Activity Index</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertionOptionImpl extends MinimalEObjectImpl.Container implements InsertionOption {
	/**
	 * The default value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected static final long COSTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected long costs = COSTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstActivityIndex() <em>First Activity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstActivityIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_ACTIVITY_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstActivityIndex() <em>First Activity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstActivityIndex()
	 * @generated
	 * @ordered
	 */
	protected int firstActivityIndex = FIRST_ACTIVITY_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondActivityIndex() <em>Second Activity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondActivityIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_ACTIVITY_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecondActivityIndex() <em>Second Activity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondActivityIndex()
	 * @generated
	 * @ordered
	 */
	protected int secondActivityIndex = SECOND_ACTIVITY_INDEX_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmObjectsPackage.Literals.INSERTION_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCosts() {
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCosts(long newCosts) {
		long oldCosts = costs;
		costs = newCosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.INSERTION_OPTION__COSTS, oldCosts, costs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstActivityIndex() {
		return firstActivityIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstActivityIndex(int newFirstActivityIndex) {
		int oldFirstActivityIndex = firstActivityIndex;
		firstActivityIndex = newFirstActivityIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.INSERTION_OPTION__FIRST_ACTIVITY_INDEX, oldFirstActivityIndex, firstActivityIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondActivityIndex() {
		return secondActivityIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondActivityIndex(int newSecondActivityIndex) {
		int oldSecondActivityIndex = secondActivityIndex;
		secondActivityIndex = newSecondActivityIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.INSERTION_OPTION__SECOND_ACTIVITY_INDEX, oldSecondActivityIndex, secondActivityIndex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.INSERTION_OPTION__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmObjectsPackage.INSERTION_OPTION__COSTS:
				return getCosts();
			case AlgorithmObjectsPackage.INSERTION_OPTION__FIRST_ACTIVITY_INDEX:
				return getFirstActivityIndex();
			case AlgorithmObjectsPackage.INSERTION_OPTION__SECOND_ACTIVITY_INDEX:
				return getSecondActivityIndex();
			case AlgorithmObjectsPackage.INSERTION_OPTION__ROUTE:
				return getRoute();
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
			case AlgorithmObjectsPackage.INSERTION_OPTION__COSTS:
				setCosts((Long)newValue);
				return;
			case AlgorithmObjectsPackage.INSERTION_OPTION__FIRST_ACTIVITY_INDEX:
				setFirstActivityIndex((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.INSERTION_OPTION__SECOND_ACTIVITY_INDEX:
				setSecondActivityIndex((Integer)newValue);
				return;
			case AlgorithmObjectsPackage.INSERTION_OPTION__ROUTE:
				setRoute((Route)newValue);
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
			case AlgorithmObjectsPackage.INSERTION_OPTION__COSTS:
				setCosts(COSTS_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.INSERTION_OPTION__FIRST_ACTIVITY_INDEX:
				setFirstActivityIndex(FIRST_ACTIVITY_INDEX_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.INSERTION_OPTION__SECOND_ACTIVITY_INDEX:
				setSecondActivityIndex(SECOND_ACTIVITY_INDEX_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.INSERTION_OPTION__ROUTE:
				setRoute(ROUTE_EDEFAULT);
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
			case AlgorithmObjectsPackage.INSERTION_OPTION__COSTS:
				return costs != COSTS_EDEFAULT;
			case AlgorithmObjectsPackage.INSERTION_OPTION__FIRST_ACTIVITY_INDEX:
				return firstActivityIndex != FIRST_ACTIVITY_INDEX_EDEFAULT;
			case AlgorithmObjectsPackage.INSERTION_OPTION__SECOND_ACTIVITY_INDEX:
				return secondActivityIndex != SECOND_ACTIVITY_INDEX_EDEFAULT;
			case AlgorithmObjectsPackage.INSERTION_OPTION__ROUTE:
				return ROUTE_EDEFAULT == null ? route != null : !ROUTE_EDEFAULT.equals(route);
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
		result.append(" (costs: ");
		result.append(costs);
		result.append(", firstActivityIndex: ");
		result.append(firstActivityIndex);
		result.append(", secondActivityIndex: ");
		result.append(secondActivityIndex);
		result.append(", route: ");
		result.append(route);
		result.append(')');
		return result.toString();
	}

} //InsertionOptionImpl
