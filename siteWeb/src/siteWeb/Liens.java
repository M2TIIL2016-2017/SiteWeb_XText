/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.Liens#getFichier <em>Fichier</em>}</li>
 *   <li>{@link siteWeb.Liens#getAdresseWeb <em>Adresse Web</em>}</li>
 *   <li>{@link siteWeb.Liens#getPageInterne <em>Page Interne</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getLiens()
 * @model
 * @generated
 */
public interface Liens extends EObject {
	/**
	 * Returns the value of the '<em><b>Fichier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fichier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fichier</em>' attribute.
	 * @see #setFichier(String)
	 * @see siteWeb.SiteWebPackage#getLiens_Fichier()
	 * @model
	 * @generated
	 */
	String getFichier();

	/**
	 * Sets the value of the '{@link siteWeb.Liens#getFichier <em>Fichier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fichier</em>' attribute.
	 * @see #getFichier()
	 * @generated
	 */
	void setFichier(String value);

	/**
	 * Returns the value of the '<em><b>Adresse Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse Web</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse Web</em>' attribute.
	 * @see #setAdresseWeb(String)
	 * @see siteWeb.SiteWebPackage#getLiens_AdresseWeb()
	 * @model
	 * @generated
	 */
	String getAdresseWeb();

	/**
	 * Sets the value of the '{@link siteWeb.Liens#getAdresseWeb <em>Adresse Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Web</em>' attribute.
	 * @see #getAdresseWeb()
	 * @generated
	 */
	void setAdresseWeb(String value);

	/**
	 * Returns the value of the '<em><b>Page Interne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Interne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Interne</em>' attribute.
	 * @see #setPageInterne(String)
	 * @see siteWeb.SiteWebPackage#getLiens_PageInterne()
	 * @model
	 * @generated
	 */
	String getPageInterne();

	/**
	 * Sets the value of the '{@link siteWeb.Liens#getPageInterne <em>Page Interne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Interne</em>' attribute.
	 * @see #getPageInterne()
	 * @generated
	 */
	void setPageInterne(String value);

} // Liens
