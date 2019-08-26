/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.Online;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.OnlineImpl#getVehicleMovementType <em>Vehicle Movement Type</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.OnlineImpl#isPreAcceptanceDecisions <em>Pre Acceptance Decisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnlineImpl extends MinimalEObjectImpl.Container implements Online {
	/**
	 * The default value of the '{@link #getVehicleMovementType() <em>Vehicle Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMovementType()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_MOVEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleMovementType() <em>Vehicle Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMovementType()
	 * @generated
	 * @ordered
	 */
	protected String vehicleMovementType = VEHICLE_MOVEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreAcceptanceDecisions() <em>Pre Acceptance Decisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreAcceptanceDecisions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRE_ACCEPTANCE_DECISIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreAcceptanceDecisions() <em>Pre Acceptance Decisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreAcceptanceDecisions()
	 * @generated
	 * @ordered
	 */
	protected boolean preAcceptanceDecisions = PRE_ACCEPTANCE_DECISIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ONLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleMovementType() {
		return vehicleMovementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleMovementType(String newVehicleMovementType) {
		String oldVehicleMovementType = vehicleMovementType;
		vehicleMovementType = newVehicleMovementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ONLINE__VEHICLE_MOVEMENT_TYPE, oldVehicleMovementType, vehicleMovementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreAcceptanceDecisions() {
		return preAcceptanceDecisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreAcceptanceDecisions(boolean newPreAcceptanceDecisions) {
		boolean oldPreAcceptanceDecisions = preAcceptanceDecisions;
		preAcceptanceDecisions = newPreAcceptanceDecisions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ONLINE__PRE_ACCEPTANCE_DECISIONS, oldPreAcceptanceDecisions, preAcceptanceDecisions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.ONLINE__VEHICLE_MOVEMENT_TYPE:
				return getVehicleMovementType();
			case ConfigPackage.ONLINE__PRE_ACCEPTANCE_DECISIONS:
				return isPreAcceptanceDecisions();
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
			case ConfigPackage.ONLINE__VEHICLE_MOVEMENT_TYPE:
				setVehicleMovementType((String)newValue);
				return;
			case ConfigPackage.ONLINE__PRE_ACCEPTANCE_DECISIONS:
				setPreAcceptanceDecisions((Boolean)newValue);
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
			case ConfigPackage.ONLINE__VEHICLE_MOVEMENT_TYPE:
				setVehicleMovementType(VEHICLE_MOVEMENT_TYPE_EDEFAULT);
				return;
			case ConfigPackage.ONLINE__PRE_ACCEPTANCE_DECISIONS:
				setPreAcceptanceDecisions(PRE_ACCEPTANCE_DECISIONS_EDEFAULT);
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
			case ConfigPackage.ONLINE__VEHICLE_MOVEMENT_TYPE:
				return VEHICLE_MOVEMENT_TYPE_EDEFAULT == null ? vehicleMovementType != null : !VEHICLE_MOVEMENT_TYPE_EDEFAULT.equals(vehicleMovementType);
			case ConfigPackage.ONLINE__PRE_ACCEPTANCE_DECISIONS:
				return preAcceptanceDecisions != PRE_ACCEPTANCE_DECISIONS_EDEFAULT;
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
		result.append(" (vehicleMovementType: ");
		result.append(vehicleMovementType);
		result.append(", preAcceptanceDecisions: ");
		result.append(preAcceptanceDecisions);
		result.append(')');
		return result.toString();
	}

} //OnlineImpl
