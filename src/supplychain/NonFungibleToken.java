/**
 */
package supplychain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Fungible Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link supplychain.NonFungibleToken#getTokenId <em>Token Id</em>}</li>
 *   <li>{@link supplychain.NonFungibleToken#getOwner <em>Owner</em>}</li>
 *   <li>{@link supplychain.NonFungibleToken#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see supplychain.SupplychainPackage#getNonFungibleToken()
 * @model
 * @generated
 */
public interface NonFungibleToken extends EObject {
	/**
	 * Returns the value of the '<em><b>Token Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Id</em>' attribute.
	 * @see #setTokenId(String)
	 * @see supplychain.SupplychainPackage#getNonFungibleToken_TokenId()
	 * @model
	 * @generated
	 */
	String getTokenId();

	/**
	 * Sets the value of the '{@link supplychain.NonFungibleToken#getTokenId <em>Token Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Id</em>' attribute.
	 * @see #getTokenId()
	 * @generated
	 */
	void setTokenId(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see supplychain.SupplychainPackage#getNonFungibleToken_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link supplychain.NonFungibleToken#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute.
	 * @see #setMetadata(String)
	 * @see supplychain.SupplychainPackage#getNonFungibleToken_Metadata()
	 * @model
	 * @generated
	 */
	String getMetadata();

	/**
	 * Sets the value of the '{@link supplychain.NonFungibleToken#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(String value);

} // NonFungibleToken
