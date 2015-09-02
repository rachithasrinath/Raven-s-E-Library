/**
 */
package com.ravens.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.RequestForm#getDocumentDetails <em>Document Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getRequestForm()
 * @model
 * @generated
 */
public interface RequestForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Details</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Details</em>' attribute list.
	 * @see model.ModelPackage#getRequestForm_DocumentDetails()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getDocumentDetails();

} // RequestForm
