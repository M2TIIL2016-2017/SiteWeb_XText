/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.Contact#getNom <em>Nom</em>}</li>
 *   <li>{@link siteWeb.Contact#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link siteWeb.Contact#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link siteWeb.Contact#getMail <em>Mail</em>}</li>
 *   <li>{@link siteWeb.Contact#getTelephone <em>Telephone</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getContact()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='testContactAdresse testContactAdresse2 testContactNom testContactPrenom testContactTel'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot testContactAdresse='adresse <> null' testContactAdresse2='adresse = \'rue des facs\'' testContactNom='nom = \'Marrec\'' testContactPrenom='prenom = \'Cedric\'' testContactTel='telephone = \'0606060606\''"
 * @generated
 */
public interface Contact extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see siteWeb.SiteWebPackage#getContact_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link siteWeb.Contact#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prenom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see siteWeb.SiteWebPackage#getContact_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link siteWeb.Contact#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see siteWeb.SiteWebPackage#getContact_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link siteWeb.Contact#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see siteWeb.SiteWebPackage#getContact_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link siteWeb.Contact#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see siteWeb.SiteWebPackage#getContact_Telephone()
	 * @model
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link siteWeb.Contact#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

} // Contact
