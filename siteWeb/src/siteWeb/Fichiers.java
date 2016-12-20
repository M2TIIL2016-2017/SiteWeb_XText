/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fichiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.Fichiers#getType <em>Type</em>}</li>
 *   <li>{@link siteWeb.Fichiers#getTaille <em>Taille</em>}</li>
 *   <li>{@link siteWeb.Fichiers#getNom <em>Nom</em>}</li>
 *   <li>{@link siteWeb.Fichiers#getEmplacement <em>Emplacement</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getFichiers()
 * @model
 * @generated
 */
public interface Fichiers extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see siteWeb.SiteWebPackage#getFichiers_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link siteWeb.Fichiers#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille</em>' attribute.
	 * @see #setTaille(int)
	 * @see siteWeb.SiteWebPackage#getFichiers_Taille()
	 * @model
	 * @generated
	 */
	int getTaille();

	/**
	 * Sets the value of the '{@link siteWeb.Fichiers#getTaille <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille</em>' attribute.
	 * @see #getTaille()
	 * @generated
	 */
	void setTaille(int value);

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
	 * @see siteWeb.SiteWebPackage#getFichiers_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link siteWeb.Fichiers#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Emplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emplacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emplacement</em>' attribute.
	 * @see #setEmplacement(String)
	 * @see siteWeb.SiteWebPackage#getFichiers_Emplacement()
	 * @model
	 * @generated
	 */
	String getEmplacement();

	/**
	 * Sets the value of the '{@link siteWeb.Fichiers#getEmplacement <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emplacement</em>' attribute.
	 * @see #getEmplacement()
	 * @generated
	 */
	void setEmplacement(String value);

} // Fichiers
