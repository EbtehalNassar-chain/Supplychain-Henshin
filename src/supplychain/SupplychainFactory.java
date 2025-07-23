/**
 */
package supplychain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see supplychain.SupplychainPackage
 * @generated
 */
public interface SupplychainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupplychainFactory eINSTANCE = supplychain.impl.SupplychainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer</em>'.
	 * @generated
	 */
	Offer createOffer();

	/**
	 * Returns a new object of class '<em>Payment Settlements Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Settlements Conditions</em>'.
	 * @generated
	 */
	PaymentSettlementsConditions createPaymentSettlementsConditions();

	/**
	 * Returns a new object of class '<em>Product List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product List</em>'.
	 * @generated
	 */
	ProductList createProductList();

	/**
	 * Returns a new object of class '<em>Product Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Order</em>'.
	 * @generated
	 */
	ProductOrder createProductOrder();

	/**
	 * Returns a new object of class '<em>Shipment Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Order</em>'.
	 * @generated
	 */
	ShipmentOrder createShipmentOrder();

	/**
	 * Returns a new object of class '<em>Shipment Planning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Planning</em>'.
	 * @generated
	 */
	ShipmentPlanning createShipmentPlanning();

	/**
	 * Returns a new object of class '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice</em>'.
	 * @generated
	 */
	Invoice createInvoice();

	/**
	 * Returns a new object of class '<em>Delivery Confirmation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Confirmation</em>'.
	 * @generated
	 */
	DeliveryConfirmation createDeliveryConfirmation();

	/**
	 * Returns a new object of class '<em>CO2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CO2</em>'.
	 * @generated
	 */
	CO2 createCO2();

	/**
	 * Returns a new object of class '<em>Supplier Certificates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier Certificates</em>'.
	 * @generated
	 */
	SupplierCertificates createSupplierCertificates();

	/**
	 * Returns a new object of class '<em>Material Reuse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Reuse</em>'.
	 * @generated
	 */
	MaterialReuse createMaterialReuse();

	/**
	 * Returns a new object of class '<em>Raw Materials Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Materials Source</em>'.
	 * @generated
	 */
	RawMaterialsSource createRawMaterialsSource();

	/**
	 * Returns a new object of class '<em>Product History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product History</em>'.
	 * @generated
	 */
	ProductHistory createProductHistory();

	/**
	 * Returns a new object of class '<em>Product Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Origin</em>'.
	 * @generated
	 */
	ProductOrigin createProductOrigin();

	/**
	 * Returns a new object of class '<em>Suppliers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suppliers</em>'.
	 * @generated
	 */
	Suppliers createSuppliers();

	/**
	 * Returns a new object of class '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment</em>'.
	 * @generated
	 */
	Payment createPayment();

	/**
	 * Returns a new object of class '<em>Io TData Streams</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TData Streams</em>'.
	 * @generated
	 */
	IoTDataStreams createIoTDataStreams();

	/**
	 * Returns a new object of class '<em>Non Fungible Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Fungible Token</em>'.
	 * @generated
	 */
	NonFungibleToken createNonFungibleToken();

	/**
	 * Returns a new object of class '<em>Io TSensors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io TSensors</em>'.
	 * @generated
	 */
	IoTSensors createIoTSensors();

	/**
	 * Returns a new object of class '<em>Cryptocurrency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cryptocurrency</em>'.
	 * @generated
	 */
	Cryptocurrency createCryptocurrency();

	/**
	 * Returns a new object of class '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inventory</em>'.
	 * @generated
	 */
	Inventory createInventory();

	/**
	 * Returns a new object of class '<em>Transportation Notes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transportation Notes</em>'.
	 * @generated
	 */
	TransportationNotes createTransportationNotes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SupplychainPackage getSupplychainPackage();

} //SupplychainFactory
