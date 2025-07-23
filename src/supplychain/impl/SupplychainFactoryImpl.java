/**
 */
package supplychain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import supplychain.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupplychainFactoryImpl extends EFactoryImpl implements SupplychainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SupplychainFactory init() {
		try {
			SupplychainFactory theSupplychainFactory = (SupplychainFactory)EPackage.Registry.INSTANCE.getEFactory(SupplychainPackage.eNS_URI);
			if (theSupplychainFactory != null) {
				return theSupplychainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SupplychainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplychainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SupplychainPackage.OFFER: return createOffer();
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS: return createPaymentSettlementsConditions();
			case SupplychainPackage.PRODUCT_LIST: return createProductList();
			case SupplychainPackage.PRODUCT_ORDER: return createProductOrder();
			case SupplychainPackage.SHIPMENT_ORDER: return createShipmentOrder();
			case SupplychainPackage.SHIPMENT_PLANNING: return createShipmentPlanning();
			case SupplychainPackage.INVOICE: return createInvoice();
			case SupplychainPackage.DELIVERY_CONFIRMATION: return createDeliveryConfirmation();
			case SupplychainPackage.CO2: return createCO2();
			case SupplychainPackage.SUPPLIER_CERTIFICATES: return createSupplierCertificates();
			case SupplychainPackage.MATERIAL_REUSE: return createMaterialReuse();
			case SupplychainPackage.RAW_MATERIALS_SOURCE: return createRawMaterialsSource();
			case SupplychainPackage.PRODUCT_HISTORY: return createProductHistory();
			case SupplychainPackage.PRODUCT_ORIGIN: return createProductOrigin();
			case SupplychainPackage.SUPPLIERS: return createSuppliers();
			case SupplychainPackage.PAYMENT: return createPayment();
			case SupplychainPackage.IO_TDATA_STREAMS: return createIoTDataStreams();
			case SupplychainPackage.NON_FUNGIBLE_TOKEN: return createNonFungibleToken();
			case SupplychainPackage.IO_TSENSORS: return createIoTSensors();
			case SupplychainPackage.CRYPTOCURRENCY: return createCryptocurrency();
			case SupplychainPackage.INVENTORY: return createInventory();
			case SupplychainPackage.TRANSPORTATION_NOTES: return createTransportationNotes();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Offer createOffer() {
		OfferImpl offer = new OfferImpl();
		return offer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentSettlementsConditions createPaymentSettlementsConditions() {
		PaymentSettlementsConditionsImpl paymentSettlementsConditions = new PaymentSettlementsConditionsImpl();
		return paymentSettlementsConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductList createProductList() {
		ProductListImpl productList = new ProductListImpl();
		return productList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOrder createProductOrder() {
		ProductOrderImpl productOrder = new ProductOrderImpl();
		return productOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentOrder createShipmentOrder() {
		ShipmentOrderImpl shipmentOrder = new ShipmentOrderImpl();
		return shipmentOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentPlanning createShipmentPlanning() {
		ShipmentPlanningImpl shipmentPlanning = new ShipmentPlanningImpl();
		return shipmentPlanning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliveryConfirmation createDeliveryConfirmation() {
		DeliveryConfirmationImpl deliveryConfirmation = new DeliveryConfirmationImpl();
		return deliveryConfirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CO2 createCO2() {
		CO2Impl co2 = new CO2Impl();
		return co2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierCertificates createSupplierCertificates() {
		SupplierCertificatesImpl supplierCertificates = new SupplierCertificatesImpl();
		return supplierCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialReuse createMaterialReuse() {
		MaterialReuseImpl materialReuse = new MaterialReuseImpl();
		return materialReuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RawMaterialsSource createRawMaterialsSource() {
		RawMaterialsSourceImpl rawMaterialsSource = new RawMaterialsSourceImpl();
		return rawMaterialsSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductHistory createProductHistory() {
		ProductHistoryImpl productHistory = new ProductHistoryImpl();
		return productHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOrigin createProductOrigin() {
		ProductOriginImpl productOrigin = new ProductOriginImpl();
		return productOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Suppliers createSuppliers() {
		SuppliersImpl suppliers = new SuppliersImpl();
		return suppliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment createPayment() {
		PaymentImpl payment = new PaymentImpl();
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTDataStreams createIoTDataStreams() {
		IoTDataStreamsImpl ioTDataStreams = new IoTDataStreamsImpl();
		return ioTDataStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NonFungibleToken createNonFungibleToken() {
		NonFungibleTokenImpl nonFungibleToken = new NonFungibleTokenImpl();
		return nonFungibleToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IoTSensors createIoTSensors() {
		IoTSensorsImpl ioTSensors = new IoTSensorsImpl();
		return ioTSensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cryptocurrency createCryptocurrency() {
		CryptocurrencyImpl cryptocurrency = new CryptocurrencyImpl();
		return cryptocurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inventory createInventory() {
		InventoryImpl inventory = new InventoryImpl();
		return inventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportationNotes createTransportationNotes() {
		TransportationNotesImpl transportationNotes = new TransportationNotesImpl();
		return transportationNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplychainPackage getSupplychainPackage() {
		return (SupplychainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SupplychainPackage getPackage() {
		return SupplychainPackage.eINSTANCE;
	}

} //SupplychainFactoryImpl
