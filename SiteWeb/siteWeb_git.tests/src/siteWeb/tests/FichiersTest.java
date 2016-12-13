/**
 */
package siteWeb.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import siteWeb.Fichiers;
import siteWeb.SiteWebFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fichiers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FichiersTest extends TestCase {

	/**
	 * The fixture for this Fichiers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fichiers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FichiersTest.class);
	}

	/**
	 * Constructs a new Fichiers test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FichiersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fichiers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Fichiers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fichiers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fichiers getFixture() {
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
		setFixture(SiteWebFactory.eINSTANCE.createFichiers());
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

} //FichiersTest
