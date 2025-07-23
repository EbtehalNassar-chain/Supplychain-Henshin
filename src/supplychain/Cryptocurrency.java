/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cryptocurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.Cryptocurrency#getCurrencyId <em>Currency Id</em>}</li>
 *   <li>{@link supplychain.Cryptocurrency#getName <em>Name</em>}</li>
 *   <li>{@link supplychain.Cryptocurrency#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getCryptocurrency()
 * @model
 * @generated
 */
public interface Cryptocurrency extends EObject {
	/**
	 * Returns the value of the '<em><b>Currency Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Id</em>' attribute.
	 * @see #setCurrencyId(String)
	 * @see supplychain.SupplychainPackage#getCryptocurrency_CurrencyId()
	 * @model
	 * @generated
	 */
	String getCurrencyId();

	/**
	 * Sets the value of the '{@link supplychain.Cryptocurrency#getCurrencyId <em>Currency Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Id</em>' attribute.
	 * @see #getCurrencyId()
	 * @generated
	 */
	void setCurrencyId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see supplychain.SupplychainPackage#getCryptocurrency_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link supplychain.Cryptocurrency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see supplychain.SupplychainPackage#getCryptocurrency_Amount()
	 * @model
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link supplychain.Cryptocurrency#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

} // Cryptocurrency
