/**
 */
package siteWeb.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import siteWeb.ConfigurationPage;
import siteWeb.SiteWebFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuration Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPageTest extends TestCase {

	/**
	 * The fixture for this Configuration Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigurationPageTest.class);
	}

	/**
	 * Constructs a new Configuration Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Configuration Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfigurationPage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Configuration Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPage getFixture() {
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
		setFixture(SiteWebFactory.eINSTANCE.createConfigurationPage());
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

} //ConfigurationPageTest
