/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.Online#getVehicleMovementType <em>Vehicle Movement Type</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Online#isPreAcceptanceDecisions <em>Pre Acceptance Decisions</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getOnline()
 * @model
 * @generated
 */
public interface Online extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle Movement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle Movement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Movement Type</em>' attribute.
	 * @see #setVehicleMovementType(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getOnline_VehicleMovementType()
	 * @model
	 * @generated
	 */
	String getVehicleMovementType();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Online#getVehicleMovementType <em>Vehicle Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Movement Type</em>' attribute.
	 * @see #getVehicleMovementType()
	 * @generated
	 */
	void setVehicleMovementType(String value);

	/**
	 * Returns the value of the '<em><b>Pre Acceptance Decisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Acceptance Decisions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Acceptance Decisions</em>' attribute.
	 * @see #setPreAcceptanceDecisions(boolean)
	 * @see ovgu.pave.model.config.ConfigPackage#getOnline_PreAcceptanceDecisions()
	 * @model
	 * @generated
	 */
	boolean isPreAcceptanceDecisions();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Online#isPreAcceptanceDecisions <em>Pre Acceptance Decisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Acceptance Decisions</em>' attribute.
	 * @see #isPreAcceptanceDecisions()
	 * @generated
	 */
	void setPreAcceptanceDecisions(boolean value);

} // Online
