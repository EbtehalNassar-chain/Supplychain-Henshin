/**
 */
package supplychain.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import supplychain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see supplychain.SupplychainPackage
 * @generated
 */
public class SupplychainSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SupplychainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplychainSwitch() {
		if (modelPackage == null) {
			modelPackage = SupplychainPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SupplychainPackage.OFFER: {
				Offer offer = (Offer)theEObject;
				T result = caseOffer(offer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.PAYMENT_SETTLEMENTS_CONDITIONS: {
				PaymentSettlementsConditions paymentSettlementsConditions = (PaymentSettlementsConditions)theEObject;
				T result = casePaymentSettlementsConditions(paymentSettlementsConditions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.PRODUCT_LIST: {
				ProductList productList = (ProductList)theEObject;
				T result = caseProductList(productList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.PRODUCT_ORDER: {
				ProductOrder productOrder = (ProductOrder)theEObject;
				T result = caseProductOrder(productOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.SHIPMENT_ORDER: {
				ShipmentOrder shipmentOrder = (ShipmentOrder)theEObject;
				T result = caseShipmentOrder(shipmentOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.SHIPMENT_PLANNING: {
				ShipmentPlanning shipmentPlanning = (ShipmentPlanning)theEObject;
				T result = caseShipmentPlanning(shipmentPlanning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.INVOICE: {
				Invoice invoice = (Invoice)theEObject;
				T result = caseInvoice(invoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.DELIVERY_CONFIRMATION: {
				DeliveryConfirmation deliveryConfirmation = (DeliveryConfirmation)theEObject;
				T result = caseDeliveryConfirmation(deliveryConfirmation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.CO2: {
				CO2 co2 = (CO2)theEObject;
				T result = caseCO2(co2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.SUPPLIER_CERTIFICATES: {
				SupplierCertificates supplierCertificates = (SupplierCertificates)theEObject;
				T result = caseSupplierCertificates(supplierCertificates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.MATERIAL_REUSE: {
				MaterialReuse materialReuse = (MaterialReuse)theEObject;
				T result = caseMaterialReuse(materialReuse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.RAW_MATERIALS_SOURCE: {
				RawMaterialsSource rawMaterialsSource = (RawMaterialsSource)theEObject;
				T result = caseRawMaterialsSource(rawMaterialsSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.PRODUCT_HISTORY: {
				ProductHistory productHistory = (ProductHistory)theEObject;
				T result = caseProductHistory(productHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.PRODUCT_ORIGIN: {
				ProductOrigin productOrigin = (ProductOrigin)theEObject;
				T result = caseProductOrigin(productOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.SUPPLIERS: {
				Suppliers suppliers = (Suppliers)theEObject;
				T result = caseSuppliers(suppliers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.PAYMENT: {
				Payment payment = (Payment)theEObject;
				T result = casePayment(payment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.IO_TDATA_STREAMS: {
				IoTDataStreams ioTDataStreams = (IoTDataStreams)theEObject;
				T result = caseIoTDataStreams(ioTDataStreams);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.NON_FUNGIBLE_TOKEN: {
				NonFungibleToken nonFungibleToken = (NonFungibleToken)theEObject;
				T result = caseNonFungibleToken(nonFungibleToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.IO_TSENSORS: {
				IoTSensors ioTSensors = (IoTSensors)theEObject;
				T result = caseIoTSensors(ioTSensors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.CRYPTOCURRENCY: {
				Cryptocurrency cryptocurrency = (Cryptocurrency)theEObject;
				T result = caseCryptocurrency(cryptocurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.INVENTORY: {
				Inventory inventory = (Inventory)theEObject;
				T result = caseInventory(inventory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SupplychainPackage.TRANSPORTATION_NOTES: {
				TransportationNotes transportationNotes = (TransportationNotes)theEObject;
				T result = caseTransportationNotes(transportationNotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffer(Offer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment Settlements Conditions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment Settlements Conditions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaymentSettlementsConditions(PaymentSettlementsConditions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductList(ProductList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductOrder(ProductOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentOrder(ShipmentOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shipment Planning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shipment Planning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShipmentPlanning(ShipmentPlanning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoice(Invoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delivery Confirmation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delivery Confirmation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeliveryConfirmation(DeliveryConfirmation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CO2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CO2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCO2(CO2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier Certificates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier Certificates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplierCertificates(SupplierCertificates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material Reuse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material Reuse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterialReuse(MaterialReuse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Materials Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Materials Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawMaterialsSource(RawMaterialsSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductHistory(ProductHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductOrigin(ProductOrigin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suppliers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suppliers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuppliers(Suppliers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayment(Payment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TData Streams</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TData Streams</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTDataStreams(IoTDataStreams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Fungible Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Fungible Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonFungibleToken(NonFungibleToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Io TSensors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Io TSensors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIoTSensors(IoTSensors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cryptocurrency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cryptocurrency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCryptocurrency(Cryptocurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventory(Inventory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Notes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Notes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationNotes(TransportationNotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SupplychainSwitch
