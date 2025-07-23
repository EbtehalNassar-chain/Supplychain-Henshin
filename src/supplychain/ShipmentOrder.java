/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.ShipmentOrder#getType <em>Type</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getTime_interval <em>Time interval</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getStatus <em>Status</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getProductOrder <em>Product Order</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getEmissions <em>Emissions</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getOrigin <em>Origin</em>}</li>
 *   <li>{@link supplychain.ShipmentOrder#getIotData <em>Iot Data</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getShipmentOrder()
 * @model
 * @generated
 */
public interface ShipmentOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Time interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time interval</em>' attribute.
	 * @see #setTime_interval(String)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_Time_interval()
	 * @model
	 * @generated
	 */
	String getTime_interval();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getTime_interval <em>Time interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time interval</em>' attribute.
	 * @see #getTime_interval()
	 * @generated
	 */
	void setTime_interval(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' attribute.
	 * @see #setShipmentId(int)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_ShipmentId()
	 * @model
	 * @generated
	 */
	int getShipmentId();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Product Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Order</em>' reference.
	 * @see #setProductOrder(ProductOrder)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_ProductOrder()
	 * @model
	 * @generated
	 */
	ProductOrder getProductOrder();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getProductOrder <em>Product Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Order</em>' reference.
	 * @see #getProductOrder()
	 * @generated
	 */
	void setProductOrder(ProductOrder value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' reference.
	 * @see #setInvoice(Invoice)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_Invoice()
	 * @model
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getInvoice <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

	/**
	 * Returns the value of the '<em><b>Emissions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emissions</em>' reference.
	 * @see #setEmissions(CO2)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_Emissions()
	 * @model
	 * @generated
	 */
	CO2 getEmissions();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getEmissions <em>Emissions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emissions</em>' reference.
	 * @see #getEmissions()
	 * @generated
	 */
	void setEmissions(CO2 value);

	/**
	 * Returns the value of the '<em><b>Certificate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' reference.
	 * @see #setCertificate(SupplierCertificates)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_Certificate()
	 * @model
	 * @generated
	 */
	SupplierCertificates getCertificate();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getCertificate <em>Certificate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate</em>' reference.
	 * @see #getCertificate()
	 * @generated
	 */
	void setCertificate(SupplierCertificates value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(ProductOrigin)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_Origin()
	 * @model
	 * @generated
	 */
	ProductOrigin getOrigin();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(ProductOrigin value);

	/**
	 * Returns the value of the '<em><b>Iot Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iot Data</em>' reference.
	 * @see #setIotData(IoTDataStreams)
	 * @see supplychain.SupplychainPackage#getShipmentOrder_IotData()
	 * @model
	 * @generated
	 */
	IoTDataStreams getIotData();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentOrder#getIotData <em>Iot Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iot Data</em>' reference.
	 * @see #getIotData()
	 * @generated
	 */
	void setIotData(IoTDataStreams value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String updateShipmentData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String verifyShipmentStatus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String verifyOnTimeDelivery();

} // ShipmentOrder
