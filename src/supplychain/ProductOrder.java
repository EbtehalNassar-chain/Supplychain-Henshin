/**
 */
package supplychain;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.ProductOrder#getType <em>Type</em>}</li>
 *   <li>{@link supplychain.ProductOrder#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link supplychain.ProductOrder#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link supplychain.ProductOrder#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link supplychain.ProductOrder#getOrderProductList <em>Order Product List</em>}</li>
 *   <li>{@link supplychain.ProductOrder#getCreatedFrom <em>Created From</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getProductOrder()
 * @model
 * @generated
 */
public interface ProductOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see supplychain.SupplychainPackage#getProductOrder_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link supplychain.ProductOrder#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see supplychain.SupplychainPackage#getProductOrder_OrderId()
	 * @model
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link supplychain.ProductOrder#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigInteger)
	 * @see supplychain.SupplychainPackage#getProductOrder_Quantity()
	 * @model
	 * @generated
	 */
	BigInteger getQuantity();

	/**
	 * Sets the value of the '{@link supplychain.ProductOrder#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(Date)
	 * @see supplychain.SupplychainPackage#getProductOrder_OrderDate()
	 * @model
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link supplychain.ProductOrder#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order Product List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Product List</em>' reference.
	 * @see #setOrderProductList(ProductList)
	 * @see supplychain.SupplychainPackage#getProductOrder_OrderProductList()
	 * @model
	 * @generated
	 */
	ProductList getOrderProductList();

	/**
	 * Sets the value of the '{@link supplychain.ProductOrder#getOrderProductList <em>Order Product List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Product List</em>' reference.
	 * @see #getOrderProductList()
	 * @generated
	 */
	void setOrderProductList(ProductList value);

	/**
	 * Returns the value of the '<em><b>Created From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created From</em>' reference.
	 * @see #setCreatedFrom(Offer)
	 * @see supplychain.SupplychainPackage#getProductOrder_CreatedFrom()
	 * @model
	 * @generated
	 */
	Offer getCreatedFrom();

	/**
	 * Sets the value of the '{@link supplychain.ProductOrder#getCreatedFrom <em>Created From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created From</em>' reference.
	 * @see #getCreatedFrom()
	 * @generated
	 */
	void setCreatedFrom(Offer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String storeOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String acceptOrder();

} // ProductOrder
