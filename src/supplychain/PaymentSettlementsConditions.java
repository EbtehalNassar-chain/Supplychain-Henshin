/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Settlements Conditions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.PaymentSettlementsConditions#getType <em>Type</em>}</li>
 *   <li>{@link supplychain.PaymentSettlementsConditions#getConditions <em>Conditions</em>}</li>
 *   <li>{@link supplychain.PaymentSettlementsConditions#getPaymentConditions <em>Payment Conditions</em>}</li>
 *   <li>{@link supplychain.PaymentSettlementsConditions#getTriggersPayment <em>Triggers Payment</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getPaymentSettlementsConditions()
 * @model
 * @generated
 */
public interface PaymentSettlementsConditions extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see supplychain.SupplychainPackage#getPaymentSettlementsConditions_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link supplychain.PaymentSettlementsConditions#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' attribute.
	 * @see #setConditions(String)
	 * @see supplychain.SupplychainPackage#getPaymentSettlementsConditions_Conditions()
	 * @model
	 * @generated
	 */
	String getConditions();

	/**
	 * Sets the value of the '{@link supplychain.PaymentSettlementsConditions#getConditions <em>Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' attribute.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(String value);

	/**
	 * Returns the value of the '<em><b>Payment Conditions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Conditions</em>' attribute.
	 * @see #setPaymentConditions(String)
	 * @see supplychain.SupplychainPackage#getPaymentSettlementsConditions_PaymentConditions()
	 * @model
	 * @generated
	 */
	String getPaymentConditions();

	/**
	 * Sets the value of the '{@link supplychain.PaymentSettlementsConditions#getPaymentConditions <em>Payment Conditions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Conditions</em>' attribute.
	 * @see #getPaymentConditions()
	 * @generated
	 */
	void setPaymentConditions(String value);

	/**
	 * Returns the value of the '<em><b>Triggers Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers Payment</em>' reference.
	 * @see #setTriggersPayment(Invoice)
	 * @see supplychain.SupplychainPackage#getPaymentSettlementsConditions_TriggersPayment()
	 * @model
	 * @generated
	 */
	Invoice getTriggersPayment();

	/**
	 * Sets the value of the '{@link supplychain.PaymentSettlementsConditions#getTriggersPayment <em>Triggers Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers Payment</em>' reference.
	 * @see #getTriggersPayment()
	 * @generated
	 */
	void setTriggersPayment(Invoice value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String storeConditions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String confirmConditions();

} // PaymentSettlementsConditions
