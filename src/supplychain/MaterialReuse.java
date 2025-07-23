/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Reuse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.MaterialReuse#getRecycledMaterialPercentage <em>Recycled Material Percentage</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getMaterialReuse()
 * @model
 * @generated
 */
public interface MaterialReuse extends EObject {
	/**
	 * Returns the value of the '<em><b>Recycled Material Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recycled Material Percentage</em>' attribute.
	 * @see #setRecycledMaterialPercentage(double)
	 * @see supplychain.SupplychainPackage#getMaterialReuse_RecycledMaterialPercentage()
	 * @model
	 * @generated
	 */
	double getRecycledMaterialPercentage();

	/**
	 * Sets the value of the '{@link supplychain.MaterialReuse#getRecycledMaterialPercentage <em>Recycled Material Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recycled Material Percentage</em>' attribute.
	 * @see #getRecycledMaterialPercentage()
	 * @generated
	 */
	void setRecycledMaterialPercentage(double value);

} // MaterialReuse
