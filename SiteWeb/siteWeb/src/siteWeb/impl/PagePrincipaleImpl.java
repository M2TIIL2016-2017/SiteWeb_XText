/**
 */
package siteWeb.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import siteWeb.ConfigurationPage;
import siteWeb.Contact;
import siteWeb.Fichiers;
import siteWeb.PageInterne;
import siteWeb.PagePrincipale;
import siteWeb.Rubriques;
import siteWeb.SiteWebPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Principale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link siteWeb.impl.PagePrincipaleImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link siteWeb.impl.PagePrincipaleImpl#getRubriques <em>Rubriques</em>}</li>
 *   <li>{@link siteWeb.impl.PagePrincipaleImpl#getFichiers <em>Fichiers</em>}</li>
 *   <li>{@link siteWeb.impl.PagePrincipaleImpl#getConfigurationPage <em>Configuration Page</em>}</li>
 *   <li>{@link siteWeb.impl.PagePrincipaleImpl#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PagePrincipaleImpl extends MinimalEObjectImpl.Container implements PagePrincipale {
	/**
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contacts;

	/**
	 * The cached value of the '{@link #getRubriques() <em>Rubriques</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubriques()
	 * @generated
	 * @ordered
	 */
	protected Rubriques rubriques;

	/**
	 * The cached value of the '{@link #getFichiers() <em>Fichiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFichiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Fichiers> fichiers;

	/**
	 * The cached value of the '{@link #getConfigurationPage() <em>Configuration Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationPage()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationPage configurationPage;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<PageInterne> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagePrincipaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteWebPackage.Literals.PAGE_PRINCIPALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<Contact>(Contact.class, this, SiteWebPackage.PAGE_PRINCIPALE__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rubriques getRubriques() {
		return rubriques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubriques(Rubriques newRubriques, NotificationChain msgs) {
		Rubriques oldRubriques = rubriques;
		rubriques = newRubriques;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES, oldRubriques, newRubriques);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubriques(Rubriques newRubriques) {
		if (newRubriques != rubriques) {
			NotificationChain msgs = null;
			if (rubriques != null)
				msgs = ((InternalEObject)rubriques).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES, null, msgs);
			if (newRubriques != null)
				msgs = ((InternalEObject)newRubriques).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES, null, msgs);
			msgs = basicSetRubriques(newRubriques, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES, newRubriques, newRubriques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fichiers> getFichiers() {
		if (fichiers == null) {
			fichiers = new EObjectContainmentEList<Fichiers>(Fichiers.class, this, SiteWebPackage.PAGE_PRINCIPALE__FICHIERS);
		}
		return fichiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPage getConfigurationPage() {
		return configurationPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationPage(ConfigurationPage newConfigurationPage, NotificationChain msgs) {
		ConfigurationPage oldConfigurationPage = configurationPage;
		configurationPage = newConfigurationPage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE, oldConfigurationPage, newConfigurationPage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationPage(ConfigurationPage newConfigurationPage) {
		if (newConfigurationPage != configurationPage) {
			NotificationChain msgs = null;
			if (configurationPage != null)
				msgs = ((InternalEObject)configurationPage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE, null, msgs);
			if (newConfigurationPage != null)
				msgs = ((InternalEObject)newConfigurationPage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE, null, msgs);
			msgs = basicSetConfigurationPage(newConfigurationPage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE, newConfigurationPage, newConfigurationPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageInterne> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<PageInterne>(PageInterne.class, this, SiteWebPackage.PAGE_PRINCIPALE__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteWebPackage.PAGE_PRINCIPALE__CONTACTS:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES:
				return basicSetRubriques(null, msgs);
			case SiteWebPackage.PAGE_PRINCIPALE__FICHIERS:
				return ((InternalEList<?>)getFichiers()).basicRemove(otherEnd, msgs);
			case SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE:
				return basicSetConfigurationPage(null, msgs);
			case SiteWebPackage.PAGE_PRINCIPALE__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
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
			case SiteWebPackage.PAGE_PRINCIPALE__CONTACTS:
				return getContacts();
			case SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES:
				return getRubriques();
			case SiteWebPackage.PAGE_PRINCIPALE__FICHIERS:
				return getFichiers();
			case SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE:
				return getConfigurationPage();
			case SiteWebPackage.PAGE_PRINCIPALE__PAGES:
				return getPages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SiteWebPackage.PAGE_PRINCIPALE__CONTACTS:
				getContacts().clear();
				getContacts().addAll((Collection<? extends Contact>)newValue);
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES:
				setRubriques((Rubriques)newValue);
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__FICHIERS:
				getFichiers().clear();
				getFichiers().addAll((Collection<? extends Fichiers>)newValue);
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE:
				setConfigurationPage((ConfigurationPage)newValue);
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends PageInterne>)newValue);
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
			case SiteWebPackage.PAGE_PRINCIPALE__CONTACTS:
				getContacts().clear();
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES:
				setRubriques((Rubriques)null);
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__FICHIERS:
				getFichiers().clear();
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE:
				setConfigurationPage((ConfigurationPage)null);
				return;
			case SiteWebPackage.PAGE_PRINCIPALE__PAGES:
				getPages().clear();
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
			case SiteWebPackage.PAGE_PRINCIPALE__CONTACTS:
				return contacts != null && !contacts.isEmpty();
			case SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES:
				return rubriques != null;
			case SiteWebPackage.PAGE_PRINCIPALE__FICHIERS:
				return fichiers != null && !fichiers.isEmpty();
			case SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE:
				return configurationPage != null;
			case SiteWebPackage.PAGE_PRINCIPALE__PAGES:
				return pages != null && !pages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PagePrincipaleImpl
