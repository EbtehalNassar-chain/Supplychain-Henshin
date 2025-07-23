/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CO2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.CO2#getEmissionAmount <em>Emission Amount</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getCO2()
 * @model
 * @generated
 */
public interface CO2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Emission Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission Amount</em>' attribute.
	 * @see #setEmissionAmount(double)
	 * @see supplychain.SupplychainPackage#getCO2_EmissionAmount()
	 * @model
	 * @generated
	 */
	double getEmissionAmount();

	/**
	 * Sets the value of the '{@link supplychain.CO2#getEmissionAmount <em>Emission Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission Amount</em>' attribute.
	 * @see #getEmissionAmount()
	 * @generated
	 */
	void setEmissionAmount(double value);

} // CO2
