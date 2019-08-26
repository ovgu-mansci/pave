/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ALNS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.ALNS#getPenaltyTerm <em>Penalty Term</em>}</li>
 *   <li>{@link ovgu.pave.model.config.ALNS#getTemperatureControlParameter <em>Temperature Control Parameter</em>}</li>
 *   <li>{@link ovgu.pave.model.config.ALNS#getCoolingRate <em>Cooling Rate</em>}</li>
 *   <li>{@link ovgu.pave.model.config.ALNS#getMaxCalculationTime <em>Max Calculation Time</em>}</li>
 *   <li>{@link ovgu.pave.model.config.ALNS#getMaxInsertionIterations <em>Max Insertion Iterations</em>}</li>
 *   <li>{@link ovgu.pave.model.config.ALNS#getRws <em>Rws</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getALNS()
 * @model
 * @generated
 */
public interface ALNS extends EObject {
	/**
	 * Returns the value of the '<em><b>Penalty Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Penalty Term</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Penalty Term</em>' attribute.
	 * @see #setPenaltyTerm(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getALNS_PenaltyTerm()
	 * @model
	 * @generated
	 */
	int getPenaltyTerm();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ALNS#getPenaltyTerm <em>Penalty Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penalty Term</em>' attribute.
	 * @see #getPenaltyTerm()
	 * @generated
	 */
	void setPenaltyTerm(int value);

	/**
	 * Returns the value of the '<em><b>Temperature Control Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature Control Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature Control Parameter</em>' attribute.
	 * @see #setTemperatureControlParameter(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getALNS_TemperatureControlParameter()
	 * @model
	 * @generated
	 */
	double getTemperatureControlParameter();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ALNS#getTemperatureControlParameter <em>Temperature Control Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature Control Parameter</em>' attribute.
	 * @see #getTemperatureControlParameter()
	 * @generated
	 */
	void setTemperatureControlParameter(double value);

	/**
	 * Returns the value of the '<em><b>Cooling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooling Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooling Rate</em>' attribute.
	 * @see #setCoolingRate(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getALNS_CoolingRate()
	 * @model
	 * @generated
	 */
	double getCoolingRate();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ALNS#getCoolingRate <em>Cooling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooling Rate</em>' attribute.
	 * @see #getCoolingRate()
	 * @generated
	 */
	void setCoolingRate(double value);

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
	 * @see ovgu.pave.model.config.ConfigPackage#getALNS_MaxCalculationTime()
	 * @model
	 * @generated
	 */
	long getMaxCalculationTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ALNS#getMaxCalculationTime <em>Max Calculation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Calculation Time</em>' attribute.
	 * @see #getMaxCalculationTime()
	 * @generated
	 */
	void setMaxCalculationTime(long value);

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
	 * @see ovgu.pave.model.config.ConfigPackage#getALNS_MaxInsertionIterations()
	 * @model
	 * @generated
	 */
	int getMaxInsertionIterations();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ALNS#getMaxInsertionIterations <em>Max Insertion Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Insertion Iterations</em>' attribute.
	 * @see #getMaxInsertionIterations()
	 * @generated
	 */
	void setMaxInsertionIterations(int value);

	/**
	 * Returns the value of the '<em><b>Rws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rws</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rws</em>' containment reference.
	 * @see #setRws(RWS)
	 * @see ovgu.pave.model.config.ConfigPackage#getALNS_Rws()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RWS getRws();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.ALNS#getRws <em>Rws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rws</em>' containment reference.
	 * @see #getRws()
	 * @generated
	 */
	void setRws(RWS value);

} // ALNS
