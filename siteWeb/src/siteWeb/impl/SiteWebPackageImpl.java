/**
 */
package siteWeb.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import siteWeb.ConfigurationPage;
import siteWeb.Contact;
import siteWeb.Fichiers;
import siteWeb.Liens;
import siteWeb.PageInterne;
import siteWeb.PagePrincipale;
import siteWeb.Photo;
import siteWeb.Rubriques;
import siteWeb.SiteWebFactory;
import siteWeb.SiteWebPackage;
import siteWeb.Types;

import siteWeb.util.SiteWebValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteWebPackageImpl extends EPackageImpl implements SiteWebPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubriquesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liensEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageInterneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fichiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagePrincipaleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see siteWeb.SiteWebPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SiteWebPackageImpl() {
		super(eNS_URI, SiteWebFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SiteWebPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SiteWebPackage init() {
		if (isInited) return (SiteWebPackage)EPackage.Registry.INSTANCE.getEPackage(SiteWebPackage.eNS_URI);

		// Obtain or create and register package
		SiteWebPackageImpl theSiteWebPackage = (SiteWebPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SiteWebPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SiteWebPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSiteWebPackage.createPackageContents();

		// Initialize created meta-data
		theSiteWebPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSiteWebPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SiteWebValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSiteWebPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SiteWebPackage.eNS_URI, theSiteWebPackage);
		return theSiteWebPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContact() {
		return contactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Nom() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Prenom() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Adresse() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Mail() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContact_Telephone() {
		return (EAttribute)contactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhoto() {
		return photoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_Taille() {
		return (EAttribute)photoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_Extension() {
		return (EAttribute)photoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_Nom() {
		return (EAttribute)photoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubriques() {
		return rubriquesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubriques_Texte() {
		return (EAttribute)rubriquesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubriques_Lien() {
		return (EAttribute)rubriquesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiens() {
		return liensEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiens_Fichier() {
		return (EAttribute)liensEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiens_AdresseWeb() {
		return (EAttribute)liensEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiens_PageInterne() {
		return (EAttribute)liensEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageInterne() {
		return pageInterneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageInterne_Types() {
		return (EReference)pageInterneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageInterne_Liens() {
		return (EReference)pageInterneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageInterne_Photo() {
		return (EReference)pageInterneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageInterne_TitrePage() {
		return (EAttribute)pageInterneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageInterne_Texte() {
		return (EAttribute)pageInterneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypes() {
		return typesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypes_Gras() {
		return (EAttribute)typesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypes_Italique() {
		return (EAttribute)typesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFichiers() {
		return fichiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichiers_Type() {
		return (EAttribute)fichiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichiers_Taille() {
		return (EAttribute)fichiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichiers_Nom() {
		return (EAttribute)fichiersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFichiers_Emplacement() {
		return (EAttribute)fichiersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPage() {
		return configurationPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPage_CouleurFond() {
		return (EAttribute)configurationPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPage_TitreSite() {
		return (EAttribute)configurationPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPage_Auteurs() {
		return (EAttribute)configurationPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPage_CouleurPolice() {
		return (EAttribute)configurationPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationPage_TaillePolice() {
		return (EAttribute)configurationPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagePrincipale() {
		return pagePrincipaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagePrincipale_Contacts() {
		return (EReference)pagePrincipaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagePrincipale_Rubriques() {
		return (EReference)pagePrincipaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagePrincipale_Fichiers() {
		return (EReference)pagePrincipaleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagePrincipale_ConfigurationPage() {
		return (EReference)pagePrincipaleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPagePrincipale_Pages() {
		return (EReference)pagePrincipaleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWebFactory getSiteWebFactory() {
		return (SiteWebFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contactEClass = createEClass(CONTACT);
		createEAttribute(contactEClass, CONTACT__NOM);
		createEAttribute(contactEClass, CONTACT__PRENOM);
		createEAttribute(contactEClass, CONTACT__ADRESSE);
		createEAttribute(contactEClass, CONTACT__MAIL);
		createEAttribute(contactEClass, CONTACT__TELEPHONE);

		photoEClass = createEClass(PHOTO);
		createEAttribute(photoEClass, PHOTO__TAILLE);
		createEAttribute(photoEClass, PHOTO__EXTENSION);
		createEAttribute(photoEClass, PHOTO__NOM);

		rubriquesEClass = createEClass(RUBRIQUES);
		createEAttribute(rubriquesEClass, RUBRIQUES__TEXTE);
		createEAttribute(rubriquesEClass, RUBRIQUES__LIEN);

		liensEClass = createEClass(LIENS);
		createEAttribute(liensEClass, LIENS__FICHIER);
		createEAttribute(liensEClass, LIENS__ADRESSE_WEB);
		createEAttribute(liensEClass, LIENS__PAGE_INTERNE);

		pageInterneEClass = createEClass(PAGE_INTERNE);
		createEReference(pageInterneEClass, PAGE_INTERNE__TYPES);
		createEReference(pageInterneEClass, PAGE_INTERNE__LIENS);
		createEReference(pageInterneEClass, PAGE_INTERNE__PHOTO);
		createEAttribute(pageInterneEClass, PAGE_INTERNE__TITRE_PAGE);
		createEAttribute(pageInterneEClass, PAGE_INTERNE__TEXTE);

		typesEClass = createEClass(TYPES);
		createEAttribute(typesEClass, TYPES__GRAS);
		createEAttribute(typesEClass, TYPES__ITALIQUE);

		fichiersEClass = createEClass(FICHIERS);
		createEAttribute(fichiersEClass, FICHIERS__TYPE);
		createEAttribute(fichiersEClass, FICHIERS__TAILLE);
		createEAttribute(fichiersEClass, FICHIERS__NOM);
		createEAttribute(fichiersEClass, FICHIERS__EMPLACEMENT);

		configurationPageEClass = createEClass(CONFIGURATION_PAGE);
		createEAttribute(configurationPageEClass, CONFIGURATION_PAGE__COULEUR_FOND);
		createEAttribute(configurationPageEClass, CONFIGURATION_PAGE__TITRE_SITE);
		createEAttribute(configurationPageEClass, CONFIGURATION_PAGE__AUTEURS);
		createEAttribute(configurationPageEClass, CONFIGURATION_PAGE__COULEUR_POLICE);
		createEAttribute(configurationPageEClass, CONFIGURATION_PAGE__TAILLE_POLICE);

		pagePrincipaleEClass = createEClass(PAGE_PRINCIPALE);
		createEReference(pagePrincipaleEClass, PAGE_PRINCIPALE__CONTACTS);
		createEReference(pagePrincipaleEClass, PAGE_PRINCIPALE__RUBRIQUES);
		createEReference(pagePrincipaleEClass, PAGE_PRINCIPALE__FICHIERS);
		createEReference(pagePrincipaleEClass, PAGE_PRINCIPALE__CONFIGURATION_PAGE);
		createEReference(pagePrincipaleEClass, PAGE_PRINCIPALE__PAGES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contactEClass, Contact.class, "Contact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContact_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContact_Telephone(), ecorePackage.getEString(), "telephone", null, 0, 1, Contact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoEClass, Photo.class, "Photo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhoto_Taille(), ecorePackage.getEFloat(), "taille", null, 0, 1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhoto_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhoto_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rubriquesEClass, Rubriques.class, "Rubriques", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRubriques_Texte(), ecorePackage.getEString(), "texte", null, 0, 1, Rubriques.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubriques_Lien(), ecorePackage.getEString(), "lien", null, 0, 1, Rubriques.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liensEClass, Liens.class, "Liens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiens_Fichier(), ecorePackage.getEString(), "fichier", null, 0, 1, Liens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiens_AdresseWeb(), ecorePackage.getEString(), "adresseWeb", null, 0, 1, Liens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiens_PageInterne(), ecorePackage.getEString(), "pageInterne", null, 0, 1, Liens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageInterneEClass, PageInterne.class, "PageInterne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageInterne_Types(), this.getTypes(), null, "types", null, 0, 1, PageInterne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageInterne_Liens(), this.getLiens(), null, "liens", null, 0, 1, PageInterne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageInterne_Photo(), this.getPhoto(), null, "photo", null, 1, 1, PageInterne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageInterne_TitrePage(), ecorePackage.getEString(), "titrePage", null, 0, 1, PageInterne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageInterne_Texte(), ecorePackage.getEString(), "texte", null, 0, 1, PageInterne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypes_Gras(), ecorePackage.getEBoolean(), "gras", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypes_Italique(), ecorePackage.getEBoolean(), "italique", null, 0, 1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fichiersEClass, Fichiers.class, "Fichiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFichiers_Type(), ecorePackage.getEString(), "type", null, 0, 1, Fichiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichiers_Taille(), ecorePackage.getEInt(), "taille", null, 0, 1, Fichiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichiers_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Fichiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFichiers_Emplacement(), ecorePackage.getEString(), "emplacement", null, 0, 1, Fichiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationPageEClass, ConfigurationPage.class, "ConfigurationPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationPage_CouleurFond(), ecorePackage.getEString(), "couleurFond", null, 0, 1, ConfigurationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationPage_TitreSite(), ecorePackage.getEString(), "titreSite", null, 0, 1, ConfigurationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationPage_Auteurs(), ecorePackage.getEString(), "auteurs", null, 0, 1, ConfigurationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationPage_CouleurPolice(), ecorePackage.getEString(), "couleurPolice", null, 0, 1, ConfigurationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationPage_TaillePolice(), ecorePackage.getEInt(), "taillePolice", null, 0, 1, ConfigurationPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pagePrincipaleEClass, PagePrincipale.class, "PagePrincipale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPagePrincipale_Contacts(), this.getContact(), null, "contacts", null, 1, -1, PagePrincipale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagePrincipale_Rubriques(), this.getRubriques(), null, "rubriques", null, 0, 1, PagePrincipale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagePrincipale_Fichiers(), this.getFichiers(), null, "fichiers", null, 0, -1, PagePrincipale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagePrincipale_ConfigurationPage(), this.getConfigurationPage(), null, "configurationPage", null, 1, 1, PagePrincipale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPagePrincipale_Pages(), this.getPageInterne(), null, "pages", null, 1, -1, PagePrincipale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (contactEClass, 
		   source, 
		   new String[] {
			 "constraints", "testContactAdresse testContactAdresse2 testContactNom testContactPrenom testContactTel"
		   });	
		addAnnotation
		  (photoEClass, 
		   source, 
		   new String[] {
			 "constraints", "tailleMinimum testPhotoDoubleExiste"
		   });	
		addAnnotation
		  (configurationPageEClass, 
		   source, 
		   new String[] {
			 "constraints", "testCouleurFond testCouleurPolice testTitre testAuteurs testTaillePolice"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (contactEClass, 
		   source, 
		   new String[] {
			 "testContactAdresse", "adresse <> null",
			 "testContactAdresse2", "adresse = \'rue des facs\'",
			 "testContactNom", "nom = \'Marrec\'",
			 "testContactPrenom", "prenom = \'Cedric\'",
			 "testContactTel", "telephone = \'0606060606\'"
		   });	
		addAnnotation
		  (photoEClass, 
		   source, 
		   new String[] {
			 "tailleMinimum", "taille>=0.1",
			 "testPhotoDoubleExiste", "Photo.allInstances()->forAll(p1, p2 | p1 <> p2 implies p1.nom <> p2.nom )"
		   });	
		addAnnotation
		  (configurationPageEClass, 
		   source, 
		   new String[] {
			 "testCouleurFond", "couleurFond = \'White\'",
			 "testCouleurPolice", "couleurPolice = \'Black\'",
			 "testTitre", "titreSite=\'SiteWeb\'",
			 "testAuteurs", "auteurs= \'Socrate\'",
			 "testTaillePolice", "taillePolice=14"
		   });
	}

} //SiteWebPackageImpl
