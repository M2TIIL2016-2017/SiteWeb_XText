/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import siteWeb.Rubriques;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rubriques</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link siteWeb.impl.RubriquesImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link siteWeb.impl.RubriquesImpl#getLien <em>Lien</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RubriquesImpl extends MinimalEObjectImpl.Container implements Rubriques {
	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected String texte = TEXTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLien() <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLien() <em>Lien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLien()
	 * @generated
	 * @ordered
	 */
	protected String lien = LIEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RubriquesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.RUBRIQUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexte() {
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexte(String newTexte) {
		String oldTexte = texte;
		texte = newTexte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.RUBRIQUES__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLien() {
		return lien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLien(String newLien) {
		String oldLien = lien;
		lien = newLien;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.RUBRIQUES__LIEN, oldLien, lien));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteWebPackage.RUBRIQUES__TEXTE:
				return getTexte();
			case SiteWebPackage.RUBRIQUES__LIEN:
				return getLien();
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
			case SiteWebPackage.RUBRIQUES__TEXTE:
				setTexte((String)newValue);
				return;
			case SiteWebPackage.RUBRIQUES__LIEN:
				setLien((String)newValue);
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
			case SiteWebPackage.RUBRIQUES__TEXTE:
				setTexte(TEXTE_EDEFAULT);
				return;
			case SiteWebPackage.RUBRIQUES__LIEN:
				setLien(LIEN_EDEFAULT);
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
			case SiteWebPackage.RUBRIQUES__TEXTE:
				return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
			case SiteWebPackage.RUBRIQUES__LIEN:
				return LIEN_EDEFAULT == null ? lien != null : !LIEN_EDEFAULT.equals(lien);
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
		result.append(" (texte: ");
		result.append(texte);
		result.append(", lien: ");
		result.append(lien);
		result.append(')');
		return result.toString();
	}

} //RubriquesImpl
