/**
 */
package supplychain;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Io TData Streams</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.IoTDataStreams#getStreamId <em>Stream Id</em>}</li>
 *   <li>{@link supplychain.IoTDataStreams#getData <em>Data</em>}</li>
 *   <li>{@link supplychain.IoTDataStreams#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getIoTDataStreams()
 * @model
 * @generated
 */
public interface IoTDataStreams extends EObject {
	/**
	 * Returns the value of the '<em><b>Stream Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stream Id</em>' attribute.
	 * @see #setStreamId(String)
	 * @see supplychain.SupplychainPackage#getIoTDataStreams_StreamId()
	 * @model
	 * @generated
	 */
	String getStreamId();

	/**
	 * Sets the value of the '{@link supplychain.IoTDataStreams#getStreamId <em>Stream Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stream Id</em>' attribute.
	 * @see #getStreamId()
	 * @generated
	 */
	void setStreamId(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see supplychain.SupplychainPackage#getIoTDataStreams_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link supplychain.IoTDataStreams#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see supplychain.SupplychainPackage#getIoTDataStreams_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link supplychain.IoTDataStreams#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // IoTDataStreams
