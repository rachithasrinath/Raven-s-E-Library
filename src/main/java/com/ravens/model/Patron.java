/**
 */
package com.ravens.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patron</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Patron#getPatronDetails <em>Patron Details</em>}</li>
 *   <li>{@link model.Patron#getAuthenticationInfo <em>Authentication Info</em>}</li>
 *   <li>{@link model.Patron#getSecurityQue <em>Security Que</em>}</li>
 *   <li>{@link model.Patron#getSearch_Catalogue <em>Search Catalogue</em>}</li>
 *   <li>{@link model.Patron#getPersonalInfo <em>Personal Info</em>}</li>
 *   <li>{@link model.Patron#getSecurityQuestion <em>Security Question</em>}</li>
 *   <li>{@link model.Patron#getPrivileges <em>Privileges</em>}</li>
 *   <li>{@link model.Patron#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link model.Patron#getRequestForm <em>Request Form</em>}</li>
 *   <li>{@link model.Patron#getAdmin <em>Admin</em>}</li>
 *   <li>{@link model.Patron#getLoan <em>Loan</em>}</li>
 *   <li>{@link model.Patron#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link model.Patron#getPatronId <em>Patron Id</em>}</li>
 *   <li>{@link model.Patron#getSubScribe <em>Sub Scribe</em>}</li>
 *   <li>{@link model.Patron#getSubscription <em>Subscription</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPatron()
 * @model
 * @generated
 */
public interface Patron extends EObject {
	/**
	 * Returns the value of the '<em><b>Patron Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patron Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patron Details</em>' reference.
	 * @see #setPatronDetails(PersonalInfo)
	 * @see model.ModelPackage#getPatron_PatronDetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
            PersonalInfo getPatronDetails();

	/**
	 * Sets the value of the '{@link model.Patron#getPatronDetails <em>Patron Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patron Details</em>' reference.
	 * @see #getPatronDetails()
	 * @generated
	 */
	void setPatronDetails(PersonalInfo value);

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
	 * @see model.ModelPackage#getPatron_AuthenticationInfo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Authentication getAuthenticationInfo();

	/**
	 * Sets the value of the '{@link model.Patron#getAuthenticationInfo <em>Authentication Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Info</em>' reference.
	 * @see #getAuthenticationInfo()
	 * @generated
	 */
	void setAuthenticationInfo(Authentication value);

	/**
	 * Returns the value of the '<em><b>Security Que</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Que</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Que</em>' reference.
	 * @see #setSecurityQue(SecurityQuestion)
	 * @see model.ModelPackage#getPatron_SecurityQue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SecurityQuestion getSecurityQue();

	/**
	 * Sets the value of the '{@link model.Patron#getSecurityQue <em>Security Que</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Que</em>' reference.
	 * @see #getSecurityQue()
	 * @generated
	 */
	void setSecurityQue(SecurityQuestion value);

	/**
	 * Returns the value of the '<em><b>Search Catalogue</b></em>' reference list.
	 * The list contents are of type {@link model.Search_Catalogue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Catalogue</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Catalogue</em>' reference list.
	 * @see model.ModelPackage#getPatron_Search_Catalogue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Search_Catalogue> getSearch_Catalogue();

	/**
	 * Returns the value of the '<em><b>Personal Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Info</em>' reference.
	 * @see #setPersonalInfo(PersonalInfo)
	 * @see model.ModelPackage#getPatron_PersonalInfo()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='personal Info'"
	 * @generated
	 */
	PersonalInfo getPersonalInfo();

	/**
	 * Sets the value of the '{@link model.Patron#getPersonalInfo <em>Personal Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Info</em>' reference.
	 * @see #getPersonalInfo()
	 * @generated
	 */
	void setPersonalInfo(PersonalInfo value);

	/**
	 * Returns the value of the '<em><b>Security Question</b></em>' reference list.
	 * The list contents are of type {@link model.SecurityQuestion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Question</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Question</em>' reference list.
	 * @see model.ModelPackage#getPatron_SecurityQuestion()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SecurityQuestion> getSecurityQuestion();

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
	 * @see model.ModelPackage#getPatron_Privileges()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Privileges> getPrivileges();

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
	 * @see model.ModelPackage#getPatron_Authentication()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Patron getAuthentication(String username, String password, String role);

	/**
	 * Sets the value of the '{@link model.Patron#getAuthentication <em>Authentication</em>}' reference.
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
	 * @see model.ModelPackage#getPatron_RequestForm()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RequestForm> getRequestForm();

	/**
	 * Returns the value of the '<em><b>Admin</b></em>' reference list.
	 * The list contents are of type {@link model.Admin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' reference list.
	 * @see model.ModelPackage#getPatron_Admin()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Admin> getAdmin();

	/**
	 * Returns the value of the '<em><b>Loan</b></em>' reference list.
	 * The list contents are of type {@link model.Loan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loan</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loan</em>' reference list.
	 * @see model.ModelPackage#getPatron_Loan()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Loan> getLoan();

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
	 * @see model.ModelPackage#getPatron_Feedback()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feedback> getFeedback();

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
	 * @see model.ModelPackage#getPatron_PatronId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPatronId();

	/**
	 * Sets the value of the '{@link model.Patron#getPatronId <em>Patron Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patron Id</em>' attribute.
	 * @see #getPatronId()
	 * @generated
	 */
	void setPatronId(int value);

	/**
	 * Returns the value of the '<em><b>Sub Scribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Scribe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Scribe</em>' reference.
	 * @see #setSubScribe(Subscription)
	 * @see model.ModelPackage#getPatron_SubScribe()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Subscription getSubScribe();

	/**
	 * Sets the value of the '{@link model.Patron#getSubScribe <em>Sub Scribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Scribe</em>' reference.
	 * @see #getSubScribe()
	 * @generated
	 */
	void setSubScribe(Subscription value);

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
	 * @see model.ModelPackage#getPatron_Subscription()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Subscription> getSubscription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model loanTypeDataType="org.eclipse.uml2.types.String" loanTypeRequired="true" loanTypeOrdered="false"
	 * @generated
	 */
	void loanDocument(String loanType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void requestToUpgradePrivileges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void subscribe(subBeanClass ssss);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unSubscribe();

} // Patron
