/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Materials Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.RawMaterialsSource#getSourceLocation <em>Source Location</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getRawMaterialsSource()
 * @model
 * @generated
 */
public interface RawMaterialsSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Location</em>' attribute.
	 * @see #setSourceLocation(String)
	 * @see supplychain.SupplychainPackage#getRawMaterialsSource_SourceLocation()
	 * @model
	 * @generated
	 */
	String getSourceLocation();

	/**
	 * Sets the value of the '{@link supplychain.RawMaterialsSource#getSourceLocation <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Location</em>' attribute.
	 * @see #getSourceLocation()
	 * @generated
	 */
	void setSourceLocation(String value);

} // RawMaterialsSource
