/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import siteWeb.SiteWebPackage;
import siteWeb.Types;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link siteWeb.impl.TypesImpl#isGras <em>Gras</em>}</li>
 *   <li>{@link siteWeb.impl.TypesImpl#isItalique <em>Italique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypesImpl extends MinimalEObjectImpl.Container implements Types {
	/**
	 * The default value of the '{@link #isGras() <em>Gras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGras()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGras() <em>Gras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGras()
	 * @generated
	 * @ordered
	 */
	protected boolean gras = GRAS_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalique() <em>Italique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalique() <em>Italique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalique()
	 * @generated
	 * @ordered
	 */
	protected boolean italique = ITALIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGras() {
		return gras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGras(boolean newGras) {
		boolean oldGras = gras;
		gras = newGras;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.TYPES__GRAS, oldGras, gras));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalique() {
		return italique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalique(boolean newItalique) {
		boolean oldItalique = italique;
		italique = newItalique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.TYPES__ITALIQUE, oldItalique, italique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteWebPackage.TYPES__GRAS:
				return isGras();
			case SiteWebPackage.TYPES__ITALIQUE:
				return isItalique();
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
			case SiteWebPackage.TYPES__GRAS:
				setGras((Boolean)newValue);
				return;
			case SiteWebPackage.TYPES__ITALIQUE:
				setItalique((Boolean)newValue);
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
			case SiteWebPackage.TYPES__GRAS:
				setGras(GRAS_EDEFAULT);
				return;
			case SiteWebPackage.TYPES__ITALIQUE:
				setItalique(ITALIQUE_EDEFAULT);
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
			case SiteWebPackage.TYPES__GRAS:
				return gras != GRAS_EDEFAULT;
			case SiteWebPackage.TYPES__ITALIQUE:
				return italique != ITALIQUE_EDEFAULT;
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
		result.append(" (gras: ");
		result.append(gras);
		result.append(", italique: ");
		result.append(italique);
		result.append(')');
		return result.toString();
	}

} //TypesImpl
