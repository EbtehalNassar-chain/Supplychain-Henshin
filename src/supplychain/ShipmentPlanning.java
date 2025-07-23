/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Planning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.ShipmentPlanning#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link supplychain.ShipmentPlanning#getRequiresPlanning <em>Requires Planning</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getShipmentPlanning()
 * @model
 * @generated
 */
public interface ShipmentPlanning extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Id</em>' attribute.
	 * @see #setPlanId(String)
	 * @see supplychain.SupplychainPackage#getShipmentPlanning_PlanId()
	 * @model
	 * @generated
	 */
	String getPlanId();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentPlanning#getPlanId <em>Plan Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Id</em>' attribute.
	 * @see #getPlanId()
	 * @generated
	 */
	void setPlanId(String value);

	/**
	 * Returns the value of the '<em><b>Requires Planning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Planning</em>' reference.
	 * @see #setRequiresPlanning(ProductOrder)
	 * @see supplychain.SupplychainPackage#getShipmentPlanning_RequiresPlanning()
	 * @model
	 * @generated
	 */
	ProductOrder getRequiresPlanning();

	/**
	 * Sets the value of the '{@link supplychain.ShipmentPlanning#getRequiresPlanning <em>Requires Planning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Planning</em>' reference.
	 * @see #getRequiresPlanning()
	 * @generated
	 */
	void setRequiresPlanning(ProductOrder value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String storeOrder();

} // ShipmentPlanning
