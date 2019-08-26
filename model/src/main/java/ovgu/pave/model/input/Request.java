/**
 */
package ovgu.pave.model.input;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.Request#getFirstActivity <em>First Activity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getSecondActivity <em>Second Activity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getId <em>Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getRequestTime <em>Request Time</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#isPreRejected <em>Pre Rejected</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getPenaltie <em>Penaltie</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.input.InputPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>First Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Activity</em>' containment reference.
	 * @see #setFirstActivity(FirstRequestActivity)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_FirstActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FirstRequestActivity getFirstActivity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getFirstActivity <em>First Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Activity</em>' containment reference.
	 * @see #getFirstActivity()
	 * @generated
	 */
	void setFirstActivity(FirstRequestActivity value);

	/**
	 * Returns the value of the '<em><b>Second Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Activity</em>' containment reference.
	 * @see #setSecondActivity(SecondRequestActivity)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_SecondActivity()
	 * @model containment="true"
	 * @generated
	 */
	SecondRequestActivity getSecondActivity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getSecondActivity <em>Second Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Activity</em>' containment reference.
	 * @see #getSecondActivity()
	 * @generated
	 */
	void setSecondActivity(SecondRequestActivity value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_Id()
	 * @model default="0" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Request Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Time</em>' attribute.
	 * @see #setRequestTime(long)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_RequestTime()
	 * @model
	 * @generated
	 */
	long getRequestTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getRequestTime <em>Request Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Time</em>' attribute.
	 * @see #getRequestTime()
	 * @generated
	 */
	void setRequestTime(long value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Pre Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Rejected</em>' attribute.
	 * @see #setPreRejected(boolean)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_PreRejected()
	 * @model
	 * @generated
	 */
	boolean isPreRejected();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#isPreRejected <em>Pre Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Rejected</em>' attribute.
	 * @see #isPreRejected()
	 * @generated
	 */
	void setPreRejected(boolean value);

	/**
	 * Returns the value of the '<em><b>Penaltie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penaltie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penaltie</em>' attribute.
	 * @see #setPenaltie(int)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_Penaltie()
	 * @model
	 * @generated
	 */
	int getPenaltie();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getPenaltie <em>Penaltie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penaltie</em>' attribute.
	 * @see #getPenaltie()
	 * @generated
	 */
	void setPenaltie(int value);

} // Request
