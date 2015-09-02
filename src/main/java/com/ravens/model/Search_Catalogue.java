/**
 */
package com.ravens.model;

import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Search_Catalogue#getDocumentDetail <em>Document Detail</em>}</li>
 *   <li>{@link model.Search_Catalogue#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getSearch_Catalogue()
 * @model
 * @generated
 */
public interface Search_Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Detail</em>' reference.
	 * @see #setDocumentDetail(Document)
	 * @see model.ModelPackage#getSearch_Catalogue_DocumentDetail()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Document getDocumentDetail(Document newDocumentDetail);

	/**
	 * Sets the value of the '{@link model.Search_Catalogue#getDocumentDetail <em>Document Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Detail</em>' reference.
	 * @see #getDocumentDetail()
	 * @generated
	 */
	void setDocumentDetail(Document value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference list.
	 * The list contents are of type {@link model.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference list.
	 * @see model.ModelPackage#getSearch_Catalogue_Document()
	 * @model ordered="false"
	 * @generated
	 */
	List<Document> getDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void search();

} // Search_Catalogue
