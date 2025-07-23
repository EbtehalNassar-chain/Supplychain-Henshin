/**
 */
package supplychain.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import supplychain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see supplychain.SupplychainPackage
 * @generated
 */
public class SupplychainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SupplychainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplychainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SupplychainPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplychainSwitch<Adapter> modelSwitch =
		new SupplychainSwitch<Adapter>() {
			@Override
			public Adapter caseOffer(Offer object) {
				return createOfferAdapter();
			}
			@Override
			public Adapter casePaymentSettlementsConditions(PaymentSettlementsConditions object) {
				return createPaymentSettlementsConditionsAdapter();
			}
			@Override
			public Adapter caseProductList(ProductList object) {
				return createProductListAdapter();
			}
			@Override
			public Adapter caseProductOrder(ProductOrder object) {
				return createProductOrderAdapter();
			}
			@Override
			public Adapter caseShipmentOrder(ShipmentOrder object) {
				return createShipmentOrderAdapter();
			}
			@Override
			public Adapter caseShipmentPlanning(ShipmentPlanning object) {
				return createShipmentPlanningAdapter();
			}
			@Override
			public Adapter caseInvoice(Invoice object) {
				return createInvoiceAdapter();
			}
			@Override
			public Adapter caseDeliveryConfirmation(DeliveryConfirmation object) {
				return createDeliveryConfirmationAdapter();
			}
			@Override
			public Adapter caseCO2(CO2 object) {
				return createCO2Adapter();
			}
			@Override
			public Adapter caseSupplierCertificates(SupplierCertificates object) {
				return createSupplierCertificatesAdapter();
			}
			@Override
			public Adapter caseMaterialReuse(MaterialReuse object) {
				return createMaterialReuseAdapter();
			}
			@Override
			public Adapter caseRawMaterialsSource(RawMaterialsSource object) {
				return createRawMaterialsSourceAdapter();
			}
			@Override
			public Adapter caseProductHistory(ProductHistory object) {
				return createProductHistoryAdapter();
			}
			@Override
			public Adapter caseProductOrigin(ProductOrigin object) {
				return createProductOriginAdapter();
			}
			@Override
			public Adapter caseSuppliers(Suppliers object) {
				return createSuppliersAdapter();
			}
			@Override
			public Adapter casePayment(Payment object) {
				return createPaymentAdapter();
			}
			@Override
			public Adapter caseIoTDataStreams(IoTDataStreams object) {
				return createIoTDataStreamsAdapter();
			}
			@Override
			public Adapter caseNonFungibleToken(NonFungibleToken object) {
				return createNonFungibleTokenAdapter();
			}
			@Override
			public Adapter caseIoTSensors(IoTSensors object) {
				return createIoTSensorsAdapter();
			}
			@Override
			public Adapter caseCryptocurrency(Cryptocurrency object) {
				return createCryptocurrencyAdapter();
			}
			@Override
			public Adapter caseInventory(Inventory object) {
				return createInventoryAdapter();
			}
			@Override
			public Adapter caseTransportationNotes(TransportationNotes object) {
				return createTransportationNotesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link supplychain.Offer <em>Offer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.Offer
	 * @generated
	 */
	public Adapter createOfferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.PaymentSettlementsConditions <em>Payment Settlements Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.PaymentSettlementsConditions
	 * @generated
	 */
	public Adapter createPaymentSettlementsConditionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.ProductList <em>Product List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.ProductList
	 * @generated
	 */
	public Adapter createProductListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.ProductOrder <em>Product Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.ProductOrder
	 * @generated
	 */
	public Adapter createProductOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.ShipmentOrder <em>Shipment Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.ShipmentOrder
	 * @generated
	 */
	public Adapter createShipmentOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.ShipmentPlanning <em>Shipment Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.ShipmentPlanning
	 * @generated
	 */
	public Adapter createShipmentPlanningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.Invoice
	 * @generated
	 */
	public Adapter createInvoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.DeliveryConfirmation <em>Delivery Confirmation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.DeliveryConfirmation
	 * @generated
	 */
	public Adapter createDeliveryConfirmationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.CO2 <em>CO2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.CO2
	 * @generated
	 */
	public Adapter createCO2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.SupplierCertificates <em>Supplier Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.SupplierCertificates
	 * @generated
	 */
	public Adapter createSupplierCertificatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.MaterialReuse <em>Material Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.MaterialReuse
	 * @generated
	 */
	public Adapter createMaterialReuseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.RawMaterialsSource <em>Raw Materials Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.RawMaterialsSource
	 * @generated
	 */
	public Adapter createRawMaterialsSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.ProductHistory <em>Product History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.ProductHistory
	 * @generated
	 */
	public Adapter createProductHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.ProductOrigin <em>Product Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.ProductOrigin
	 * @generated
	 */
	public Adapter createProductOriginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.Suppliers <em>Suppliers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.Suppliers
	 * @generated
	 */
	public Adapter createSuppliersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.Payment
	 * @generated
	 */
	public Adapter createPaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.IoTDataStreams <em>Io TData Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.IoTDataStreams
	 * @generated
	 */
	public Adapter createIoTDataStreamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.NonFungibleToken <em>Non Fungible Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.NonFungibleToken
	 * @generated
	 */
	public Adapter createNonFungibleTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.IoTSensors <em>Io TSensors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.IoTSensors
	 * @generated
	 */
	public Adapter createIoTSensorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.Cryptocurrency <em>Cryptocurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.Cryptocurrency
	 * @generated
	 */
	public Adapter createCryptocurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.Inventory
	 * @generated
	 */
	public Adapter createInventoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link supplychain.TransportationNotes <em>Transportation Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see supplychain.TransportationNotes
	 * @generated
	 */
	public Adapter createTransportationNotesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SupplychainAdapterFactory
