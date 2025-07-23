/**
 */
package supplychain.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.ProductOrder;
import supplychain.ShipmentPlanning;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Planning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.ShipmentPlanningImpl#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link supplychain.impl.ShipmentPlanningImpl#getRequiresPlanning <em>Requires Planning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentPlanningImpl extends MinimalEObjectImpl.Container implements ShipmentPlanning {
	/**
	 * The default value of the '{@link #getPlanId() <em>Plan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanId()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanId() <em>Plan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanId()
	 * @generated
	 * @ordered
	 */
	protected String planId = PLAN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequiresPlanning() <em>Requires Planning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresPlanning()
	 * @generated
	 * @ordered
	 */
	protected ProductOrder requiresPlanning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentPlanningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.SHIPMENT_PLANNING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlanId() {
		return planId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanId(String newPlanId) {
		String oldPlanId = planId;
		planId = newPlanId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_PLANNING__PLAN_ID, oldPlanId, planId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOrder getRequiresPlanning() {
		if (requiresPlanning != null && requiresPlanning.eIsProxy()) {
			InternalEObject oldRequiresPlanning = (InternalEObject)requiresPlanning;
			requiresPlanning = (ProductOrder)eResolveProxy(oldRequiresPlanning);
			if (requiresPlanning != oldRequiresPlanning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SupplychainPackage.SHIPMENT_PLANNING__REQUIRES_PLANNING, oldRequiresPlanning, requiresPlanning));
			}
		}
		return requiresPlanning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductOrder basicGetRequiresPlanning() {
		return requiresPlanning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresPlanning(ProductOrder newRequiresPlanning) {
		ProductOrder oldRequiresPlanning = requiresPlanning;
		requiresPlanning = newRequiresPlanning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.SHIPMENT_PLANNING__REQUIRES_PLANNING, oldRequiresPlanning, requiresPlanning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String storeOrder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplychainPackage.SHIPMENT_PLANNING__PLAN_ID:
				return getPlanId();
			case SupplychainPackage.SHIPMENT_PLANNING__REQUIRES_PLANNING:
				if (resolve) return getRequiresPlanning();
				return basicGetRequiresPlanning();
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
			case SupplychainPackage.SHIPMENT_PLANNING__PLAN_ID:
				setPlanId((String)newValue);
				return;
			case SupplychainPackage.SHIPMENT_PLANNING__REQUIRES_PLANNING:
				setRequiresPlanning((ProductOrder)newValue);
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
			case SupplychainPackage.SHIPMENT_PLANNING__PLAN_ID:
				setPlanId(PLAN_ID_EDEFAULT);
				return;
			case SupplychainPackage.SHIPMENT_PLANNING__REQUIRES_PLANNING:
				setRequiresPlanning((ProductOrder)null);
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
			case SupplychainPackage.SHIPMENT_PLANNING__PLAN_ID:
				return PLAN_ID_EDEFAULT == null ? planId != null : !PLAN_ID_EDEFAULT.equals(planId);
			case SupplychainPackage.SHIPMENT_PLANNING__REQUIRES_PLANNING:
				return requiresPlanning != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SupplychainPackage.SHIPMENT_PLANNING___STORE_ORDER:
				return storeOrder();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (planId: ");
		result.append(planId);
		result.append(')');
		return result.toString();
	}

} //ShipmentPlanningImpl
