/**
 */
package siteWeb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see siteWeb.SiteWebFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SiteWebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "siteWeb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://github.com/M2TIIL2016-2017/SiteWeb/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "siteWeb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SiteWebPackage eINSTANCE = siteWeb.impl.SiteWebPackageImpl.init();

	/**
	 * The meta object id for the '{@link siteWeb.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.ContactImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__MAIL = 3;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__TELEPHONE = 4;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.PhotoImpl <em>Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.PhotoImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getPhoto()
	 * @generated
	 */
	int PHOTO = 1;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__TAILLE = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__NOM = 2;

	/**
	 * The number of structural features of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.RubriquesImpl <em>Rubriques</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.RubriquesImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getRubriques()
	 * @generated
	 */
	int RUBRIQUES = 2;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBRIQUES__TEXTE = 0;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBRIQUES__LIEN = 1;

	/**
	 * The number of structural features of the '<em>Rubriques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBRIQUES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rubriques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBRIQUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.LiensImpl <em>Liens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.LiensImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getLiens()
	 * @generated
	 */
	int LIENS = 3;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIENS__FICHIER = 0;

	/**
	 * The feature id for the '<em><b>Adresse Web</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIENS__ADRESSE_WEB = 1;

	/**
	 * The feature id for the '<em><b>Page Interne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIENS__PAGE_INTERNE = 2;

	/**
	 * The number of structural features of the '<em>Liens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIENS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Liens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIENS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.PageInterneImpl <em>Page Interne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.PageInterneImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getPageInterne()
	 * @generated
	 */
	int PAGE_INTERNE = 4;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INTERNE__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Liens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INTERNE__LIENS = 1;

	/**
	 * The feature id for the '<em><b>Photo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INTERNE__PHOTO = 2;

	/**
	 * The feature id for the '<em><b>Titre Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INTERNE__TITRE_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INTERNE__TEXTE = 4;

	/**
	 * The number of structural features of the '<em>Page Interne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INTERNE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Page Interne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_INTERNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.TypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.TypesImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getTypes()
	 * @generated
	 */
	int TYPES = 5;

	/**
	 * The feature id for the '<em><b>Gras</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES__GRAS = 0;

	/**
	 * The feature id for the '<em><b>Italique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES__ITALIQUE = 1;

	/**
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.FichiersImpl <em>Fichiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.FichiersImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getFichiers()
	 * @generated
	 */
	int FICHIERS = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIERS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Taille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIERS__TAILLE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIERS__NOM = 2;

	/**
	 * The feature id for the '<em><b>Emplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIERS__EMPLACEMENT = 3;

	/**
	 * The number of structural features of the '<em>Fichiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIERS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fichiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.ConfigurationPageImpl <em>Configuration Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.ConfigurationPageImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getConfigurationPage()
	 * @generated
	 */
	int CONFIGURATION_PAGE = 7;

	/**
	 * The feature id for the '<em><b>Couleur Fond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PAGE__COULEUR_FOND = 0;

	/**
	 * The feature id for the '<em><b>Titre Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PAGE__TITRE_SITE = 1;

	/**
	 * The feature id for the '<em><b>Auteurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PAGE__AUTEURS = 2;

	/**
	 * The feature id for the '<em><b>Couleur Police</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PAGE__COULEUR_POLICE = 3;

	/**
	 * The feature id for the '<em><b>Taille Police</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PAGE__TAILLE_POLICE = 4;

	/**
	 * The number of structural features of the '<em>Configuration Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Configuration Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link siteWeb.impl.PagePrincipaleImpl <em>Page Principale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see siteWeb.impl.PagePrincipaleImpl
	 * @see siteWeb.impl.SiteWebPackageImpl#getPagePrincipale()
	 * @generated
	 */
	int PAGE_PRINCIPALE = 8;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PRINCIPALE__CONTACTS = 0;

	/**
	 * The feature id for the '<em><b>Rubriques</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PRINCIPALE__RUBRIQUES = 1;

	/**
	 * The feature id for the '<em><b>Fichiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PRINCIPALE__FICHIERS = 2;

	/**
	 * The feature id for the '<em><b>Configuration Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PRINCIPALE__CONFIGURATION_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PRINCIPALE__PAGES = 4;

	/**
	 * The number of structural features of the '<em>Page Principale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PRINCIPALE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Page Principale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_PRINCIPALE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link siteWeb.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see siteWeb.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Contact#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see siteWeb.Contact#getNom()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Nom();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Contact#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see siteWeb.Contact#getPrenom()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Contact#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see siteWeb.Contact#getAdresse()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Contact#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see siteWeb.Contact#getMail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Mail();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Contact#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see siteWeb.Contact#getTelephone()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Telephone();

	/**
	 * Returns the meta object for class '{@link siteWeb.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo</em>'.
	 * @see siteWeb.Photo
	 * @generated
	 */
	EClass getPhoto();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Photo#getTaille <em>Taille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille</em>'.
	 * @see siteWeb.Photo#getTaille()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Taille();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Photo#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see siteWeb.Photo#getExtension()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Extension();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Photo#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see siteWeb.Photo#getNom()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Nom();

	/**
	 * Returns the meta object for class '{@link siteWeb.Rubriques <em>Rubriques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rubriques</em>'.
	 * @see siteWeb.Rubriques
	 * @generated
	 */
	EClass getRubriques();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Rubriques#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see siteWeb.Rubriques#getTexte()
	 * @see #getRubriques()
	 * @generated
	 */
	EAttribute getRubriques_Texte();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Rubriques#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see siteWeb.Rubriques#getLien()
	 * @see #getRubriques()
	 * @generated
	 */
	EAttribute getRubriques_Lien();

	/**
	 * Returns the meta object for class '{@link siteWeb.Liens <em>Liens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Liens</em>'.
	 * @see siteWeb.Liens
	 * @generated
	 */
	EClass getLiens();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Liens#getFichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fichier</em>'.
	 * @see siteWeb.Liens#getFichier()
	 * @see #getLiens()
	 * @generated
	 */
	EAttribute getLiens_Fichier();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Liens#getAdresseWeb <em>Adresse Web</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse Web</em>'.
	 * @see siteWeb.Liens#getAdresseWeb()
	 * @see #getLiens()
	 * @generated
	 */
	EAttribute getLiens_AdresseWeb();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Liens#getPageInterne <em>Page Interne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Interne</em>'.
	 * @see siteWeb.Liens#getPageInterne()
	 * @see #getLiens()
	 * @generated
	 */
	EAttribute getLiens_PageInterne();

	/**
	 * Returns the meta object for class '{@link siteWeb.PageInterne <em>Page Interne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Interne</em>'.
	 * @see siteWeb.PageInterne
	 * @generated
	 */
	EClass getPageInterne();

	/**
	 * Returns the meta object for the containment reference '{@link siteWeb.PageInterne#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see siteWeb.PageInterne#getTypes()
	 * @see #getPageInterne()
	 * @generated
	 */
	EReference getPageInterne_Types();

	/**
	 * Returns the meta object for the containment reference '{@link siteWeb.PageInterne#getLiens <em>Liens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Liens</em>'.
	 * @see siteWeb.PageInterne#getLiens()
	 * @see #getPageInterne()
	 * @generated
	 */
	EReference getPageInterne_Liens();

	/**
	 * Returns the meta object for the containment reference '{@link siteWeb.PageInterne#getPhoto <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Photo</em>'.
	 * @see siteWeb.PageInterne#getPhoto()
	 * @see #getPageInterne()
	 * @generated
	 */
	EReference getPageInterne_Photo();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.PageInterne#getTitrePage <em>Titre Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre Page</em>'.
	 * @see siteWeb.PageInterne#getTitrePage()
	 * @see #getPageInterne()
	 * @generated
	 */
	EAttribute getPageInterne_TitrePage();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.PageInterne#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see siteWeb.PageInterne#getTexte()
	 * @see #getPageInterne()
	 * @generated
	 */
	EAttribute getPageInterne_Texte();

	/**
	 * Returns the meta object for class '{@link siteWeb.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types</em>'.
	 * @see siteWeb.Types
	 * @generated
	 */
	EClass getTypes();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Types#isGras <em>Gras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gras</em>'.
	 * @see siteWeb.Types#isGras()
	 * @see #getTypes()
	 * @generated
	 */
	EAttribute getTypes_Gras();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Types#isItalique <em>Italique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italique</em>'.
	 * @see siteWeb.Types#isItalique()
	 * @see #getTypes()
	 * @generated
	 */
	EAttribute getTypes_Italique();

	/**
	 * Returns the meta object for class '{@link siteWeb.Fichiers <em>Fichiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichiers</em>'.
	 * @see siteWeb.Fichiers
	 * @generated
	 */
	EClass getFichiers();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Fichiers#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see siteWeb.Fichiers#getType()
	 * @see #getFichiers()
	 * @generated
	 */
	EAttribute getFichiers_Type();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Fichiers#getTaille <em>Taille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille</em>'.
	 * @see siteWeb.Fichiers#getTaille()
	 * @see #getFichiers()
	 * @generated
	 */
	EAttribute getFichiers_Taille();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Fichiers#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see siteWeb.Fichiers#getNom()
	 * @see #getFichiers()
	 * @generated
	 */
	EAttribute getFichiers_Nom();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.Fichiers#getEmplacement <em>Emplacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emplacement</em>'.
	 * @see siteWeb.Fichiers#getEmplacement()
	 * @see #getFichiers()
	 * @generated
	 */
	EAttribute getFichiers_Emplacement();

	/**
	 * Returns the meta object for class '{@link siteWeb.ConfigurationPage <em>Configuration Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Page</em>'.
	 * @see siteWeb.ConfigurationPage
	 * @generated
	 */
	EClass getConfigurationPage();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.ConfigurationPage#getCouleurFond <em>Couleur Fond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Couleur Fond</em>'.
	 * @see siteWeb.ConfigurationPage#getCouleurFond()
	 * @see #getConfigurationPage()
	 * @generated
	 */
	EAttribute getConfigurationPage_CouleurFond();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.ConfigurationPage#getTitreSite <em>Titre Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre Site</em>'.
	 * @see siteWeb.ConfigurationPage#getTitreSite()
	 * @see #getConfigurationPage()
	 * @generated
	 */
	EAttribute getConfigurationPage_TitreSite();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.ConfigurationPage#getAuteurs <em>Auteurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auteurs</em>'.
	 * @see siteWeb.ConfigurationPage#getAuteurs()
	 * @see #getConfigurationPage()
	 * @generated
	 */
	EAttribute getConfigurationPage_Auteurs();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.ConfigurationPage#getCouleurPolice <em>Couleur Police</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Couleur Police</em>'.
	 * @see siteWeb.ConfigurationPage#getCouleurPolice()
	 * @see #getConfigurationPage()
	 * @generated
	 */
	EAttribute getConfigurationPage_CouleurPolice();

	/**
	 * Returns the meta object for the attribute '{@link siteWeb.ConfigurationPage#getTaillePolice <em>Taille Police</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taille Police</em>'.
	 * @see siteWeb.ConfigurationPage#getTaillePolice()
	 * @see #getConfigurationPage()
	 * @generated
	 */
	EAttribute getConfigurationPage_TaillePolice();

	/**
	 * Returns the meta object for class '{@link siteWeb.PagePrincipale <em>Page Principale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Principale</em>'.
	 * @see siteWeb.PagePrincipale
	 * @generated
	 */
	EClass getPagePrincipale();

	/**
	 * Returns the meta object for the containment reference list '{@link siteWeb.PagePrincipale#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see siteWeb.PagePrincipale#getContacts()
	 * @see #getPagePrincipale()
	 * @generated
	 */
	EReference getPagePrincipale_Contacts();

	/**
	 * Returns the meta object for the containment reference '{@link siteWeb.PagePrincipale#getRubriques <em>Rubriques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rubriques</em>'.
	 * @see siteWeb.PagePrincipale#getRubriques()
	 * @see #getPagePrincipale()
	 * @generated
	 */
	EReference getPagePrincipale_Rubriques();

	/**
	 * Returns the meta object for the containment reference list '{@link siteWeb.PagePrincipale#getFichiers <em>Fichiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fichiers</em>'.
	 * @see siteWeb.PagePrincipale#getFichiers()
	 * @see #getPagePrincipale()
	 * @generated
	 */
	EReference getPagePrincipale_Fichiers();

	/**
	 * Returns the meta object for the containment reference '{@link siteWeb.PagePrincipale#getConfigurationPage <em>Configuration Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration Page</em>'.
	 * @see siteWeb.PagePrincipale#getConfigurationPage()
	 * @see #getPagePrincipale()
	 * @generated
	 */
	EReference getPagePrincipale_ConfigurationPage();

	/**
	 * Returns the meta object for the containment reference list '{@link siteWeb.PagePrincipale#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see siteWeb.PagePrincipale#getPages()
	 * @see #getPagePrincipale()
	 * @generated
	 */
	EReference getPagePrincipale_Pages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SiteWebFactory getSiteWebFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link siteWeb.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.ContactImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NOM = eINSTANCE.getContact_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__PRENOM = eINSTANCE.getContact_Prenom();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__ADRESSE = eINSTANCE.getContact_Adresse();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__MAIL = eINSTANCE.getContact_Mail();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__TELEPHONE = eINSTANCE.getContact_Telephone();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.PhotoImpl <em>Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.PhotoImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getPhoto()
		 * @generated
		 */
		EClass PHOTO = eINSTANCE.getPhoto();

		/**
		 * The meta object literal for the '<em><b>Taille</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__TAILLE = eINSTANCE.getPhoto_Taille();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__EXTENSION = eINSTANCE.getPhoto_Extension();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__NOM = eINSTANCE.getPhoto_Nom();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.RubriquesImpl <em>Rubriques</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.RubriquesImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getRubriques()
		 * @generated
		 */
		EClass RUBRIQUES = eINSTANCE.getRubriques();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBRIQUES__TEXTE = eINSTANCE.getRubriques_Texte();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBRIQUES__LIEN = eINSTANCE.getRubriques_Lien();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.LiensImpl <em>Liens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.LiensImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getLiens()
		 * @generated
		 */
		EClass LIENS = eINSTANCE.getLiens();

		/**
		 * The meta object literal for the '<em><b>Fichier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIENS__FICHIER = eINSTANCE.getLiens_Fichier();

		/**
		 * The meta object literal for the '<em><b>Adresse Web</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIENS__ADRESSE_WEB = eINSTANCE.getLiens_AdresseWeb();

		/**
		 * The meta object literal for the '<em><b>Page Interne</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIENS__PAGE_INTERNE = eINSTANCE.getLiens_PageInterne();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.PageInterneImpl <em>Page Interne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.PageInterneImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getPageInterne()
		 * @generated
		 */
		EClass PAGE_INTERNE = eINSTANCE.getPageInterne();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_INTERNE__TYPES = eINSTANCE.getPageInterne_Types();

		/**
		 * The meta object literal for the '<em><b>Liens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_INTERNE__LIENS = eINSTANCE.getPageInterne_Liens();

		/**
		 * The meta object literal for the '<em><b>Photo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_INTERNE__PHOTO = eINSTANCE.getPageInterne_Photo();

		/**
		 * The meta object literal for the '<em><b>Titre Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_INTERNE__TITRE_PAGE = eINSTANCE.getPageInterne_TitrePage();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_INTERNE__TEXTE = eINSTANCE.getPageInterne_Texte();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.TypesImpl <em>Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.TypesImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getTypes()
		 * @generated
		 */
		EClass TYPES = eINSTANCE.getTypes();

		/**
		 * The meta object literal for the '<em><b>Gras</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES__GRAS = eINSTANCE.getTypes_Gras();

		/**
		 * The meta object literal for the '<em><b>Italique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES__ITALIQUE = eINSTANCE.getTypes_Italique();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.FichiersImpl <em>Fichiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.FichiersImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getFichiers()
		 * @generated
		 */
		EClass FICHIERS = eINSTANCE.getFichiers();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIERS__TYPE = eINSTANCE.getFichiers_Type();

		/**
		 * The meta object literal for the '<em><b>Taille</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIERS__TAILLE = eINSTANCE.getFichiers_Taille();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIERS__NOM = eINSTANCE.getFichiers_Nom();

		/**
		 * The meta object literal for the '<em><b>Emplacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FICHIERS__EMPLACEMENT = eINSTANCE.getFichiers_Emplacement();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.ConfigurationPageImpl <em>Configuration Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.ConfigurationPageImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getConfigurationPage()
		 * @generated
		 */
		EClass CONFIGURATION_PAGE = eINSTANCE.getConfigurationPage();

		/**
		 * The meta object literal for the '<em><b>Couleur Fond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PAGE__COULEUR_FOND = eINSTANCE.getConfigurationPage_CouleurFond();

		/**
		 * The meta object literal for the '<em><b>Titre Site</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PAGE__TITRE_SITE = eINSTANCE.getConfigurationPage_TitreSite();

		/**
		 * The meta object literal for the '<em><b>Auteurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PAGE__AUTEURS = eINSTANCE.getConfigurationPage_Auteurs();

		/**
		 * The meta object literal for the '<em><b>Couleur Police</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PAGE__COULEUR_POLICE = eINSTANCE.getConfigurationPage_CouleurPolice();

		/**
		 * The meta object literal for the '<em><b>Taille Police</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_PAGE__TAILLE_POLICE = eINSTANCE.getConfigurationPage_TaillePolice();

		/**
		 * The meta object literal for the '{@link siteWeb.impl.PagePrincipaleImpl <em>Page Principale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see siteWeb.impl.PagePrincipaleImpl
		 * @see siteWeb.impl.SiteWebPackageImpl#getPagePrincipale()
		 * @generated
		 */
		EClass PAGE_PRINCIPALE = eINSTANCE.getPagePrincipale();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_PRINCIPALE__CONTACTS = eINSTANCE.getPagePrincipale_Contacts();

		/**
		 * The meta object literal for the '<em><b>Rubriques</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_PRINCIPALE__RUBRIQUES = eINSTANCE.getPagePrincipale_Rubriques();

		/**
		 * The meta object literal for the '<em><b>Fichiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_PRINCIPALE__FICHIERS = eINSTANCE.getPagePrincipale_Fichiers();

		/**
		 * The meta object literal for the '<em><b>Configuration Page</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_PRINCIPALE__CONFIGURATION_PAGE = eINSTANCE.getPagePrincipale_ConfigurationPage();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_PRINCIPALE__PAGES = eINSTANCE.getPagePrincipale_Pages();

	}

} //SiteWebPackage
