/**
 */
package supplychain.impl;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.Offer;
import supplychain.ProductList;
import supplychain.ProductOrder;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.ProductOrderImpl#getType <em>Type</em>}</li>
 *   <li>{@link supplychain.impl.ProductOrderImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link supplychain.impl.ProductOrderImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link supplychain.impl.ProductOrderImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link supplychain.impl.ProductOrderImpl#getOrderProductList <em>Order Product List</em>}</li>
 *   <li>{@link supplychain.impl.ProductOrderImpl#getCreatedFrom <em>Created From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductOrderImpl extends MinimalEObjectImpl.Container implements ProductOrder {
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
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderProductList() <em>Order Product List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderProductList()
	 * @generated
	 * @ordered
	 */
	protected ProductList orderProductList;

	/**
	 * The cached value of the '{@link #getCreatedFrom() <em>Created From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedFrom()
	 * @generated
	 * @ordered
	 */
	protected Offer createdFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.PRODUCT_ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PRODUCT_ORDER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PRODUCT_ORDER__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigInteger newQuantity) {
		BigInteger oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PRODUCT_ORDER__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDate(Date newOrderDate) {
		Date oldOrderDate = orderDate;
		orderDate = newOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PRODUCT_ORDER__ORDER_DATE, oldOrderDate, orderDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductList getOrderProductList() {
		if (orderProductList != null && orderProductList.eIsProxy()) {
			InternalEObject oldOrderProductList = (InternalEObject)orderProductList;
			orderProductList = (ProductList)eResolveProxy(oldOrderProductList);
			if (orderProductList != oldOrderProductList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.PRODUCT_ORDER__ORDER_PRODUCT_LIST, oldOrderProductList, orderProductList));
			}
		}
		return orderProductList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductList basicGetOrderProductList() {
		return orderProductList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderProductList(ProductList newOrderProductList) {
		ProductList oldOrderProductList = orderProductList;
		orderProductList = newOrderProductList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PRODUCT_ORDER__ORDER_PRODUCT_LIST, oldOrderProductList, orderProductList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offer getCreatedFrom() {
		if (createdFrom != null && createdFrom.eIsProxy()) {
			InternalEObject oldCreatedFrom = (InternalEObject)createdFrom;
			createdFrom = (Offer)eResolveProxy(oldCreatedFrom);
			if (createdFrom != oldCreatedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.PRODUCT_ORDER__CREATED_FROM, oldCreatedFrom, createdFrom));
			}
		}
		return createdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Offer basicGetCreatedFrom() {
		return createdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedFrom(Offer newCreatedFrom) {
		Offer oldCreatedFrom = createdFrom;
		createdFrom = newCreatedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PRODUCT_ORDER__CREATED_FROM, oldCreatedFrom, createdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String storeOrder() {
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
	public String acceptOrder() {
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
			case SupplychainPackage.PRODUCT_ORDER__TYPE:
				return getType();
			case SupplychainPackage.PRODUCT_ORDER__ORDER_ID:
				return getOrderId();
			case SupplychainPackage.PRODUCT_ORDER__QUANTITY:
				return getQuantity();
			case SupplychainPackage.PRODUCT_ORDER__ORDER_DATE:
				return getOrderDate();
			case SupplychainPackage.PRODUCT_ORDER__ORDER_PRODUCT_LIST:
				if (resolve) return getOrderProductList();
				return basicGetOrderProductList();
			case SupplychainPackage.PRODUCT_ORDER__CREATED_FROM:
				if (resolve) return getCreatedFrom();
				return basicGetCreatedFrom();
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
			case SupplychainPackage.PRODUCT_ORDER__TYPE:
				setType((String)newValue);
				return;
			case SupplychainPackage.PRODUCT_ORDER__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case SupplychainPackage.PRODUCT_ORDER__QUANTITY:
				setQuantity((BigInteger)newValue);
				return;
			case SupplychainPackage.PRODUCT_ORDER__ORDER_DATE:
				setOrderDate((Date)newValue);
				return;
			case SupplychainPackage.PRODUCT_ORDER__ORDER_PRODUCT_LIST:
				setOrderProductList((ProductList)newValue);
				return;
			case SupplychainPackage.PRODUCT_ORDER__CREATED_FROM:
				setCreatedFrom((Offer)newValue);
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
			case SupplychainPackage.PRODUCT_ORDER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SupplychainPackage.PRODUCT_ORDER__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case SupplychainPackage.PRODUCT_ORDER__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case SupplychainPackage.PRODUCT_ORDER__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
				return;
			case SupplychainPackage.PRODUCT_ORDER__ORDER_PRODUCT_LIST:
				setOrderProductList((ProductList)null);
				return;
			case SupplychainPackage.PRODUCT_ORDER__CREATED_FROM:
				setCreatedFrom((Offer)null);
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
			case SupplychainPackage.PRODUCT_ORDER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SupplychainPackage.PRODUCT_ORDER__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case SupplychainPackage.PRODUCT_ORDER__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case SupplychainPackage.PRODUCT_ORDER__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
			case SupplychainPackage.PRODUCT_ORDER__ORDER_PRODUCT_LIST:
				return orderProductList != null;
			case SupplychainPackage.PRODUCT_ORDER__CREATED_FROM:
				return createdFrom != null;
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
			case SupplychainPackage.PRODUCT_ORDER___STORE_ORDER:
				return storeOrder();
			case SupplychainPackage.PRODUCT_ORDER___ACCEPT_ORDER:
				return acceptOrder();
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
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(')');
		return result.toString();
	}

} //ProductOrderImpl
