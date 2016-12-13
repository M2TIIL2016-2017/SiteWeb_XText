/**
 */
package siteWeb.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import siteWeb.Rubriques;
import siteWeb.SiteWebFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rubriques</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RubriquesTest extends TestCase {

	/**
	 * The fixture for this Rubriques test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rubriques fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RubriquesTest.class);
	}

	/**
	 * Constructs a new Rubriques test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubriquesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rubriques test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Rubriques fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rubriques test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rubriques getFixture() {
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
		setFixture(SiteWebFactory.eINSTANCE.createRubriques());
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

} //RubriquesTest
