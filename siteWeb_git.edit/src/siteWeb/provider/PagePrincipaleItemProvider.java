/**
 */
package siteWeb.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import siteWeb.PagePrincipale;
import siteWeb.SiteWebFactory;
import siteWeb.SiteWebPackage;

/**
 * This is the item provider adapter for a {@link siteWeb.PagePrincipale} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PagePrincipaleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagePrincipaleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SiteWebPackage.Literals.PAGE_PRINCIPALE__CONTACTS);
			childrenFeatures.add(SiteWebPackage.Literals.PAGE_PRINCIPALE__RUBRIQUES);
			childrenFeatures.add(SiteWebPackage.Literals.PAGE_PRINCIPALE__FICHIERS);
			childrenFeatures.add(SiteWebPackage.Literals.PAGE_PRINCIPALE__CONFIGURATION_PAGE);
			childrenFeatures.add(SiteWebPackage.Literals.PAGE_PRINCIPALE__PAGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PagePrincipale.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PagePrincipale"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PagePrincipale_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PagePrincipale.class)) {
			case SiteWebPackage.PAGE_PRINCIPALE__CONTACTS:
			case SiteWebPackage.PAGE_PRINCIPALE__RUBRIQUES:
			case SiteWebPackage.PAGE_PRINCIPALE__FICHIERS:
			case SiteWebPackage.PAGE_PRINCIPALE__CONFIGURATION_PAGE:
			case SiteWebPackage.PAGE_PRINCIPALE__PAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SiteWebPackage.Literals.PAGE_PRINCIPALE__CONTACTS,
				 SiteWebFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(SiteWebPackage.Literals.PAGE_PRINCIPALE__RUBRIQUES,
				 SiteWebFactory.eINSTANCE.createRubriques()));

		newChildDescriptors.add
			(createChildParameter
				(SiteWebPackage.Literals.PAGE_PRINCIPALE__FICHIERS,
				 SiteWebFactory.eINSTANCE.createFichiers()));

		newChildDescriptors.add
			(createChildParameter
				(SiteWebPackage.Literals.PAGE_PRINCIPALE__CONFIGURATION_PAGE,
				 SiteWebFactory.eINSTANCE.createConfigurationPage()));

		newChildDescriptors.add
			(createChildParameter
				(SiteWebPackage.Literals.PAGE_PRINCIPALE__PAGES,
				 SiteWebFactory.eINSTANCE.createPageInterne()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SiteWebEditPlugin.INSTANCE;
	}

}
