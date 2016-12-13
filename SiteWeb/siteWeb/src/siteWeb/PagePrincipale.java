/**
 */
package siteWeb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Principale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.PagePrincipale#getContacts <em>Contacts</em>}</li>
 *   <li>{@link siteWeb.PagePrincipale#getRubriques <em>Rubriques</em>}</li>
 *   <li>{@link siteWeb.PagePrincipale#getFichiers <em>Fichiers</em>}</li>
 *   <li>{@link siteWeb.PagePrincipale#getConfigurationPage <em>Configuration Page</em>}</li>
 *   <li>{@link siteWeb.PagePrincipale#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getPagePrincipale()
 * @model
 * @generated
 */
public interface PagePrincipale extends EObject {
	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference list.
	 * The list contents are of type {@link siteWeb.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference list.
	 * @see siteWeb.SiteWebPackage#getPagePrincipale_Contacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Contact> getContacts();

	/**
	 * Returns the value of the '<em><b>Rubriques</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rubriques</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rubriques</em>' containment reference.
	 * @see #setRubriques(Rubriques)
	 * @see siteWeb.SiteWebPackage#getPagePrincipale_Rubriques()
	 * @model containment="true"
	 * @generated
	 */
	Rubriques getRubriques();

	/**
	 * Sets the value of the '{@link siteWeb.PagePrincipale#getRubriques <em>Rubriques</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rubriques</em>' containment reference.
	 * @see #getRubriques()
	 * @generated
	 */
	void setRubriques(Rubriques value);

	/**
	 * Returns the value of the '<em><b>Fichiers</b></em>' containment reference list.
	 * The list contents are of type {@link siteWeb.Fichiers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fichiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fichiers</em>' containment reference list.
	 * @see siteWeb.SiteWebPackage#getPagePrincipale_Fichiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fichiers> getFichiers();

	/**
	 * Returns the value of the '<em><b>Configuration Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Page</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Page</em>' containment reference.
	 * @see #setConfigurationPage(ConfigurationPage)
	 * @see siteWeb.SiteWebPackage#getPagePrincipale_ConfigurationPage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigurationPage getConfigurationPage();

	/**
	 * Sets the value of the '{@link siteWeb.PagePrincipale#getConfigurationPage <em>Configuration Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Page</em>' containment reference.
	 * @see #getConfigurationPage()
	 * @generated
	 */
	void setConfigurationPage(ConfigurationPage value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link siteWeb.PageInterne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see siteWeb.SiteWebPackage#getPagePrincipale_Pages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PageInterne> getPages();

} // PagePrincipale
