/**
 */
package siteWeb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import siteWeb.Liens;
import siteWeb.PageInterne;
import siteWeb.Photo;
import siteWeb.SiteWebPackage;
import siteWeb.Types;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Interne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link siteWeb.impl.PageInterneImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link siteWeb.impl.PageInterneImpl#getLiens <em>Liens</em>}</li>
 *   <li>{@link siteWeb.impl.PageInterneImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link siteWeb.impl.PageInterneImpl#getTitrePage <em>Titre Page</em>}</li>
 *   <li>{@link siteWeb.impl.PageInterneImpl#getTexte <em>Texte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageInterneImpl extends MinimalEObjectImpl.Container implements PageInterne {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected Types types;

	/**
	 * The cached value of the '{@link #getLiens() <em>Liens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiens()
	 * @generated
	 * @ordered
	 */
	protected Liens liens;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Photo photo;

	/**
	 * The default value of the '{@link #getTitrePage() <em>Titre Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitrePage()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitrePage() <em>Titre Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitrePage()
	 * @generated
	 * @ordered
	 */
	protected String titrePage = TITRE_PAGE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageInterneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.PAGE_INTERNE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(Types newTypes, NotificationChain msgs) {
		Types oldTypes = types;
		types = newTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__TYPES, oldTypes, newTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(Types newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_INTERNE__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_INTERNE__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__TYPES, newTypes, newTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Liens getLiens() {
		return liens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiens(Liens newLiens, NotificationChain msgs) {
		Liens oldLiens = liens;
		liens = newLiens;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__LIENS, oldLiens, newLiens);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiens(Liens newLiens) {
		if (newLiens != liens) {
			NotificationChain msgs = null;
			if (liens != null)
				msgs = ((InternalEObject)liens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_INTERNE__LIENS, null, msgs);
			if (newLiens != null)
				msgs = ((InternalEObject)newLiens).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_INTERNE__LIENS, null, msgs);
			msgs = basicSetLiens(newLiens, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__LIENS, newLiens, newLiens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo getPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhoto(Photo newPhoto, NotificationChain msgs) {
		Photo oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__PHOTO, oldPhoto, newPhoto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Photo newPhoto) {
		if (newPhoto != photo) {
			NotificationChain msgs = null;
			if (photo != null)
				msgs = ((InternalEObject)photo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_INTERNE__PHOTO, null, msgs);
			if (newPhoto != null)
				msgs = ((InternalEObject)newPhoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_INTERNE__PHOTO, null, msgs);
			msgs = basicSetPhoto(newPhoto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__PHOTO, newPhoto, newPhoto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitrePage() {
		return titrePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitrePage(String newTitrePage) {
		String oldTitrePage = titrePage;
		titrePage = newTitrePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__TITRE_PAGE, oldTitrePage, titrePage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_INTERNE__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteWebPackage.PAGE_INTERNE__TYPES:
				return basicSetTypes(null, msgs);
			case SiteWebPackage.PAGE_INTERNE__LIENS:
				return basicSetLiens(null, msgs);
			case SiteWebPackage.PAGE_INTERNE__PHOTO:
				return basicSetPhoto(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteWebPackage.PAGE_INTERNE__TYPES:
				return getTypes();
			case SiteWebPackage.PAGE_INTERNE__LIENS:
				return getLiens();
			case SiteWebPackage.PAGE_INTERNE__PHOTO:
				return getPhoto();
			case SiteWebPackage.PAGE_INTERNE__TITRE_PAGE:
				return getTitrePage();
			case SiteWebPackage.PAGE_INTERNE__TEXTE:
				return getTexte();
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
			case SiteWebPackage.PAGE_INTERNE__TYPES:
				setTypes((Types)newValue);
				return;
			case SiteWebPackage.PAGE_INTERNE__LIENS:
				setLiens((Liens)newValue);
				return;
			case SiteWebPackage.PAGE_INTERNE__PHOTO:
				setPhoto((Photo)newValue);
				return;
			case SiteWebPackage.PAGE_INTERNE__TITRE_PAGE:
				setTitrePage((String)newValue);
				return;
			case SiteWebPackage.PAGE_INTERNE__TEXTE:
				setTexte((String)newValue);
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
			case SiteWebPackage.PAGE_INTERNE__TYPES:
				setTypes((Types)null);
				return;
			case SiteWebPackage.PAGE_INTERNE__LIENS:
				setLiens((Liens)null);
				return;
			case SiteWebPackage.PAGE_INTERNE__PHOTO:
				setPhoto((Photo)null);
				return;
			case SiteWebPackage.PAGE_INTERNE__TITRE_PAGE:
				setTitrePage(TITRE_PAGE_EDEFAULT);
				return;
			case SiteWebPackage.PAGE_INTERNE__TEXTE:
				setTexte(TEXTE_EDEFAULT);
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
			case SiteWebPackage.PAGE_INTERNE__TYPES:
				return types != null;
			case SiteWebPackage.PAGE_INTERNE__LIENS:
				return liens != null;
			case SiteWebPackage.PAGE_INTERNE__PHOTO:
				return photo != null;
			case SiteWebPackage.PAGE_INTERNE__TITRE_PAGE:
				return TITRE_PAGE_EDEFAULT == null ? titrePage != null : !TITRE_PAGE_EDEFAULT.equals(titrePage);
			case SiteWebPackage.PAGE_INTERNE__TEXTE:
				return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
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
		result.append(" (titrePage: ");
		result.append(titrePage);
		result.append(", texte: ");
		result.append(texte);
		result.append(')');
		return result.toString();
	}

} //PageInterneImpl
