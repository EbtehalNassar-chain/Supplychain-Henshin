/**
 */
package supplychain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see supplychain.SupplychainFactory
 * @model kind="package"
 * @generated
 */
public interface SupplychainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "supplychain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/supplychain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "supplychain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupplychainPackage eINSTANCE = supplychain.impl.SupplychainPackageImpl.init();

	/**
	 * The meta object id for the '{@link supplychain.impl.OfferImpl <em>Offer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.OfferImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getOffer()
	 * @generated
	 */
	int OFFER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Offer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER__OFFER_ID = 3;

	/**
	 * The number of structural features of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Create Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___CREATE_OFFER = 0;

	/**
	 * The operation id for the '<em>Accept Offer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER___ACCEPT_OFFER = 1;

	/**
	 * The number of operations of the '<em>Offer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link supplychain.impl.PaymentSettlementsConditionsImpl <em>Payment Settlements Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.PaymentSettlementsConditionsImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getPaymentSettlementsConditions()
	 * @generated
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Payment Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Triggers Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT = 3;

	/**
	 * The number of structural features of the '<em>Payment Settlements Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Store Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS___STORE_CONDITIONS = 0;

	/**
	 * The operation id for the '<em>Confirm Conditions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS___CONFIRM_CONDITIONS = 1;

	/**
	 * The number of operations of the '<em>Payment Settlements Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_SETTLEMENTS_CONDITIONS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link supplychain.impl.ProductListImpl <em>Product List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.ProductListImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getProductList()
	 * @generated
	 */
	int PRODUCT_LIST = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LIST__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LIST__PRODUCT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Product List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LIST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LIST___ADD_PRODUCT = 0;

	/**
	 * The number of operations of the '<em>Product List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_LIST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link supplychain.impl.ProductOrderImpl <em>Product Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.ProductOrderImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getProductOrder()
	 * @generated
	 */
	int PRODUCT_ORDER = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__ORDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__ORDER_DATE = 3;

	/**
	 * The feature id for the '<em><b>Order Product List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__ORDER_PRODUCT_LIST = 4;

	/**
	 * The feature id for the '<em><b>Created From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER__CREATED_FROM = 5;

	/**
	 * The number of structural features of the '<em>Product Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Store Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER___STORE_ORDER = 0;

	/**
	 * The operation id for the '<em>Accept Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER___ACCEPT_ORDER = 1;

	/**
	 * The number of operations of the '<em>Product Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link supplychain.impl.ShipmentOrderImpl <em>Shipment Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.ShipmentOrderImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getShipmentOrder()
	 * @generated
	 */
	int SHIPMENT_ORDER = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Time interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__TIME_INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__SHIPMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Product Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__PRODUCT_ORDER = 4;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__INVOICE = 5;

	/**
	 * The feature id for the '<em><b>Emissions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__EMISSIONS = 6;

	/**
	 * The feature id for the '<em><b>Certificate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__CERTIFICATE = 7;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__ORIGIN = 8;

	/**
	 * The feature id for the '<em><b>Iot Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER__IOT_DATA = 9;

	/**
	 * The number of structural features of the '<em>Shipment Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Update Shipment Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER___UPDATE_SHIPMENT_DATA = 0;

	/**
	 * The operation id for the '<em>Verify Shipment Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER___VERIFY_SHIPMENT_STATUS = 1;

	/**
	 * The operation id for the '<em>Verify On Time Delivery</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER___VERIFY_ON_TIME_DELIVERY = 2;

	/**
	 * The number of operations of the '<em>Shipment Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ORDER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link supplychain.impl.ShipmentPlanningImpl <em>Shipment Planning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.ShipmentPlanningImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getShipmentPlanning()
	 * @generated
	 */
	int SHIPMENT_PLANNING = 5;

	/**
	 * The feature id for the '<em><b>Plan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PLANNING__PLAN_ID = 0;

	/**
	 * The feature id for the '<em><b>Requires Planning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PLANNING__REQUIRES_PLANNING = 1;

	/**
	 * The number of structural features of the '<em>Shipment Planning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PLANNING_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Store Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PLANNING___STORE_ORDER = 0;

	/**
	 * The number of operations of the '<em>Shipment Planning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PLANNING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link supplychain.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.InvoiceImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 6;

	/**
	 * The feature id for the '<em><b>Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PRODUCT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Shipment Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__SHIPMENT_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ID = 2;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__TOTAL_AMOUNT = 3;

	/**
	 * The feature id for the '<em><b>In Product Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__IN_PRODUCT_ORDER = 4;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Create Invoice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE___CREATE_INVOICE = 0;

	/**
	 * The operation id for the '<em>Verify Break Down Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE___VERIFY_BREAK_DOWN_COST = 1;

	/**
	 * The number of operations of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link supplychain.impl.DeliveryConfirmationImpl <em>Delivery Confirmation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.DeliveryConfirmationImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getDeliveryConfirmation()
	 * @generated
	 */
	int DELIVERY_CONFIRMATION = 7;

	/**
	 * The feature id for the '<em><b>Confirmation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION__CONFIRMATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION__DELIVERY_DATE = 1;

	/**
	 * The feature id for the '<em><b>Requires Shipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT = 2;

	/**
	 * The number of structural features of the '<em>Delivery Confirmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Transfer Product Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION___TRANSFER_PRODUCT_OWNERSHIP = 0;

	/**
	 * The operation id for the '<em>Confirm Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION___CONFIRM_PRODUCT = 1;

	/**
	 * The operation id for the '<em>Verify Order Fulfillment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION___VERIFY_ORDER_FULFILLMENT = 2;

	/**
	 * The operation id for the '<em>Verify Product Authenticity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION___VERIFY_PRODUCT_AUTHENTICITY = 3;

	/**
	 * The operation id for the '<em>Verify Product Quality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION___VERIFY_PRODUCT_QUALITY = 4;

	/**
	 * The number of operations of the '<em>Delivery Confirmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONFIRMATION_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link supplychain.impl.CO2Impl <em>CO2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.CO2Impl
	 * @see supplychain.impl.SupplychainPackageImpl#getCO2()
	 * @generated
	 */
	int CO2 = 8;

	/**
	 * The feature id for the '<em><b>Emission Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2__EMISSION_AMOUNT = 0;

	/**
	 * The number of structural features of the '<em>CO2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CO2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CO2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.SupplierCertificatesImpl <em>Supplier Certificates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.SupplierCertificatesImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getSupplierCertificates()
	 * @generated
	 */
	int SUPPLIER_CERTIFICATES = 9;

	/**
	 * The feature id for the '<em><b>Certificate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CERTIFICATES__CERTIFICATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Issuing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CERTIFICATES__ISSUING_DATE = 1;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CERTIFICATES__EXPIRY_DATE = 2;

	/**
	 * The number of structural features of the '<em>Supplier Certificates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CERTIFICATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Supplier Certificates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_CERTIFICATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.MaterialReuseImpl <em>Material Reuse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.MaterialReuseImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getMaterialReuse()
	 * @generated
	 */
	int MATERIAL_REUSE = 10;

	/**
	 * The feature id for the '<em><b>Recycled Material Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE = 0;

	/**
	 * The number of structural features of the '<em>Material Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_REUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Material Reuse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_REUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.RawMaterialsSourceImpl <em>Raw Materials Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.RawMaterialsSourceImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getRawMaterialsSource()
	 * @generated
	 */
	int RAW_MATERIALS_SOURCE = 11;

	/**
	 * The feature id for the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MATERIALS_SOURCE__SOURCE_LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Raw Materials Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MATERIALS_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Raw Materials Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_MATERIALS_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.ProductHistoryImpl <em>Product History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.ProductHistoryImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getProductHistory()
	 * @generated
	 */
	int PRODUCT_HISTORY = 12;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_HISTORY__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_HISTORY__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Product History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_HISTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.ProductOriginImpl <em>Product Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.ProductOriginImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getProductOrigin()
	 * @generated
	 */
	int PRODUCT_ORIGIN = 13;

	/**
	 * The feature id for the '<em><b>Origin Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORIGIN__ORIGIN_LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Product Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORIGIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ORIGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.SuppliersImpl <em>Suppliers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.SuppliersImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getSuppliers()
	 * @generated
	 */
	int SUPPLIERS = 14;

	/**
	 * The feature id for the '<em><b>Supplier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERS__SUPPLIER_ID = 0;

	/**
	 * The feature id for the '<em><b>Supplier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERS__SUPPLIER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Suppliers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Suppliers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.PaymentImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 15;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = 1;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___PAY = 0;

	/**
	 * The operation id for the '<em>Verify Payment Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT___VERIFY_PAYMENT_STATUS = 1;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link supplychain.impl.IoTDataStreamsImpl <em>Io TData Streams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.IoTDataStreamsImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getIoTDataStreams()
	 * @generated
	 */
	int IO_TDATA_STREAMS = 16;

	/**
	 * The feature id for the '<em><b>Stream Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDATA_STREAMS__STREAM_ID = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDATA_STREAMS__DATA = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDATA_STREAMS__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Io TData Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDATA_STREAMS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Io TData Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TDATA_STREAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.NonFungibleTokenImpl <em>Non Fungible Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.NonFungibleTokenImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getNonFungibleToken()
	 * @generated
	 */
	int NON_FUNGIBLE_TOKEN = 17;

	/**
	 * The feature id for the '<em><b>Token Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNGIBLE_TOKEN__TOKEN_ID = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNGIBLE_TOKEN__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNGIBLE_TOKEN__METADATA = 2;

	/**
	 * The number of structural features of the '<em>Non Fungible Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNGIBLE_TOKEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Non Fungible Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNGIBLE_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.IoTSensorsImpl <em>Io TSensors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.IoTSensorsImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getIoTSensors()
	 * @generated
	 */
	int IO_TSENSORS = 18;

	/**
	 * The feature id for the '<em><b>Sensor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSENSORS__SENSOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Sensor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSENSORS__SENSOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSENSORS__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSENSORS__READING = 3;

	/**
	 * The number of structural features of the '<em>Io TSensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSENSORS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Io TSensors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSENSORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.CryptocurrencyImpl <em>Cryptocurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.CryptocurrencyImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getCryptocurrency()
	 * @generated
	 */
	int CRYPTOCURRENCY = 19;

	/**
	 * The feature id for the '<em><b>Currency Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOCURRENCY__CURRENCY_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOCURRENCY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOCURRENCY__AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Cryptocurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOCURRENCY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cryptocurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTOCURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.InventoryImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 20;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link supplychain.impl.TransportationNotesImpl <em>Transportation Notes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see supplychain.impl.TransportationNotesImpl
	 * @see supplychain.impl.SupplychainPackageImpl#getTransportationNotes()
	 * @generated
	 */
	int TRANSPORTATION_NOTES = 21;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_NOTES__NOTE_ID = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_NOTES__CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Transportation Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_NOTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transportation Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_NOTES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link supplychain.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer</em>'.
	 * @see supplychain.Offer
	 * @generated
	 */
	EClass getOffer();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Offer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see supplychain.Offer#getType()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Type();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Offer#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see supplychain.Offer#getPrice()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Price();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Offer#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see supplychain.Offer#getQuantity()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Offer#getOfferId <em>Offer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offer Id</em>'.
	 * @see supplychain.Offer#getOfferId()
	 * @see #getOffer()
	 * @generated
	 */
	EAttribute getOffer_OfferId();

	/**
	 * Returns the meta object for the '{@link supplychain.Offer#createOffer() <em>Create Offer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Offer</em>' operation.
	 * @see supplychain.Offer#createOffer()
	 * @generated
	 */
	EOperation getOffer__CreateOffer();

	/**
	 * Returns the meta object for the '{@link supplychain.Offer#acceptOffer() <em>Accept Offer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Offer</em>' operation.
	 * @see supplychain.Offer#acceptOffer()
	 * @generated
	 */
	EOperation getOffer__AcceptOffer();

	/**
	 * Returns the meta object for class '{@link supplychain.PaymentSettlementsConditions <em>Payment Settlements Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Settlements Conditions</em>'.
	 * @see supplychain.PaymentSettlementsConditions
	 * @generated
	 */
	EClass getPaymentSettlementsConditions();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.PaymentSettlementsConditions#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see supplychain.PaymentSettlementsConditions#getType()
	 * @see #getPaymentSettlementsConditions()
	 * @generated
	 */
	EAttribute getPaymentSettlementsConditions_Type();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.PaymentSettlementsConditions#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditions</em>'.
	 * @see supplychain.PaymentSettlementsConditions#getConditions()
	 * @see #getPaymentSettlementsConditions()
	 * @generated
	 */
	EAttribute getPaymentSettlementsConditions_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.PaymentSettlementsConditions#getPaymentConditions <em>Payment Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Conditions</em>'.
	 * @see supplychain.PaymentSettlementsConditions#getPaymentConditions()
	 * @see #getPaymentSettlementsConditions()
	 * @generated
	 */
	EAttribute getPaymentSettlementsConditions_PaymentConditions();

	/**
	 * Returns the meta object for the reference '{@link supplychain.PaymentSettlementsConditions#getTriggersPayment <em>Triggers Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers Payment</em>'.
	 * @see supplychain.PaymentSettlementsConditions#getTriggersPayment()
	 * @see #getPaymentSettlementsConditions()
	 * @generated
	 */
	EReference getPaymentSettlementsConditions_TriggersPayment();

	/**
	 * Returns the meta object for the '{@link supplychain.PaymentSettlementsConditions#storeConditions() <em>Store Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Conditions</em>' operation.
	 * @see supplychain.PaymentSettlementsConditions#storeConditions()
	 * @generated
	 */
	EOperation getPaymentSettlementsConditions__StoreConditions();

	/**
	 * Returns the meta object for the '{@link supplychain.PaymentSettlementsConditions#confirmConditions() <em>Confirm Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Conditions</em>' operation.
	 * @see supplychain.PaymentSettlementsConditions#confirmConditions()
	 * @generated
	 */
	EOperation getPaymentSettlementsConditions__ConfirmConditions();

	/**
	 * Returns the meta object for class '{@link supplychain.ProductList <em>Product List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product List</em>'.
	 * @see supplychain.ProductList
	 * @generated
	 */
	EClass getProductList();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductList#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see supplychain.ProductList#getType()
	 * @see #getProductList()
	 * @generated
	 */
	EAttribute getProductList_Type();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductList#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see supplychain.ProductList#getProductName()
	 * @see #getProductList()
	 * @generated
	 */
	EAttribute getProductList_ProductName();

	/**
	 * Returns the meta object for the '{@link supplychain.ProductList#addProduct() <em>Add Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Product</em>' operation.
	 * @see supplychain.ProductList#addProduct()
	 * @generated
	 */
	EOperation getProductList__AddProduct();

	/**
	 * Returns the meta object for class '{@link supplychain.ProductOrder <em>Product Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Order</em>'.
	 * @see supplychain.ProductOrder
	 * @generated
	 */
	EClass getProductOrder();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductOrder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see supplychain.ProductOrder#getType()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_Type();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductOrder#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see supplychain.ProductOrder#getOrderId()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductOrder#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see supplychain.ProductOrder#getQuantity()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductOrder#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see supplychain.ProductOrder#getOrderDate()
	 * @see #getProductOrder()
	 * @generated
	 */
	EAttribute getProductOrder_OrderDate();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ProductOrder#getOrderProductList <em>Order Product List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Product List</em>'.
	 * @see supplychain.ProductOrder#getOrderProductList()
	 * @see #getProductOrder()
	 * @generated
	 */
	EReference getProductOrder_OrderProductList();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ProductOrder#getCreatedFrom <em>Created From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created From</em>'.
	 * @see supplychain.ProductOrder#getCreatedFrom()
	 * @see #getProductOrder()
	 * @generated
	 */
	EReference getProductOrder_CreatedFrom();

	/**
	 * Returns the meta object for the '{@link supplychain.ProductOrder#storeOrder() <em>Store Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Order</em>' operation.
	 * @see supplychain.ProductOrder#storeOrder()
	 * @generated
	 */
	EOperation getProductOrder__StoreOrder();

	/**
	 * Returns the meta object for the '{@link supplychain.ProductOrder#acceptOrder() <em>Accept Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Order</em>' operation.
	 * @see supplychain.ProductOrder#acceptOrder()
	 * @generated
	 */
	EOperation getProductOrder__AcceptOrder();

	/**
	 * Returns the meta object for class '{@link supplychain.ShipmentOrder <em>Shipment Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Order</em>'.
	 * @see supplychain.ShipmentOrder
	 * @generated
	 */
	EClass getShipmentOrder();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ShipmentOrder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see supplychain.ShipmentOrder#getType()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EAttribute getShipmentOrder_Type();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ShipmentOrder#getTime_interval <em>Time interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time interval</em>'.
	 * @see supplychain.ShipmentOrder#getTime_interval()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EAttribute getShipmentOrder_Time_interval();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ShipmentOrder#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Id</em>'.
	 * @see supplychain.ShipmentOrder#getShipmentId()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EAttribute getShipmentOrder_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ShipmentOrder#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see supplychain.ShipmentOrder#getStatus()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EAttribute getShipmentOrder_Status();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ShipmentOrder#getProductOrder <em>Product Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Order</em>'.
	 * @see supplychain.ShipmentOrder#getProductOrder()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EReference getShipmentOrder_ProductOrder();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ShipmentOrder#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see supplychain.ShipmentOrder#getInvoice()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EReference getShipmentOrder_Invoice();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ShipmentOrder#getEmissions <em>Emissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emissions</em>'.
	 * @see supplychain.ShipmentOrder#getEmissions()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EReference getShipmentOrder_Emissions();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ShipmentOrder#getCertificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Certificate</em>'.
	 * @see supplychain.ShipmentOrder#getCertificate()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EReference getShipmentOrder_Certificate();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ShipmentOrder#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see supplychain.ShipmentOrder#getOrigin()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EReference getShipmentOrder_Origin();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ShipmentOrder#getIotData <em>Iot Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Iot Data</em>'.
	 * @see supplychain.ShipmentOrder#getIotData()
	 * @see #getShipmentOrder()
	 * @generated
	 */
	EReference getShipmentOrder_IotData();

	/**
	 * Returns the meta object for the '{@link supplychain.ShipmentOrder#updateShipmentData() <em>Update Shipment Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Shipment Data</em>' operation.
	 * @see supplychain.ShipmentOrder#updateShipmentData()
	 * @generated
	 */
	EOperation getShipmentOrder__UpdateShipmentData();

	/**
	 * Returns the meta object for the '{@link supplychain.ShipmentOrder#verifyShipmentStatus() <em>Verify Shipment Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Shipment Status</em>' operation.
	 * @see supplychain.ShipmentOrder#verifyShipmentStatus()
	 * @generated
	 */
	EOperation getShipmentOrder__VerifyShipmentStatus();

	/**
	 * Returns the meta object for the '{@link supplychain.ShipmentOrder#verifyOnTimeDelivery() <em>Verify On Time Delivery</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify On Time Delivery</em>' operation.
	 * @see supplychain.ShipmentOrder#verifyOnTimeDelivery()
	 * @generated
	 */
	EOperation getShipmentOrder__VerifyOnTimeDelivery();

	/**
	 * Returns the meta object for class '{@link supplychain.ShipmentPlanning <em>Shipment Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Planning</em>'.
	 * @see supplychain.ShipmentPlanning
	 * @generated
	 */
	EClass getShipmentPlanning();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ShipmentPlanning#getPlanId <em>Plan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Id</em>'.
	 * @see supplychain.ShipmentPlanning#getPlanId()
	 * @see #getShipmentPlanning()
	 * @generated
	 */
	EAttribute getShipmentPlanning_PlanId();

	/**
	 * Returns the meta object for the reference '{@link supplychain.ShipmentPlanning#getRequiresPlanning <em>Requires Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requires Planning</em>'.
	 * @see supplychain.ShipmentPlanning#getRequiresPlanning()
	 * @see #getShipmentPlanning()
	 * @generated
	 */
	EReference getShipmentPlanning_RequiresPlanning();

	/**
	 * Returns the meta object for the '{@link supplychain.ShipmentPlanning#storeOrder() <em>Store Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Order</em>' operation.
	 * @see supplychain.ShipmentPlanning#storeOrder()
	 * @generated
	 */
	EOperation getShipmentPlanning__StoreOrder();

	/**
	 * Returns the meta object for class '{@link supplychain.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see supplychain.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Invoice#getProductType <em>Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type</em>'.
	 * @see supplychain.Invoice#getProductType()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_ProductType();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Invoice#getShipmentOrder <em>Shipment Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Order</em>'.
	 * @see supplychain.Invoice#getShipmentOrder()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_ShipmentOrder();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Invoice#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id</em>'.
	 * @see supplychain.Invoice#getInvoiceId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Invoice#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see supplychain.Invoice#getTotalAmount()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_TotalAmount();

	/**
	 * Returns the meta object for the containment reference '{@link supplychain.Invoice#getInProductOrder <em>In Product Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Product Order</em>'.
	 * @see supplychain.Invoice#getInProductOrder()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InProductOrder();

	/**
	 * Returns the meta object for the '{@link supplychain.Invoice#createInvoice() <em>Create Invoice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Invoice</em>' operation.
	 * @see supplychain.Invoice#createInvoice()
	 * @generated
	 */
	EOperation getInvoice__CreateInvoice();

	/**
	 * Returns the meta object for the '{@link supplychain.Invoice#verifyBreakDownCost() <em>Verify Break Down Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Break Down Cost</em>' operation.
	 * @see supplychain.Invoice#verifyBreakDownCost()
	 * @generated
	 */
	EOperation getInvoice__VerifyBreakDownCost();

	/**
	 * Returns the meta object for class '{@link supplychain.DeliveryConfirmation <em>Delivery Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Confirmation</em>'.
	 * @see supplychain.DeliveryConfirmation
	 * @generated
	 */
	EClass getDeliveryConfirmation();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.DeliveryConfirmation#getConfirmationId <em>Confirmation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmation Id</em>'.
	 * @see supplychain.DeliveryConfirmation#getConfirmationId()
	 * @see #getDeliveryConfirmation()
	 * @generated
	 */
	EAttribute getDeliveryConfirmation_ConfirmationId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.DeliveryConfirmation#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see supplychain.DeliveryConfirmation#getDeliveryDate()
	 * @see #getDeliveryConfirmation()
	 * @generated
	 */
	EAttribute getDeliveryConfirmation_DeliveryDate();

	/**
	 * Returns the meta object for the containment reference '{@link supplychain.DeliveryConfirmation#getRequiresShipment <em>Requires Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requires Shipment</em>'.
	 * @see supplychain.DeliveryConfirmation#getRequiresShipment()
	 * @see #getDeliveryConfirmation()
	 * @generated
	 */
	EReference getDeliveryConfirmation_RequiresShipment();

	/**
	 * Returns the meta object for the '{@link supplychain.DeliveryConfirmation#transferProductOwnership() <em>Transfer Product Ownership</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer Product Ownership</em>' operation.
	 * @see supplychain.DeliveryConfirmation#transferProductOwnership()
	 * @generated
	 */
	EOperation getDeliveryConfirmation__TransferProductOwnership();

	/**
	 * Returns the meta object for the '{@link supplychain.DeliveryConfirmation#confirmProduct() <em>Confirm Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Product</em>' operation.
	 * @see supplychain.DeliveryConfirmation#confirmProduct()
	 * @generated
	 */
	EOperation getDeliveryConfirmation__ConfirmProduct();

	/**
	 * Returns the meta object for the '{@link supplychain.DeliveryConfirmation#verifyOrderFulfillment() <em>Verify Order Fulfillment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Order Fulfillment</em>' operation.
	 * @see supplychain.DeliveryConfirmation#verifyOrderFulfillment()
	 * @generated
	 */
	EOperation getDeliveryConfirmation__VerifyOrderFulfillment();

	/**
	 * Returns the meta object for the '{@link supplychain.DeliveryConfirmation#verifyProductAuthenticity() <em>Verify Product Authenticity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Product Authenticity</em>' operation.
	 * @see supplychain.DeliveryConfirmation#verifyProductAuthenticity()
	 * @generated
	 */
	EOperation getDeliveryConfirmation__VerifyProductAuthenticity();

	/**
	 * Returns the meta object for the '{@link supplychain.DeliveryConfirmation#verifyProductQuality() <em>Verify Product Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Product Quality</em>' operation.
	 * @see supplychain.DeliveryConfirmation#verifyProductQuality()
	 * @generated
	 */
	EOperation getDeliveryConfirmation__VerifyProductQuality();

	/**
	 * Returns the meta object for class '{@link supplychain.CO2 <em>CO2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CO2</em>'.
	 * @see supplychain.CO2
	 * @generated
	 */
	EClass getCO2();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.CO2#getEmissionAmount <em>Emission Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emission Amount</em>'.
	 * @see supplychain.CO2#getEmissionAmount()
	 * @see #getCO2()
	 * @generated
	 */
	EAttribute getCO2_EmissionAmount();

	/**
	 * Returns the meta object for class '{@link supplychain.SupplierCertificates <em>Supplier Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Certificates</em>'.
	 * @see supplychain.SupplierCertificates
	 * @generated
	 */
	EClass getSupplierCertificates();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.SupplierCertificates#getCertificateId <em>Certificate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Id</em>'.
	 * @see supplychain.SupplierCertificates#getCertificateId()
	 * @see #getSupplierCertificates()
	 * @generated
	 */
	EAttribute getSupplierCertificates_CertificateId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.SupplierCertificates#getIssuingDate <em>Issuing Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issuing Date</em>'.
	 * @see supplychain.SupplierCertificates#getIssuingDate()
	 * @see #getSupplierCertificates()
	 * @generated
	 */
	EAttribute getSupplierCertificates_IssuingDate();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.SupplierCertificates#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see supplychain.SupplierCertificates#getExpiryDate()
	 * @see #getSupplierCertificates()
	 * @generated
	 */
	EAttribute getSupplierCertificates_ExpiryDate();

	/**
	 * Returns the meta object for class '{@link supplychain.MaterialReuse <em>Material Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Reuse</em>'.
	 * @see supplychain.MaterialReuse
	 * @generated
	 */
	EClass getMaterialReuse();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.MaterialReuse#getRecycledMaterialPercentage <em>Recycled Material Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recycled Material Percentage</em>'.
	 * @see supplychain.MaterialReuse#getRecycledMaterialPercentage()
	 * @see #getMaterialReuse()
	 * @generated
	 */
	EAttribute getMaterialReuse_RecycledMaterialPercentage();

	/**
	 * Returns the meta object for class '{@link supplychain.RawMaterialsSource <em>Raw Materials Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Materials Source</em>'.
	 * @see supplychain.RawMaterialsSource
	 * @generated
	 */
	EClass getRawMaterialsSource();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.RawMaterialsSource#getSourceLocation <em>Source Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Location</em>'.
	 * @see supplychain.RawMaterialsSource#getSourceLocation()
	 * @see #getRawMaterialsSource()
	 * @generated
	 */
	EAttribute getRawMaterialsSource_SourceLocation();

	/**
	 * Returns the meta object for class '{@link supplychain.ProductHistory <em>Product History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product History</em>'.
	 * @see supplychain.ProductHistory
	 * @generated
	 */
	EClass getProductHistory();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductHistory#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see supplychain.ProductHistory#getTimestamp()
	 * @see #getProductHistory()
	 * @generated
	 */
	EAttribute getProductHistory_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductHistory#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see supplychain.ProductHistory#getEvent()
	 * @see #getProductHistory()
	 * @generated
	 */
	EAttribute getProductHistory_Event();

	/**
	 * Returns the meta object for class '{@link supplychain.ProductOrigin <em>Product Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Origin</em>'.
	 * @see supplychain.ProductOrigin
	 * @generated
	 */
	EClass getProductOrigin();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.ProductOrigin#getOriginLocation <em>Origin Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Location</em>'.
	 * @see supplychain.ProductOrigin#getOriginLocation()
	 * @see #getProductOrigin()
	 * @generated
	 */
	EAttribute getProductOrigin_OriginLocation();

	/**
	 * Returns the meta object for class '{@link supplychain.Suppliers <em>Suppliers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suppliers</em>'.
	 * @see supplychain.Suppliers
	 * @generated
	 */
	EClass getSuppliers();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Suppliers#getSupplierId <em>Supplier Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Id</em>'.
	 * @see supplychain.Suppliers#getSupplierId()
	 * @see #getSuppliers()
	 * @generated
	 */
	EAttribute getSuppliers_SupplierId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Suppliers#getSupplierName <em>Supplier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Name</em>'.
	 * @see supplychain.Suppliers#getSupplierName()
	 * @see #getSuppliers()
	 * @generated
	 */
	EAttribute getSuppliers_SupplierName();

	/**
	 * Returns the meta object for class '{@link supplychain.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see supplychain.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Payment#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Id</em>'.
	 * @see supplychain.Payment#getPaymentId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see supplychain.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for the '{@link supplychain.Payment#pay() <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see supplychain.Payment#pay()
	 * @generated
	 */
	EOperation getPayment__Pay();

	/**
	 * Returns the meta object for the '{@link supplychain.Payment#verifyPaymentStatus() <em>Verify Payment Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Payment Status</em>' operation.
	 * @see supplychain.Payment#verifyPaymentStatus()
	 * @generated
	 */
	EOperation getPayment__VerifyPaymentStatus();

	/**
	 * Returns the meta object for class '{@link supplychain.IoTDataStreams <em>Io TData Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TData Streams</em>'.
	 * @see supplychain.IoTDataStreams
	 * @generated
	 */
	EClass getIoTDataStreams();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.IoTDataStreams#getStreamId <em>Stream Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream Id</em>'.
	 * @see supplychain.IoTDataStreams#getStreamId()
	 * @see #getIoTDataStreams()
	 * @generated
	 */
	EAttribute getIoTDataStreams_StreamId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.IoTDataStreams#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see supplychain.IoTDataStreams#getData()
	 * @see #getIoTDataStreams()
	 * @generated
	 */
	EAttribute getIoTDataStreams_Data();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.IoTDataStreams#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see supplychain.IoTDataStreams#getTimestamp()
	 * @see #getIoTDataStreams()
	 * @generated
	 */
	EAttribute getIoTDataStreams_Timestamp();

	/**
	 * Returns the meta object for class '{@link supplychain.NonFungibleToken <em>Non Fungible Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Fungible Token</em>'.
	 * @see supplychain.NonFungibleToken
	 * @generated
	 */
	EClass getNonFungibleToken();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.NonFungibleToken#getTokenId <em>Token Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Id</em>'.
	 * @see supplychain.NonFungibleToken#getTokenId()
	 * @see #getNonFungibleToken()
	 * @generated
	 */
	EAttribute getNonFungibleToken_TokenId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.NonFungibleToken#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see supplychain.NonFungibleToken#getOwner()
	 * @see #getNonFungibleToken()
	 * @generated
	 */
	EAttribute getNonFungibleToken_Owner();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.NonFungibleToken#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see supplychain.NonFungibleToken#getMetadata()
	 * @see #getNonFungibleToken()
	 * @generated
	 */
	EAttribute getNonFungibleToken_Metadata();

	/**
	 * Returns the meta object for class '{@link supplychain.IoTSensors <em>Io TSensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TSensors</em>'.
	 * @see supplychain.IoTSensors
	 * @generated
	 */
	EClass getIoTSensors();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.IoTSensors#getSensorId <em>Sensor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Id</em>'.
	 * @see supplychain.IoTSensors#getSensorId()
	 * @see #getIoTSensors()
	 * @generated
	 */
	EAttribute getIoTSensors_SensorId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.IoTSensors#getSensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Type</em>'.
	 * @see supplychain.IoTSensors#getSensorType()
	 * @see #getIoTSensors()
	 * @generated
	 */
	EAttribute getIoTSensors_SensorType();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.IoTSensors#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see supplychain.IoTSensors#getLocation()
	 * @see #getIoTSensors()
	 * @generated
	 */
	EAttribute getIoTSensors_Location();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.IoTSensors#getReading <em>Reading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading</em>'.
	 * @see supplychain.IoTSensors#getReading()
	 * @see #getIoTSensors()
	 * @generated
	 */
	EAttribute getIoTSensors_Reading();

	/**
	 * Returns the meta object for class '{@link supplychain.Cryptocurrency <em>Cryptocurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cryptocurrency</em>'.
	 * @see supplychain.Cryptocurrency
	 * @generated
	 */
	EClass getCryptocurrency();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Cryptocurrency#getCurrencyId <em>Currency Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Id</em>'.
	 * @see supplychain.Cryptocurrency#getCurrencyId()
	 * @see #getCryptocurrency()
	 * @generated
	 */
	EAttribute getCryptocurrency_CurrencyId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Cryptocurrency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see supplychain.Cryptocurrency#getName()
	 * @see #getCryptocurrency()
	 * @generated
	 */
	EAttribute getCryptocurrency_Name();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Cryptocurrency#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see supplychain.Cryptocurrency#getAmount()
	 * @see #getCryptocurrency()
	 * @generated
	 */
	EAttribute getCryptocurrency_Amount();

	/**
	 * Returns the meta object for class '{@link supplychain.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see supplychain.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Inventory#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see supplychain.Inventory#getQuantity()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.Inventory#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see supplychain.Inventory#getLocation()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Location();

	/**
	 * Returns the meta object for class '{@link supplychain.TransportationNotes <em>Transportation Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportation Notes</em>'.
	 * @see supplychain.TransportationNotes
	 * @generated
	 */
	EClass getTransportationNotes();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.TransportationNotes#getNoteId <em>Note Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Id</em>'.
	 * @see supplychain.TransportationNotes#getNoteId()
	 * @see #getTransportationNotes()
	 * @generated
	 */
	EAttribute getTransportationNotes_NoteId();

	/**
	 * Returns the meta object for the attribute '{@link supplychain.TransportationNotes#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see supplychain.TransportationNotes#getContent()
	 * @see #getTransportationNotes()
	 * @generated
	 */
	EAttribute getTransportationNotes_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SupplychainFactory getSupplychainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link supplychain.impl.OfferImpl <em>Offer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.OfferImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getOffer()
		 * @generated
		 */
		EClass OFFER = eINSTANCE.getOffer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__TYPE = eINSTANCE.getOffer_Type();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__PRICE = eINSTANCE.getOffer_Price();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__QUANTITY = eINSTANCE.getOffer_Quantity();

		/**
		 * The meta object literal for the '<em><b>Offer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER__OFFER_ID = eINSTANCE.getOffer_OfferId();

		/**
		 * The meta object literal for the '<em><b>Create Offer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___CREATE_OFFER = eINSTANCE.getOffer__CreateOffer();

		/**
		 * The meta object literal for the '<em><b>Accept Offer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OFFER___ACCEPT_OFFER = eINSTANCE.getOffer__AcceptOffer();

		/**
		 * The meta object literal for the '{@link supplychain.impl.PaymentSettlementsConditionsImpl <em>Payment Settlements Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.PaymentSettlementsConditionsImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getPaymentSettlementsConditions()
		 * @generated
		 */
		EClass PAYMENT_SETTLEMENTS_CONDITIONS = eINSTANCE.getPaymentSettlementsConditions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_SETTLEMENTS_CONDITIONS__TYPE = eINSTANCE.getPaymentSettlementsConditions_Type();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS = eINSTANCE.getPaymentSettlementsConditions_Conditions();

		/**
		 * The meta object literal for the '<em><b>Payment Conditions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS = eINSTANCE.getPaymentSettlementsConditions_PaymentConditions();

		/**
		 * The meta object literal for the '<em><b>Triggers Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT = eINSTANCE.getPaymentSettlementsConditions_TriggersPayment();

		/**
		 * The meta object literal for the '<em><b>Store Conditions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_SETTLEMENTS_CONDITIONS___STORE_CONDITIONS = eINSTANCE.getPaymentSettlementsConditions__StoreConditions();

		/**
		 * The meta object literal for the '<em><b>Confirm Conditions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_SETTLEMENTS_CONDITIONS___CONFIRM_CONDITIONS = eINSTANCE.getPaymentSettlementsConditions__ConfirmConditions();

		/**
		 * The meta object literal for the '{@link supplychain.impl.ProductListImpl <em>Product List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.ProductListImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getProductList()
		 * @generated
		 */
		EClass PRODUCT_LIST = eINSTANCE.getProductList();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_LIST__TYPE = eINSTANCE.getProductList_Type();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_LIST__PRODUCT_NAME = eINSTANCE.getProductList_ProductName();

		/**
		 * The meta object literal for the '<em><b>Add Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_LIST___ADD_PRODUCT = eINSTANCE.getProductList__AddProduct();

		/**
		 * The meta object literal for the '{@link supplychain.impl.ProductOrderImpl <em>Product Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.ProductOrderImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getProductOrder()
		 * @generated
		 */
		EClass PRODUCT_ORDER = eINSTANCE.getProductOrder();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__TYPE = eINSTANCE.getProductOrder_Type();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__ORDER_ID = eINSTANCE.getProductOrder_OrderId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__QUANTITY = eINSTANCE.getProductOrder_Quantity();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORDER__ORDER_DATE = eINSTANCE.getProductOrder_OrderDate();

		/**
		 * The meta object literal for the '<em><b>Order Product List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ORDER__ORDER_PRODUCT_LIST = eINSTANCE.getProductOrder_OrderProductList();

		/**
		 * The meta object literal for the '<em><b>Created From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ORDER__CREATED_FROM = eINSTANCE.getProductOrder_CreatedFrom();

		/**
		 * The meta object literal for the '<em><b>Store Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_ORDER___STORE_ORDER = eINSTANCE.getProductOrder__StoreOrder();

		/**
		 * The meta object literal for the '<em><b>Accept Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_ORDER___ACCEPT_ORDER = eINSTANCE.getProductOrder__AcceptOrder();

		/**
		 * The meta object literal for the '{@link supplychain.impl.ShipmentOrderImpl <em>Shipment Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.ShipmentOrderImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getShipmentOrder()
		 * @generated
		 */
		EClass SHIPMENT_ORDER = eINSTANCE.getShipmentOrder();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ORDER__TYPE = eINSTANCE.getShipmentOrder_Type();

		/**
		 * The meta object literal for the '<em><b>Time interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ORDER__TIME_INTERVAL = eINSTANCE.getShipmentOrder_Time_interval();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ORDER__SHIPMENT_ID = eINSTANCE.getShipmentOrder_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ORDER__STATUS = eINSTANCE.getShipmentOrder_Status();

		/**
		 * The meta object literal for the '<em><b>Product Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ORDER__PRODUCT_ORDER = eINSTANCE.getShipmentOrder_ProductOrder();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ORDER__INVOICE = eINSTANCE.getShipmentOrder_Invoice();

		/**
		 * The meta object literal for the '<em><b>Emissions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ORDER__EMISSIONS = eINSTANCE.getShipmentOrder_Emissions();

		/**
		 * The meta object literal for the '<em><b>Certificate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ORDER__CERTIFICATE = eINSTANCE.getShipmentOrder_Certificate();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ORDER__ORIGIN = eINSTANCE.getShipmentOrder_Origin();

		/**
		 * The meta object literal for the '<em><b>Iot Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ORDER__IOT_DATA = eINSTANCE.getShipmentOrder_IotData();

		/**
		 * The meta object literal for the '<em><b>Update Shipment Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHIPMENT_ORDER___UPDATE_SHIPMENT_DATA = eINSTANCE.getShipmentOrder__UpdateShipmentData();

		/**
		 * The meta object literal for the '<em><b>Verify Shipment Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHIPMENT_ORDER___VERIFY_SHIPMENT_STATUS = eINSTANCE.getShipmentOrder__VerifyShipmentStatus();

		/**
		 * The meta object literal for the '<em><b>Verify On Time Delivery</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHIPMENT_ORDER___VERIFY_ON_TIME_DELIVERY = eINSTANCE.getShipmentOrder__VerifyOnTimeDelivery();

		/**
		 * The meta object literal for the '{@link supplychain.impl.ShipmentPlanningImpl <em>Shipment Planning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.ShipmentPlanningImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getShipmentPlanning()
		 * @generated
		 */
		EClass SHIPMENT_PLANNING = eINSTANCE.getShipmentPlanning();

		/**
		 * The meta object literal for the '<em><b>Plan Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PLANNING__PLAN_ID = eINSTANCE.getShipmentPlanning_PlanId();

		/**
		 * The meta object literal for the '<em><b>Requires Planning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PLANNING__REQUIRES_PLANNING = eINSTANCE.getShipmentPlanning_RequiresPlanning();

		/**
		 * The meta object literal for the '<em><b>Store Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHIPMENT_PLANNING___STORE_ORDER = eINSTANCE.getShipmentPlanning__StoreOrder();

		/**
		 * The meta object literal for the '{@link supplychain.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.InvoiceImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Product Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__PRODUCT_TYPE = eINSTANCE.getInvoice_ProductType();

		/**
		 * The meta object literal for the '<em><b>Shipment Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__SHIPMENT_ORDER = eINSTANCE.getInvoice_ShipmentOrder();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_ID = eINSTANCE.getInvoice_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Total Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__TOTAL_AMOUNT = eINSTANCE.getInvoice_TotalAmount();

		/**
		 * The meta object literal for the '<em><b>In Product Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__IN_PRODUCT_ORDER = eINSTANCE.getInvoice_InProductOrder();

		/**
		 * The meta object literal for the '<em><b>Create Invoice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVOICE___CREATE_INVOICE = eINSTANCE.getInvoice__CreateInvoice();

		/**
		 * The meta object literal for the '<em><b>Verify Break Down Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVOICE___VERIFY_BREAK_DOWN_COST = eINSTANCE.getInvoice__VerifyBreakDownCost();

		/**
		 * The meta object literal for the '{@link supplychain.impl.DeliveryConfirmationImpl <em>Delivery Confirmation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.DeliveryConfirmationImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getDeliveryConfirmation()
		 * @generated
		 */
		EClass DELIVERY_CONFIRMATION = eINSTANCE.getDeliveryConfirmation();

		/**
		 * The meta object literal for the '<em><b>Confirmation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CONFIRMATION__CONFIRMATION_ID = eINSTANCE.getDeliveryConfirmation_ConfirmationId();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CONFIRMATION__DELIVERY_DATE = eINSTANCE.getDeliveryConfirmation_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Requires Shipment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT = eINSTANCE.getDeliveryConfirmation_RequiresShipment();

		/**
		 * The meta object literal for the '<em><b>Transfer Product Ownership</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELIVERY_CONFIRMATION___TRANSFER_PRODUCT_OWNERSHIP = eINSTANCE.getDeliveryConfirmation__TransferProductOwnership();

		/**
		 * The meta object literal for the '<em><b>Confirm Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELIVERY_CONFIRMATION___CONFIRM_PRODUCT = eINSTANCE.getDeliveryConfirmation__ConfirmProduct();

		/**
		 * The meta object literal for the '<em><b>Verify Order Fulfillment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELIVERY_CONFIRMATION___VERIFY_ORDER_FULFILLMENT = eINSTANCE.getDeliveryConfirmation__VerifyOrderFulfillment();

		/**
		 * The meta object literal for the '<em><b>Verify Product Authenticity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELIVERY_CONFIRMATION___VERIFY_PRODUCT_AUTHENTICITY = eINSTANCE.getDeliveryConfirmation__VerifyProductAuthenticity();

		/**
		 * The meta object literal for the '<em><b>Verify Product Quality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELIVERY_CONFIRMATION___VERIFY_PRODUCT_QUALITY = eINSTANCE.getDeliveryConfirmation__VerifyProductQuality();

		/**
		 * The meta object literal for the '{@link supplychain.impl.CO2Impl <em>CO2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.CO2Impl
		 * @see supplychain.impl.SupplychainPackageImpl#getCO2()
		 * @generated
		 */
		EClass CO2 = eINSTANCE.getCO2();

		/**
		 * The meta object literal for the '<em><b>Emission Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CO2__EMISSION_AMOUNT = eINSTANCE.getCO2_EmissionAmount();

		/**
		 * The meta object literal for the '{@link supplychain.impl.SupplierCertificatesImpl <em>Supplier Certificates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.SupplierCertificatesImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getSupplierCertificates()
		 * @generated
		 */
		EClass SUPPLIER_CERTIFICATES = eINSTANCE.getSupplierCertificates();

		/**
		 * The meta object literal for the '<em><b>Certificate Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_CERTIFICATES__CERTIFICATE_ID = eINSTANCE.getSupplierCertificates_CertificateId();

		/**
		 * The meta object literal for the '<em><b>Issuing Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_CERTIFICATES__ISSUING_DATE = eINSTANCE.getSupplierCertificates_IssuingDate();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_CERTIFICATES__EXPIRY_DATE = eINSTANCE.getSupplierCertificates_ExpiryDate();

		/**
		 * The meta object literal for the '{@link supplychain.impl.MaterialReuseImpl <em>Material Reuse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.MaterialReuseImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getMaterialReuse()
		 * @generated
		 */
		EClass MATERIAL_REUSE = eINSTANCE.getMaterialReuse();

		/**
		 * The meta object literal for the '<em><b>Recycled Material Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE = eINSTANCE.getMaterialReuse_RecycledMaterialPercentage();

		/**
		 * The meta object literal for the '{@link supplychain.impl.RawMaterialsSourceImpl <em>Raw Materials Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.RawMaterialsSourceImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getRawMaterialsSource()
		 * @generated
		 */
		EClass RAW_MATERIALS_SOURCE = eINSTANCE.getRawMaterialsSource();

		/**
		 * The meta object literal for the '<em><b>Source Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_MATERIALS_SOURCE__SOURCE_LOCATION = eINSTANCE.getRawMaterialsSource_SourceLocation();

		/**
		 * The meta object literal for the '{@link supplychain.impl.ProductHistoryImpl <em>Product History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.ProductHistoryImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getProductHistory()
		 * @generated
		 */
		EClass PRODUCT_HISTORY = eINSTANCE.getProductHistory();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_HISTORY__TIMESTAMP = eINSTANCE.getProductHistory_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_HISTORY__EVENT = eINSTANCE.getProductHistory_Event();

		/**
		 * The meta object literal for the '{@link supplychain.impl.ProductOriginImpl <em>Product Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.ProductOriginImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getProductOrigin()
		 * @generated
		 */
		EClass PRODUCT_ORIGIN = eINSTANCE.getProductOrigin();

		/**
		 * The meta object literal for the '<em><b>Origin Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ORIGIN__ORIGIN_LOCATION = eINSTANCE.getProductOrigin_OriginLocation();

		/**
		 * The meta object literal for the '{@link supplychain.impl.SuppliersImpl <em>Suppliers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.SuppliersImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getSuppliers()
		 * @generated
		 */
		EClass SUPPLIERS = eINSTANCE.getSuppliers();

		/**
		 * The meta object literal for the '<em><b>Supplier Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIERS__SUPPLIER_ID = eINSTANCE.getSuppliers_SupplierId();

		/**
		 * The meta object literal for the '<em><b>Supplier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIERS__SUPPLIER_NAME = eINSTANCE.getSuppliers_SupplierName();

		/**
		 * The meta object literal for the '{@link supplychain.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.PaymentImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_ID = eINSTANCE.getPayment_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___PAY = eINSTANCE.getPayment__Pay();

		/**
		 * The meta object literal for the '<em><b>Verify Payment Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT___VERIFY_PAYMENT_STATUS = eINSTANCE.getPayment__VerifyPaymentStatus();

		/**
		 * The meta object literal for the '{@link supplychain.impl.IoTDataStreamsImpl <em>Io TData Streams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.IoTDataStreamsImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getIoTDataStreams()
		 * @generated
		 */
		EClass IO_TDATA_STREAMS = eINSTANCE.getIoTDataStreams();

		/**
		 * The meta object literal for the '<em><b>Stream Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TDATA_STREAMS__STREAM_ID = eINSTANCE.getIoTDataStreams_StreamId();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TDATA_STREAMS__DATA = eINSTANCE.getIoTDataStreams_Data();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TDATA_STREAMS__TIMESTAMP = eINSTANCE.getIoTDataStreams_Timestamp();

		/**
		 * The meta object literal for the '{@link supplychain.impl.NonFungibleTokenImpl <em>Non Fungible Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.NonFungibleTokenImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getNonFungibleToken()
		 * @generated
		 */
		EClass NON_FUNGIBLE_TOKEN = eINSTANCE.getNonFungibleToken();

		/**
		 * The meta object literal for the '<em><b>Token Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_FUNGIBLE_TOKEN__TOKEN_ID = eINSTANCE.getNonFungibleToken_TokenId();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_FUNGIBLE_TOKEN__OWNER = eINSTANCE.getNonFungibleToken_Owner();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_FUNGIBLE_TOKEN__METADATA = eINSTANCE.getNonFungibleToken_Metadata();

		/**
		 * The meta object literal for the '{@link supplychain.impl.IoTSensorsImpl <em>Io TSensors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.IoTSensorsImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getIoTSensors()
		 * @generated
		 */
		EClass IO_TSENSORS = eINSTANCE.getIoTSensors();

		/**
		 * The meta object literal for the '<em><b>Sensor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TSENSORS__SENSOR_ID = eINSTANCE.getIoTSensors_SensorId();

		/**
		 * The meta object literal for the '<em><b>Sensor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TSENSORS__SENSOR_TYPE = eINSTANCE.getIoTSensors_SensorType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TSENSORS__LOCATION = eINSTANCE.getIoTSensors_Location();

		/**
		 * The meta object literal for the '<em><b>Reading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TSENSORS__READING = eINSTANCE.getIoTSensors_Reading();

		/**
		 * The meta object literal for the '{@link supplychain.impl.CryptocurrencyImpl <em>Cryptocurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.CryptocurrencyImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getCryptocurrency()
		 * @generated
		 */
		EClass CRYPTOCURRENCY = eINSTANCE.getCryptocurrency();

		/**
		 * The meta object literal for the '<em><b>Currency Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTOCURRENCY__CURRENCY_ID = eINSTANCE.getCryptocurrency_CurrencyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTOCURRENCY__NAME = eINSTANCE.getCryptocurrency_Name();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTOCURRENCY__AMOUNT = eINSTANCE.getCryptocurrency_Amount();

		/**
		 * The meta object literal for the '{@link supplychain.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.InventoryImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__QUANTITY = eINSTANCE.getInventory_Quantity();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__LOCATION = eINSTANCE.getInventory_Location();

		/**
		 * The meta object literal for the '{@link supplychain.impl.TransportationNotesImpl <em>Transportation Notes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see supplychain.impl.TransportationNotesImpl
		 * @see supplychain.impl.SupplychainPackageImpl#getTransportationNotes()
		 * @generated
		 */
		EClass TRANSPORTATION_NOTES = eINSTANCE.getTransportationNotes();

		/**
		 * The meta object literal for the '<em><b>Note Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_NOTES__NOTE_ID = eINSTANCE.getTransportationNotes_NoteId();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORTATION_NOTES__CONTENT = eINSTANCE.getTransportationNotes_Content();

	}

} //SupplychainPackage
