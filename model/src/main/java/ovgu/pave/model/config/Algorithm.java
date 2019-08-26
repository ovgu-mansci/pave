/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.Algorithm#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Algorithm#getLns <em>Lns</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Algorithm#getRandomSeet <em>Random Seet</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Algorithm#getOrtools <em>Ortools</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getAlgorithm_Algorithm()
	 * @model
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Algorithm#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Lns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lns</em>' containment reference.
	 * @see #setLns(LNS)
	 * @see ovgu.pave.model.config.ConfigPackage#getAlgorithm_Lns()
	 * @model containment="true"
	 * @generated
	 */
	LNS getLns();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Algorithm#getLns <em>Lns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lns</em>' containment reference.
	 * @see #getLns()
	 * @generated
	 */
	void setLns(LNS value);

	/**
	 * Returns the value of the '<em><b>Random Seet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Seet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Seet</em>' attribute.
	 * @see #setRandomSeet(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getAlgorithm_RandomSeet()
	 * @model
	 * @generated
	 */
	int getRandomSeet();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Algorithm#getRandomSeet <em>Random Seet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Seet</em>' attribute.
	 * @see #getRandomSeet()
	 * @generated
	 */
	void setRandomSeet(int value);

	/**
	 * Returns the value of the '<em><b>Ortools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ortools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ortools</em>' containment reference.
	 * @see #setOrtools(ORTOOLS)
	 * @see ovgu.pave.model.config.ConfigPackage#getAlgorithm_Ortools()
	 * @model containment="true"
	 * @generated
	 */
	ORTOOLS getOrtools();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Algorithm#getOrtools <em>Ortools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ortools</em>' containment reference.
	 * @see #getOrtools()
	 * @generated
	 */
	void setOrtools(ORTOOLS value);

} // Algorithm
