/**
 */
package siteWeb.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import siteWeb.PagePrincipale;
import siteWeb.SiteWebFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Page Principale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagePrincipaleTest extends TestCase {

	/**
	 * The fixture for this Page Principale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagePrincipale fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PagePrincipaleTest.class);
	}

	/**
	 * Constructs a new Page Principale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagePrincipaleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Page Principale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PagePrincipale fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Page Principale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PagePrincipale getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SiteWebFactory.eINSTANCE.createPagePrincipale());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PagePrincipaleTest
