/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see siteWeb.SiteWebPackage
 * @generated
 */
public interface SiteWebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SiteWebFactory eINSTANCE = siteWeb.impl.SiteWebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
	Contact createContact();

	/**
	 * Returns a new object of class '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo</em>'.
	 * @generated
	 */
	Photo createPhoto();

	/**
	 * Returns a new object of class '<em>Rubriques</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rubriques</em>'.
	 * @generated
	 */
	Rubriques createRubriques();

	/**
	 * Returns a new object of class '<em>Liens</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Liens</em>'.
	 * @generated
	 */
	Liens createLiens();

	/**
	 * Returns a new object of class '<em>Page Interne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Interne</em>'.
	 * @generated
	 */
	PageInterne createPageInterne();

	/**
	 * Returns a new object of class '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types</em>'.
	 * @generated
	 */
	Types createTypes();

	/**
	 * Returns a new object of class '<em>Fichiers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichiers</em>'.
	 * @generated
	 */
	Fichiers createFichiers();

	/**
	 * Returns a new object of class '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Page</em>'.
	 * @generated
	 */
	ConfigurationPage createConfigurationPage();

	/**
	 * Returns a new object of class '<em>Page Principale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Principale</em>'.
	 * @generated
	 */
	PagePrincipale createPagePrincipale();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SiteWebPackage getSiteWebPackage();

} //SiteWebFactory
