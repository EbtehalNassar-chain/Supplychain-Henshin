/**
 */
package supplychain.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.MaterialReuse;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Reuse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.MaterialReuseImpl#getRecycledMaterialPercentage <em>Recycled Material Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialReuseImpl extends MinimalEObjectImpl.Container implements MaterialReuse {
	/**
	 * The default value of the '{@link #getRecycledMaterialPercentage() <em>Recycled Material Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecycledMaterialPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double RECYCLED_MATERIAL_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRecycledMaterialPercentage() <em>Recycled Material Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecycledMaterialPercentage()
	 * @generated
	 * @ordered
	 */
	protected double recycledMaterialPercentage = RECYCLED_MATERIAL_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialReuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.MATERIAL_REUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRecycledMaterialPercentage() {
		return recycledMaterialPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecycledMaterialPercentage(double newRecycledMaterialPercentage) {
		double oldRecycledMaterialPercentage = recycledMaterialPercentage;
		recycledMaterialPercentage = newRecycledMaterialPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE, oldRecycledMaterialPercentage, recycledMaterialPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplychainPackage.MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE:
				return getRecycledMaterialPercentage();
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
			case SupplychainPackage.MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE:
				setRecycledMaterialPercentage((Double)newValue);
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
			case SupplychainPackage.MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE:
				setRecycledMaterialPercentage(RECYCLED_MATERIAL_PERCENTAGE_EDEFAULT);
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
			case SupplychainPackage.MATERIAL_REUSE__RECYCLED_MATERIAL_PERCENTAGE:
				return recycledMaterialPercentage != RECYCLED_MATERIAL_PERCENTAGE_EDEFAULT;
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
		result.append(" (recycledMaterialPercentage: ");
		result.append(recycledMaterialPercentage);
		result.append(')');
		return result.toString();
	}

} //MaterialReuseImpl
