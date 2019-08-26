/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.RemovalInformation;

import ovgu.pave.model.input.Request;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removal Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.RemovalInformationImpl#getNumberOfRemovalsPerRequest <em>Number Of Removals Per Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemovalInformationImpl extends MinimalEObjectImpl.Container implements RemovalInformation {
	/**
	 * The default value of the '{@link #getNumberOfRemovalsPerRequest() <em>Number Of Removals Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRemovalsPerRequest()
	 * @generated
	 * @ordered
	 */
	protected static final HashMap<Request, Long> NUMBER_OF_REMOVALS_PER_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfRemovalsPerRequest() <em>Number Of Removals Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRemovalsPerRequest()
	 * @generated
	 * @ordered
	 */
	protected HashMap<Request, Long> numberOfRemovalsPerRequest = NUMBER_OF_REMOVALS_PER_REQUEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovalInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmObjectsPackage.Literals.REMOVAL_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<Request, Long> getNumberOfRemovalsPerRequest() {
		return numberOfRemovalsPerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRemovalsPerRequest(HashMap<Request, Long> newNumberOfRemovalsPerRequest) {
		HashMap<Request, Long> oldNumberOfRemovalsPerRequest = numberOfRemovalsPerRequest;
		numberOfRemovalsPerRequest = newNumberOfRemovalsPerRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST, oldNumberOfRemovalsPerRequest, numberOfRemovalsPerRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmObjectsPackage.REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST:
				return getNumberOfRemovalsPerRequest();
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
			case AlgorithmObjectsPackage.REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST:
				setNumberOfRemovalsPerRequest((HashMap<Request, Long>)newValue);
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
			case AlgorithmObjectsPackage.REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST:
				setNumberOfRemovalsPerRequest(NUMBER_OF_REMOVALS_PER_REQUEST_EDEFAULT);
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
			case AlgorithmObjectsPackage.REMOVAL_INFORMATION__NUMBER_OF_REMOVALS_PER_REQUEST:
				return NUMBER_OF_REMOVALS_PER_REQUEST_EDEFAULT == null ? numberOfRemovalsPerRequest != null : !NUMBER_OF_REMOVALS_PER_REQUEST_EDEFAULT.equals(numberOfRemovalsPerRequest);
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
		result.append(" (numberOfRemovalsPerRequest: ");
		result.append(numberOfRemovalsPerRequest);
		result.append(')');
		return result.toString();
	}

} //RemovalInformationImpl
