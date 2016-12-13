/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import siteWeb.Liens;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Liens</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link siteWeb.impl.LiensImpl#getFichier <em>Fichier</em>}</li>
 *   <li>{@link siteWeb.impl.LiensImpl#getAdresseWeb <em>Adresse Web</em>}</li>
 *   <li>{@link siteWeb.impl.LiensImpl#getPageInterne <em>Page Interne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiensImpl extends MinimalEObjectImpl.Container implements Liens {
	/**
	 * The default value of the '{@link #getFichier() <em>Fichier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFichier()
	 * @generated
	 * @ordered
	 */
	protected static final String FICHIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFichier() <em>Fichier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFichier()
	 * @generated
	 * @ordered
	 */
	protected String fichier = FICHIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresseWeb() <em>Adresse Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseWeb()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_WEB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresseWeb() <em>Adresse Web</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresseWeb()
	 * @generated
	 * @ordered
	 */
	protected String adresseWeb = ADRESSE_WEB_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageInterne() <em>Page Interne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageInterne()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_INTERNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageInterne() <em>Page Interne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageInterne()
	 * @generated
	 * @ordered
	 */
	protected String pageInterne = PAGE_INTERNE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiensImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.LIENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFichier() {
		return fichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFichier(String newFichier) {
		String oldFichier = fichier;
		fichier = newFichier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.LIENS__FICHIER, oldFichier, fichier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresseWeb() {
		return adresseWeb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresseWeb(String newAdresseWeb) {
		String oldAdresseWeb = adresseWeb;
		adresseWeb = newAdresseWeb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.LIENS__ADRESSE_WEB, oldAdresseWeb, adresseWeb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageInterne() {
		return pageInterne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageInterne(String newPageInterne) {
		String oldPageInterne = pageInterne;
		pageInterne = newPageInterne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.LIENS__PAGE_INTERNE, oldPageInterne, pageInterne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteWebPackage.LIENS__FICHIER:
				return getFichier();
			case SiteWebPackage.LIENS__ADRESSE_WEB:
				return getAdresseWeb();
			case SiteWebPackage.LIENS__PAGE_INTERNE:
				return getPageInterne();
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
			case SiteWebPackage.LIENS__FICHIER:
				setFichier((String)newValue);
				return;
			case SiteWebPackage.LIENS__ADRESSE_WEB:
				setAdresseWeb((String)newValue);
				return;
			case SiteWebPackage.LIENS__PAGE_INTERNE:
				setPageInterne((String)newValue);
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
			case SiteWebPackage.LIENS__FICHIER:
				setFichier(FICHIER_EDEFAULT);
				return;
			case SiteWebPackage.LIENS__ADRESSE_WEB:
				setAdresseWeb(ADRESSE_WEB_EDEFAULT);
				return;
			case SiteWebPackage.LIENS__PAGE_INTERNE:
				setPageInterne(PAGE_INTERNE_EDEFAULT);
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
			case SiteWebPackage.LIENS__FICHIER:
				return FICHIER_EDEFAULT == null ? fichier != null : !FICHIER_EDEFAULT.equals(fichier);
			case SiteWebPackage.LIENS__ADRESSE_WEB:
				return ADRESSE_WEB_EDEFAULT == null ? adresseWeb != null : !ADRESSE_WEB_EDEFAULT.equals(adresseWeb);
			case SiteWebPackage.LIENS__PAGE_INTERNE:
				return PAGE_INTERNE_EDEFAULT == null ? pageInterne != null : !PAGE_INTERNE_EDEFAULT.equals(pageInterne);
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
		result.append(" (fichier: ");
		result.append(fichier);
		result.append(", adresseWeb: ");
		result.append(adresseWeb);
		result.append(", pageInterne: ");
		result.append(pageInterne);
		result.append(')');
		return result.toString();
	}

} //LiensImpl
