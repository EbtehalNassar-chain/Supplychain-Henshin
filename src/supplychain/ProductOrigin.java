/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.ProductOrigin#getOriginLocation <em>Origin Location</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getProductOrigin()
 * @model
 * @generated
 */
public interface ProductOrigin extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Location</em>' attribute.
	 * @see #setOriginLocation(String)
	 * @see supplychain.SupplychainPackage#getProductOrigin_OriginLocation()
	 * @model
	 * @generated
	 */
	String getOriginLocation();

	/**
	 * Sets the value of the '{@link supplychain.ProductOrigin#getOriginLocation <em>Origin Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Location</em>' attribute.
	 * @see #getOriginLocation()
	 * @generated
	 */
	void setOriginLocation(String value);

} // ProductOrigin
