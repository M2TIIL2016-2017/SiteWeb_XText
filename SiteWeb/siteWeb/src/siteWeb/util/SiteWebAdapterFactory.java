/**
 */
package siteWeb.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import siteWeb.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see siteWeb.SiteWebPackage
 * @generated
 */
public class SiteWebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SiteWebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteWebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SiteWebPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteWebSwitch<Adapter> modelSwitch =
		new SiteWebSwitch<Adapter>() {
			@Override
			public Adapter caseContact(Contact object) {
				return createContactAdapter();
			}
			@Override
			public Adapter casePhoto(Photo object) {
				return createPhotoAdapter();
			}
			@Override
			public Adapter caseRubriques(Rubriques object) {
				return createRubriquesAdapter();
			}
			@Override
			public Adapter caseLiens(Liens object) {
				return createLiensAdapter();
			}
			@Override
			public Adapter casePageInterne(PageInterne object) {
				return createPageInterneAdapter();
			}
			@Override
			public Adapter caseTypes(Types object) {
				return createTypesAdapter();
			}
			@Override
			public Adapter caseFichiers(Fichiers object) {
				return createFichiersAdapter();
			}
			@Override
			public Adapter caseConfigurationPage(ConfigurationPage object) {
				return createConfigurationPageAdapter();
			}
			@Override
			public Adapter casePagePrincipale(PagePrincipale object) {
				return createPagePrincipaleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.Contact
	 * @generated
	 */
	public Adapter createContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.Photo
	 * @generated
	 */
	public Adapter createPhotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.Rubriques <em>Rubriques</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.Rubriques
	 * @generated
	 */
	public Adapter createRubriquesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.Liens <em>Liens</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.Liens
	 * @generated
	 */
	public Adapter createLiensAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.PageInterne <em>Page Interne</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.PageInterne
	 * @generated
	 */
	public Adapter createPageInterneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.Fichiers <em>Fichiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.Fichiers
	 * @generated
	 */
	public Adapter createFichiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.ConfigurationPage <em>Configuration Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.ConfigurationPage
	 * @generated
	 */
	public Adapter createConfigurationPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link siteWeb.PagePrincipale <em>Page Principale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see siteWeb.PagePrincipale
	 * @generated
	 */
	public Adapter createPagePrincipaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SiteWebAdapterFactory
