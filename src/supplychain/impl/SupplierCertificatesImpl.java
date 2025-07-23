/**
 */
package supplychain.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.SupplierCertificates;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Certificates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.SupplierCertificatesImpl#getCertificateId <em>Certificate Id</em>}</li>
 *   <li>{@link supplychain.impl.SupplierCertificatesImpl#getIssuingDate <em>Issuing Date</em>}</li>
 *   <li>{@link supplychain.impl.SupplierCertificatesImpl#getExpiryDate <em>Expiry Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierCertificatesImpl extends MinimalEObjectImpl.Container implements SupplierCertificates {
	/**
	 * The default value of the '{@link #getCertificateId() <em>Certificate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateId()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateId() <em>Certificate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateId()
	 * @generated
	 * @ordered
	 */
	protected String certificateId = CERTIFICATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssuingDate() <em>Issuing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUING_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssuingDate() <em>Issuing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuingDate()
	 * @generated
	 * @ordered
	 */
	protected Date issuingDate = ISSUING_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected Date expiryDate = EXPIRY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierCertificatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.SUPPLIER_CERTIFICATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateId() {
		return certificateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateId(String newCertificateId) {
		String oldCertificateId = certificateId;
		certificateId = newCertificateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SUPPLIER_CERTIFICATES__CERTIFICATE_ID, oldCertificateId, certificateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIssuingDate() {
		return issuingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuingDate(Date newIssuingDate) {
		Date oldIssuingDate = issuingDate;
		issuingDate = newIssuingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SUPPLIER_CERTIFICATES__ISSUING_DATE, oldIssuingDate, issuingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiryDate(Date newExpiryDate) {
		Date oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SUPPLIER_CERTIFICATES__EXPIRY_DATE, oldExpiryDate, expiryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplychainPackage.SUPPLIER_CERTIFICATES__CERTIFICATE_ID:
				return getCertificateId();
			case SupplychainPackage.SUPPLIER_CERTIFICATES__ISSUING_DATE:
				return getIssuingDate();
			case SupplychainPackage.SUPPLIER_CERTIFICATES__EXPIRY_DATE:
				return getExpiryDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SupplychainPackage.SUPPLIER_CERTIFICATES__CERTIFICATE_ID:
				setCertificateId((String)newValue);
				return;
			case SupplychainPackage.SUPPLIER_CERTIFICATES__ISSUING_DATE:
				setIssuingDate((Date)newValue);
				return;
			case SupplychainPackage.SUPPLIER_CERTIFICATES__EXPIRY_DATE:
				setExpiryDate((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SupplychainPackage.SUPPLIER_CERTIFICATES__CERTIFICATE_ID:
				setCertificateId(CERTIFICATE_ID_EDEFAULT);
				return;
			case SupplychainPackage.SUPPLIER_CERTIFICATES__ISSUING_DATE:
				setIssuingDate(ISSUING_DATE_EDEFAULT);
				return;
			case SupplychainPackage.SUPPLIER_CERTIFICATES__EXPIRY_DATE:
				setExpiryDate(EXPIRY_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SupplychainPackage.SUPPLIER_CERTIFICATES__CERTIFICATE_ID:
				return CERTIFICATE_ID_EDEFAULT == null ? certificateId != null : !CERTIFICATE_ID_EDEFAULT.equals(certificateId);
			case SupplychainPackage.SUPPLIER_CERTIFICATES__ISSUING_DATE:
				return ISSUING_DATE_EDEFAULT == null ? issuingDate != null : !ISSUING_DATE_EDEFAULT.equals(issuingDate);
			case SupplychainPackage.SUPPLIER_CERTIFICATES__EXPIRY_DATE:
				return EXPIRY_DATE_EDEFAULT == null ? expiryDate != null : !EXPIRY_DATE_EDEFAULT.equals(expiryDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (certificateId: ");
		result.append(certificateId);
		result.append(", issuingDate: ");
		result.append(issuingDate);
		result.append(", expiryDate: ");
		result.append(expiryDate);
		result.append(')');
		return result.toString();
	}

} //SupplierCertificatesImpl
