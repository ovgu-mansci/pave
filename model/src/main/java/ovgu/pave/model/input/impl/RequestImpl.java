/**
 */
package ovgu.pave.model.input.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.input.FirstRequestActivity;
import ovgu.pave.model.input.InputPackage;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.SecondRequestActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.impl.RequestImpl#getFirstActivity <em>First Activity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.RequestImpl#getSecondActivity <em>Second Activity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.RequestImpl#getId <em>Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.RequestImpl#getRequestTime <em>Request Time</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.RequestImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.RequestImpl#isPreRejected <em>Pre Rejected</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.RequestImpl#getPenaltie <em>Penaltie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestImpl extends MinimalEObjectImpl.Container implements Request {
	/**
	 * The cached value of the '{@link #getFirstActivity() <em>First Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstActivity()
	 * @generated
	 * @ordered
	 */
	protected FirstRequestActivity firstActivity;

	/**
	 * The cached value of the '{@link #getSecondActivity() <em>Second Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondActivity()
	 * @generated
	 * @ordered
	 */
	protected SecondRequestActivity secondActivity;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestTime() <em>Request Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTime()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUEST_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestTime() <em>Request Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTime()
	 * @generated
	 * @ordered
	 */
	protected long requestTime = REQUEST_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreRejected() <em>Pre Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreRejected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRE_REJECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreRejected() <em>Pre Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreRejected()
	 * @generated
	 * @ordered
	 */
	protected boolean preRejected = PRE_REJECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPenaltie() <em>Penaltie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltie()
	 * @generated
	 * @ordered
	 */
	protected static final int PENALTIE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPenaltie() <em>Penaltie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenaltie()
	 * @generated
	 * @ordered
	 */
	protected int penaltie = PENALTIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputPackage.Literals.REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstRequestActivity getFirstActivity() {
		return firstActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstActivity(FirstRequestActivity newFirstActivity, NotificationChain msgs) {
		FirstRequestActivity oldFirstActivity = firstActivity;
		firstActivity = newFirstActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__FIRST_ACTIVITY, oldFirstActivity, newFirstActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstActivity(FirstRequestActivity newFirstActivity) {
		if (newFirstActivity != firstActivity) {
			NotificationChain msgs = null;
			if (firstActivity != null)
				msgs = ((InternalEObject)firstActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.REQUEST__FIRST_ACTIVITY, null, msgs);
			if (newFirstActivity != null)
				msgs = ((InternalEObject)newFirstActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.REQUEST__FIRST_ACTIVITY, null, msgs);
			msgs = basicSetFirstActivity(newFirstActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__FIRST_ACTIVITY, newFirstActivity, newFirstActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondRequestActivity getSecondActivity() {
		return secondActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondActivity(SecondRequestActivity newSecondActivity, NotificationChain msgs) {
		SecondRequestActivity oldSecondActivity = secondActivity;
		secondActivity = newSecondActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__SECOND_ACTIVITY, oldSecondActivity, newSecondActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondActivity(SecondRequestActivity newSecondActivity) {
		if (newSecondActivity != secondActivity) {
			NotificationChain msgs = null;
			if (secondActivity != null)
				msgs = ((InternalEObject)secondActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InputPackage.REQUEST__SECOND_ACTIVITY, null, msgs);
			if (newSecondActivity != null)
				msgs = ((InternalEObject)newSecondActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InputPackage.REQUEST__SECOND_ACTIVITY, null, msgs);
			msgs = basicSetSecondActivity(newSecondActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__SECOND_ACTIVITY, newSecondActivity, newSecondActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRequestTime() {
		return requestTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestTime(long newRequestTime) {
		long oldRequestTime = requestTime;
		requestTime = newRequestTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__REQUEST_TIME, oldRequestTime, requestTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreRejected() {
		return preRejected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreRejected(boolean newPreRejected) {
		boolean oldPreRejected = preRejected;
		preRejected = newPreRejected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__PRE_REJECTED, oldPreRejected, preRejected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPenaltie() {
		return penaltie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenaltie(int newPenaltie) {
		int oldPenaltie = penaltie;
		penaltie = newPenaltie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.REQUEST__PENALTIE, oldPenaltie, penaltie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputPackage.REQUEST__FIRST_ACTIVITY:
				return basicSetFirstActivity(null, msgs);
			case InputPackage.REQUEST__SECOND_ACTIVITY:
				return basicSetSecondActivity(null, msgs);
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
			case InputPackage.REQUEST__FIRST_ACTIVITY:
				return getFirstActivity();
			case InputPackage.REQUEST__SECOND_ACTIVITY:
				return getSecondActivity();
			case InputPackage.REQUEST__ID:
				return getId();
			case InputPackage.REQUEST__REQUEST_TIME:
				return getRequestTime();
			case InputPackage.REQUEST__QUANTITY:
				return getQuantity();
			case InputPackage.REQUEST__PRE_REJECTED:
				return isPreRejected();
			case InputPackage.REQUEST__PENALTIE:
				return getPenaltie();
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
			case InputPackage.REQUEST__FIRST_ACTIVITY:
				setFirstActivity((FirstRequestActivity)newValue);
				return;
			case InputPackage.REQUEST__SECOND_ACTIVITY:
				setSecondActivity((SecondRequestActivity)newValue);
				return;
			case InputPackage.REQUEST__ID:
				setId((Integer)newValue);
				return;
			case InputPackage.REQUEST__REQUEST_TIME:
				setRequestTime((Long)newValue);
				return;
			case InputPackage.REQUEST__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case InputPackage.REQUEST__PRE_REJECTED:
				setPreRejected((Boolean)newValue);
				return;
			case InputPackage.REQUEST__PENALTIE:
				setPenaltie((Integer)newValue);
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
			case InputPackage.REQUEST__FIRST_ACTIVITY:
				setFirstActivity((FirstRequestActivity)null);
				return;
			case InputPackage.REQUEST__SECOND_ACTIVITY:
				setSecondActivity((SecondRequestActivity)null);
				return;
			case InputPackage.REQUEST__ID:
				setId(ID_EDEFAULT);
				return;
			case InputPackage.REQUEST__REQUEST_TIME:
				setRequestTime(REQUEST_TIME_EDEFAULT);
				return;
			case InputPackage.REQUEST__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InputPackage.REQUEST__PRE_REJECTED:
				setPreRejected(PRE_REJECTED_EDEFAULT);
				return;
			case InputPackage.REQUEST__PENALTIE:
				setPenaltie(PENALTIE_EDEFAULT);
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
			case InputPackage.REQUEST__FIRST_ACTIVITY:
				return firstActivity != null;
			case InputPackage.REQUEST__SECOND_ACTIVITY:
				return secondActivity != null;
			case InputPackage.REQUEST__ID:
				return id != ID_EDEFAULT;
			case InputPackage.REQUEST__REQUEST_TIME:
				return requestTime != REQUEST_TIME_EDEFAULT;
			case InputPackage.REQUEST__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case InputPackage.REQUEST__PRE_REJECTED:
				return preRejected != PRE_REJECTED_EDEFAULT;
			case InputPackage.REQUEST__PENALTIE:
				return penaltie != PENALTIE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", requestTime: ");
		result.append(requestTime);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", preRejected: ");
		result.append(preRejected);
		result.append(", penaltie: ");
		result.append(penaltie);
		result.append(')');
		return result.toString();
	}

} //RequestImpl
