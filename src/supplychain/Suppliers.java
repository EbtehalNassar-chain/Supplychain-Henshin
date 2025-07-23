/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suppliers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.Suppliers#getSupplierId <em>Supplier Id</em>}</li>
 *   <li>{@link supplychain.Suppliers#getSupplierName <em>Supplier Name</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getSuppliers()
 * @model
 * @generated
 */
public interface Suppliers extends EObject {
	/**
	 * Returns the value of the '<em><b>Supplier Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Id</em>' attribute.
	 * @see #setSupplierId(String)
	 * @see supplychain.SupplychainPackage#getSuppliers_SupplierId()
	 * @model
	 * @generated
	 */
	String getSupplierId();

	/**
	 * Sets the value of the '{@link supplychain.Suppliers#getSupplierId <em>Supplier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Id</em>' attribute.
	 * @see #getSupplierId()
	 * @generated
	 */
	void setSupplierId(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Name</em>' attribute.
	 * @see #setSupplierName(String)
	 * @see supplychain.SupplychainPackage#getSuppliers_SupplierName()
	 * @model
	 * @generated
	 */
	String getSupplierName();

	/**
	 * Sets the value of the '{@link supplychain.Suppliers#getSupplierName <em>Supplier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Name</em>' attribute.
	 * @see #getSupplierName()
	 * @generated
	 */
	void setSupplierName(String value);

} // Suppliers
