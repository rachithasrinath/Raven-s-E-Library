/**
 */
package com.ravens.model;

import com.ravens.model.impl.LoanImpl;
import com.ravens.model.impl.PatronImpl;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Loan#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link model.Loan#getReturnDate <em>Return Date</em>}</li>
 *   <li>{@link model.Loan#getDocument <em>Document</em>}</li>
 *   <li>{@link model.Loan#getLoanType <em>Loan Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getLoan()
 * @model
 * @generated
 */
public interface Loan extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute list.
	 * @see model.ModelPackage#getLoan_IssueDate()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Date> getIssueDate();

	/**
	 * Returns the value of the '<em><b>Return Date</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Date</em>' attribute list.
	 * @see model.ModelPackage#getLoan_ReturnDate()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Date> getReturnDate();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see model.ModelPackage#getLoan_Document()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link model.Loan#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Loan Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loan Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loan Type</em>' attribute list.
	 * @see model.ModelPackage#getLoan_LoanType()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getLoanType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	 List<loanBean> borrowDocument(loanBean document);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void renewDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void returnDocument();

} // Loan
