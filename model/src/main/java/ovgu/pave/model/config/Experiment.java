/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.Experiment#getPlanningType <em>Planning Type</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getNumberOfRequests <em>Number Of Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getNumberOfVehicles <em>Number Of Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getMaxDelayValue <em>Max Delay Value</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getInsideRepetitions <em>Inside Repetitions</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getOutsideRepetitions <em>Outside Repetitions</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getVehicleCapacity <em>Vehicle Capacity</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getFactorOnTravelTime <em>Factor On Travel Time</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getOffline <em>Offline</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Experiment#getOnline <em>Online</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getExperiment()
 * @model
 * @generated
 */
public interface Experiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Planning Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Type</em>' attribute.
	 * @see #setPlanningType(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_PlanningType()
	 * @model
	 * @generated
	 */
	String getPlanningType();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getPlanningType <em>Planning Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Type</em>' attribute.
	 * @see #getPlanningType()
	 * @generated
	 */
	void setPlanningType(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Requests</em>' attribute.
	 * @see #setNumberOfRequests(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_NumberOfRequests()
	 * @model
	 * @generated
	 */
	int getNumberOfRequests();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getNumberOfRequests <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Requests</em>' attribute.
	 * @see #getNumberOfRequests()
	 * @generated
	 */
	void setNumberOfRequests(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Vehicles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Vehicles</em>' attribute.
	 * @see #setNumberOfVehicles(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_NumberOfVehicles()
	 * @model
	 * @generated
	 */
	int getNumberOfVehicles();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getNumberOfVehicles <em>Number Of Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Vehicles</em>' attribute.
	 * @see #getNumberOfVehicles()
	 * @generated
	 */
	void setNumberOfVehicles(int value);

	/**
	 * Returns the value of the '<em><b>Service Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Duration</em>' attribute.
	 * @see #setServiceDuration(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_ServiceDuration()
	 * @model default="0"
	 * @generated
	 */
	int getServiceDuration();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getServiceDuration <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Duration</em>' attribute.
	 * @see #getServiceDuration()
	 * @generated
	 */
	void setServiceDuration(int value);

	/**
	 * Returns the value of the '<em><b>Max Delay Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Delay Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Delay Value</em>' attribute.
	 * @see #setMaxDelayValue(long)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_MaxDelayValue()
	 * @model
	 * @generated
	 */
	long getMaxDelayValue();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getMaxDelayValue <em>Max Delay Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Delay Value</em>' attribute.
	 * @see #getMaxDelayValue()
	 * @generated
	 */
	void setMaxDelayValue(long value);

	/**
	 * Returns the value of the '<em><b>Inside Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inside Repetitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside Repetitions</em>' attribute.
	 * @see #setInsideRepetitions(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_InsideRepetitions()
	 * @model
	 * @generated
	 */
	int getInsideRepetitions();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getInsideRepetitions <em>Inside Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inside Repetitions</em>' attribute.
	 * @see #getInsideRepetitions()
	 * @generated
	 */
	void setInsideRepetitions(int value);

	/**
	 * Returns the value of the '<em><b>Output Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Folder</em>' attribute.
	 * @see #setOutputFolder(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_OutputFolder()
	 * @model
	 * @generated
	 */
	String getOutputFolder();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getOutputFolder <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Folder</em>' attribute.
	 * @see #getOutputFolder()
	 * @generated
	 */
	void setOutputFolder(String value);

	/**
	 * Returns the value of the '<em><b>Outside Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside Repetitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Repetitions</em>' attribute.
	 * @see #setOutsideRepetitions(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_OutsideRepetitions()
	 * @model
	 * @generated
	 */
	int getOutsideRepetitions();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getOutsideRepetitions <em>Outside Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Repetitions</em>' attribute.
	 * @see #getOutsideRepetitions()
	 * @generated
	 */
	void setOutsideRepetitions(int value);

	/**
	 * Returns the value of the '<em><b>Vehicle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Capacity</em>' attribute.
	 * @see #setVehicleCapacity(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_VehicleCapacity()
	 * @model
	 * @generated
	 */
	int getVehicleCapacity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getVehicleCapacity <em>Vehicle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Capacity</em>' attribute.
	 * @see #getVehicleCapacity()
	 * @generated
	 */
	void setVehicleCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Factor On Travel Time</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor On Travel Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor On Travel Time</em>' attribute.
	 * @see #setFactorOnTravelTime(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_FactorOnTravelTime()
	 * @model default="1"
	 * @generated
	 */
	double getFactorOnTravelTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getFactorOnTravelTime <em>Factor On Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor On Travel Time</em>' attribute.
	 * @see #getFactorOnTravelTime()
	 * @generated
	 */
	void setFactorOnTravelTime(double value);

	/**
	 * Returns the value of the '<em><b>Offline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offline</em>' containment reference.
	 * @see #setOffline(Offline)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_Offline()
	 * @model containment="true"
	 * @generated
	 */
	Offline getOffline();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getOffline <em>Offline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offline</em>' containment reference.
	 * @see #getOffline()
	 * @generated
	 */
	void setOffline(Offline value);

	/**
	 * Returns the value of the '<em><b>Online</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Online</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online</em>' containment reference.
	 * @see #setOnline(Online)
	 * @see ovgu.pave.model.config.ConfigPackage#getExperiment_Online()
	 * @model containment="true"
	 * @generated
	 */
	Online getOnline();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Experiment#getOnline <em>Online</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online</em>' containment reference.
	 * @see #getOnline()
	 * @generated
	 */
	void setOnline(Online value);

} // Experiment
