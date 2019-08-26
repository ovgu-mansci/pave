/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.ORTOOLS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORTOOLS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.ORTOOLSImpl#getFirstSolutionStrategy <em>First Solution Strategy</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ORTOOLSImpl#getLocalSearchMetaheuristic <em>Local Search Metaheuristic</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ORTOOLSImpl#getMaxCalculationTime <em>Max Calculation Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORTOOLSImpl extends MinimalEObjectImpl.Container implements ORTOOLS {
	/**
	 * The default value of the '{@link #getFirstSolutionStrategy() <em>First Solution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSolutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_SOLUTION_STRATEGY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirstSolutionStrategy() <em>First Solution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstSolutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected String firstSolutionStrategy = FIRST_SOLUTION_STRATEGY_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocalSearchMetaheuristic() <em>Local Search Metaheuristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSearchMetaheuristic()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_SEARCH_METAHEURISTIC_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocalSearchMetaheuristic() <em>Local Search Metaheuristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSearchMetaheuristic()
	 * @generated
	 * @ordered
	 */
	protected String localSearchMetaheuristic = LOCAL_SEARCH_METAHEURISTIC_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORTOOLSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.ORTOOLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstSolutionStrategy() {
		return firstSolutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstSolutionStrategy(String newFirstSolutionStrategy) {
		String oldFirstSolutionStrategy = firstSolutionStrategy;
		firstSolutionStrategy = newFirstSolutionStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ORTOOLS__FIRST_SOLUTION_STRATEGY, oldFirstSolutionStrategy, firstSolutionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalSearchMetaheuristic() {
		return localSearchMetaheuristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalSearchMetaheuristic(String newLocalSearchMetaheuristic) {
		String oldLocalSearchMetaheuristic = localSearchMetaheuristic;
		localSearchMetaheuristic = newLocalSearchMetaheuristic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ORTOOLS__LOCAL_SEARCH_METAHEURISTIC, oldLocalSearchMetaheuristic, localSearchMetaheuristic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ORTOOLS__MAX_CALCULATION_TIME, oldMaxCalculationTime, maxCalculationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.ORTOOLS__FIRST_SOLUTION_STRATEGY:
				return getFirstSolutionStrategy();
			case ConfigPackage.ORTOOLS__LOCAL_SEARCH_METAHEURISTIC:
				return getLocalSearchMetaheuristic();
			case ConfigPackage.ORTOOLS__MAX_CALCULATION_TIME:
				return getMaxCalculationTime();
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
			case ConfigPackage.ORTOOLS__FIRST_SOLUTION_STRATEGY:
				setFirstSolutionStrategy((String)newValue);
				return;
			case ConfigPackage.ORTOOLS__LOCAL_SEARCH_METAHEURISTIC:
				setLocalSearchMetaheuristic((String)newValue);
				return;
			case ConfigPackage.ORTOOLS__MAX_CALCULATION_TIME:
				setMaxCalculationTime((Long)newValue);
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
			case ConfigPackage.ORTOOLS__FIRST_SOLUTION_STRATEGY:
				setFirstSolutionStrategy(FIRST_SOLUTION_STRATEGY_EDEFAULT);
				return;
			case ConfigPackage.ORTOOLS__LOCAL_SEARCH_METAHEURISTIC:
				setLocalSearchMetaheuristic(LOCAL_SEARCH_METAHEURISTIC_EDEFAULT);
				return;
			case ConfigPackage.ORTOOLS__MAX_CALCULATION_TIME:
				setMaxCalculationTime(MAX_CALCULATION_TIME_EDEFAULT);
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
			case ConfigPackage.ORTOOLS__FIRST_SOLUTION_STRATEGY:
				return FIRST_SOLUTION_STRATEGY_EDEFAULT == null ? firstSolutionStrategy != null : !FIRST_SOLUTION_STRATEGY_EDEFAULT.equals(firstSolutionStrategy);
			case ConfigPackage.ORTOOLS__LOCAL_SEARCH_METAHEURISTIC:
				return LOCAL_SEARCH_METAHEURISTIC_EDEFAULT == null ? localSearchMetaheuristic != null : !LOCAL_SEARCH_METAHEURISTIC_EDEFAULT.equals(localSearchMetaheuristic);
			case ConfigPackage.ORTOOLS__MAX_CALCULATION_TIME:
				return maxCalculationTime != MAX_CALCULATION_TIME_EDEFAULT;
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
		result.append(" (firstSolutionStrategy: ");
		result.append(firstSolutionStrategy);
		result.append(", localSearchMetaheuristic: ");
		result.append(localSearchMetaheuristic);
		result.append(", maxCalculationTime: ");
		result.append(maxCalculationTime);
		result.append(')');
		return result.toString();
	}

} //ORTOOLSImpl
