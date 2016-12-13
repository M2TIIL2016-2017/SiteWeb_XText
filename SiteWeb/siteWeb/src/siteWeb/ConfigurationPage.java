/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.ConfigurationPage#getCouleurFond <em>Couleur Fond</em>}</li>
 *   <li>{@link siteWeb.ConfigurationPage#getTitreSite <em>Titre Site</em>}</li>
 *   <li>{@link siteWeb.ConfigurationPage#getAuteurs <em>Auteurs</em>}</li>
 *   <li>{@link siteWeb.ConfigurationPage#getCouleurPolice <em>Couleur Police</em>}</li>
 *   <li>{@link siteWeb.ConfigurationPage#getTaillePolice <em>Taille Police</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getConfigurationPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='testCouleurFond testCouleurPolice testTitre testAuteurs testTaillePolice'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot testCouleurFond='couleurFond = \'White\'' testCouleurPolice='couleurPolice = \'Black\'' testTitre='titreSite=\'SiteWeb\'' testAuteurs='auteurs= \'Socrate\'' testTaillePolice='taillePolice=14'"
 * @generated
 */
public interface ConfigurationPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Couleur Fond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Fond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Fond</em>' attribute.
	 * @see #setCouleurFond(String)
	 * @see siteWeb.SiteWebPackage#getConfigurationPage_CouleurFond()
	 * @model
	 * @generated
	 */
	String getCouleurFond();

	/**
	 * Sets the value of the '{@link siteWeb.ConfigurationPage#getCouleurFond <em>Couleur Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Fond</em>' attribute.
	 * @see #getCouleurFond()
	 * @generated
	 */
	void setCouleurFond(String value);

	/**
	 * Returns the value of the '<em><b>Titre Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre Site</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre Site</em>' attribute.
	 * @see #setTitreSite(String)
	 * @see siteWeb.SiteWebPackage#getConfigurationPage_TitreSite()
	 * @model
	 * @generated
	 */
	String getTitreSite();

	/**
	 * Sets the value of the '{@link siteWeb.ConfigurationPage#getTitreSite <em>Titre Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre Site</em>' attribute.
	 * @see #getTitreSite()
	 * @generated
	 */
	void setTitreSite(String value);

	/**
	 * Returns the value of the '<em><b>Auteurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auteurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteurs</em>' attribute.
	 * @see #setAuteurs(String)
	 * @see siteWeb.SiteWebPackage#getConfigurationPage_Auteurs()
	 * @model
	 * @generated
	 */
	String getAuteurs();

	/**
	 * Sets the value of the '{@link siteWeb.ConfigurationPage#getAuteurs <em>Auteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auteurs</em>' attribute.
	 * @see #getAuteurs()
	 * @generated
	 */
	void setAuteurs(String value);

	/**
	 * Returns the value of the '<em><b>Couleur Police</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Police</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Police</em>' attribute.
	 * @see #setCouleurPolice(String)
	 * @see siteWeb.SiteWebPackage#getConfigurationPage_CouleurPolice()
	 * @model
	 * @generated
	 */
	String getCouleurPolice();

	/**
	 * Sets the value of the '{@link siteWeb.ConfigurationPage#getCouleurPolice <em>Couleur Police</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Police</em>' attribute.
	 * @see #getCouleurPolice()
	 * @generated
	 */
	void setCouleurPolice(String value);

	/**
	 * Returns the value of the '<em><b>Taille Police</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Police</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Police</em>' attribute.
	 * @see #setTaillePolice(int)
	 * @see siteWeb.SiteWebPackage#getConfigurationPage_TaillePolice()
	 * @model
	 * @generated
	 */
	int getTaillePolice();

	/**
	 * Sets the value of the '{@link siteWeb.ConfigurationPage#getTaillePolice <em>Taille Police</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Police</em>' attribute.
	 * @see #getTaillePolice()
	 * @generated
	 */
	void setTaillePolice(int value);

} // ConfigurationPage
