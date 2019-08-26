/**
 */
package ovgu.pave.model.config.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ovgu.pave.model.config.ALNS;
import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.Heuristic;
import ovgu.pave.model.config.LMNS;
import ovgu.pave.model.config.LNS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getMinSmallRequestSet <em>Min Small Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getMaxLargeRequestSet <em>Max Large Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getMaxSmallRequestSet <em>Max Small Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getMinLargeRequestSet <em>Min Large Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getInsertionHeuristics <em>Insertion Heuristics</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getRemovalHeuristics <em>Removal Heuristics</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getShawDistanceWeight <em>Shaw Distance Weight</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getShawBeginWeight <em>Shaw Begin Weight</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getAlns <em>Alns</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LNSImpl#getLmns <em>Lmns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNSImpl extends MinimalEObjectImpl.Container implements LNS {
	/**
	 * The default value of the '{@link #getMinSmallRequestSet() <em>Min Small Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSmallRequestSet()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_SMALL_REQUEST_SET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinSmallRequestSet() <em>Min Small Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSmallRequestSet()
	 * @generated
	 * @ordered
	 */
	protected double minSmallRequestSet = MIN_SMALL_REQUEST_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLargeRequestSet() <em>Max Large Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLargeRequestSet()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LARGE_REQUEST_SET_EDEFAULT = 999999;

	/**
	 * The cached value of the '{@link #getMaxLargeRequestSet() <em>Max Large Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLargeRequestSet()
	 * @generated
	 * @ordered
	 */
	protected int maxLargeRequestSet = MAX_LARGE_REQUEST_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSmallRequestSet() <em>Max Small Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSmallRequestSet()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SMALL_REQUEST_SET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxSmallRequestSet() <em>Max Small Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSmallRequestSet()
	 * @generated
	 * @ordered
	 */
	protected double maxSmallRequestSet = MAX_SMALL_REQUEST_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLargeRequestSet() <em>Min Large Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLargeRequestSet()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LARGE_REQUEST_SET_EDEFAULT = 999999;

	/**
	 * The cached value of the '{@link #getMinLargeRequestSet() <em>Min Large Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLargeRequestSet()
	 * @generated
	 * @ordered
	 */
	protected int minLargeRequestSet = MIN_LARGE_REQUEST_SET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInsertionHeuristics() <em>Insertion Heuristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertionHeuristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Heuristic> insertionHeuristics;

	/**
	 * The cached value of the '{@link #getRemovalHeuristics() <em>Removal Heuristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovalHeuristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Heuristic> removalHeuristics;

	/**
	 * The default value of the '{@link #getShawDistanceWeight() <em>Shaw Distance Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawDistanceWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double SHAW_DISTANCE_WEIGHT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getShawDistanceWeight() <em>Shaw Distance Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawDistanceWeight()
	 * @generated
	 * @ordered
	 */
	protected double shawDistanceWeight = SHAW_DISTANCE_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShawBeginWeight() <em>Shaw Begin Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawBeginWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double SHAW_BEGIN_WEIGHT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getShawBeginWeight() <em>Shaw Begin Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShawBeginWeight()
	 * @generated
	 * @ordered
	 */
	protected double shawBeginWeight = SHAW_BEGIN_WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlns() <em>Alns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlns()
	 * @generated
	 * @ordered
	 */
	protected ALNS alns;

	/**
	 * The cached value of the '{@link #getLmns() <em>Lmns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLmns()
	 * @generated
	 * @ordered
	 */
	protected LMNS lmns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LNSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.LNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinSmallRequestSet() {
		return minSmallRequestSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSmallRequestSet(double newMinSmallRequestSet) {
		double oldMinSmallRequestSet = minSmallRequestSet;
		minSmallRequestSet = newMinSmallRequestSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__MIN_SMALL_REQUEST_SET, oldMinSmallRequestSet, minSmallRequestSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLargeRequestSet() {
		return maxLargeRequestSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLargeRequestSet(int newMaxLargeRequestSet) {
		int oldMaxLargeRequestSet = maxLargeRequestSet;
		maxLargeRequestSet = newMaxLargeRequestSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__MAX_LARGE_REQUEST_SET, oldMaxLargeRequestSet, maxLargeRequestSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxSmallRequestSet() {
		return maxSmallRequestSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSmallRequestSet(double newMaxSmallRequestSet) {
		double oldMaxSmallRequestSet = maxSmallRequestSet;
		maxSmallRequestSet = newMaxSmallRequestSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__MAX_SMALL_REQUEST_SET, oldMaxSmallRequestSet, maxSmallRequestSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinLargeRequestSet() {
		return minLargeRequestSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLargeRequestSet(int newMinLargeRequestSet) {
		int oldMinLargeRequestSet = minLargeRequestSet;
		minLargeRequestSet = newMinLargeRequestSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__MIN_LARGE_REQUEST_SET, oldMinLargeRequestSet, minLargeRequestSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Heuristic> getInsertionHeuristics() {
		if (insertionHeuristics == null) {
			insertionHeuristics = new EObjectContainmentEList<Heuristic>(Heuristic.class, this, ConfigPackage.LNS__INSERTION_HEURISTICS);
		}
		return insertionHeuristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Heuristic> getRemovalHeuristics() {
		if (removalHeuristics == null) {
			removalHeuristics = new EObjectContainmentEList<Heuristic>(Heuristic.class, this, ConfigPackage.LNS__REMOVAL_HEURISTICS);
		}
		return removalHeuristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShawDistanceWeight() {
		return shawDistanceWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShawDistanceWeight(double newShawDistanceWeight) {
		double oldShawDistanceWeight = shawDistanceWeight;
		shawDistanceWeight = newShawDistanceWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__SHAW_DISTANCE_WEIGHT, oldShawDistanceWeight, shawDistanceWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShawBeginWeight() {
		return shawBeginWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShawBeginWeight(double newShawBeginWeight) {
		double oldShawBeginWeight = shawBeginWeight;
		shawBeginWeight = newShawBeginWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__SHAW_BEGIN_WEIGHT, oldShawBeginWeight, shawBeginWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALNS getAlns() {
		return alns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlns(ALNS newAlns, NotificationChain msgs) {
		ALNS oldAlns = alns;
		alns = newAlns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__ALNS, oldAlns, newAlns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlns(ALNS newAlns) {
		if (newAlns != alns) {
			NotificationChain msgs = null;
			if (alns != null)
				msgs = ((InternalEObject)alns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.LNS__ALNS, null, msgs);
			if (newAlns != null)
				msgs = ((InternalEObject)newAlns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.LNS__ALNS, null, msgs);
			msgs = basicSetAlns(newAlns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__ALNS, newAlns, newAlns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LMNS getLmns() {
		return lmns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLmns(LMNS newLmns, NotificationChain msgs) {
		LMNS oldLmns = lmns;
		lmns = newLmns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__LMNS, oldLmns, newLmns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLmns(LMNS newLmns) {
		if (newLmns != lmns) {
			NotificationChain msgs = null;
			if (lmns != null)
				msgs = ((InternalEObject)lmns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.LNS__LMNS, null, msgs);
			if (newLmns != null)
				msgs = ((InternalEObject)newLmns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.LNS__LMNS, null, msgs);
			msgs = basicSetLmns(newLmns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LNS__LMNS, newLmns, newLmns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.LNS__INSERTION_HEURISTICS:
				return ((InternalEList<?>)getInsertionHeuristics()).basicRemove(otherEnd, msgs);
			case ConfigPackage.LNS__REMOVAL_HEURISTICS:
				return ((InternalEList<?>)getRemovalHeuristics()).basicRemove(otherEnd, msgs);
			case ConfigPackage.LNS__ALNS:
				return basicSetAlns(null, msgs);
			case ConfigPackage.LNS__LMNS:
				return basicSetLmns(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.LNS__MIN_SMALL_REQUEST_SET:
				return getMinSmallRequestSet();
			case ConfigPackage.LNS__MAX_LARGE_REQUEST_SET:
				return getMaxLargeRequestSet();
			case ConfigPackage.LNS__MAX_SMALL_REQUEST_SET:
				return getMaxSmallRequestSet();
			case ConfigPackage.LNS__MIN_LARGE_REQUEST_SET:
				return getMinLargeRequestSet();
			case ConfigPackage.LNS__INSERTION_HEURISTICS:
				return getInsertionHeuristics();
			case ConfigPackage.LNS__REMOVAL_HEURISTICS:
				return getRemovalHeuristics();
			case ConfigPackage.LNS__SHAW_DISTANCE_WEIGHT:
				return getShawDistanceWeight();
			case ConfigPackage.LNS__SHAW_BEGIN_WEIGHT:
				return getShawBeginWeight();
			case ConfigPackage.LNS__ALNS:
				return getAlns();
			case ConfigPackage.LNS__LMNS:
				return getLmns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.LNS__MIN_SMALL_REQUEST_SET:
				setMinSmallRequestSet((Double)newValue);
				return;
			case ConfigPackage.LNS__MAX_LARGE_REQUEST_SET:
				setMaxLargeRequestSet((Integer)newValue);
				return;
			case ConfigPackage.LNS__MAX_SMALL_REQUEST_SET:
				setMaxSmallRequestSet((Double)newValue);
				return;
			case ConfigPackage.LNS__MIN_LARGE_REQUEST_SET:
				setMinLargeRequestSet((Integer)newValue);
				return;
			case ConfigPackage.LNS__INSERTION_HEURISTICS:
				getInsertionHeuristics().clear();
				getInsertionHeuristics().addAll((Collection<? extends Heuristic>)newValue);
				return;
			case ConfigPackage.LNS__REMOVAL_HEURISTICS:
				getRemovalHeuristics().clear();
				getRemovalHeuristics().addAll((Collection<? extends Heuristic>)newValue);
				return;
			case ConfigPackage.LNS__SHAW_DISTANCE_WEIGHT:
				setShawDistanceWeight((Double)newValue);
				return;
			case ConfigPackage.LNS__SHAW_BEGIN_WEIGHT:
				setShawBeginWeight((Double)newValue);
				return;
			case ConfigPackage.LNS__ALNS:
				setAlns((ALNS)newValue);
				return;
			case ConfigPackage.LNS__LMNS:
				setLmns((LMNS)newValue);
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
			case ConfigPackage.LNS__MIN_SMALL_REQUEST_SET:
				setMinSmallRequestSet(MIN_SMALL_REQUEST_SET_EDEFAULT);
				return;
			case ConfigPackage.LNS__MAX_LARGE_REQUEST_SET:
				setMaxLargeRequestSet(MAX_LARGE_REQUEST_SET_EDEFAULT);
				return;
			case ConfigPackage.LNS__MAX_SMALL_REQUEST_SET:
				setMaxSmallRequestSet(MAX_SMALL_REQUEST_SET_EDEFAULT);
				return;
			case ConfigPackage.LNS__MIN_LARGE_REQUEST_SET:
				setMinLargeRequestSet(MIN_LARGE_REQUEST_SET_EDEFAULT);
				return;
			case ConfigPackage.LNS__INSERTION_HEURISTICS:
				getInsertionHeuristics().clear();
				return;
			case ConfigPackage.LNS__REMOVAL_HEURISTICS:
				getRemovalHeuristics().clear();
				return;
			case ConfigPackage.LNS__SHAW_DISTANCE_WEIGHT:
				setShawDistanceWeight(SHAW_DISTANCE_WEIGHT_EDEFAULT);
				return;
			case ConfigPackage.LNS__SHAW_BEGIN_WEIGHT:
				setShawBeginWeight(SHAW_BEGIN_WEIGHT_EDEFAULT);
				return;
			case ConfigPackage.LNS__ALNS:
				setAlns((ALNS)null);
				return;
			case ConfigPackage.LNS__LMNS:
				setLmns((LMNS)null);
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
			case ConfigPackage.LNS__MIN_SMALL_REQUEST_SET:
				return minSmallRequestSet != MIN_SMALL_REQUEST_SET_EDEFAULT;
			case ConfigPackage.LNS__MAX_LARGE_REQUEST_SET:
				return maxLargeRequestSet != MAX_LARGE_REQUEST_SET_EDEFAULT;
			case ConfigPackage.LNS__MAX_SMALL_REQUEST_SET:
				return maxSmallRequestSet != MAX_SMALL_REQUEST_SET_EDEFAULT;
			case ConfigPackage.LNS__MIN_LARGE_REQUEST_SET:
				return minLargeRequestSet != MIN_LARGE_REQUEST_SET_EDEFAULT;
			case ConfigPackage.LNS__INSERTION_HEURISTICS:
				return insertionHeuristics != null && !insertionHeuristics.isEmpty();
			case ConfigPackage.LNS__REMOVAL_HEURISTICS:
				return removalHeuristics != null && !removalHeuristics.isEmpty();
			case ConfigPackage.LNS__SHAW_DISTANCE_WEIGHT:
				return shawDistanceWeight != SHAW_DISTANCE_WEIGHT_EDEFAULT;
			case ConfigPackage.LNS__SHAW_BEGIN_WEIGHT:
				return shawBeginWeight != SHAW_BEGIN_WEIGHT_EDEFAULT;
			case ConfigPackage.LNS__ALNS:
				return alns != null;
			case ConfigPackage.LNS__LMNS:
				return lmns != null;
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
		result.append(" (minSmallRequestSet: ");
		result.append(minSmallRequestSet);
		result.append(", maxLargeRequestSet: ");
		result.append(maxLargeRequestSet);
		result.append(", maxSmallRequestSet: ");
		result.append(maxSmallRequestSet);
		result.append(", minLargeRequestSet: ");
		result.append(minLargeRequestSet);
		result.append(", shawDistanceWeight: ");
		result.append(shawDistanceWeight);
		result.append(", shawBeginWeight: ");
		result.append(shawBeginWeight);
		result.append(')');
		return result.toString();
	}

} //LNSImpl
