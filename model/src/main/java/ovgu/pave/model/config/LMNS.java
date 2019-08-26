/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LMNS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.LMNS#getMaxInsertionIterations <em>Max Insertion Iterations</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LMNS#getMaxImprovementIterations <em>Max Improvement Iterations</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getLMNS()
 * @model
 * @generated
 */
public interface LMNS extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Insertion Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Insertion Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Insertion Iterations</em>' attribute.
	 * @see #setMaxInsertionIterations(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getLMNS_MaxInsertionIterations()
	 * @model
	 * @generated
	 */
	int getMaxInsertionIterations();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LMNS#getMaxInsertionIterations <em>Max Insertion Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Insertion Iterations</em>' attribute.
	 * @see #getMaxInsertionIterations()
	 * @generated
	 */
	void setMaxInsertionIterations(int value);

	/**
	 * Returns the value of the '<em><b>Max Improvement Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Improvement Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Improvement Iterations</em>' attribute.
	 * @see #setMaxImprovementIterations(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getLMNS_MaxImprovementIterations()
	 * @model
	 * @generated
	 */
	int getMaxImprovementIterations();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LMNS#getMaxImprovementIterations <em>Max Improvement Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Improvement Iterations</em>' attribute.
	 * @see #getMaxImprovementIterations()
	 * @generated
	 */
	void setMaxImprovementIterations(int value);

} // LMNS
