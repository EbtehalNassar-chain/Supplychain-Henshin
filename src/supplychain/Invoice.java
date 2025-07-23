/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.Invoice#getProductType <em>Product Type</em>}</li>
 *   <li>{@link supplychain.Invoice#getShipmentOrder <em>Shipment Order</em>}</li>
 *   <li>{@link supplychain.Invoice#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link supplychain.Invoice#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link supplychain.Invoice#getInProductOrder <em>In Product Order</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getInvoice()
 * @model
 * @generated
 */
public interface Invoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type</em>' attribute.
	 * @see #setProductType(String)
	 * @see supplychain.SupplychainPackage#getInvoice_ProductType()
	 * @model
	 * @generated
	 */
	String getProductType();

	/**
	 * Sets the value of the '{@link supplychain.Invoice#getProductType <em>Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type</em>' attribute.
	 * @see #getProductType()
	 * @generated
	 */
	void setProductType(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Order</em>' attribute.
	 * @see #setShipmentOrder(String)
	 * @see supplychain.SupplychainPackage#getInvoice_ShipmentOrder()
	 * @model
	 * @generated
	 */
	String getShipmentOrder();

	/**
	 * Sets the value of the '{@link supplychain.Invoice#getShipmentOrder <em>Shipment Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Order</em>' attribute.
	 * @see #getShipmentOrder()
	 * @generated
	 */
	void setShipmentOrder(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see supplychain.SupplychainPackage#getInvoice_InvoiceId()
	 * @model
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link supplychain.Invoice#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(double)
	 * @see supplychain.SupplychainPackage#getInvoice_TotalAmount()
	 * @model
	 * @generated
	 */
	double getTotalAmount();

	/**
	 * Sets the value of the '{@link supplychain.Invoice#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(double value);

	/**
	 * Returns the value of the '<em><b>In Product Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Product Order</em>' containment reference.
	 * @see #setInProductOrder(ProductOrder)
	 * @see supplychain.SupplychainPackage#getInvoice_InProductOrder()
	 * @model containment="true"
	 * @generated
	 */
	ProductOrder getInProductOrder();

	/**
	 * Sets the value of the '{@link supplychain.Invoice#getInProductOrder <em>In Product Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Product Order</em>' containment reference.
	 * @see #getInProductOrder()
	 * @generated
	 */
	void setInProductOrder(ProductOrder value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String createInvoice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String verifyBreakDownCost();

} // Invoice
