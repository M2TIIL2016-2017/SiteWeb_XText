/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import siteWeb.Fichiers;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fichiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link siteWeb.impl.FichiersImpl#getType <em>Type</em>}</li>
 *   <li>{@link siteWeb.impl.FichiersImpl#getTaille <em>Taille</em>}</li>
 *   <li>{@link siteWeb.impl.FichiersImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link siteWeb.impl.FichiersImpl#getEmplacement <em>Emplacement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FichiersImpl extends MinimalEObjectImpl.Container implements Fichiers {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaille() <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaille()
	 * @generated
	 * @ordered
	 */
	protected static final int TAILLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTaille() <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaille()
	 * @generated
	 * @ordered
	 */
	protected int taille = TAILLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmplacement() <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplacement()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplacement() <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplacement()
	 * @generated
	 * @ordered
	 */
	protected String emplacement = EMPLACEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FichiersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.FICHIERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.FICHIERS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaille(int newTaille) {
		int oldTaille = taille;
		taille = newTaille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.FICHIERS__TAILLE, oldTaille, taille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.FICHIERS__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmplacement() {
		return emplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmplacement(String newEmplacement) {
		String oldEmplacement = emplacement;
		emplacement = newEmplacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.FICHIERS__EMPLACEMENT, oldEmplacement, emplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteWebPackage.FICHIERS__TYPE:
				return getType();
			case SiteWebPackage.FICHIERS__TAILLE:
				return getTaille();
			case SiteWebPackage.FICHIERS__NOM:
				return getNom();
			case SiteWebPackage.FICHIERS__EMPLACEMENT:
				return getEmplacement();
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
			case SiteWebPackage.FICHIERS__TYPE:
				setType((String)newValue);
				return;
			case SiteWebPackage.FICHIERS__TAILLE:
				setTaille((Integer)newValue);
				return;
			case SiteWebPackage.FICHIERS__NOM:
				setNom((String)newValue);
				return;
			case SiteWebPackage.FICHIERS__EMPLACEMENT:
				setEmplacement((String)newValue);
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
			case SiteWebPackage.FICHIERS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SiteWebPackage.FICHIERS__TAILLE:
				setTaille(TAILLE_EDEFAULT);
				return;
			case SiteWebPackage.FICHIERS__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SiteWebPackage.FICHIERS__EMPLACEMENT:
				setEmplacement(EMPLACEMENT_EDEFAULT);
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
			case SiteWebPackage.FICHIERS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SiteWebPackage.FICHIERS__TAILLE:
				return taille != TAILLE_EDEFAULT;
			case SiteWebPackage.FICHIERS__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SiteWebPackage.FICHIERS__EMPLACEMENT:
				return EMPLACEMENT_EDEFAULT == null ? emplacement != null : !EMPLACEMENT_EDEFAULT.equals(emplacement);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", taille: ");
		result.append(taille);
		result.append(", nom: ");
		result.append(nom);
		result.append(", emplacement: ");
		result.append(emplacement);
		result.append(')');
		return result.toString();
	}

} //FichiersImpl
