/**
 */
package com.ravens.model;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Admin#getAuthenticationInfo <em>Authentication Info</em>}</li>
 *   <li>{@link model.Admin#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link model.Admin#getSearch_Catalogue <em>Search Catalogue</em>}</li>
 *   <li>{@link model.Admin#getPrivileges <em>Privileges</em>}</li>
 *   <li>{@link model.Admin#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link model.Admin#getRequestForm <em>Request Form</em>}</li>
 *   <li>{@link model.Admin#getCatalogue <em>Catalogue</em>}</li>
 *   <li>{@link model.Admin#getFeedback <em>Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends EObject {
	/**
	 * Returns the value of the '<em><b>Authentication Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Info</em>' reference.
	 * @see #setAuthenticationInfo(Authentication)
	 * @see model.ModelPackage#getAdmin_AuthenticationInfo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Authentication getAuthenticationInfo();

	/**
	 * Sets the value of the '{@link model.Admin#getAuthenticationInfo <em>Authentication Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Info</em>' reference.
	 * @see #getAuthenticationInfo()
	 * @generated
	 */
	void setAuthenticationInfo(Authentication value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' reference list.
	 * The list contents are of type {@link model.Subscription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' reference list.
	 * @see model.ModelPackage#getAdmin_Subscription()
	 * @model ordered="false"
	 * @generated
	 */
	List<Subscription> getSubscription();

	/**
	 * Returns the value of the '<em><b>Search Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Catalogue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Catalogue</em>' reference.
	 * @see #setSearch_Catalogue(Search_Catalogue)
	 * @see model.ModelPackage#getAdmin_Search_Catalogue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Search_Catalogue getSearch_Catalogue();

	/**
	 * Sets the value of the '{@link model.Admin#getSearch_Catalogue <em>Search Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Catalogue</em>' reference.
	 * @see #getSearch_Catalogue()
	 * @generated
	 */
	void setSearch_Catalogue(Search_Catalogue value);

	/**
	 * Returns the value of the '<em><b>Privileges</b></em>' reference list.
	 * The list contents are of type {@link model.Privileges}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privileges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privileges</em>' reference list.
	 * @see model.ModelPackage#getAdmin_Privileges()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	List<Privileges> getPrivileges();

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' reference.
	 * @see #setAuthentication(Authentication)
	 * @see model.ModelPackage#getAdmin_Authentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Authentication getAuthentication(String username,String password,String role);

	/**
	 * Sets the value of the '{@link model.Admin#getAuthentication <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Request Form</b></em>' reference list.
	 * The list contents are of type {@link model.RequestForm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Form</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Form</em>' reference list.
	 * @see model.ModelPackage#getAdmin_RequestForm()
	 * @model ordered="false"
	 * @generated
	 */
	List<RequestForm> getRequestForm();

	/**
	 * Returns the value of the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalogue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogue</em>' reference.
	 * @see #setCatalogue(Catalogue)
	 * @see model.ModelPackage#getAdmin_Catalogue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Catalogue getCatalogue();

	/**
	 * Sets the value of the '{@link model.Admin#getCatalogue <em>Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalogue</em>' reference.
	 * @see #getCatalogue()
	 * @generated
	 */
	void setCatalogue(Catalogue value);

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference list.
	 * The list contents are of type {@link model.Feedback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference list.
	 * @see model.ModelPackage#getAdmin_Feedback()
	 * @model ordered="false"
	 * @generated
	 */
	List<Feedback> getFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void verifyUser();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void approveRequest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addSubscription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateSubscription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeSubcription();

} // Admin
