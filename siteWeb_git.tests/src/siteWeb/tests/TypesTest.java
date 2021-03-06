/**
 */
package siteWeb.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import siteWeb.SiteWebFactory;
import siteWeb.Types;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesTest extends TestCase {

	/**
	 * The fixture for this Types test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Types fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypesTest.class);
	}

	/**
	 * Constructs a new Types test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Types test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Types fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Types test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Types getFixture() {
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
		setFixture(SiteWebFactory.eINSTANCE.createTypes());
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

} //TypesTest
