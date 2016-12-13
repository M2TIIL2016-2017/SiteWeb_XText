/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.Types#isGras <em>Gras</em>}</li>
 *   <li>{@link siteWeb.Types#isItalique <em>Italique</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getTypes()
 * @model
 * @generated
 */
public interface Types extends EObject {
	/**
	 * Returns the value of the '<em><b>Gras</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gras</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gras</em>' attribute.
	 * @see #setGras(boolean)
	 * @see siteWeb.SiteWebPackage#getTypes_Gras()
	 * @model
	 * @generated
	 */
	boolean isGras();

	/**
	 * Sets the value of the '{@link siteWeb.Types#isGras <em>Gras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gras</em>' attribute.
	 * @see #isGras()
	 * @generated
	 */
	void setGras(boolean value);

	/**
	 * Returns the value of the '<em><b>Italique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Italique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Italique</em>' attribute.
	 * @see #setItalique(boolean)
	 * @see siteWeb.SiteWebPackage#getTypes_Italique()
	 * @model
	 * @generated
	 */
	boolean isItalique();

	/**
	 * Sets the value of the '{@link siteWeb.Types#isItalique <em>Italique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Italique</em>' attribute.
	 * @see #isItalique()
	 * @generated
	 */
	void setItalique(boolean value);

} // Types
