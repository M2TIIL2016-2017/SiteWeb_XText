/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rubriques</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.Rubriques#getTexte <em>Texte</em>}</li>
 *   <li>{@link siteWeb.Rubriques#getLien <em>Lien</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getRubriques()
 * @model
 * @generated
 */
public interface Rubriques extends EObject {
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
	 * @see siteWeb.SiteWebPackage#getRubriques_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link siteWeb.Rubriques#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien</em>' attribute.
	 * @see #setLien(String)
	 * @see siteWeb.SiteWebPackage#getRubriques_Lien()
	 * @model
	 * @generated
	 */
	String getLien();

	/**
	 * Sets the value of the '{@link siteWeb.Rubriques#getLien <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien</em>' attribute.
	 * @see #getLien()
	 * @generated
	 */
	void setLien(String value);

} // Rubriques
