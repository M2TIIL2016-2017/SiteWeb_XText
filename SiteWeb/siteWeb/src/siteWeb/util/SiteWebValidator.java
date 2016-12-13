/**
 */
package siteWeb.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import siteWeb.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see siteWeb.SiteWebPackage
 * @generated
 */
public class SiteWebValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SiteWebValidator INSTANCE = new SiteWebValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "siteWeb";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWebValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SiteWebPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SiteWebPackage.CONTACT:
				return validateContact((Contact)value, diagnostics, context);
			case SiteWebPackage.PHOTO:
				return validatePhoto((Photo)value, diagnostics, context);
			case SiteWebPackage.RUBRIQUES:
				return validateRubriques((Rubriques)value, diagnostics, context);
			case SiteWebPackage.LIENS:
				return validateLiens((Liens)value, diagnostics, context);
			case SiteWebPackage.PAGE_INTERNE:
				return validatePageInterne((PageInterne)value, diagnostics, context);
			case SiteWebPackage.TYPES:
				return validateTypes((Types)value, diagnostics, context);
			case SiteWebPackage.FICHIERS:
				return validateFichiers((Fichiers)value, diagnostics, context);
			case SiteWebPackage.CONFIGURATION_PAGE:
				return validateConfigurationPage((ConfigurationPage)value, diagnostics, context);
			case SiteWebPackage.PAGE_PRINCIPALE:
				return validatePagePrincipale((PagePrincipale)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contact, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validateContact_testContactAdresse(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validateContact_testContactAdresse2(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validateContact_testContactNom(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validateContact_testContactPrenom(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validateContact_testContactMail(contact, diagnostics, context);
		if (result || diagnostics != null) result &= validateContact_testContactTel(contact, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the testContactAdresse constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT__TEST_CONTACT_ADRESSE__EEXPRESSION = "adresse <> null";

	/**
	 * Validates the testContactAdresse constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact_testContactAdresse(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONTACT,
				 contact,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testContactAdresse",
				 CONTACT__TEST_CONTACT_ADRESSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testContactAdresse2 constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT__TEST_CONTACT_ADRESSE2__EEXPRESSION = "adresse = 'rue des facs'";

	/**
	 * Validates the testContactAdresse2 constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact_testContactAdresse2(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONTACT,
				 contact,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testContactAdresse2",
				 CONTACT__TEST_CONTACT_ADRESSE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testContactNom constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT__TEST_CONTACT_NOM__EEXPRESSION = "nom = 'Marrec'";

	/**
	 * Validates the testContactNom constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact_testContactNom(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONTACT,
				 contact,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testContactNom",
				 CONTACT__TEST_CONTACT_NOM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testContactPrenom constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT__TEST_CONTACT_PRENOM__EEXPRESSION = "prenom = 'Cedric'";

	/**
	 * Validates the testContactPrenom constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact_testContactPrenom(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONTACT,
				 contact,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testContactPrenom",
				 CONTACT__TEST_CONTACT_PRENOM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testContactMail constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT__TEST_CONTACT_MAIL__EEXPRESSION = "mail = 'cedric.marrec29@gmail.com'";

	/**
	 * Validates the testContactMail constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact_testContactMail(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONTACT,
				 contact,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testContactMail",
				 CONTACT__TEST_CONTACT_MAIL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testContactTel constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTACT__TEST_CONTACT_TEL__EEXPRESSION = "telephone = '0606060606'";

	/**
	 * Validates the testContactTel constraint of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact_testContactTel(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONTACT,
				 contact,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testContactTel",
				 CONTACT__TEST_CONTACT_TEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoto(Photo photo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(photo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhoto_tailleMinimum(photo, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhoto_testPhotoDoubleExiste(photo, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the tailleMinimum constraint of '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PHOTO__TAILLE_MINIMUM__EEXPRESSION = "taille>=0.1";

	/**
	 * Validates the tailleMinimum constraint of '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoto_tailleMinimum(Photo photo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.PHOTO,
				 photo,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "tailleMinimum",
				 PHOTO__TAILLE_MINIMUM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testPhotoDoubleExiste constraint of '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PHOTO__TEST_PHOTO_DOUBLE_EXISTE__EEXPRESSION = "Photo.allInstances()->forAll(p1, p2 | p1 <> p2 implies p1.nom <> p2.nom )";

	/**
	 * Validates the testPhotoDoubleExiste constraint of '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhoto_testPhotoDoubleExiste(Photo photo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.PHOTO,
				 photo,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testPhotoDoubleExiste",
				 PHOTO__TEST_PHOTO_DOUBLE_EXISTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRubriques(Rubriques rubriques, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rubriques, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiens(Liens liens, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(liens, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageInterne(PageInterne pageInterne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageInterne, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypes(Types types, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(types, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFichiers(Fichiers fichiers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fichiers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationPage(ConfigurationPage configurationPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configurationPage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurationPage_testCouleurFond(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurationPage_testCouleurPolice(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurationPage_testTitre(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurationPage_testAuteurs(configurationPage, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfigurationPage_testTaillePolice(configurationPage, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the testCouleurFond constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION_PAGE__TEST_COULEUR_FOND__EEXPRESSION = "couleurFond = 'White'";

	/**
	 * Validates the testCouleurFond constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationPage_testCouleurFond(ConfigurationPage configurationPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONFIGURATION_PAGE,
				 configurationPage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testCouleurFond",
				 CONFIGURATION_PAGE__TEST_COULEUR_FOND__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testCouleurPolice constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION_PAGE__TEST_COULEUR_POLICE__EEXPRESSION = "couleurPolice = 'Black'";

	/**
	 * Validates the testCouleurPolice constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationPage_testCouleurPolice(ConfigurationPage configurationPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONFIGURATION_PAGE,
				 configurationPage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testCouleurPolice",
				 CONFIGURATION_PAGE__TEST_COULEUR_POLICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testTitre constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION_PAGE__TEST_TITRE__EEXPRESSION = "titreSite='SiteWeb'";

	/**
	 * Validates the testTitre constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationPage_testTitre(ConfigurationPage configurationPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONFIGURATION_PAGE,
				 configurationPage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testTitre",
				 CONFIGURATION_PAGE__TEST_TITRE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testAuteurs constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION_PAGE__TEST_AUTEURS__EEXPRESSION = "auteurs= 'Socrate'";

	/**
	 * Validates the testAuteurs constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationPage_testAuteurs(ConfigurationPage configurationPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONFIGURATION_PAGE,
				 configurationPage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testAuteurs",
				 CONFIGURATION_PAGE__TEST_AUTEURS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the testTaillePolice constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONFIGURATION_PAGE__TEST_TAILLE_POLICE__EEXPRESSION = "taillePolice=14";

	/**
	 * Validates the testTaillePolice constraint of '<em>Configuration Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationPage_testTaillePolice(ConfigurationPage configurationPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SiteWebPackage.Literals.CONFIGURATION_PAGE,
				 configurationPage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "testTaillePolice",
				 CONFIGURATION_PAGE__TEST_TAILLE_POLICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagePrincipale(PagePrincipale pagePrincipale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pagePrincipale, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SiteWebValidator
