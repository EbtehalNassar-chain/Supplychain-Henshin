/**
 */
package supplychain.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.ProductOrigin;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Origin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.ProductOriginImpl#getOriginLocation <em>Origin Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductOriginImpl extends MinimalEObjectImpl.Container implements ProductOrigin {
	/**
	 * The default value of the '{@link #getOriginLocation() <em>Origin Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginLocation() <em>Origin Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginLocation()
	 * @generated
	 * @ordered
	 */
	protected String originLocation = ORIGIN_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductOriginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.PRODUCT_ORIGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginLocation() {
		return originLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginLocation(String newOriginLocation) {
		String oldOriginLocation = originLocation;
		originLocation = newOriginLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.PRODUCT_ORIGIN__ORIGIN_LOCATION, oldOriginLocation, originLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplychainPackage.PRODUCT_ORIGIN__ORIGIN_LOCATION:
				return getOriginLocation();
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
			case SupplychainPackage.PRODUCT_ORIGIN__ORIGIN_LOCATION:
				setOriginLocation((String)newValue);
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
			case SupplychainPackage.PRODUCT_ORIGIN__ORIGIN_LOCATION:
				setOriginLocation(ORIGIN_LOCATION_EDEFAULT);
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
			case SupplychainPackage.PRODUCT_ORIGIN__ORIGIN_LOCATION:
				return ORIGIN_LOCATION_EDEFAULT == null ? originLocation != null : !ORIGIN_LOCATION_EDEFAULT.equals(originLocation);
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
		result.append(" (originLocation: ");
		result.append(originLocation);
		result.append(')');
		return result.toString();
	}

} //ProductOriginImpl
