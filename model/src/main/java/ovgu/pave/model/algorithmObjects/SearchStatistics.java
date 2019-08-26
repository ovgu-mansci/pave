/**
 */
package ovgu.pave.model.algorithmObjects;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getIterationsBeforeAcceptance <em>Iterations Before Acceptance</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfAcceptances <em>Number Of Acceptances</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfReschedulableRequests <em>Number Of Reschedulable Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getSearchDuration <em>Search Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueCapacity <em>Invalid Due Capacity</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueTime <em>Invalid Due Time</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getOnTheFlyRescheduling <em>On The Fly Rescheduling</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getWayPoints <em>Way Points</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getRemovalIterations <em>Removal Iterations</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics()
 * @model
 * @generated
 */
public interface SearchStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Iterations Before Acceptance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterations Before Acceptance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations Before Acceptance</em>' attribute.
	 * @see #setIterationsBeforeAcceptance(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_IterationsBeforeAcceptance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getIterationsBeforeAcceptance();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getIterationsBeforeAcceptance <em>Iterations Before Acceptance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations Before Acceptance</em>' attribute.
	 * @see #getIterationsBeforeAcceptance()
	 * @generated
	 */
	void setIterationsBeforeAcceptance(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Acceptances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Acceptances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Acceptances</em>' attribute.
	 * @see #setNumberOfAcceptances(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_NumberOfAcceptances()
	 * @model
	 * @generated
	 */
	int getNumberOfAcceptances();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfAcceptances <em>Number Of Acceptances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Acceptances</em>' attribute.
	 * @see #getNumberOfAcceptances()
	 * @generated
	 */
	void setNumberOfAcceptances(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Reschedulable Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Reschedulable Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Reschedulable Requests</em>' attribute.
	 * @see #setNumberOfReschedulableRequests(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_NumberOfReschedulableRequests()
	 * @model
	 * @generated
	 */
	int getNumberOfReschedulableRequests();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getNumberOfReschedulableRequests <em>Number Of Reschedulable Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Reschedulable Requests</em>' attribute.
	 * @see #getNumberOfReschedulableRequests()
	 * @generated
	 */
	void setNumberOfReschedulableRequests(int value);

	/**
	 * Returns the value of the '<em><b>Search Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Duration</em>' attribute.
	 * @see #setSearchDuration(long)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_SearchDuration()
	 * @model
	 * @generated
	 */
	long getSearchDuration();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getSearchDuration <em>Search Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Duration</em>' attribute.
	 * @see #getSearchDuration()
	 * @generated
	 */
	void setSearchDuration(long value);

	/**
	 * Returns the value of the '<em><b>Invalid Due Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Due Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Due Capacity</em>' attribute.
	 * @see #setInvalidDueCapacity(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_InvalidDueCapacity()
	 * @model
	 * @generated
	 */
	int getInvalidDueCapacity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueCapacity <em>Invalid Due Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Due Capacity</em>' attribute.
	 * @see #getInvalidDueCapacity()
	 * @generated
	 */
	void setInvalidDueCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Invalid Due Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invalid Due Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Due Time</em>' attribute.
	 * @see #setInvalidDueTime(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_InvalidDueTime()
	 * @model
	 * @generated
	 */
	int getInvalidDueTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getInvalidDueTime <em>Invalid Due Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Due Time</em>' attribute.
	 * @see #getInvalidDueTime()
	 * @generated
	 */
	void setInvalidDueTime(int value);

	/**
	 * Returns the value of the '<em><b>On The Fly Rescheduling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On The Fly Rescheduling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On The Fly Rescheduling</em>' attribute.
	 * @see #setOnTheFlyRescheduling(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_OnTheFlyRescheduling()
	 * @model
	 * @generated
	 */
	int getOnTheFlyRescheduling();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getOnTheFlyRescheduling <em>On The Fly Rescheduling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On The Fly Rescheduling</em>' attribute.
	 * @see #getOnTheFlyRescheduling()
	 * @generated
	 */
	void setOnTheFlyRescheduling(int value);

	/**
	 * Returns the value of the '<em><b>Way Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Way Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Way Points</em>' attribute.
	 * @see #setWayPoints(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_WayPoints()
	 * @model
	 * @generated
	 */
	int getWayPoints();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getWayPoints <em>Way Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Way Points</em>' attribute.
	 * @see #getWayPoints()
	 * @generated
	 */
	void setWayPoints(int value);

	/**
	 * Returns the value of the '<em><b>Removal Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removal Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Iterations</em>' attribute.
	 * @see #setRemovalIterations(int)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSearchStatistics_RemovalIterations()
	 * @model
	 * @generated
	 */
	int getRemovalIterations();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.SearchStatistics#getRemovalIterations <em>Removal Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Iterations</em>' attribute.
	 * @see #getRemovalIterations()
	 * @generated
	 */
	void setRemovalIterations(int value);

} // SearchStatistics
