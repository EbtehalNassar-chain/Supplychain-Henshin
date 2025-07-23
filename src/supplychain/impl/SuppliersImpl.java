/**
 */
package supplychain.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.Suppliers;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suppliers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.SuppliersImpl#getSupplierId <em>Supplier Id</em>}</li>
 *   <li>{@link supplychain.impl.SuppliersImpl#getSupplierName <em>Supplier Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuppliersImpl extends MinimalEObjectImpl.Container implements Suppliers {
	/**
	 * The default value of the '{@link #getSupplierId() <em>Supplier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierId() <em>Supplier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierId()
	 * @generated
	 * @ordered
	 */
	protected String supplierId = SUPPLIER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierName() <em>Supplier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierName() <em>Supplier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierName()
	 * @generated
	 * @ordered
	 */
	protected String supplierName = SUPPLIER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuppliersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.SUPPLIERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierId() {
		return supplierId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierId(String newSupplierId) {
		String oldSupplierId = supplierId;
		supplierId = newSupplierId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SUPPLIERS__SUPPLIER_ID, oldSupplierId, supplierId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierName(String newSupplierName) {
		String oldSupplierName = supplierName;
		supplierName = newSupplierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SUPPLIERS__SUPPLIER_NAME, oldSupplierName, supplierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplychainPackage.SUPPLIERS__SUPPLIER_ID:
				return getSupplierId();
			case SupplychainPackage.SUPPLIERS__SUPPLIER_NAME:
				return getSupplierName();
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
			case SupplychainPackage.SUPPLIERS__SUPPLIER_ID:
				setSupplierId((String)newValue);
				return;
			case SupplychainPackage.SUPPLIERS__SUPPLIER_NAME:
				setSupplierName((String)newValue);
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
			case SupplychainPackage.SUPPLIERS__SUPPLIER_ID:
				setSupplierId(SUPPLIER_ID_EDEFAULT);
				return;
			case SupplychainPackage.SUPPLIERS__SUPPLIER_NAME:
				setSupplierName(SUPPLIER_NAME_EDEFAULT);
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
			case SupplychainPackage.SUPPLIERS__SUPPLIER_ID:
				return SUPPLIER_ID_EDEFAULT == null ? supplierId != null : !SUPPLIER_ID_EDEFAULT.equals(supplierId);
			case SupplychainPackage.SUPPLIERS__SUPPLIER_NAME:
				return SUPPLIER_NAME_EDEFAULT == null ? supplierName != null : !SUPPLIER_NAME_EDEFAULT.equals(supplierName);
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
		result.append(" (supplierId: ");
		result.append(supplierId);
		result.append(", supplierName: ");
		result.append(supplierName);
		result.append(')');
		return result.toString();
	}

} //SuppliersImpl
