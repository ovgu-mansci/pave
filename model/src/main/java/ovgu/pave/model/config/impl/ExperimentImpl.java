/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.Experiment;
import ovgu.pave.model.config.Offline;
import ovgu.pave.model.config.Online;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getPlanningType <em>Planning Type</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getNumberOfRequests <em>Number Of Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getNumberOfVehicles <em>Number Of Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getMaxDelayValue <em>Max Delay Value</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getInsideRepetitions <em>Inside Repetitions</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getOutsideRepetitions <em>Outside Repetitions</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getVehicleCapacity <em>Vehicle Capacity</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getFactorOnTravelTime <em>Factor On Travel Time</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getOffline <em>Offline</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ExperimentImpl#getOnline <em>Online</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentImpl extends MinimalEObjectImpl.Container implements Experiment {
	/**
	 * The default value of the '{@link #getPlanningType() <em>Planning Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningType()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANNING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanningType() <em>Planning Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningType()
	 * @generated
	 * @ordered
	 */
	protected String planningType = PLANNING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRequests() <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRequests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REQUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRequests() <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRequests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRequests = NUMBER_OF_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfVehicles() <em>Number Of Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVehicles()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_VEHICLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfVehicles() <em>Number Of Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVehicles()
	 * @generated
	 * @ordered
	 */
	protected int numberOfVehicles = NUMBER_OF_VEHICLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected int serviceDuration = SERVICE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDelayValue() <em>Max Delay Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDelayValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_DELAY_VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxDelayValue() <em>Max Delay Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDelayValue()
	 * @generated
	 * @ordered
	 */
	protected long maxDelayValue = MAX_DELAY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsideRepetitions() <em>Inside Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideRepetitions()
	 * @generated
	 * @ordered
	 */
	protected static final int INSIDE_REPETITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInsideRepetitions() <em>Inside Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideRepetitions()
	 * @generated
	 * @ordered
	 */
	protected int insideRepetitions = INSIDE_REPETITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected String outputFolder = OUTPUT_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutsideRepetitions() <em>Outside Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideRepetitions()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTSIDE_REPETITIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutsideRepetitions() <em>Outside Repetitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideRepetitions()
	 * @generated
	 * @ordered
	 */
	protected int outsideRepetitions = OUTSIDE_REPETITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleCapacity() <em>Vehicle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int VEHICLE_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVehicleCapacity() <em>Vehicle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleCapacity()
	 * @generated
	 * @ordered
	 */
	protected int vehicleCapacity = VEHICLE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactorOnTravelTime() <em>Factor On Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorOnTravelTime()
	 * @generated
	 * @ordered
	 */
	protected static final double FACTOR_ON_TRAVEL_TIME_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getFactorOnTravelTime() <em>Factor On Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactorOnTravelTime()
	 * @generated
	 * @ordered
	 */
	protected double factorOnTravelTime = FACTOR_ON_TRAVEL_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOffline() <em>Offline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffline()
	 * @generated
	 * @ordered
	 */
	protected Offline offline;

	/**
	 * The cached value of the '{@link #getOnline() <em>Online</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnline()
	 * @generated
	 * @ordered
	 */
	protected Online online;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.EXPERIMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanningType() {
		return planningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningType(String newPlanningType) {
		String oldPlanningType = planningType;
		planningType = newPlanningType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__PLANNING_TYPE, oldPlanningType, planningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRequests() {
		return numberOfRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRequests(int newNumberOfRequests) {
		int oldNumberOfRequests = numberOfRequests;
		numberOfRequests = newNumberOfRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__NUMBER_OF_REQUESTS, oldNumberOfRequests, numberOfRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfVehicles(int newNumberOfVehicles) {
		int oldNumberOfVehicles = numberOfVehicles;
		numberOfVehicles = newNumberOfVehicles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__NUMBER_OF_VEHICLES, oldNumberOfVehicles, numberOfVehicles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServiceDuration() {
		return serviceDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDuration(int newServiceDuration) {
		int oldServiceDuration = serviceDuration;
		serviceDuration = newServiceDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__SERVICE_DURATION, oldServiceDuration, serviceDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxDelayValue() {
		return maxDelayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDelayValue(long newMaxDelayValue) {
		long oldMaxDelayValue = maxDelayValue;
		maxDelayValue = newMaxDelayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__MAX_DELAY_VALUE, oldMaxDelayValue, maxDelayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInsideRepetitions() {
		return insideRepetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsideRepetitions(int newInsideRepetitions) {
		int oldInsideRepetitions = insideRepetitions;
		insideRepetitions = newInsideRepetitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__INSIDE_REPETITIONS, oldInsideRepetitions, insideRepetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFolder() {
		return outputFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFolder(String newOutputFolder) {
		String oldOutputFolder = outputFolder;
		outputFolder = newOutputFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__OUTPUT_FOLDER, oldOutputFolder, outputFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutsideRepetitions() {
		return outsideRepetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsideRepetitions(int newOutsideRepetitions) {
		int oldOutsideRepetitions = outsideRepetitions;
		outsideRepetitions = newOutsideRepetitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__OUTSIDE_REPETITIONS, oldOutsideRepetitions, outsideRepetitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVehicleCapacity() {
		return vehicleCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleCapacity(int newVehicleCapacity) {
		int oldVehicleCapacity = vehicleCapacity;
		vehicleCapacity = newVehicleCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__VEHICLE_CAPACITY, oldVehicleCapacity, vehicleCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFactorOnTravelTime() {
		return factorOnTravelTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactorOnTravelTime(double newFactorOnTravelTime) {
		double oldFactorOnTravelTime = factorOnTravelTime;
		factorOnTravelTime = newFactorOnTravelTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__FACTOR_ON_TRAVEL_TIME, oldFactorOnTravelTime, factorOnTravelTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offline getOffline() {
		return offline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffline(Offline newOffline, NotificationChain msgs) {
		Offline oldOffline = offline;
		offline = newOffline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__OFFLINE, oldOffline, newOffline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffline(Offline newOffline) {
		if (newOffline != offline) {
			NotificationChain msgs = null;
			if (offline != null)
				msgs = ((InternalEObject)offline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.EXPERIMENT__OFFLINE, null, msgs);
			if (newOffline != null)
				msgs = ((InternalEObject)newOffline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.EXPERIMENT__OFFLINE, null, msgs);
			msgs = basicSetOffline(newOffline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__OFFLINE, newOffline, newOffline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Online getOnline() {
		return online;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnline(Online newOnline, NotificationChain msgs) {
		Online oldOnline = online;
		online = newOnline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__ONLINE, oldOnline, newOnline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnline(Online newOnline) {
		if (newOnline != online) {
			NotificationChain msgs = null;
			if (online != null)
				msgs = ((InternalEObject)online).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.EXPERIMENT__ONLINE, null, msgs);
			if (newOnline != null)
				msgs = ((InternalEObject)newOnline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.EXPERIMENT__ONLINE, null, msgs);
			msgs = basicSetOnline(newOnline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXPERIMENT__ONLINE, newOnline, newOnline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.EXPERIMENT__OFFLINE:
				return basicSetOffline(null, msgs);
			case ConfigPackage.EXPERIMENT__ONLINE:
				return basicSetOnline(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.EXPERIMENT__PLANNING_TYPE:
				return getPlanningType();
			case ConfigPackage.EXPERIMENT__NUMBER_OF_REQUESTS:
				return getNumberOfRequests();
			case ConfigPackage.EXPERIMENT__NUMBER_OF_VEHICLES:
				return getNumberOfVehicles();
			case ConfigPackage.EXPERIMENT__SERVICE_DURATION:
				return getServiceDuration();
			case ConfigPackage.EXPERIMENT__MAX_DELAY_VALUE:
				return getMaxDelayValue();
			case ConfigPackage.EXPERIMENT__INSIDE_REPETITIONS:
				return getInsideRepetitions();
			case ConfigPackage.EXPERIMENT__OUTPUT_FOLDER:
				return getOutputFolder();
			case ConfigPackage.EXPERIMENT__OUTSIDE_REPETITIONS:
				return getOutsideRepetitions();
			case ConfigPackage.EXPERIMENT__VEHICLE_CAPACITY:
				return getVehicleCapacity();
			case ConfigPackage.EXPERIMENT__FACTOR_ON_TRAVEL_TIME:
				return getFactorOnTravelTime();
			case ConfigPackage.EXPERIMENT__OFFLINE:
				return getOffline();
			case ConfigPackage.EXPERIMENT__ONLINE:
				return getOnline();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.EXPERIMENT__PLANNING_TYPE:
				setPlanningType((String)newValue);
				return;
			case ConfigPackage.EXPERIMENT__NUMBER_OF_REQUESTS:
				setNumberOfRequests((Integer)newValue);
				return;
			case ConfigPackage.EXPERIMENT__NUMBER_OF_VEHICLES:
				setNumberOfVehicles((Integer)newValue);
				return;
			case ConfigPackage.EXPERIMENT__SERVICE_DURATION:
				setServiceDuration((Integer)newValue);
				return;
			case ConfigPackage.EXPERIMENT__MAX_DELAY_VALUE:
				setMaxDelayValue((Long)newValue);
				return;
			case ConfigPackage.EXPERIMENT__INSIDE_REPETITIONS:
				setInsideRepetitions((Integer)newValue);
				return;
			case ConfigPackage.EXPERIMENT__OUTPUT_FOLDER:
				setOutputFolder((String)newValue);
				return;
			case ConfigPackage.EXPERIMENT__OUTSIDE_REPETITIONS:
				setOutsideRepetitions((Integer)newValue);
				return;
			case ConfigPackage.EXPERIMENT__VEHICLE_CAPACITY:
				setVehicleCapacity((Integer)newValue);
				return;
			case ConfigPackage.EXPERIMENT__FACTOR_ON_TRAVEL_TIME:
				setFactorOnTravelTime((Double)newValue);
				return;
			case ConfigPackage.EXPERIMENT__OFFLINE:
				setOffline((Offline)newValue);
				return;
			case ConfigPackage.EXPERIMENT__ONLINE:
				setOnline((Online)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.EXPERIMENT__PLANNING_TYPE:
				setPlanningType(PLANNING_TYPE_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__NUMBER_OF_REQUESTS:
				setNumberOfRequests(NUMBER_OF_REQUESTS_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__NUMBER_OF_VEHICLES:
				setNumberOfVehicles(NUMBER_OF_VEHICLES_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__SERVICE_DURATION:
				setServiceDuration(SERVICE_DURATION_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__MAX_DELAY_VALUE:
				setMaxDelayValue(MAX_DELAY_VALUE_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__INSIDE_REPETITIONS:
				setInsideRepetitions(INSIDE_REPETITIONS_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__OUTPUT_FOLDER:
				setOutputFolder(OUTPUT_FOLDER_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__OUTSIDE_REPETITIONS:
				setOutsideRepetitions(OUTSIDE_REPETITIONS_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__VEHICLE_CAPACITY:
				setVehicleCapacity(VEHICLE_CAPACITY_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__FACTOR_ON_TRAVEL_TIME:
				setFactorOnTravelTime(FACTOR_ON_TRAVEL_TIME_EDEFAULT);
				return;
			case ConfigPackage.EXPERIMENT__OFFLINE:
				setOffline((Offline)null);
				return;
			case ConfigPackage.EXPERIMENT__ONLINE:
				setOnline((Online)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.EXPERIMENT__PLANNING_TYPE:
				return PLANNING_TYPE_EDEFAULT == null ? planningType != null : !PLANNING_TYPE_EDEFAULT.equals(planningType);
			case ConfigPackage.EXPERIMENT__NUMBER_OF_REQUESTS:
				return numberOfRequests != NUMBER_OF_REQUESTS_EDEFAULT;
			case ConfigPackage.EXPERIMENT__NUMBER_OF_VEHICLES:
				return numberOfVehicles != NUMBER_OF_VEHICLES_EDEFAULT;
			case ConfigPackage.EXPERIMENT__SERVICE_DURATION:
				return serviceDuration != SERVICE_DURATION_EDEFAULT;
			case ConfigPackage.EXPERIMENT__MAX_DELAY_VALUE:
				return maxDelayValue != MAX_DELAY_VALUE_EDEFAULT;
			case ConfigPackage.EXPERIMENT__INSIDE_REPETITIONS:
				return insideRepetitions != INSIDE_REPETITIONS_EDEFAULT;
			case ConfigPackage.EXPERIMENT__OUTPUT_FOLDER:
				return OUTPUT_FOLDER_EDEFAULT == null ? outputFolder != null : !OUTPUT_FOLDER_EDEFAULT.equals(outputFolder);
			case ConfigPackage.EXPERIMENT__OUTSIDE_REPETITIONS:
				return outsideRepetitions != OUTSIDE_REPETITIONS_EDEFAULT;
			case ConfigPackage.EXPERIMENT__VEHICLE_CAPACITY:
				return vehicleCapacity != VEHICLE_CAPACITY_EDEFAULT;
			case ConfigPackage.EXPERIMENT__FACTOR_ON_TRAVEL_TIME:
				return factorOnTravelTime != FACTOR_ON_TRAVEL_TIME_EDEFAULT;
			case ConfigPackage.EXPERIMENT__OFFLINE:
				return offline != null;
			case ConfigPackage.EXPERIMENT__ONLINE:
				return online != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (planningType: ");
		result.append(planningType);
		result.append(", numberOfRequests: ");
		result.append(numberOfRequests);
		result.append(", numberOfVehicles: ");
		result.append(numberOfVehicles);
		result.append(", serviceDuration: ");
		result.append(serviceDuration);
		result.append(", maxDelayValue: ");
		result.append(maxDelayValue);
		result.append(", insideRepetitions: ");
		result.append(insideRepetitions);
		result.append(", outputFolder: ");
		result.append(outputFolder);
		result.append(", outsideRepetitions: ");
		result.append(outsideRepetitions);
		result.append(", vehicleCapacity: ");
		result.append(vehicleCapacity);
		result.append(", factorOnTravelTime: ");
		result.append(factorOnTravelTime);
		result.append(')');
		return result.toString();
	}

} //ExperimentImpl
