/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ovgu.pave.model.config.Algorithm;
import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.LNS;
import ovgu.pave.model.config.ORTOOLS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.AlgorithmImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.AlgorithmImpl#getLns <em>Lns</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.AlgorithmImpl#getRandomSeet <em>Random Seet</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.AlgorithmImpl#getOrtools <em>Ortools</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmImpl extends MinimalEObjectImpl.Container implements Algorithm {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLns() <em>Lns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLns()
	 * @generated
	 * @ordered
	 */
	protected LNS lns;

	/**
	 * The default value of the '{@link #getRandomSeet() <em>Random Seet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeet()
	 * @generated
	 * @ordered
	 */
	protected static final int RANDOM_SEET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRandomSeet() <em>Random Seet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeet()
	 * @generated
	 * @ordered
	 */
	protected int randomSeet = RANDOM_SEET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrtools() <em>Ortools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrtools()
	 * @generated
	 * @ordered
	 */
	protected ORTOOLS ortools;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALGORITHM__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNS getLns() {
		return lns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLns(LNS newLns, NotificationChain msgs) {
		LNS oldLns = lns;
		lns = newLns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.ALGORITHM__LNS, oldLns, newLns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLns(LNS newLns) {
		if (newLns != lns) {
			NotificationChain msgs = null;
			if (lns != null)
				msgs = ((InternalEObject)lns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.ALGORITHM__LNS, null, msgs);
			if (newLns != null)
				msgs = ((InternalEObject)newLns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.ALGORITHM__LNS, null, msgs);
			msgs = basicSetLns(newLns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALGORITHM__LNS, newLns, newLns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRandomSeet() {
		return randomSeet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomSeet(int newRandomSeet) {
		int oldRandomSeet = randomSeet;
		randomSeet = newRandomSeet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALGORITHM__RANDOM_SEET, oldRandomSeet, randomSeet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORTOOLS getOrtools() {
		return ortools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrtools(ORTOOLS newOrtools, NotificationChain msgs) {
		ORTOOLS oldOrtools = ortools;
		ortools = newOrtools;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.ALGORITHM__ORTOOLS, oldOrtools, newOrtools);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrtools(ORTOOLS newOrtools) {
		if (newOrtools != ortools) {
			NotificationChain msgs = null;
			if (ortools != null)
				msgs = ((InternalEObject)ortools).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.ALGORITHM__ORTOOLS, null, msgs);
			if (newOrtools != null)
				msgs = ((InternalEObject)newOrtools).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.ALGORITHM__ORTOOLS, null, msgs);
			msgs = basicSetOrtools(newOrtools, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALGORITHM__ORTOOLS, newOrtools, newOrtools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.ALGORITHM__LNS:
				return basicSetLns(null, msgs);
			case ConfigPackage.ALGORITHM__ORTOOLS:
				return basicSetOrtools(null, msgs);
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
			case ConfigPackage.ALGORITHM__ALGORITHM:
				return getAlgorithm();
			case ConfigPackage.ALGORITHM__LNS:
				return getLns();
			case ConfigPackage.ALGORITHM__RANDOM_SEET:
				return getRandomSeet();
			case ConfigPackage.ALGORITHM__ORTOOLS:
				return getOrtools();
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
			case ConfigPackage.ALGORITHM__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case ConfigPackage.ALGORITHM__LNS:
				setLns((LNS)newValue);
				return;
			case ConfigPackage.ALGORITHM__RANDOM_SEET:
				setRandomSeet((Integer)newValue);
				return;
			case ConfigPackage.ALGORITHM__ORTOOLS:
				setOrtools((ORTOOLS)newValue);
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
			case ConfigPackage.ALGORITHM__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case ConfigPackage.ALGORITHM__LNS:
				setLns((LNS)null);
				return;
			case ConfigPackage.ALGORITHM__RANDOM_SEET:
				setRandomSeet(RANDOM_SEET_EDEFAULT);
				return;
			case ConfigPackage.ALGORITHM__ORTOOLS:
				setOrtools((ORTOOLS)null);
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
			case ConfigPackage.ALGORITHM__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case ConfigPackage.ALGORITHM__LNS:
				return lns != null;
			case ConfigPackage.ALGORITHM__RANDOM_SEET:
				return randomSeet != RANDOM_SEET_EDEFAULT;
			case ConfigPackage.ALGORITHM__ORTOOLS:
				return ortools != null;
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
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", randomSeet: ");
		result.append(randomSeet);
		result.append(')');
		return result.toString();
	}

} //AlgorithmImpl
