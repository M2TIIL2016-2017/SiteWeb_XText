/**
 */
package siteWeb.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import siteWeb.Liens;
import siteWeb.SiteWebFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Liens</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiensTest extends TestCase {

	/**
	 * The fixture for this Liens test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Liens fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LiensTest.class);
	}

	/**
	 * Constructs a new Liens test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiensTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Liens test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Liens fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Liens test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Liens getFixture() {
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
		setFixture(SiteWebFactory.eINSTANCE.createLiens());
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

} //LiensTest
