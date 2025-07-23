/**
 */
package supplychain;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Confirmation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.DeliveryConfirmation#getConfirmationId <em>Confirmation Id</em>}</li>
 *   <li>{@link supplychain.DeliveryConfirmation#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link supplychain.DeliveryConfirmation#getRequiresShipment <em>Requires Shipment</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getDeliveryConfirmation()
 * @model
 * @generated
 */
public interface DeliveryConfirmation extends EObject {
	/**
	 * Returns the value of the '<em><b>Confirmation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation Id</em>' attribute.
	 * @see #setConfirmationId(String)
	 * @see supplychain.SupplychainPackage#getDeliveryConfirmation_ConfirmationId()
	 * @model
	 * @generated
	 */
	String getConfirmationId();

	/**
	 * Sets the value of the '{@link supplychain.DeliveryConfirmation#getConfirmationId <em>Confirmation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmation Id</em>' attribute.
	 * @see #getConfirmationId()
	 * @generated
	 */
	void setConfirmationId(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(Date)
	 * @see supplychain.SupplychainPackage#getDeliveryConfirmation_DeliveryDate()
	 * @model
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link supplychain.DeliveryConfirmation#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Requires Shipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Shipment</em>' containment reference.
	 * @see #setRequiresShipment(ShipmentOrder)
	 * @see supplychain.SupplychainPackage#getDeliveryConfirmation_RequiresShipment()
	 * @model containment="true"
	 * @generated
	 */
	ShipmentOrder getRequiresShipment();

	/**
	 * Sets the value of the '{@link supplychain.DeliveryConfirmation#getRequiresShipment <em>Requires Shipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Shipment</em>' containment reference.
	 * @see #getRequiresShipment()
	 * @generated
	 */
	void setRequiresShipment(ShipmentOrder value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String transferProductOwnership();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String confirmProduct();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String verifyOrderFulfillment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String verifyProductAuthenticity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String verifyProductQuality();

} // DeliveryConfirmation
