/**
 */
package supplychain;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Certificates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.SupplierCertificates#getCertificateId <em>Certificate Id</em>}</li>
 *   <li>{@link supplychain.SupplierCertificates#getIssuingDate <em>Issuing Date</em>}</li>
 *   <li>{@link supplychain.SupplierCertificates#getExpiryDate <em>Expiry Date</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getSupplierCertificates()
 * @model
 * @generated
 */
public interface SupplierCertificates extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Id</em>' attribute.
	 * @see #setCertificateId(String)
	 * @see supplychain.SupplychainPackage#getSupplierCertificates_CertificateId()
	 * @model
	 * @generated
	 */
	String getCertificateId();

	/**
	 * Sets the value of the '{@link supplychain.SupplierCertificates#getCertificateId <em>Certificate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Id</em>' attribute.
	 * @see #getCertificateId()
	 * @generated
	 */
	void setCertificateId(String value);

	/**
	 * Returns the value of the '<em><b>Issuing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuing Date</em>' attribute.
	 * @see #setIssuingDate(Date)
	 * @see supplychain.SupplychainPackage#getSupplierCertificates_IssuingDate()
	 * @model
	 * @generated
	 */
	Date getIssuingDate();

	/**
	 * Sets the value of the '{@link supplychain.SupplierCertificates#getIssuingDate <em>Issuing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuing Date</em>' attribute.
	 * @see #getIssuingDate()
	 * @generated
	 */
	void setIssuingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(Date)
	 * @see supplychain.SupplychainPackage#getSupplierCertificates_ExpiryDate()
	 * @model
	 * @generated
	 */
	Date getExpiryDate();

	/**
	 * Sets the value of the '{@link supplychain.SupplierCertificates#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(Date value);

} // SupplierCertificates
