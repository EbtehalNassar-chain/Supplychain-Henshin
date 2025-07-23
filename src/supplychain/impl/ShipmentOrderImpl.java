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

import supplychain.CO2;
import supplychain.Invoice;
import supplychain.IoTDataStreams;
import supplychain.ProductOrder;
import supplychain.ProductOrigin;
import supplychain.ShipmentOrder;
import supplychain.SupplierCertificates;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getType <em>Type</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getTime_interval <em>Time interval</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getProductOrder <em>Product Order</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getEmissions <em>Emissions</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentOrderImpl#getIotData <em>Iot Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentOrderImpl extends MinimalEObjectImpl.Container implements ShipmentOrder {
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
	 * The default value of the '{@link #getTime_interval() <em>Time interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_interval()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime_interval() <em>Time interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime_interval()
	 * @generated
	 * @ordered
	 */
	protected String time_interval = TIME_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected static final int SHIPMENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected int shipmentId = SHIPMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductOrder() <em>Product Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOrder()
	 * @generated
	 * @ordered
	 */
	protected ProductOrder productOrder;

	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoice;

	/**
	 * The cached value of the '{@link #getEmissions() <em>Emissions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmissions()
	 * @generated
	 * @ordered
	 */
	protected CO2 emissions;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected SupplierCertificates certificate;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected ProductOrigin origin;

	/**
	 * The cached value of the '{@link #getIotData() <em>Iot Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotData()
	 * @generated
	 * @ordered
	 */
	protected IoTDataStreams iotData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.SHIPMENT_ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime_interval() {
		return time_interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime_interval(String newTime_interval) {
		String oldTime_interval = time_interval;
		time_interval = newTime_interval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__TIME_INTERVAL, oldTime_interval, time_interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(int newShipmentId) {
		int oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__SHIPMENT_ID, oldShipmentId, shipmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOrder getProductOrder() {
		if (productOrder != null && productOrder.eIsProxy()) {
			InternalEObject oldProductOrder = (InternalEObject)productOrder;
			productOrder = (ProductOrder)eResolveProxy(oldProductOrder);
			if (productOrder != oldProductOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.SHIPMENT_ORDER__PRODUCT_ORDER, oldProductOrder, productOrder));
			}
		}
		return productOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOrder basicGetProductOrder() {
		return productOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductOrder(ProductOrder newProductOrder) {
		ProductOrder oldProductOrder = productOrder;
		productOrder = newProductOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__PRODUCT_ORDER, oldProductOrder, productOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getInvoice() {
		if (invoice != null && invoice.eIsProxy()) {
			InternalEObject oldInvoice = (InternalEObject)invoice;
			invoice = (Invoice)eResolveProxy(oldInvoice);
			if (invoice != oldInvoice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.SHIPMENT_ORDER__INVOICE, oldInvoice, invoice));
			}
		}
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoice() {
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoice(Invoice newInvoice) {
		Invoice oldInvoice = invoice;
		invoice = newInvoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__INVOICE, oldInvoice, invoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CO2 getEmissions() {
		if (emissions != null && emissions.eIsProxy()) {
			InternalEObject oldEmissions = (InternalEObject)emissions;
			emissions = (CO2)eResolveProxy(oldEmissions);
			if (emissions != oldEmissions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.SHIPMENT_ORDER__EMISSIONS, oldEmissions, emissions));
			}
		}
		return emissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CO2 basicGetEmissions() {
		return emissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmissions(CO2 newEmissions) {
		CO2 oldEmissions = emissions;
		emissions = newEmissions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__EMISSIONS, oldEmissions, emissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierCertificates getCertificate() {
		if (certificate != null && certificate.eIsProxy()) {
			InternalEObject oldCertificate = (InternalEObject)certificate;
			certificate = (SupplierCertificates)eResolveProxy(oldCertificate);
			if (certificate != oldCertificate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.SHIPMENT_ORDER__CERTIFICATE, oldCertificate, certificate));
			}
		}
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierCertificates basicGetCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificate(SupplierCertificates newCertificate) {
		SupplierCertificates oldCertificate = certificate;
		certificate = newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__CERTIFICATE, oldCertificate, certificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOrigin getOrigin() {
		if (origin != null && origin.eIsProxy()) {
			InternalEObject oldOrigin = (InternalEObject)origin;
			origin = (ProductOrigin)eResolveProxy(oldOrigin);
			if (origin != oldOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.SHIPMENT_ORDER__ORIGIN, oldOrigin, origin));
			}
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOrigin basicGetOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(ProductOrigin newOrigin) {
		ProductOrigin oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTDataStreams getIotData() {
		if (iotData != null && iotData.eIsProxy()) {
			InternalEObject oldIotData = (InternalEObject)iotData;
			iotData = (IoTDataStreams)eResolveProxy(oldIotData);
			if (iotData != oldIotData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.SHIPMENT_ORDER__IOT_DATA, oldIotData, iotData));
			}
		}
		return iotData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTDataStreams basicGetIotData() {
		return iotData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIotData(IoTDataStreams newIotData) {
		IoTDataStreams oldIotData = iotData;
		iotData = newIotData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_ORDER__IOT_DATA, oldIotData, iotData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String updateShipmentData() {
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
	public String verifyShipmentStatus() {
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
	public String verifyOnTimeDelivery() {
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
			case SupplychainPackage.SHIPMENT_ORDER__TYPE:
				return getType();
			case SupplychainPackage.SHIPMENT_ORDER__TIME_INTERVAL:
				return getTime_interval();
			case SupplychainPackage.SHIPMENT_ORDER__SHIPMENT_ID:
				return getShipmentId();
			case SupplychainPackage.SHIPMENT_ORDER__STATUS:
				return getStatus();
			case SupplychainPackage.SHIPMENT_ORDER__PRODUCT_ORDER:
				if (resolve) return getProductOrder();
				return basicGetProductOrder();
			case SupplychainPackage.SHIPMENT_ORDER__INVOICE:
				if (resolve) return getInvoice();
				return basicGetInvoice();
			case SupplychainPackage.SHIPMENT_ORDER__EMISSIONS:
				if (resolve) return getEmissions();
				return basicGetEmissions();
			case SupplychainPackage.SHIPMENT_ORDER__CERTIFICATE:
				if (resolve) return getCertificate();
				return basicGetCertificate();
			case SupplychainPackage.SHIPMENT_ORDER__ORIGIN:
				if (resolve) return getOrigin();
				return basicGetOrigin();
			case SupplychainPackage.SHIPMENT_ORDER__IOT_DATA:
				if (resolve) return getIotData();
				return basicGetIotData();
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
			case SupplychainPackage.SHIPMENT_ORDER__TYPE:
				setType((String)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__TIME_INTERVAL:
				setTime_interval((String)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__SHIPMENT_ID:
				setShipmentId((Integer)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__STATUS:
				setStatus((String)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__PRODUCT_ORDER:
				setProductOrder((ProductOrder)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__INVOICE:
				setInvoice((Invoice)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__EMISSIONS:
				setEmissions((CO2)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__CERTIFICATE:
				setCertificate((SupplierCertificates)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__ORIGIN:
				setOrigin((ProductOrigin)newValue);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__IOT_DATA:
				setIotData((IoTDataStreams)newValue);
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
			case SupplychainPackage.SHIPMENT_ORDER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__TIME_INTERVAL:
				setTime_interval(TIME_INTERVAL_EDEFAULT);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__PRODUCT_ORDER:
				setProductOrder((ProductOrder)null);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__INVOICE:
				setInvoice((Invoice)null);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__EMISSIONS:
				setEmissions((CO2)null);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__CERTIFICATE:
				setCertificate((SupplierCertificates)null);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__ORIGIN:
				setOrigin((ProductOrigin)null);
				return;
			case SupplychainPackage.SHIPMENT_ORDER__IOT_DATA:
				setIotData((IoTDataStreams)null);
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
			case SupplychainPackage.SHIPMENT_ORDER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SupplychainPackage.SHIPMENT_ORDER__TIME_INTERVAL:
				return TIME_INTERVAL_EDEFAULT == null ? time_interval != null : !TIME_INTERVAL_EDEFAULT.equals(time_interval);
			case SupplychainPackage.SHIPMENT_ORDER__SHIPMENT_ID:
				return shipmentId != SHIPMENT_ID_EDEFAULT;
			case SupplychainPackage.SHIPMENT_ORDER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case SupplychainPackage.SHIPMENT_ORDER__PRODUCT_ORDER:
				return productOrder != null;
			case SupplychainPackage.SHIPMENT_ORDER__INVOICE:
				return invoice != null;
			case SupplychainPackage.SHIPMENT_ORDER__EMISSIONS:
				return emissions != null;
			case SupplychainPackage.SHIPMENT_ORDER__CERTIFICATE:
				return certificate != null;
			case SupplychainPackage.SHIPMENT_ORDER__ORIGIN:
				return origin != null;
			case SupplychainPackage.SHIPMENT_ORDER__IOT_DATA:
				return iotData != null;
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
			case SupplychainPackage.SHIPMENT_ORDER___UPDATE_SHIPMENT_DATA:
				return updateShipmentData();
			case SupplychainPackage.SHIPMENT_ORDER___VERIFY_SHIPMENT_STATUS:
				return verifyShipmentStatus();
			case SupplychainPackage.SHIPMENT_ORDER___VERIFY_ON_TIME_DELIVERY:
				return verifyOnTimeDelivery();
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
		result.append(", time_interval: ");
		result.append(time_interval);
		result.append(", shipmentId: ");
		result.append(shipmentId);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ShipmentOrderImpl
