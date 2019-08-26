/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORTOOLS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.ORTOOLS#getFirstSolutionStrategy <em>First Solution Strategy</em>}</li>
 *   <li>{@link ovgu.pave.model.config.ORTOOLS#getLocalSearchMetaheuristic <em>Local Search Metaheuristic</em>}</li>
 *   <li>{@link ovgu.pave.model.config.ORTOOLS#getMaxCalculationTime <em>Max Calculation Time</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getORTOOLS()
 * @model
 * @generated
 */
public interface ORTOOLS extends EObject {

	/**
	 * Returns the value of the '<em><b>First Solution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Solution Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Solution Strategy</em>' attribute.
	 * @see #setFirstSolutionStrategy(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getORTOOLS_FirstSolutionStrategy()
	 * @model
	 * @generated
	 */
	String getFirstSolutionStrategy();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ORTOOLS#getFirstSolutionStrategy <em>First Solution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Solution Strategy</em>' attribute.
	 * @see #getFirstSolutionStrategy()
	 * @generated
	 */
	void setFirstSolutionStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Local Search Metaheuristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Search Metaheuristic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Search Metaheuristic</em>' attribute.
	 * @see #setLocalSearchMetaheuristic(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getORTOOLS_LocalSearchMetaheuristic()
	 * @model
	 * @generated
	 */
	String getLocalSearchMetaheuristic();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ORTOOLS#getLocalSearchMetaheuristic <em>Local Search Metaheuristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Search Metaheuristic</em>' attribute.
	 * @see #getLocalSearchMetaheuristic()
	 * @generated
	 */
	void setLocalSearchMetaheuristic(String value);

	/**
	 * Returns the value of the '<em><b>Max Calculation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Calculation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Calculation Time</em>' attribute.
	 * @see #setMaxCalculationTime(long)
	 * @see ovgu.pave.model.config.ConfigPackage#getORTOOLS_MaxCalculationTime()
	 * @model
	 * @generated
	 */
	long getMaxCalculationTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ORTOOLS#getMaxCalculationTime <em>Max Calculation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Calculation Time</em>' attribute.
	 * @see #getMaxCalculationTime()
	 * @generated
	 */
	void setMaxCalculationTime(long value);
} // ORTOOLS
