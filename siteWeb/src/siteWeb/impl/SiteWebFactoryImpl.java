/**
 */
package siteWeb.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import siteWeb.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteWebFactoryImpl extends EFactoryImpl implements SiteWebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SiteWebFactory init() {
		try {
			SiteWebFactory theSiteWebFactory = (SiteWebFactory)EPackage.Registry.INSTANCE.getEFactory(SiteWebPackage.eNS_URI);
			if (theSiteWebFactory != null) {
				return theSiteWebFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SiteWebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SiteWebPackage.CONTACT: return createContact();
			case SiteWebPackage.PHOTO: return createPhoto();
			case SiteWebPackage.RUBRIQUES: return createRubriques();
			case SiteWebPackage.LIENS: return createLiens();
			case SiteWebPackage.PAGE_INTERNE: return createPageInterne();
			case SiteWebPackage.TYPES: return createTypes();
			case SiteWebPackage.FICHIERS: return createFichiers();
			case SiteWebPackage.CONFIGURATION_PAGE: return createConfigurationPage();
			case SiteWebPackage.PAGE_PRINCIPALE: return createPagePrincipale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo createPhoto() {
		PhotoImpl photo = new PhotoImpl();
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rubriques createRubriques() {
		RubriquesImpl rubriques = new RubriquesImpl();
		return rubriques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Liens createLiens() {
		LiensImpl liens = new LiensImpl();
		return liens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageInterne createPageInterne() {
		PageInterneImpl pageInterne = new PageInterneImpl();
		return pageInterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types createTypes() {
		TypesImpl types = new TypesImpl();
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fichiers createFichiers() {
		FichiersImpl fichiers = new FichiersImpl();
		return fichiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPage createConfigurationPage() {
		ConfigurationPageImpl configurationPage = new ConfigurationPageImpl();
		return configurationPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagePrincipale createPagePrincipale() {
		PagePrincipaleImpl pagePrincipale = new PagePrincipaleImpl();
		return pagePrincipale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWebPackage getSiteWebPackage() {
		return (SiteWebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SiteWebPackage getPackage() {
		return SiteWebPackage.eINSTANCE;
	}

} //SiteWebFactoryImpl
