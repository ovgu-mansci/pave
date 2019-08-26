/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LNS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.LNS#getMinSmallRequestSet <em>Min Small Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getMaxLargeRequestSet <em>Max Large Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getMaxSmallRequestSet <em>Max Small Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getMinLargeRequestSet <em>Min Large Request Set</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getInsertionHeuristics <em>Insertion Heuristics</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getRemovalHeuristics <em>Removal Heuristics</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getShawDistanceWeight <em>Shaw Distance Weight</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getShawBeginWeight <em>Shaw Begin Weight</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getAlns <em>Alns</em>}</li>
 *   <li>{@link ovgu.pave.model.config.LNS#getLmns <em>Lmns</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getLNS()
 * @model
 * @generated
 */
public interface LNS extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Small Request Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Small Request Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Small Request Set</em>' attribute.
	 * @see #setMinSmallRequestSet(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_MinSmallRequestSet()
	 * @model
	 * @generated
	 */
	double getMinSmallRequestSet();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getMinSmallRequestSet <em>Min Small Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Small Request Set</em>' attribute.
	 * @see #getMinSmallRequestSet()
	 * @generated
	 */
	void setMinSmallRequestSet(double value);

	/**
	 * Returns the value of the '<em><b>Max Large Request Set</b></em>' attribute.
	 * The default value is <code>"999999"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Large Request Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Large Request Set</em>' attribute.
	 * @see #setMaxLargeRequestSet(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_MaxLargeRequestSet()
	 * @model default="999999"
	 * @generated
	 */
	int getMaxLargeRequestSet();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getMaxLargeRequestSet <em>Max Large Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Large Request Set</em>' attribute.
	 * @see #getMaxLargeRequestSet()
	 * @generated
	 */
	void setMaxLargeRequestSet(int value);

	/**
	 * Returns the value of the '<em><b>Max Small Request Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Small Request Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Small Request Set</em>' attribute.
	 * @see #setMaxSmallRequestSet(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_MaxSmallRequestSet()
	 * @model
	 * @generated
	 */
	double getMaxSmallRequestSet();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getMaxSmallRequestSet <em>Max Small Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Small Request Set</em>' attribute.
	 * @see #getMaxSmallRequestSet()
	 * @generated
	 */
	void setMaxSmallRequestSet(double value);

	/**
	 * Returns the value of the '<em><b>Min Large Request Set</b></em>' attribute.
	 * The default value is <code>"999999"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Large Request Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Large Request Set</em>' attribute.
	 * @see #setMinLargeRequestSet(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_MinLargeRequestSet()
	 * @model default="999999"
	 * @generated
	 */
	int getMinLargeRequestSet();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getMinLargeRequestSet <em>Min Large Request Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Large Request Set</em>' attribute.
	 * @see #getMinLargeRequestSet()
	 * @generated
	 */
	void setMinLargeRequestSet(int value);

	/**
	 * Returns the value of the '<em><b>Insertion Heuristics</b></em>' containment reference list.
	 * The list contents are of type {@link ovgu.pave.model.config.Heuristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertion Heuristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion Heuristics</em>' containment reference list.
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_InsertionHeuristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Heuristic> getInsertionHeuristics();

	/**
	 * Returns the value of the '<em><b>Removal Heuristics</b></em>' containment reference list.
	 * The list contents are of type {@link ovgu.pave.model.config.Heuristic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removal Heuristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Heuristics</em>' containment reference list.
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_RemovalHeuristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Heuristic> getRemovalHeuristics();

	/**
	 * Returns the value of the '<em><b>Shaw Distance Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaw Distance Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaw Distance Weight</em>' attribute.
	 * @see #setShawDistanceWeight(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_ShawDistanceWeight()
	 * @model default="1"
	 * @generated
	 */
	double getShawDistanceWeight();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getShawDistanceWeight <em>Shaw Distance Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaw Distance Weight</em>' attribute.
	 * @see #getShawDistanceWeight()
	 * @generated
	 */
	void setShawDistanceWeight(double value);

	/**
	 * Returns the value of the '<em><b>Shaw Begin Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shaw Begin Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaw Begin Weight</em>' attribute.
	 * @see #setShawBeginWeight(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_ShawBeginWeight()
	 * @model default="1"
	 * @generated
	 */
	double getShawBeginWeight();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getShawBeginWeight <em>Shaw Begin Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaw Begin Weight</em>' attribute.
	 * @see #getShawBeginWeight()
	 * @generated
	 */
	void setShawBeginWeight(double value);

	/**
	 * Returns the value of the '<em><b>Alns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alns</em>' containment reference.
	 * @see #setAlns(ALNS)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_Alns()
	 * @model containment="true"
	 * @generated
	 */
	ALNS getAlns();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getAlns <em>Alns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alns</em>' containment reference.
	 * @see #getAlns()
	 * @generated
	 */
	void setAlns(ALNS value);

	/**
	 * Returns the value of the '<em><b>Lmns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lmns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lmns</em>' containment reference.
	 * @see #setLmns(LMNS)
	 * @see ovgu.pave.model.config.ConfigPackage#getLNS_Lmns()
	 * @model containment="true"
	 * @generated
	 */
	LMNS getLmns();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.LNS#getLmns <em>Lmns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lmns</em>' containment reference.
	 * @see #getLmns()
	 * @generated
	 */
	void setLmns(LMNS value);

} // LNS
