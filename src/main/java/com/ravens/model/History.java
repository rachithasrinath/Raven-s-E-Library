/**
 */
package com.ravens.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.History#getPatronId <em>Patron Id</em>}</li>
 *   <li>{@link model.History#getPatron <em>Patron</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends EObject {
	/**
	 * Returns the value of the '<em><b>Patron Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patron Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patron Id</em>' attribute.
	 * @see #setPatronId(int)
	 * @see model.ModelPackage#getHistory_PatronId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPatronId();

	/**
	 * Sets the value of the '{@link model.History#getPatronId <em>Patron Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patron Id</em>' attribute.
	 * @see #getPatronId()
	 * @generated
	 */
	void setPatronId(int value);

	/**
	 * Returns the value of the '<em><b>Patron</b></em>' reference list.
	 * The list contents are of type {@link model.Patron}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patron</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patron</em>' reference list.
	 * @see model.ModelPackage#getHistory_Patron()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Patron> getPatron();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void lastBorrowedDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void lastLogin();

} // History
