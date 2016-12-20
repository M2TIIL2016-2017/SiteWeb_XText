/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Interne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.PageInterne#getTypes <em>Types</em>}</li>
 *   <li>{@link siteWeb.PageInterne#getLiens <em>Liens</em>}</li>
 *   <li>{@link siteWeb.PageInterne#getPhoto <em>Photo</em>}</li>
 *   <li>{@link siteWeb.PageInterne#getTitrePage <em>Titre Page</em>}</li>
 *   <li>{@link siteWeb.PageInterne#getTexte <em>Texte</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getPageInterne()
 * @model
 * @generated
 */
public interface PageInterne extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(Types)
	 * @see siteWeb.SiteWebPackage#getPageInterne_Types()
	 * @model containment="true"
	 * @generated
	 */
	Types getTypes();

	/**
	 * Sets the value of the '{@link siteWeb.PageInterne#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(Types value);

	/**
	 * Returns the value of the '<em><b>Liens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liens</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liens</em>' containment reference.
	 * @see #setLiens(Liens)
	 * @see siteWeb.SiteWebPackage#getPageInterne_Liens()
	 * @model containment="true"
	 * @generated
	 */
	Liens getLiens();

	/**
	 * Sets the value of the '{@link siteWeb.PageInterne#getLiens <em>Liens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liens</em>' containment reference.
	 * @see #getLiens()
	 * @generated
	 */
	void setLiens(Liens value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' containment reference.
	 * @see #setPhoto(Photo)
	 * @see siteWeb.SiteWebPackage#getPageInterne_Photo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Photo getPhoto();

	/**
	 * Sets the value of the '{@link siteWeb.PageInterne#getPhoto <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' containment reference.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(Photo value);

	/**
	 * Returns the value of the '<em><b>Titre Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre Page</em>' attribute.
	 * @see #setTitrePage(String)
	 * @see siteWeb.SiteWebPackage#getPageInterne_TitrePage()
	 * @model
	 * @generated
	 */
	String getTitrePage();

	/**
	 * Sets the value of the '{@link siteWeb.PageInterne#getTitrePage <em>Titre Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre Page</em>' attribute.
	 * @see #getTitrePage()
	 * @generated
	 */
	void setTitrePage(String value);

	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see siteWeb.SiteWebPackage#getPageInterne_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link siteWeb.PageInterne#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

} // PageInterne
