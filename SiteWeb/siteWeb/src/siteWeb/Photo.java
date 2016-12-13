/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link siteWeb.Photo#getTaille <em>Taille</em>}</li>
 *   <li>{@link siteWeb.Photo#getExtension <em>Extension</em>}</li>
 *   <li>{@link siteWeb.Photo#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see siteWeb.SiteWebPackage#getPhoto()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tailleMinimum testPhotoDoubleExiste'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot tailleMinimum='taille>=0.1' testPhotoDoubleExiste='Photo.allInstances()->forAll(p1, p2 | p1 <> p2 implies p1.nom <> p2.nom )'"
 * @generated
 */
public interface Photo extends EObject {
	/**
	 * Returns the value of the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille</em>' attribute.
	 * @see #setTaille(float)
	 * @see siteWeb.SiteWebPackage#getPhoto_Taille()
	 * @model
	 * @generated
	 */
	float getTaille();

	/**
	 * Sets the value of the '{@link siteWeb.Photo#getTaille <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille</em>' attribute.
	 * @see #getTaille()
	 * @generated
	 */
	void setTaille(float value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see siteWeb.SiteWebPackage#getPhoto_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link siteWeb.Photo#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

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
	 * @see siteWeb.SiteWebPackage#getPhoto_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link siteWeb.Photo#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // Photo
