/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.config.ALNS;
import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.RWS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALNS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.ALNSImpl#getPenaltyTerm <em>Penalty Term</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ALNSImpl#getTemperatureControlParameter <em>Temperature Control Parameter</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ALNSImpl#getCoolingRate <em>Cooling Rate</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ALNSImpl#getMaxCalculationTime <em>Max Calculation Time</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ALNSImpl#getMaxInsertionIterations <em>Max Insertion Iterations</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ALNSImpl#getRws <em>Rws</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALNSImpl extends MinimalEObjectImpl.Container implements ALNS {
	/**
	 * The default value of the '{@link #getPenaltyTerm() <em>Penalty Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyTerm()
	 * @generated
	 * @ordered
	 */
	protected static final int PENALTY_TERM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPenaltyTerm() <em>Penalty Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltyTerm()
	 * @generated
	 * @ordered
	 */
	protected int penaltyTerm = PENALTY_TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperatureControlParameter() <em>Temperature Control Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureControlParameter()
	 * @generated
	 * @ordered
	 */
	protected static final double TEMPERATURE_CONTROL_PARAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTemperatureControlParameter() <em>Temperature Control Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperatureControlParameter()
	 * @generated
	 * @ordered
	 */
	protected double temperatureControlParameter = TEMPERATURE_CONTROL_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoolingRate() <em>Cooling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolingRate()
	 * @generated
	 * @ordered
	 */
	protected static final double COOLING_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCoolingRate() <em>Cooling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolingRate()
	 * @generated
	 * @ordered
	 */
	protected double coolingRate = COOLING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCalculationTime() <em>Max Calculation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCalculationTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_CALCULATION_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxCalculationTime() <em>Max Calculation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCalculationTime()
	 * @generated
	 * @ordered
	 */
	protected long maxCalculationTime = MAX_CALCULATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInsertionIterations() <em>Max Insertion Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInsertionIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INSERTION_ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInsertionIterations() <em>Max Insertion Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInsertionIterations()
	 * @generated
	 * @ordered
	 */
	protected int maxInsertionIterations = MAX_INSERTION_ITERATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRws() <em>Rws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRws()
	 * @generated
	 * @ordered
	 */
	protected RWS rws;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ALNSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ALNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPenaltyTerm() {
		return penaltyTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenaltyTerm(int newPenaltyTerm) {
		int oldPenaltyTerm = penaltyTerm;
		penaltyTerm = newPenaltyTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALNS__PENALTY_TERM, oldPenaltyTerm, penaltyTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTemperatureControlParameter() {
		return temperatureControlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperatureControlParameter(double newTemperatureControlParameter) {
		double oldTemperatureControlParameter = temperatureControlParameter;
		temperatureControlParameter = newTemperatureControlParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALNS__TEMPERATURE_CONTROL_PARAMETER, oldTemperatureControlParameter, temperatureControlParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCoolingRate() {
		return coolingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolingRate(double newCoolingRate) {
		double oldCoolingRate = coolingRate;
		coolingRate = newCoolingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALNS__COOLING_RATE, oldCoolingRate, coolingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxCalculationTime() {
		return maxCalculationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCalculationTime(long newMaxCalculationTime) {
		long oldMaxCalculationTime = maxCalculationTime;
		maxCalculationTime = newMaxCalculationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALNS__MAX_CALCULATION_TIME, oldMaxCalculationTime, maxCalculationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInsertionIterations() {
		return maxInsertionIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInsertionIterations(int newMaxInsertionIterations) {
		int oldMaxInsertionIterations = maxInsertionIterations;
		maxInsertionIterations = newMaxInsertionIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALNS__MAX_INSERTION_ITERATIONS, oldMaxInsertionIterations, maxInsertionIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWS getRws() {
		return rws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRws(RWS newRws, NotificationChain msgs) {
		RWS oldRws = rws;
		rws = newRws;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.ALNS__RWS, oldRws, newRws);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRws(RWS newRws) {
		if (newRws != rws) {
			NotificationChain msgs = null;
			if (rws != null)
				msgs = ((InternalEObject)rws).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.ALNS__RWS, null, msgs);
			if (newRws != null)
				msgs = ((InternalEObject)newRws).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.ALNS__RWS, null, msgs);
			msgs = basicSetRws(newRws, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ALNS__RWS, newRws, newRws));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.ALNS__RWS:
				return basicSetRws(null, msgs);
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
			case ConfigPackage.ALNS__PENALTY_TERM:
				return getPenaltyTerm();
			case ConfigPackage.ALNS__TEMPERATURE_CONTROL_PARAMETER:
				return getTemperatureControlParameter();
			case ConfigPackage.ALNS__COOLING_RATE:
				return getCoolingRate();
			case ConfigPackage.ALNS__MAX_CALCULATION_TIME:
				return getMaxCalculationTime();
			case ConfigPackage.ALNS__MAX_INSERTION_ITERATIONS:
				return getMaxInsertionIterations();
			case ConfigPackage.ALNS__RWS:
				return getRws();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.ALNS__PENALTY_TERM:
				setPenaltyTerm((Integer)newValue);
				return;
			case ConfigPackage.ALNS__TEMPERATURE_CONTROL_PARAMETER:
				setTemperatureControlParameter((Double)newValue);
				return;
			case ConfigPackage.ALNS__COOLING_RATE:
				setCoolingRate((Double)newValue);
				return;
			case ConfigPackage.ALNS__MAX_CALCULATION_TIME:
				setMaxCalculationTime((Long)newValue);
				return;
			case ConfigPackage.ALNS__MAX_INSERTION_ITERATIONS:
				setMaxInsertionIterations((Integer)newValue);
				return;
			case ConfigPackage.ALNS__RWS:
				setRws((RWS)newValue);
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
			case ConfigPackage.ALNS__PENALTY_TERM:
				setPenaltyTerm(PENALTY_TERM_EDEFAULT);
				return;
			case ConfigPackage.ALNS__TEMPERATURE_CONTROL_PARAMETER:
				setTemperatureControlParameter(TEMPERATURE_CONTROL_PARAMETER_EDEFAULT);
				return;
			case ConfigPackage.ALNS__COOLING_RATE:
				setCoolingRate(COOLING_RATE_EDEFAULT);
				return;
			case ConfigPackage.ALNS__MAX_CALCULATION_TIME:
				setMaxCalculationTime(MAX_CALCULATION_TIME_EDEFAULT);
				return;
			case ConfigPackage.ALNS__MAX_INSERTION_ITERATIONS:
				setMaxInsertionIterations(MAX_INSERTION_ITERATIONS_EDEFAULT);
				return;
			case ConfigPackage.ALNS__RWS:
				setRws((RWS)null);
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
			case ConfigPackage.ALNS__PENALTY_TERM:
				return penaltyTerm != PENALTY_TERM_EDEFAULT;
			case ConfigPackage.ALNS__TEMPERATURE_CONTROL_PARAMETER:
				return temperatureControlParameter != TEMPERATURE_CONTROL_PARAMETER_EDEFAULT;
			case ConfigPackage.ALNS__COOLING_RATE:
				return coolingRate != COOLING_RATE_EDEFAULT;
			case ConfigPackage.ALNS__MAX_CALCULATION_TIME:
				return maxCalculationTime != MAX_CALCULATION_TIME_EDEFAULT;
			case ConfigPackage.ALNS__MAX_INSERTION_ITERATIONS:
				return maxInsertionIterations != MAX_INSERTION_ITERATIONS_EDEFAULT;
			case ConfigPackage.ALNS__RWS:
				return rws != null;
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
		result.append(" (penaltyTerm: ");
		result.append(penaltyTerm);
		result.append(", temperatureControlParameter: ");
		result.append(temperatureControlParameter);
		result.append(", coolingRate: ");
		result.append(coolingRate);
		result.append(", maxCalculationTime: ");
		result.append(maxCalculationTime);
		result.append(", maxInsertionIterations: ");
		result.append(maxInsertionIterations);
		result.append(')');
		return result.toString();
	}

} //ALNSImpl
