/**
 */
package supplychain.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.DeliveryConfirmation;
import supplychain.ShipmentOrder;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Confirmation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.DeliveryConfirmationImpl#getConfirmationId <em>Confirmation Id</em>}</li>
 *   <li>{@link supplychain.impl.DeliveryConfirmationImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link supplychain.impl.DeliveryConfirmationImpl#getRequiresShipment <em>Requires Shipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryConfirmationImpl extends MinimalEObjectImpl.Container implements DeliveryConfirmation {
	/**
	 * The default value of the '{@link #getConfirmationId() <em>Confirmation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmationId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRMATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmationId() <em>Confirmation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmationId()
	 * @generated
	 * @ordered
	 */
	protected String confirmationId = CONFIRMATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiresShipment() <em>Requires Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresShipment()
	 * @generated
	 * @ordered
	 */
	protected ShipmentOrder requiresShipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryConfirmationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.DELIVERY_CONFIRMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmationId() {
		return confirmationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmationId(String newConfirmationId) {
		String oldConfirmationId = confirmationId;
		confirmationId = newConfirmationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.DELIVERY_CONFIRMATION__CONFIRMATION_ID, oldConfirmationId, confirmationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.DELIVERY_CONFIRMATION__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentOrder getRequiresShipment() {
		return requiresShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiresShipment(ShipmentOrder newRequiresShipment, NotificationChain msgs) {
		ShipmentOrder oldRequiresShipment = requiresShipment;
		requiresShipment = newRequiresShipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT, oldRequiresShipment, newRequiresShipment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresShipment(ShipmentOrder newRequiresShipment) {
		if (newRequiresShipment != requiresShipment) {
			NotificationChain msgs = null;
			if (requiresShipment != null)
				msgs = ((InternalEObject)requiresShipment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT, null, msgs);
			if (newRequiresShipment != null)
				msgs = ((InternalEObject)newRequiresShipment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT, null, msgs);
			msgs = basicSetRequiresShipment(newRequiresShipment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT, newRequiresShipment, newRequiresShipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String transferProductOwnership() {
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
	public String confirmProduct() {
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
	public String verifyOrderFulfillment() {
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
	public String verifyProductAuthenticity() {
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
	public String verifyProductQuality() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT:
				return basicSetRequiresShipment(null, msgs);
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
			case SupplychainPackage.DELIVERY_CONFIRMATION__CONFIRMATION_ID:
				return getConfirmationId();
			case SupplychainPackage.DELIVERY_CONFIRMATION__DELIVERY_DATE:
				return getDeliveryDate();
			case SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT:
				return getRequiresShipment();
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
			case SupplychainPackage.DELIVERY_CONFIRMATION__CONFIRMATION_ID:
				setConfirmationId((String)newValue);
				return;
			case SupplychainPackage.DELIVERY_CONFIRMATION__DELIVERY_DATE:
				setDeliveryDate((Date)newValue);
				return;
			case SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT:
				setRequiresShipment((ShipmentOrder)newValue);
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
			case SupplychainPackage.DELIVERY_CONFIRMATION__CONFIRMATION_ID:
				setConfirmationId(CONFIRMATION_ID_EDEFAULT);
				return;
			case SupplychainPackage.DELIVERY_CONFIRMATION__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT:
				setRequiresShipment((ShipmentOrder)null);
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
			case SupplychainPackage.DELIVERY_CONFIRMATION__CONFIRMATION_ID:
				return CONFIRMATION_ID_EDEFAULT == null ? confirmationId != null : !CONFIRMATION_ID_EDEFAULT.equals(confirmationId);
			case SupplychainPackage.DELIVERY_CONFIRMATION__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
			case SupplychainPackage.DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT:
				return requiresShipment != null;
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
			case SupplychainPackage.DELIVERY_CONFIRMATION___TRANSFER_PRODUCT_OWNERSHIP:
				return transferProductOwnership();
			case SupplychainPackage.DELIVERY_CONFIRMATION___CONFIRM_PRODUCT:
				return confirmProduct();
			case SupplychainPackage.DELIVERY_CONFIRMATION___VERIFY_ORDER_FULFILLMENT:
				return verifyOrderFulfillment();
			case SupplychainPackage.DELIVERY_CONFIRMATION___VERIFY_PRODUCT_AUTHENTICITY:
				return verifyProductAuthenticity();
			case SupplychainPackage.DELIVERY_CONFIRMATION___VERIFY_PRODUCT_QUALITY:
				return verifyProductQuality();
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
		result.append(" (confirmationId: ");
		result.append(confirmationId);
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(')');
		return result.toString();
	}

} //DeliveryConfirmationImpl
