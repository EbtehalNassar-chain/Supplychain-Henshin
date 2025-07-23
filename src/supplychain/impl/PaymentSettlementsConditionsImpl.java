/**
 */
package supplychain.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.Invoice;
import supplychain.PaymentSettlementsConditions;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Settlements Conditions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.PaymentSettlementsConditionsImpl#getType <em>Type</em>}</li>
 *   <li>{@link supplychain.impl.PaymentSettlementsConditionsImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link supplychain.impl.PaymentSettlementsConditionsImpl#getPaymentConditions <em>Payment Conditions</em>}</li>
 *   <li>{@link supplychain.impl.PaymentSettlementsConditionsImpl#getTriggersPayment <em>Triggers Payment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentSettlementsConditionsImpl extends MinimalEObjectImpl.Container implements PaymentSettlementsConditions {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditions() <em>Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected String conditions = CONDITIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentConditions() <em>Payment Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentConditions()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_CONDITIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentConditions() <em>Payment Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentConditions()
	 * @generated
	 * @ordered
	 */
	protected String paymentConditions = PAYMENT_CONDITIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggersPayment() <em>Triggers Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersPayment()
	 * @generated
	 * @ordered
	 */
	protected Invoice triggersPayment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentSettlementsConditionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.PAYMENT_SETTLEMENTS_CONDITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditions(String newConditions) {
		String oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS, oldConditions, conditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentConditions() {
		return paymentConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentConditions(String newPaymentConditions) {
		String oldPaymentConditions = paymentConditions;
		paymentConditions = newPaymentConditions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS, oldPaymentConditions, paymentConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getTriggersPayment() {
		if (triggersPayment != null && triggersPayment.eIsProxy()) {
			InternalEObject oldTriggersPayment = (InternalEObject)triggersPayment;
			triggersPayment = (Invoice)eResolveProxy(oldTriggersPayment);
			if (triggersPayment != oldTriggersPayment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT, oldTriggersPayment, triggersPayment));
			}
		}
		return triggersPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetTriggersPayment() {
		return triggersPayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggersPayment(Invoice newTriggersPayment) {
		Invoice oldTriggersPayment = triggersPayment;
		triggersPayment = newTriggersPayment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT, oldTriggersPayment, triggersPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String storeConditions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String confirmConditions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TYPE:
				return getType();
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS:
				return getConditions();
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS:
				return getPaymentConditions();
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT:
				if (resolve) return getTriggersPayment();
				return basicGetTriggersPayment();
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
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TYPE:
				setType((String)newValue);
				return;
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS:
				setConditions((String)newValue);
				return;
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS:
				setPaymentConditions((String)newValue);
				return;
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT:
				setTriggersPayment((Invoice)newValue);
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
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS:
				setConditions(CONDITIONS_EDEFAULT);
				return;
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS:
				setPaymentConditions(PAYMENT_CONDITIONS_EDEFAULT);
				return;
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT:
				setTriggersPayment((Invoice)null);
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
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS:
				return CONDITIONS_EDEFAULT == null ? conditions != null : !CONDITIONS_EDEFAULT.equals(conditions);
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS:
				return PAYMENT_CONDITIONS_EDEFAULT == null ? paymentConditions != null : !PAYMENT_CONDITIONS_EDEFAULT.equals(paymentConditions);
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT:
				return triggersPayment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS___STORE_CONDITIONS:
				return storeConditions();
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS___CONFIRM_CONDITIONS:
				return confirmConditions();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", conditions: ");
		result.append(conditions);
		result.append(", paymentConditions: ");
		result.append(paymentConditions);
		result.append(')');
		return result.toString();
	}

} //PaymentSettlementsConditionsImpl
