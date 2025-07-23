/**
 */
package supplychain.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import supplychain.IoTSensors;
import supplychain.SupplychainPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TSensors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link supplychain.impl.IoTSensorsImpl#getSensorId <em>Sensor Id</em>}</li>
 *   <li>{@link supplychain.impl.IoTSensorsImpl#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link supplychain.impl.IoTSensorsImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link supplychain.impl.IoTSensorsImpl#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTSensorsImpl extends MinimalEObjectImpl.Container implements IoTSensors {
	/**
	 * The default value of the '{@link #getSensorId() <em>Sensor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorId()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorId() <em>Sensor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorId()
	 * @generated
	 * @ordered
	 */
	protected String sensorId = SENSOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected String sensorType = SENSOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReading() <em>Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected static final double READING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReading() <em>Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected double reading = READING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTSensorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplychainPackage.Literals.IO_TSENSORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensorId() {
		return sensorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorId(String newSensorId) {
		String oldSensorId = sensorId;
		sensorId = newSensorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.IO_TSENSORS__SENSOR_ID, oldSensorId, sensorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensorType() {
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorType(String newSensorType) {
		String oldSensorType = sensorType;
		sensorType = newSensorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.IO_TSENSORS__SENSOR_TYPE, oldSensorType, sensorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.IO_TSENSORS__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getReading() {
		return reading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReading(double newReading) {
		double oldReading = reading;
		reading = newReading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplychainPackage.IO_TSENSORS__READING, oldReading, reading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplychainPackage.IO_TSENSORS__SENSOR_ID:
				return getSensorId();
			case SupplychainPackage.IO_TSENSORS__SENSOR_TYPE:
				return getSensorType();
			case SupplychainPackage.IO_TSENSORS__LOCATION:
				return getLocation();
			case SupplychainPackage.IO_TSENSORS__READING:
				return getReading();
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
			case SupplychainPackage.IO_TSENSORS__SENSOR_ID:
				setSensorId((String)newValue);
				return;
			case SupplychainPackage.IO_TSENSORS__SENSOR_TYPE:
				setSensorType((String)newValue);
				return;
			case SupplychainPackage.IO_TSENSORS__LOCATION:
				setLocation((String)newValue);
				return;
			case SupplychainPackage.IO_TSENSORS__READING:
				setReading((Double)newValue);
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
			case SupplychainPackage.IO_TSENSORS__SENSOR_ID:
				setSensorId(SENSOR_ID_EDEFAULT);
				return;
			case SupplychainPackage.IO_TSENSORS__SENSOR_TYPE:
				setSensorType(SENSOR_TYPE_EDEFAULT);
				return;
			case SupplychainPackage.IO_TSENSORS__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case SupplychainPackage.IO_TSENSORS__READING:
				setReading(READING_EDEFAULT);
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
			case SupplychainPackage.IO_TSENSORS__SENSOR_ID:
				return SENSOR_ID_EDEFAULT == null ? sensorId != null : !SENSOR_ID_EDEFAULT.equals(sensorId);
			case SupplychainPackage.IO_TSENSORS__SENSOR_TYPE:
				return SENSOR_TYPE_EDEFAULT == null ? sensorType != null : !SENSOR_TYPE_EDEFAULT.equals(sensorType);
			case SupplychainPackage.IO_TSENSORS__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case SupplychainPackage.IO_TSENSORS__READING:
				return reading != READING_EDEFAULT;
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
		result.append(" (sensorId: ");
		result.append(sensorId);
		result.append(", sensorType: ");
		result.append(sensorType);
		result.append(", location: ");
		result.append(location);
		result.append(", reading: ");
		result.append(reading);
		result.append(')');
		return result.toString();
	}

} //IoTSensorsImpl
