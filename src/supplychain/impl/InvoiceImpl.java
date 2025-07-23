/**
 */
package supplychain.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.Invoice;
import supplychain.ProductOrder;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.InvoiceImpl#getProductType <em>Product Type</em>}</li>
 *   <li>{@link supplychain.impl.InvoiceImpl#getShipmentOrder <em>Shipment Order</em>}</li>
 *   <li>{@link supplychain.impl.InvoiceImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link supplychain.impl.InvoiceImpl#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link supplychain.impl.InvoiceImpl#getInProductOrder <em>In Product Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends MinimalEObjectImpl.Container implements Invoice {
	/**
	 * The default value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductType() <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductType()
	 * @generated
	 * @ordered
	 */
	protected String productType = PRODUCT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentOrder() <em>Shipment Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentOrder() <em>Shipment Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentOrder()
	 * @generated
	 * @ordered
	 */
	protected String shipmentOrder = SHIPMENT_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected double totalAmount = TOTAL_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInProductOrder() <em>In Product Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInProductOrder()
	 * @generated
	 * @ordered
	 */
	protected ProductOrder inProductOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductType() {
		return productType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductType(String newProductType) {
		String oldProductType = productType;
		productType = newProductType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.INVOICE__PRODUCT_TYPE, oldProductType, productType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentOrder() {
		return shipmentOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentOrder(String newShipmentOrder) {
		String oldShipmentOrder = shipmentOrder;
		shipmentOrder = newShipmentOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.INVOICE__SHIPMENT_ORDER, oldShipmentOrder, shipmentOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.INVOICE__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalAmount(double newTotalAmount) {
		double oldTotalAmount = totalAmount;
		totalAmount = newTotalAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.INVOICE__TOTAL_AMOUNT, oldTotalAmount, totalAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOrder getInProductOrder() {
		return inProductOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInProductOrder(ProductOrder newInProductOrder, NotificationChain msgs) {
		ProductOrder oldInProductOrder = inProductOrder;
		inProductOrder = newInProductOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SupplychainPackage.INVOICE__IN_PRODUCT_ORDER, oldInProductOrder, newInProductOrder);
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
	public void setInProductOrder(ProductOrder newInProductOrder) {
		if (newInProductOrder != inProductOrder) {
			NotificationChain msgs = null;
			if (inProductOrder != null)
				msgs = ((InternalEObject)inProductOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SupplychainPackage.INVOICE__IN_PRODUCT_ORDER, null, msgs);
			if (newInProductOrder != null)
				msgs = ((InternalEObject)newInProductOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SupplychainPackage.INVOICE__IN_PRODUCT_ORDER, null, msgs);
			msgs = basicSetInProductOrder(newInProductOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.INVOICE__IN_PRODUCT_ORDER, newInProductOrder, newInProductOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String createInvoice() {
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
	public String verifyBreakDownCost() {
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
			case SupplychainPackage.INVOICE__IN_PRODUCT_ORDER:
				return basicSetInProductOrder(null, msgs);
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
			case SupplychainPackage.INVOICE__PRODUCT_TYPE:
				return getProductType();
			case SupplychainPackage.INVOICE__SHIPMENT_ORDER:
				return getShipmentOrder();
			case SupplychainPackage.INVOICE__INVOICE_ID:
				return getInvoiceId();
			case SupplychainPackage.INVOICE__TOTAL_AMOUNT:
				return getTotalAmount();
			case SupplychainPackage.INVOICE__IN_PRODUCT_ORDER:
				return getInProductOrder();
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
			case SupplychainPackage.INVOICE__PRODUCT_TYPE:
				setProductType((String)newValue);
				return;
			case SupplychainPackage.INVOICE__SHIPMENT_ORDER:
				setShipmentOrder((String)newValue);
				return;
			case SupplychainPackage.INVOICE__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case SupplychainPackage.INVOICE__TOTAL_AMOUNT:
				setTotalAmount((Double)newValue);
				return;
			case SupplychainPackage.INVOICE__IN_PRODUCT_ORDER:
				setInProductOrder((ProductOrder)newValue);
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
			case SupplychainPackage.INVOICE__PRODUCT_TYPE:
				setProductType(PRODUCT_TYPE_EDEFAULT);
				return;
			case SupplychainPackage.INVOICE__SHIPMENT_ORDER:
				setShipmentOrder(SHIPMENT_ORDER_EDEFAULT);
				return;
			case SupplychainPackage.INVOICE__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case SupplychainPackage.INVOICE__TOTAL_AMOUNT:
				setTotalAmount(TOTAL_AMOUNT_EDEFAULT);
				return;
			case SupplychainPackage.INVOICE__IN_PRODUCT_ORDER:
				setInProductOrder((ProductOrder)null);
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
			case SupplychainPackage.INVOICE__PRODUCT_TYPE:
				return PRODUCT_TYPE_EDEFAULT == null ? productType != null : !PRODUCT_TYPE_EDEFAULT.equals(productType);
			case SupplychainPackage.INVOICE__SHIPMENT_ORDER:
				return SHIPMENT_ORDER_EDEFAULT == null ? shipmentOrder != null : !SHIPMENT_ORDER_EDEFAULT.equals(shipmentOrder);
			case SupplychainPackage.INVOICE__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case SupplychainPackage.INVOICE__TOTAL_AMOUNT:
				return totalAmount != TOTAL_AMOUNT_EDEFAULT;
			case SupplychainPackage.INVOICE__IN_PRODUCT_ORDER:
				return inProductOrder != null;
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
			case SupplychainPackage.INVOICE___CREATE_INVOICE:
				return createInvoice();
			case SupplychainPackage.INVOICE___VERIFY_BREAK_DOWN_COST:
				return verifyBreakDownCost();
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
		result.append(" (productType: ");
		result.append(productType);
		result.append(", shipmentOrder: ");
		result.append(shipmentOrder);
		result.append(", invoiceId: ");
		result.append(invoiceId);
		result.append(", totalAmount: ");
		result.append(totalAmount);
		result.append(')');
		return result.toString();
	}

} //InvoiceImpl
