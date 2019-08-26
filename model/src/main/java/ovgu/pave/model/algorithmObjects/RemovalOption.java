/**
 */
package ovgu.pave.model.algorithmObjects;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removal Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.RemovalOption#getScore <em>Score</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.RemovalOption#getRoute <em>Route</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.RemovalOption#getFirstActivityRouteElement <em>First Activity Route Element</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.RemovalOption#getSecondActivityRouteElement <em>Second Activity Route Element</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.RemovalOption#getShawDistance <em>Shaw Distance</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.RemovalOption#getShawServiceBegin <em>Shaw Service Begin</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalOption()
 * @model
 * @generated
 */
public interface RemovalOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(long)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalOption_Score()
	 * @model
	 * @generated
	 */
	long getScore();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(long value);

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
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalOption_Route()
	 * @model dataType="ovgu.pave.model.algorithmObjects.Route"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' attribute.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>First Activity Route Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Activity Route Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Activity Route Element</em>' attribute.
	 * @see #setFirstActivityRouteElement(RouteElement)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalOption_FirstActivityRouteElement()
	 * @model dataType="ovgu.pave.model.algorithmObjects.RouteElement"
	 * @generated
	 */
	RouteElement getFirstActivityRouteElement();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getFirstActivityRouteElement <em>First Activity Route Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Activity Route Element</em>' attribute.
	 * @see #getFirstActivityRouteElement()
	 * @generated
	 */
	void setFirstActivityRouteElement(RouteElement value);

	/**
	 * Returns the value of the '<em><b>Second Activity Route Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Activity Route Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Activity Route Element</em>' attribute.
	 * @see #setSecondActivityRouteElement(RouteElement)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalOption_SecondActivityRouteElement()
	 * @model dataType="ovgu.pave.model.algorithmObjects.RouteElement"
	 * @generated
	 */
	RouteElement getSecondActivityRouteElement();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getSecondActivityRouteElement <em>Second Activity Route Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Activity Route Element</em>' attribute.
	 * @see #getSecondActivityRouteElement()
	 * @generated
	 */
	void setSecondActivityRouteElement(RouteElement value);

	/**
	 * Returns the value of the '<em><b>Shaw Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaw Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaw Distance</em>' attribute.
	 * @see #setShawDistance(long)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalOption_ShawDistance()
	 * @model
	 * @generated
	 */
	long getShawDistance();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getShawDistance <em>Shaw Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaw Distance</em>' attribute.
	 * @see #getShawDistance()
	 * @generated
	 */
	void setShawDistance(long value);

	/**
	 * Returns the value of the '<em><b>Shaw Service Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaw Service Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaw Service Begin</em>' attribute.
	 * @see #setShawServiceBegin(long)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getRemovalOption_ShawServiceBegin()
	 * @model
	 * @generated
	 */
	long getShawServiceBegin();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.RemovalOption#getShawServiceBegin <em>Shaw Service Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaw Service Begin</em>' attribute.
	 * @see #getShawServiceBegin()
	 * @generated
	 */
	void setShawServiceBegin(long value);

} // RemovalOption
