/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.LMNS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LMNS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.LMNSImpl#getMaxInsertionIterations <em>Max Insertion Iterations</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.LMNSImpl#getMaxImprovementIterations <em>Max Improvement Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LMNSImpl extends MinimalEObjectImpl.Container implements LMNS {
	/**
	 * The default value of the '{@link #getMaxInsertionIterations() <em>Max Insertion Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInsertionIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INSERTION_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInsertionIterations() <em>Max Insertion Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInsertionIterations()
	 * @generated
	 * @ordered
	 */
	protected int maxInsertionIterations = MAX_INSERTION_ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxImprovementIterations() <em>Max Improvement Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxImprovementIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_IMPROVEMENT_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxImprovementIterations() <em>Max Improvement Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxImprovementIterations()
	 * @generated
	 * @ordered
	 */
	protected int maxImprovementIterations = MAX_IMPROVEMENT_ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LMNSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.LMNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInsertionIterations() {
		return maxInsertionIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInsertionIterations(int newMaxInsertionIterations) {
		int oldMaxInsertionIterations = maxInsertionIterations;
		maxInsertionIterations = newMaxInsertionIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LMNS__MAX_INSERTION_ITERATIONS, oldMaxInsertionIterations, maxInsertionIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxImprovementIterations() {
		return maxImprovementIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxImprovementIterations(int newMaxImprovementIterations) {
		int oldMaxImprovementIterations = maxImprovementIterations;
		maxImprovementIterations = newMaxImprovementIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.LMNS__MAX_IMPROVEMENT_ITERATIONS, oldMaxImprovementIterations, maxImprovementIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.LMNS__MAX_INSERTION_ITERATIONS:
				return getMaxInsertionIterations();
			case ConfigPackage.LMNS__MAX_IMPROVEMENT_ITERATIONS:
				return getMaxImprovementIterations();
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
			case ConfigPackage.LMNS__MAX_INSERTION_ITERATIONS:
				setMaxInsertionIterations((Integer)newValue);
				return;
			case ConfigPackage.LMNS__MAX_IMPROVEMENT_ITERATIONS:
				setMaxImprovementIterations((Integer)newValue);
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
			case ConfigPackage.LMNS__MAX_INSERTION_ITERATIONS:
				setMaxInsertionIterations(MAX_INSERTION_ITERATIONS_EDEFAULT);
				return;
			case ConfigPackage.LMNS__MAX_IMPROVEMENT_ITERATIONS:
				setMaxImprovementIterations(MAX_IMPROVEMENT_ITERATIONS_EDEFAULT);
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
			case ConfigPackage.LMNS__MAX_INSERTION_ITERATIONS:
				return maxInsertionIterations != MAX_INSERTION_ITERATIONS_EDEFAULT;
			case ConfigPackage.LMNS__MAX_IMPROVEMENT_ITERATIONS:
				return maxImprovementIterations != MAX_IMPROVEMENT_ITERATIONS_EDEFAULT;
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
		result.append(" (maxInsertionIterations: ");
		result.append(maxInsertionIterations);
		result.append(", maxImprovementIterations: ");
		result.append(maxImprovementIterations);
		result.append(')');
		return result.toString();
	}

} //LMNSImpl
