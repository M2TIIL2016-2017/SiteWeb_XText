/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import siteWeb.ConfigurationPage;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link siteWeb.impl.ConfigurationPageImpl#getCouleurFond <em>Couleur Fond</em>}</li>
 *   <li>{@link siteWeb.impl.ConfigurationPageImpl#getTitreSite <em>Titre Site</em>}</li>
 *   <li>{@link siteWeb.impl.ConfigurationPageImpl#getAuteurs <em>Auteurs</em>}</li>
 *   <li>{@link siteWeb.impl.ConfigurationPageImpl#getCouleurPolice <em>Couleur Police</em>}</li>
 *   <li>{@link siteWeb.impl.ConfigurationPageImpl#getTaillePolice <em>Taille Police</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationPageImpl extends MinimalEObjectImpl.Container implements ConfigurationPage {
	/**
	 * The default value of the '{@link #getCouleurFond() <em>Couleur Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurFond()
	 * @generated
	 * @ordered
	 */
	protected static final String COULEUR_FOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouleurFond() <em>Couleur Fond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurFond()
	 * @generated
	 * @ordered
	 */
	protected String couleurFond = COULEUR_FOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitreSite() <em>Titre Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitreSite()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_SITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitreSite() <em>Titre Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitreSite()
	 * @generated
	 * @ordered
	 */
	protected String titreSite = TITRE_SITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuteurs() <em>Auteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteurs()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTEURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuteurs() <em>Auteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuteurs()
	 * @generated
	 * @ordered
	 */
	protected String auteurs = AUTEURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCouleurPolice() <em>Couleur Police</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurPolice()
	 * @generated
	 * @ordered
	 */
	protected static final String COULEUR_POLICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouleurPolice() <em>Couleur Police</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurPolice()
	 * @generated
	 * @ordered
	 */
	protected String couleurPolice = COULEUR_POLICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaillePolice() <em>Taille Police</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePolice()
	 * @generated
	 * @ordered
	 */
	protected static final int TAILLE_POLICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTaillePolice() <em>Taille Police</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaillePolice()
	 * @generated
	 * @ordered
	 */
	protected int taillePolice = TAILLE_POLICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.CONFIGURATION_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouleurFond() {
		return couleurFond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurFond(String newCouleurFond) {
		String oldCouleurFond = couleurFond;
		couleurFond = newCouleurFond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.CONFIGURATION_PAGE__COULEUR_FOND, oldCouleurFond, couleurFond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitreSite() {
		return titreSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitreSite(String newTitreSite) {
		String oldTitreSite = titreSite;
		titreSite = newTitreSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.CONFIGURATION_PAGE__TITRE_SITE, oldTitreSite, titreSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuteurs() {
		return auteurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuteurs(String newAuteurs) {
		String oldAuteurs = auteurs;
		auteurs = newAuteurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.CONFIGURATION_PAGE__AUTEURS, oldAuteurs, auteurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouleurPolice() {
		return couleurPolice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurPolice(String newCouleurPolice) {
		String oldCouleurPolice = couleurPolice;
		couleurPolice = newCouleurPolice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.CONFIGURATION_PAGE__COULEUR_POLICE, oldCouleurPolice, couleurPolice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaillePolice() {
		return taillePolice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaillePolice(int newTaillePolice) {
		int oldTaillePolice = taillePolice;
		taillePolice = newTaillePolice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.CONFIGURATION_PAGE__TAILLE_POLICE, oldTaillePolice, taillePolice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_FOND:
				return getCouleurFond();
			case SiteWebPackage.CONFIGURATION_PAGE__TITRE_SITE:
				return getTitreSite();
			case SiteWebPackage.CONFIGURATION_PAGE__AUTEURS:
				return getAuteurs();
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_POLICE:
				return getCouleurPolice();
			case SiteWebPackage.CONFIGURATION_PAGE__TAILLE_POLICE:
				return getTaillePolice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_FOND:
				setCouleurFond((String)newValue);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__TITRE_SITE:
				setTitreSite((String)newValue);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__AUTEURS:
				setAuteurs((String)newValue);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_POLICE:
				setCouleurPolice((String)newValue);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__TAILLE_POLICE:
				setTaillePolice((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_FOND:
				setCouleurFond(COULEUR_FOND_EDEFAULT);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__TITRE_SITE:
				setTitreSite(TITRE_SITE_EDEFAULT);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__AUTEURS:
				setAuteurs(AUTEURS_EDEFAULT);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_POLICE:
				setCouleurPolice(COULEUR_POLICE_EDEFAULT);
				return;
			case SiteWebPackage.CONFIGURATION_PAGE__TAILLE_POLICE:
				setTaillePolice(TAILLE_POLICE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_FOND:
				return COULEUR_FOND_EDEFAULT == null ? couleurFond != null : !COULEUR_FOND_EDEFAULT.equals(couleurFond);
			case SiteWebPackage.CONFIGURATION_PAGE__TITRE_SITE:
				return TITRE_SITE_EDEFAULT == null ? titreSite != null : !TITRE_SITE_EDEFAULT.equals(titreSite);
			case SiteWebPackage.CONFIGURATION_PAGE__AUTEURS:
				return AUTEURS_EDEFAULT == null ? auteurs != null : !AUTEURS_EDEFAULT.equals(auteurs);
			case SiteWebPackage.CONFIGURATION_PAGE__COULEUR_POLICE:
				return COULEUR_POLICE_EDEFAULT == null ? couleurPolice != null : !COULEUR_POLICE_EDEFAULT.equals(couleurPolice);
			case SiteWebPackage.CONFIGURATION_PAGE__TAILLE_POLICE:
				return taillePolice != TAILLE_POLICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (couleurFond: ");
		result.append(couleurFond);
		result.append(", titreSite: ");
		result.append(titreSite);
		result.append(", auteurs: ");
		result.append(auteurs);
		result.append(", couleurPolice: ");
		result.append(couleurPolice);
		result.append(", taillePolice: ");
		result.append(taillePolice);
		result.append(')');
		return result.toString();
	}

} //ConfigurationPageImpl
