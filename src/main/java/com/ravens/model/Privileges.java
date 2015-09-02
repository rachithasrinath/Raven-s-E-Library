/**
 */
package com.ravens.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privileges</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Privileges#getPrivilegeType <em>Privilege Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPrivileges()
 * @model
 * @generated
 */
public interface Privileges extends EObject {
	/**
	 * Returns the value of the '<em><b>Privilege Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privilege Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege Type</em>' attribute.
	 * @see #setPrivilegeType(String)
	 * @see model.ModelPackage#getPrivileges_PrivilegeType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPrivilegeType();

	/**
	 * Sets the value of the '{@link model.Privileges#getPrivilegeType <em>Privilege Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege Type</em>' attribute.
	 * @see #getPrivilegeType()
	 * @generated
	 */
	void setPrivilegeType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updatePrivileges();

} // Privileges
