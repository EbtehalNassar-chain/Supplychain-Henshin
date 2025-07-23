/**
 */
package supplychain.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import supplychain.Cryptocurrency;
import supplychain.DeliveryConfirmation;
import supplychain.Inventory;
import supplychain.Invoice;
import supplychain.IoTDataStreams;
import supplychain.IoTSensors;
import supplychain.MaterialReuse;
import supplychain.NonFungibleToken;
import supplychain.Offer;
import supplychain.Payment;
import supplychain.PaymentSettlementsConditions;
import supplychain.ProductHistory;
import supplychain.ProductList;
import supplychain.ProductOrder;
import supplychain.ProductOrigin;
import supplychain.RawMaterialsSource;
import supplychain.ShipmentOrder;
import supplychain.ShipmentPlanning;
import supplychain.SupplierCertificates;
import supplychain.Suppliers;
import supplychain.SupplychainFactory;
import supplychain.SupplychainPackage;
import supplychain.TransportationNotes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SupplychainPackageImpl extends EPackageImpl implements SupplychainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentSettlementsConditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentPlanningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryConfirmationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass co2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierCertificatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialReuseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawMaterialsSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productOriginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suppliersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTDataStreamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonFungibleTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTSensorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptocurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationNotesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see supplychain.SupplychainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SupplychainPackageImpl() {
		super(eNS_URI, SupplychainFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SupplychainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SupplychainPackage init() {
		if (isInited) return (SupplychainPackage)EPackage.Registry.INSTANCE.getEPackage(SupplychainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSupplychainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SupplychainPackageImpl theSupplychainPackage = registeredSupplychainPackage instanceof SupplychainPackageImpl ? (SupplychainPackageImpl)registeredSupplychainPackage : new SupplychainPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSupplychainPackage.createPackageContents();

		// Initialize created meta-data
		theSupplychainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSupplychainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SupplychainPackage.eNS_URI, theSupplychainPackage);
		return theSupplychainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOffer() {
		return offerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_Type() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_Price() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_Quantity() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOffer_OfferId() {
		return (EAttribute)offerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOffer__CreateOffer() {
		return offerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOffer__AcceptOffer() {
		return offerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentSettlementsConditions() {
		return paymentSettlementsConditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentSettlementsConditions_Type() {
		return (EAttribute)paymentSettlementsConditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentSettlementsConditions_Conditions() {
		return (EAttribute)paymentSettlementsConditionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentSettlementsConditions_PaymentConditions() {
		return (EAttribute)paymentSettlementsConditionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentSettlementsConditions_TriggersPayment() {
		return (EReference)paymentSettlementsConditionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPaymentSettlementsConditions__StoreConditions() {
		return paymentSettlementsConditionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPaymentSettlementsConditions__ConfirmConditions() {
		return paymentSettlementsConditionsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductList() {
		return productListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductList_Type() {
		return (EAttribute)productListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductList_ProductName() {
		return (EAttribute)productListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductList__AddProduct() {
		return productListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductOrder() {
		return productOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrder_Type() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrder_OrderId() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrder_Quantity() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrder_OrderDate() {
		return (EAttribute)productOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrder_OrderProductList() {
		return (EReference)productOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductOrder_CreatedFrom() {
		return (EReference)productOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductOrder__StoreOrder() {
		return productOrderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProductOrder__AcceptOrder() {
		return productOrderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentOrder() {
		return shipmentOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentOrder_Type() {
		return (EAttribute)shipmentOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentOrder_Time_interval() {
		return (EAttribute)shipmentOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentOrder_ShipmentId() {
		return (EAttribute)shipmentOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentOrder_Status() {
		return (EAttribute)shipmentOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentOrder_ProductOrder() {
		return (EReference)shipmentOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentOrder_Invoice() {
		return (EReference)shipmentOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentOrder_Emissions() {
		return (EReference)shipmentOrderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentOrder_Certificate() {
		return (EReference)shipmentOrderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentOrder_Origin() {
		return (EReference)shipmentOrderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentOrder_IotData() {
		return (EReference)shipmentOrderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShipmentOrder__UpdateShipmentData() {
		return shipmentOrderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShipmentOrder__VerifyShipmentStatus() {
		return shipmentOrderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShipmentOrder__VerifyOnTimeDelivery() {
		return shipmentOrderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipmentPlanning() {
		return shipmentPlanningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipmentPlanning_PlanId() {
		return (EAttribute)shipmentPlanningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShipmentPlanning_RequiresPlanning() {
		return (EReference)shipmentPlanningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShipmentPlanning__StoreOrder() {
		return shipmentPlanningEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvoice() {
		return invoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoice_ProductType() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoice_ShipmentOrder() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoice_InvoiceId() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvoice_TotalAmount() {
		return (EAttribute)invoiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvoice_InProductOrder() {
		return (EReference)invoiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInvoice__CreateInvoice() {
		return invoiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInvoice__VerifyBreakDownCost() {
		return invoiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeliveryConfirmation() {
		return deliveryConfirmationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliveryConfirmation_ConfirmationId() {
		return (EAttribute)deliveryConfirmationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliveryConfirmation_DeliveryDate() {
		return (EAttribute)deliveryConfirmationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeliveryConfirmation_RequiresShipment() {
		return (EReference)deliveryConfirmationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeliveryConfirmation__TransferProductOwnership() {
		return deliveryConfirmationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeliveryConfirmation__ConfirmProduct() {
		return deliveryConfirmationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeliveryConfirmation__VerifyOrderFulfillment() {
		return deliveryConfirmationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeliveryConfirmation__VerifyProductAuthenticity() {
		return deliveryConfirmationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDeliveryConfirmation__VerifyProductQuality() {
		return deliveryConfirmationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCO2() {
		return co2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCO2_EmissionAmount() {
		return (EAttribute)co2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupplierCertificates() {
		return supplierCertificatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplierCertificates_CertificateId() {
		return (EAttribute)supplierCertificatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplierCertificates_IssuingDate() {
		return (EAttribute)supplierCertificatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplierCertificates_ExpiryDate() {
		return (EAttribute)supplierCertificatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaterialReuse() {
		return materialReuseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterialReuse_RecycledMaterialPercentage() {
		return (EAttribute)materialReuseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRawMaterialsSource() {
		return rawMaterialsSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRawMaterialsSource_SourceLocation() {
		return (EAttribute)rawMaterialsSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductHistory() {
		return productHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductHistory_Timestamp() {
		return (EAttribute)productHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductHistory_Event() {
		return (EAttribute)productHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductOrigin() {
		return productOriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductOrigin_OriginLocation() {
		return (EAttribute)productOriginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuppliers() {
		return suppliersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuppliers_SupplierId() {
		return (EAttribute)suppliersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuppliers_SupplierName() {
		return (EAttribute)suppliersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_PaymentId() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Amount() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPayment__Pay() {
		return paymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPayment__VerifyPaymentStatus() {
		return paymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoTDataStreams() {
		return ioTDataStreamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoTDataStreams_StreamId() {
		return (EAttribute)ioTDataStreamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoTDataStreams_Data() {
		return (EAttribute)ioTDataStreamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoTDataStreams_Timestamp() {
		return (EAttribute)ioTDataStreamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNonFungibleToken() {
		return nonFungibleTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonFungibleToken_TokenId() {
		return (EAttribute)nonFungibleTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonFungibleToken_Owner() {
		return (EAttribute)nonFungibleTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNonFungibleToken_Metadata() {
		return (EAttribute)nonFungibleTokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIoTSensors() {
		return ioTSensorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoTSensors_SensorId() {
		return (EAttribute)ioTSensorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoTSensors_SensorType() {
		return (EAttribute)ioTSensorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoTSensors_Location() {
		return (EAttribute)ioTSensorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIoTSensors_Reading() {
		return (EAttribute)ioTSensorsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCryptocurrency() {
		return cryptocurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCryptocurrency_CurrencyId() {
		return (EAttribute)cryptocurrencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCryptocurrency_Name() {
		return (EAttribute)cryptocurrencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCryptocurrency_Amount() {
		return (EAttribute)cryptocurrencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Quantity() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Location() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportationNotes() {
		return transportationNotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportationNotes_NoteId() {
		return (EAttribute)transportationNotesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransportationNotes_Content() {
		return (EAttribute)transportationNotesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplychainFactory getSupplychainFactory() {
		return (SupplychainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		offerEClass = createEClass(OFFER);
		createEAttribute(offerEClass, OFFER__TYPE);
		createEAttribute(offerEClass, OFFER__PRICE);
		createEAttribute(offerEClass, OFFER__QUANTITY);
		createEAttribute(offerEClass, OFFER__OFFER_ID);
		createEOperation(offerEClass, OFFER___CREATE_OFFER);
		createEOperation(offerEClass, OFFER___ACCEPT_OFFER);

		paymentSettlementsConditionsEClass = createEClass(PAYMENT_SETTLEMENTS_CONDITIONS);
		createEAttribute(paymentSettlementsConditionsEClass, PAYMENT_SETTLEMENTS_CONDITIONS__TYPE);
		createEAttribute(paymentSettlementsConditionsEClass, PAYMENT_SETTLEMENTS_CONDITIONS__CONDITIONS);
		createEAttribute(paymentSettlementsConditionsEClass, PAYMENT_SETTLEMENTS_CONDITIONS__PAYMENT_CONDITIONS);
		createEReference(paymentSettlementsConditionsEClass, PAYMENT_SETTLEMENTS_CONDITIONS__TRIGGERS_PAYMENT);
		createEOperation(paymentSettlementsConditionsEClass, PAYMENT_SETTLEMENTS_CONDITIONS___STORE_CONDITIONS);
		createEOperation(paymentSettlementsConditionsEClass, PAYMENT_SETTLEMENTS_CONDITIONS___CONFIRM_CONDITIONS);

		productListEClass = createEClass(PRODUCT_LIST);
		createEAttribute(productListEClass, PRODUCT_LIST__TYPE);
		createEAttribute(productListEClass, PRODUCT_LIST__PRODUCT_NAME);
		createEOperation(productListEClass, PRODUCT_LIST___ADD_PRODUCT);

		productOrderEClass = createEClass(PRODUCT_ORDER);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__TYPE);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__ORDER_ID);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__QUANTITY);
		createEAttribute(productOrderEClass, PRODUCT_ORDER__ORDER_DATE);
		createEReference(productOrderEClass, PRODUCT_ORDER__ORDER_PRODUCT_LIST);
		createEReference(productOrderEClass, PRODUCT_ORDER__CREATED_FROM);
		createEOperation(productOrderEClass, PRODUCT_ORDER___STORE_ORDER);
		createEOperation(productOrderEClass, PRODUCT_ORDER___ACCEPT_ORDER);

		shipmentOrderEClass = createEClass(SHIPMENT_ORDER);
		createEAttribute(shipmentOrderEClass, SHIPMENT_ORDER__TYPE);
		createEAttribute(shipmentOrderEClass, SHIPMENT_ORDER__TIME_INTERVAL);
		createEAttribute(shipmentOrderEClass, SHIPMENT_ORDER__SHIPMENT_ID);
		createEAttribute(shipmentOrderEClass, SHIPMENT_ORDER__STATUS);
		createEReference(shipmentOrderEClass, SHIPMENT_ORDER__PRODUCT_ORDER);
		createEReference(shipmentOrderEClass, SHIPMENT_ORDER__INVOICE);
		createEReference(shipmentOrderEClass, SHIPMENT_ORDER__EMISSIONS);
		createEReference(shipmentOrderEClass, SHIPMENT_ORDER__CERTIFICATE);
		createEReference(shipmentOrderEClass, SHIPMENT_ORDER__ORIGIN);
		createEReference(shipmentOrderEClass, SHIPMENT_ORDER__IOT_DATA);
		createEOperation(shipmentOrderEClass, SHIPMENT_ORDER___UPDATE_SHIPMENT_DATA);
		createEOperation(shipmentOrderEClass, SHIPMENT_ORDER___VERIFY_SHIPMENT_STATUS);
		createEOperation(shipmentOrderEClass, SHIPMENT_ORDER___VERIFY_ON_TIME_DELIVERY);

		shipmentPlanningEClass = createEClass(SHIPMENT_PLANNING);
		createEAttribute(shipmentPlanningEClass, SHIPMENT_PLANNING__PLAN_ID);
		createEReference(shipmentPlanningEClass, SHIPMENT_PLANNING__REQUIRES_PLANNING);
		createEOperation(shipmentPlanningEClass, SHIPMENT_PLANNING___STORE_ORDER);

		invoiceEClass = createEClass(INVOICE);
		createEAttribute(invoiceEClass, INVOICE__PRODUCT_TYPE);
		createEAttribute(invoiceEClass, INVOICE__SHIPMENT_ORDER);
		createEAttribute(invoiceEClass, INVOICE__INVOICE_ID);
		createEAttribute(invoiceEClass, INVOICE__TOTAL_AMOUNT);
		createEReference(invoiceEClass, INVOICE__IN_PRODUCT_ORDER);
		createEOperation(invoiceEClass, INVOICE___CREATE_INVOICE);
		createEOperation(invoiceEClass, INVOICE___VERIFY_BREAK_DOWN_COST);

		deliveryConfirmationEClass = createEClass(DELIVERY_CONFIRMATION);
		createEAttribute(deliveryConfirmationEClass, DELIVERY_CONFIRMATION__CONFIRMATION_ID);
		createEAttribute(deliveryConfirmationEClass, DELIVERY_CONFIRMATION__DELIVERY_DATE);
		createEReference(deliveryConfirmationEClass, DELIVERY_CONFIRMATION__REQUIRES_SHIPMENT);
		createEOperation(deliveryConfirmationEClass, DELIVERY_CONFIRMATION___TRANSFER_PRODUCT_OWNERSHIP);
		createEOperation(deliveryConfirmationEClass, DELIVERY_CONFIRMATION___CONFIRM_PRODUCT);
		createEOperation(deliveryConfirmationEClass, DELIVERY_CONFIRMATION___VERIFY_ORDER_FULFILLMENT);
		createEOperation(deliveryConfirmationEClass, DELIVERY_CONFIRMATION___VERIFY_PRODUCT_AUTHENTICITY);
		createEOperation(deliveryConfirmationEClass, DELIVERY_CONFIRMATION___VERIFY_PRODUCT_QUALITY);

		co2EClass = createEClass(CO2);
		createEAttribute(co2EClass, CO2__EMISSION_AMOUNT);

		supplierCertificatesEClass = createEClass(SUPPLIER_CERTIFICATES);
		createEAttribute(supplierCertificatesEClass, SUPPLIER_CERTIFICATES__CERTIFICATE_ID);
		createEAttribute(supplierCertificatesEClass, SUPPLIER_CERTIFICATES__ISSUING_DATE);
		createEAttribute(supplierCertificatesEClass, SUPPLIER_CERTIFICATES__EXPIRY_DATE);

		materialReuseEClass = createEClass(MATERIAL_REUSE);
		createEAttribute(materialReuseEClass, MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE);

		rawMaterialsSourceEClass = createEClass(RAW_MATERIALS_SOURCE);
		createEAttribute(rawMaterialsSourceEClass, RAW_MATERIALS_SOURCE__SOURCE_LOCATION);

		productHistoryEClass = createEClass(PRODUCT_HISTORY);
		createEAttribute(productHistoryEClass, PRODUCT_HISTORY__TIMESTAMP);
		createEAttribute(productHistoryEClass, PRODUCT_HISTORY__EVENT);

		productOriginEClass = createEClass(PRODUCT_ORIGIN);
		createEAttribute(productOriginEClass, PRODUCT_ORIGIN__ORIGIN_LOCATION);

		suppliersEClass = createEClass(SUPPLIERS);
		createEAttribute(suppliersEClass, SUPPLIERS__SUPPLIER_ID);
		createEAttribute(suppliersEClass, SUPPLIERS__SUPPLIER_NAME);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_ID);
		createEAttribute(paymentEClass, PAYMENT__AMOUNT);
		createEOperation(paymentEClass, PAYMENT___PAY);
		createEOperation(paymentEClass, PAYMENT___VERIFY_PAYMENT_STATUS);

		ioTDataStreamsEClass = createEClass(IO_TDATA_STREAMS);
		createEAttribute(ioTDataStreamsEClass, IO_TDATA_STREAMS__STREAM_ID);
		createEAttribute(ioTDataStreamsEClass, IO_TDATA_STREAMS__DATA);
		createEAttribute(ioTDataStreamsEClass, IO_TDATA_STREAMS__TIMESTAMP);

		nonFungibleTokenEClass = createEClass(NON_FUNGIBLE_TOKEN);
		createEAttribute(nonFungibleTokenEClass, NON_FUNGIBLE_TOKEN__TOKEN_ID);
		createEAttribute(nonFungibleTokenEClass, NON_FUNGIBLE_TOKEN__OWNER);
		createEAttribute(nonFungibleTokenEClass, NON_FUNGIBLE_TOKEN__METADATA);

		ioTSensorsEClass = createEClass(IO_TSENSORS);
		createEAttribute(ioTSensorsEClass, IO_TSENSORS__SENSOR_ID);
		createEAttribute(ioTSensorsEClass, IO_TSENSORS__SENSOR_TYPE);
		createEAttribute(ioTSensorsEClass, IO_TSENSORS__LOCATION);
		createEAttribute(ioTSensorsEClass, IO_TSENSORS__READING);

		cryptocurrencyEClass = createEClass(CRYPTOCURRENCY);
		createEAttribute(cryptocurrencyEClass, CRYPTOCURRENCY__CURRENCY_ID);
		createEAttribute(cryptocurrencyEClass, CRYPTOCURRENCY__NAME);
		createEAttribute(cryptocurrencyEClass, CRYPTOCURRENCY__AMOUNT);

		inventoryEClass = createEClass(INVENTORY);
		createEAttribute(inventoryEClass, INVENTORY__QUANTITY);
		createEAttribute(inventoryEClass, INVENTORY__LOCATION);

		transportationNotesEClass = createEClass(TRANSPORTATION_NOTES);
		createEAttribute(transportationNotesEClass, TRANSPORTATION_NOTES__NOTE_ID);
		createEAttribute(transportationNotesEClass, TRANSPORTATION_NOTES__CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(offerEClass, Offer.class, "Offer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffer_Type(), ecorePackage.getEString(), "type", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_Price(), ecorePackage.getEDouble(), "price", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_Quantity(), ecorePackage.getEDouble(), "quantity", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffer_OfferId(), ecorePackage.getEBigInteger(), "offerId", null, 0, 1, Offer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOffer__CreateOffer(), ecorePackage.getEString(), "createOffer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOffer__AcceptOffer(), ecorePackage.getEString(), "acceptOffer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paymentSettlementsConditionsEClass, PaymentSettlementsConditions.class, "PaymentSettlementsConditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentSettlementsConditions_Type(), ecorePackage.getEString(), "type", null, 0, 1, PaymentSettlementsConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentSettlementsConditions_Conditions(), ecorePackage.getEString(), "conditions", null, 0, 1, PaymentSettlementsConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentSettlementsConditions_PaymentConditions(), ecorePackage.getEString(), "paymentConditions", null, 0, 1, PaymentSettlementsConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPaymentSettlementsConditions_TriggersPayment(), this.getInvoice(), null, "triggersPayment", null, 0, 1, PaymentSettlementsConditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPaymentSettlementsConditions__StoreConditions(), ecorePackage.getEString(), "storeConditions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPaymentSettlementsConditions__ConfirmConditions(), ecorePackage.getEString(), "confirmConditions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productListEClass, ProductList.class, "ProductList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductList_Type(), ecorePackage.getEString(), "type", null, 0, 1, ProductList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductList_ProductName(), ecorePackage.getEString(), "productName", null, 0, 1, ProductList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProductList__AddProduct(), ecorePackage.getEString(), "addProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productOrderEClass, ProductOrder.class, "ProductOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductOrder_Type(), ecorePackage.getEString(), "type", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_OrderId(), ecorePackage.getEString(), "orderId", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_Quantity(), ecorePackage.getEBigInteger(), "quantity", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductOrder_OrderDate(), ecorePackage.getEDate(), "orderDate", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOrder_OrderProductList(), this.getProductList(), null, "orderProductList", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductOrder_CreatedFrom(), this.getOffer(), null, "createdFrom", null, 0, 1, ProductOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProductOrder__StoreOrder(), ecorePackage.getEString(), "storeOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProductOrder__AcceptOrder(), ecorePackage.getEString(), "acceptOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentOrderEClass, ShipmentOrder.class, "ShipmentOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentOrder_Type(), ecorePackage.getEString(), "type", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentOrder_Time_interval(), ecorePackage.getEString(), "time_interval", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentOrder_ShipmentId(), ecorePackage.getEInt(), "shipmentId", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipmentOrder_Status(), ecorePackage.getEString(), "status", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentOrder_ProductOrder(), this.getProductOrder(), null, "productOrder", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentOrder_Invoice(), this.getInvoice(), null, "invoice", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentOrder_Emissions(), this.getCO2(), null, "emissions", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentOrder_Certificate(), this.getSupplierCertificates(), null, "certificate", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentOrder_Origin(), this.getProductOrigin(), null, "origin", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentOrder_IotData(), this.getIoTDataStreams(), null, "iotData", null, 0, 1, ShipmentOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getShipmentOrder__UpdateShipmentData(), ecorePackage.getEString(), "updateShipmentData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getShipmentOrder__VerifyShipmentStatus(), ecorePackage.getEString(), "verifyShipmentStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getShipmentOrder__VerifyOnTimeDelivery(), ecorePackage.getEString(), "verifyOnTimeDelivery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(shipmentPlanningEClass, ShipmentPlanning.class, "ShipmentPlanning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipmentPlanning_PlanId(), ecorePackage.getEString(), "planId", null, 0, 1, ShipmentPlanning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipmentPlanning_RequiresPlanning(), this.getProductOrder(), null, "requiresPlanning", null, 0, 1, ShipmentPlanning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getShipmentPlanning__StoreOrder(), ecorePackage.getEString(), "storeOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(invoiceEClass, Invoice.class, "Invoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoice_ProductType(), ecorePackage.getEString(), "productType", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_ShipmentOrder(), ecorePackage.getEString(), "shipmentOrder", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_InvoiceId(), ecorePackage.getEString(), "invoiceId", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_TotalAmount(), ecorePackage.getEDouble(), "totalAmount", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoice_InProductOrder(), this.getProductOrder(), null, "inProductOrder", null, 0, 1, Invoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInvoice__CreateInvoice(), ecorePackage.getEString(), "createInvoice", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInvoice__VerifyBreakDownCost(), ecorePackage.getEString(), "verifyBreakDownCost", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deliveryConfirmationEClass, DeliveryConfirmation.class, "DeliveryConfirmation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliveryConfirmation_ConfirmationId(), ecorePackage.getEString(), "confirmationId", null, 0, 1, DeliveryConfirmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryConfirmation_DeliveryDate(), ecorePackage.getEDate(), "deliveryDate", null, 0, 1, DeliveryConfirmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeliveryConfirmation_RequiresShipment(), this.getShipmentOrder(), null, "requiresShipment", null, 0, 1, DeliveryConfirmation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeliveryConfirmation__TransferProductOwnership(), ecorePackage.getEString(), "transferProductOwnership", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeliveryConfirmation__ConfirmProduct(), ecorePackage.getEString(), "confirmProduct", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeliveryConfirmation__VerifyOrderFulfillment(), ecorePackage.getEString(), "verifyOrderFulfillment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeliveryConfirmation__VerifyProductAuthenticity(), ecorePackage.getEString(), "verifyProductAuthenticity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeliveryConfirmation__VerifyProductQuality(), ecorePackage.getEString(), "verifyProductQuality", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(co2EClass, supplychain.CO2.class, "CO2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCO2_EmissionAmount(), ecorePackage.getEDouble(), "emissionAmount", null, 0, 1, supplychain.CO2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplierCertificatesEClass, SupplierCertificates.class, "SupplierCertificates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplierCertificates_CertificateId(), ecorePackage.getEString(), "certificateId", null, 0, 1, SupplierCertificates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierCertificates_IssuingDate(), ecorePackage.getEDate(), "issuingDate", null, 0, 1, SupplierCertificates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplierCertificates_ExpiryDate(), ecorePackage.getEDate(), "expiryDate", null, 0, 1, SupplierCertificates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialReuseEClass, MaterialReuse.class, "MaterialReuse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterialReuse_RecycledMaterialPercentage(), ecorePackage.getEDouble(), "recycledMaterialPercentage", null, 0, 1, MaterialReuse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawMaterialsSourceEClass, RawMaterialsSource.class, "RawMaterialsSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRawMaterialsSource_SourceLocation(), ecorePackage.getEString(), "sourceLocation", null, 0, 1, RawMaterialsSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productHistoryEClass, ProductHistory.class, "ProductHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductHistory_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, ProductHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductHistory_Event(), ecorePackage.getEString(), "event", null, 0, 1, ProductHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productOriginEClass, ProductOrigin.class, "ProductOrigin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductOrigin_OriginLocation(), ecorePackage.getEString(), "originLocation", null, 0, 1, ProductOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suppliersEClass, Suppliers.class, "Suppliers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuppliers_SupplierId(), ecorePackage.getEString(), "supplierId", null, 0, 1, Suppliers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuppliers_SupplierName(), ecorePackage.getEString(), "supplierName", null, 0, 1, Suppliers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_PaymentId(), ecorePackage.getEString(), "paymentId", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPayment__Pay(), ecorePackage.getEString(), "pay", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPayment__VerifyPaymentStatus(), ecorePackage.getEString(), "verifyPaymentStatus", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ioTDataStreamsEClass, IoTDataStreams.class, "IoTDataStreams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIoTDataStreams_StreamId(), ecorePackage.getEString(), "streamId", null, 0, 1, IoTDataStreams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIoTDataStreams_Data(), ecorePackage.getEString(), "data", null, 0, 1, IoTDataStreams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIoTDataStreams_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, IoTDataStreams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonFungibleTokenEClass, NonFungibleToken.class, "NonFungibleToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonFungibleToken_TokenId(), ecorePackage.getEString(), "tokenId", null, 0, 1, NonFungibleToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonFungibleToken_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, NonFungibleToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonFungibleToken_Metadata(), ecorePackage.getEString(), "metadata", null, 0, 1, NonFungibleToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioTSensorsEClass, IoTSensors.class, "IoTSensors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIoTSensors_SensorId(), ecorePackage.getEString(), "sensorId", null, 0, 1, IoTSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIoTSensors_SensorType(), ecorePackage.getEString(), "sensorType", null, 0, 1, IoTSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIoTSensors_Location(), ecorePackage.getEString(), "location", null, 0, 1, IoTSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIoTSensors_Reading(), ecorePackage.getEDouble(), "reading", null, 0, 1, IoTSensors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cryptocurrencyEClass, Cryptocurrency.class, "Cryptocurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCryptocurrency_CurrencyId(), ecorePackage.getEString(), "currencyId", null, 0, 1, Cryptocurrency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCryptocurrency_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cryptocurrency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCryptocurrency_Amount(), ecorePackage.getEDouble(), "amount", null, 0, 1, Cryptocurrency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventory_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_Location(), ecorePackage.getEString(), "location", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportationNotesEClass, TransportationNotes.class, "TransportationNotes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransportationNotes_NoteId(), ecorePackage.getEString(), "noteId", null, 0, 1, TransportationNotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransportationNotes_Content(), ecorePackage.getEString(), "content", null, 0, 1, TransportationNotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SupplychainPackageImpl
