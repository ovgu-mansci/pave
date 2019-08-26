/**
 */
package ovgu.pave.model.algorithmObjects;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.solution.Route;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insertion Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.InsertionOption#getCosts <em>Costs</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.InsertionOption#getFirstActivityIndex <em>First Activity Index</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.InsertionOption#getSecondActivityIndex <em>Second Activity Index</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.InsertionOption#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getInsertionOption()
 * @model
 * @generated
 */
public interface InsertionOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' attribute.
	 * @see #setCosts(long)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getInsertionOption_Costs()
	 * @model
	 * @generated
	 */
	long getCosts();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getCosts <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costs</em>' attribute.
	 * @see #getCosts()
	 * @generated
	 */
	void setCosts(long value);

	/**
	 * Returns the value of the '<em><b>First Activity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Activity Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Activity Index</em>' attribute.
	 * @see #setFirstActivityIndex(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getInsertionOption_FirstActivityIndex()
	 * @model
	 * @generated
	 */
	int getFirstActivityIndex();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getFirstActivityIndex <em>First Activity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Activity Index</em>' attribute.
	 * @see #getFirstActivityIndex()
	 * @generated
	 */
	void setFirstActivityIndex(int value);

	/**
	 * Returns the value of the '<em><b>Second Activity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Activity Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Activity Index</em>' attribute.
	 * @see #setSecondActivityIndex(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getInsertionOption_SecondActivityIndex()
	 * @model
	 * @generated
	 */
	int getSecondActivityIndex();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getSecondActivityIndex <em>Second Activity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Activity Index</em>' attribute.
	 * @see #getSecondActivityIndex()
	 * @generated
	 */
	void setSecondActivityIndex(int value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see #setRoute(Route)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getInsertionOption_Route()
	 * @model dataType="ovgu.pave.model.algorithmObjects.Route"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' attribute.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

} // InsertionOption
