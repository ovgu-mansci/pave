/**
 */
package ovgu.pave.model.algorithmObjects;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.input.Request;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removal Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.RemovalInformation#getNumberOfRemovalsPerRequest <em>Number Of Removals Per Request</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalInformation()
 * @model
 * @generated
 */
public interface RemovalInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Removals Per Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Removals Per Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Removals Per Request</em>' attribute.
	 * @see #setNumberOfRemovalsPerRequest(HashMap)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalInformation_NumberOfRemovalsPerRequest()
	 * @model dataType="ovgu.pave.model.algorithmObjects.ReuqestsHashMap"
	 * @generated
	 */
	HashMap<Request, Long> getNumberOfRemovalsPerRequest();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.RemovalInformation#getNumberOfRemovalsPerRequest <em>Number Of Removals Per Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Removals Per Request</em>' attribute.
	 * @see #getNumberOfRemovalsPerRequest()
	 * @generated
	 */
	void setNumberOfRemovalsPerRequest(HashMap<Request, Long> value);

} // RemovalInformation
