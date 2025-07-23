/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TSensors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.IoTSensors#getSensorId <em>Sensor Id</em>}</li>
 *   <li>{@link supplychain.IoTSensors#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link supplychain.IoTSensors#getLocation <em>Location</em>}</li>
 *   <li>{@link supplychain.IoTSensors#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getIoTSensors()
 * @model
 * @generated
 */
public interface IoTSensors extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Id</em>' attribute.
	 * @see #setSensorId(String)
	 * @see supplychain.SupplychainPackage#getIoTSensors_SensorId()
	 * @model
	 * @generated
	 */
	String getSensorId();

	/**
	 * Sets the value of the '{@link supplychain.IoTSensors#getSensorId <em>Sensor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Id</em>' attribute.
	 * @see #getSensorId()
	 * @generated
	 */
	void setSensorId(String value);

	/**
	 * Returns the value of the '<em><b>Sensor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Type</em>' attribute.
	 * @see #setSensorType(String)
	 * @see supplychain.SupplychainPackage#getIoTSensors_SensorType()
	 * @model
	 * @generated
	 */
	String getSensorType();

	/**
	 * Sets the value of the '{@link supplychain.IoTSensors#getSensorType <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' attribute.
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see supplychain.SupplychainPackage#getIoTSensors_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link supplychain.IoTSensors#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' attribute.
	 * @see #setReading(double)
	 * @see supplychain.SupplychainPackage#getIoTSensors_Reading()
	 * @model
	 * @generated
	 */
	double getReading();

	/**
	 * Sets the value of the '{@link supplychain.IoTSensors#getReading <em>Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' attribute.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(double value);

} // IoTSensors
