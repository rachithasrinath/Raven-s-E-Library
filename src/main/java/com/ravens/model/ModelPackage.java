/**
 */
package com.ravens.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = com.ravens.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.PersonalInfoImpl <em>Personal Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PersonalInfoImpl
	 * @see model.impl.ModelPackageImpl#getPersonalInfo()
	 * @generated
	 */
	int PERSONAL_INFO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO__EMAIL_ID = 1;

	/**
	 * The feature id for the '<em><b>Phone No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO__PHONE_NO = 2;

	/**
	 * The feature id for the '<em><b>Occupation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO__OCCUPATION = 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO__AGE = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO__ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO__SEX = 6;

	/**
	 * The number of structural features of the '<em>Personal Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Update Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO___UPDATE_RECORD = 0;

	/**
	 * The number of operations of the '<em>Personal Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAL_INFO_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FeedbackImpl
	 * @see model.impl.ModelPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.PatronImpl <em>Patron</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PatronImpl
	 * @see model.impl.ModelPackageImpl#getPatron()
	 * @generated
	 */
	int PATRON = 2;

	/**
	 * The feature id for the '<em><b>Patron Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__PATRON_DETAILS = 0;

	/**
	 * The feature id for the '<em><b>Authentication Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__AUTHENTICATION_INFO = 1;

	/**
	 * The feature id for the '<em><b>Security Que</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__SECURITY_QUE = 2;

	/**
	 * The feature id for the '<em><b>Search Catalogue</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__SEARCH_CATALOGUE = 3;

	/**
	 * The feature id for the '<em><b>Personal Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__PERSONAL_INFO = 4;

	/**
	 * The feature id for the '<em><b>Security Question</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__SECURITY_QUESTION = 5;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__PRIVILEGES = 6;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__AUTHENTICATION = 7;

	/**
	 * The feature id for the '<em><b>Request Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__REQUEST_FORM = 8;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__ADMIN = 9;

	/**
	 * The feature id for the '<em><b>Loan</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__LOAN = 10;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__FEEDBACK = 11;

	/**
	 * The feature id for the '<em><b>Patron Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__PATRON_ID = 12;

	/**
	 * The feature id for the '<em><b>Sub Scribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__SUB_SCRIBE = 13;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON__SUBSCRIPTION = 14;

	/**
	 * The number of structural features of the '<em>Patron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON_FEATURE_COUNT = 15;

	/**
	 * The operation id for the '<em>Loan Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON___LOAN_DOCUMENT__STRING = 0;

	/**
	 * The operation id for the '<em>Request To Upgrade Privileges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON___REQUEST_TO_UPGRADE_PRIVILEGES = 1;

	/**
	 * The operation id for the '<em>Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON___SUBSCRIBE = 2;

	/**
	 * The operation id for the '<em>Un Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON___UN_SUBSCRIBE = 3;

	/**
	 * The number of operations of the '<em>Patron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATRON_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link model.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AuthenticationImpl
	 * @see model.impl.ModelPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__PASSWORD = 1;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___LOG_IN = 0;

	/**
	 * The operation id for the '<em>Reset Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___RESET_PASSWORD = 1;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___LOG_OUT = 2;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.SecurityQuestionImpl <em>Security Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SecurityQuestionImpl
	 * @see model.impl.ModelPackageImpl#getSecurityQuestion()
	 * @generated
	 */
	int SECURITY_QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUESTION__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUESTION__ANSWER = 1;

	/**
	 * The number of structural features of the '<em>Security Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUESTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.Search_CatalogueImpl <em>Search Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.Search_CatalogueImpl
	 * @see model.impl.ModelPackageImpl#getSearch_Catalogue()
	 * @generated
	 */
	int SEARCH_CATALOGUE = 5;

	/**
	 * The feature id for the '<em><b>Document Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CATALOGUE__DOCUMENT_DETAIL = 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CATALOGUE__DOCUMENT = 1;

	/**
	 * The number of structural features of the '<em>Search Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CATALOGUE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CATALOGUE___SEARCH = 0;

	/**
	 * The number of operations of the '<em>Search Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CATALOGUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.DocumentImpl
	 * @see model.impl.ModelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EDITION = 3;

	/**
	 * The feature id for the '<em><b>Publication Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PUBLICATION_NAME = 4;

	/**
	 * The feature id for the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PUBLISHED_DATE = 5;

	/**
	 * The feature id for the '<em><b>Loan</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LOAN = 6;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CATALOGUE = 7;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LoanImpl <em>Loan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LoanImpl
	 * @see model.impl.ModelPackageImpl#getLoan()
	 * @generated
	 */
	int LOAN = 7;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__ISSUE_DATE = 0;

	/**
	 * The feature id for the '<em><b>Return Date</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__RETURN_DATE = 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Loan Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN__LOAN_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Loan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Borrow Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN___BORROW_DOCUMENT = 0;

	/**
	 * The operation id for the '<em>Renew Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN___RENEW_DOCUMENT = 1;

	/**
	 * The operation id for the '<em>Return Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN___RETURN_DOCUMENT = 2;

	/**
	 * The number of operations of the '<em>Loan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAN_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link model.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CatalogueImpl
	 * @see model.impl.ModelPackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 8;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE___ADD_DOCUMENT = 0;

	/**
	 * The operation id for the '<em>Remove Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE___REMOVE_DOCUMENT = 1;

	/**
	 * The operation id for the '<em>Update Document Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE___UPDATE_DOCUMENT_DETAILS = 2;

	/**
	 * The operation id for the '<em>Update Document List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE___UPDATE_DOCUMENT_LIST = 3;

	/**
	 * The operation id for the '<em>Update Author List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE___UPDATE_AUTHOR_LIST = 4;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.impl.PrivilegesImpl <em>Privileges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PrivilegesImpl
	 * @see model.impl.ModelPackageImpl#getPrivileges()
	 * @generated
	 */
	int PRIVILEGES = 9;

	/**
	 * The feature id for the '<em><b>Privilege Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGES__PRIVILEGE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Privileges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGES_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Update Privileges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGES___UPDATE_PRIVILEGES = 0;

	/**
	 * The number of operations of the '<em>Privileges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGES_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link model.impl.RequestFormImpl <em>Request Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RequestFormImpl
	 * @see model.impl.ModelPackageImpl#getRequestForm()
	 * @generated
	 */
	int REQUEST_FORM = 10;

	/**
	 * The feature id for the '<em><b>Document Details</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FORM__DOCUMENT_DETAILS = 0;

	/**
	 * The number of structural features of the '<em>Request Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Request Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AdminImpl
	 * @see model.impl.ModelPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 11;

	/**
	 * The feature id for the '<em><b>Authentication Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__AUTHENTICATION_INFO = 0;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__SUBSCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Search Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__SEARCH_CATALOGUE = 2;

	/**
	 * The feature id for the '<em><b>Privileges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PRIVILEGES = 3;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__AUTHENTICATION = 4;

	/**
	 * The feature id for the '<em><b>Request Form</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__REQUEST_FORM = 5;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__CATALOGUE = 6;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__FEEDBACK = 7;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Verify User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___VERIFY_USER = 0;

	/**
	 * The operation id for the '<em>Approve Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___APPROVE_REQUEST = 1;

	/**
	 * The operation id for the '<em>Add Subscription</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___ADD_SUBSCRIPTION = 2;

	/**
	 * The operation id for the '<em>Update Subscription</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___UPDATE_SUBSCRIPTION = 3;

	/**
	 * The operation id for the '<em>Remove Subcription</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___REMOVE_SUBCRIPTION = 4;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link model.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SubscriptionImpl
	 * @see model.impl.ModelPackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Subscription Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__STATUS = 1;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.BookImpl
	 * @see model.impl.ModelPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__AUTHOR = DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ID = DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__EDITION = DOCUMENT__EDITION;

	/**
	 * The feature id for the '<em><b>Publication Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PUBLICATION_NAME = DOCUMENT__PUBLICATION_NAME;

	/**
	 * The feature id for the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PUBLISHED_DATE = DOCUMENT__PUBLISHED_DATE;

	/**
	 * The feature id for the '<em><b>Loan</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__LOAN = DOCUMENT__LOAN;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__CATALOGUE = DOCUMENT__CATALOGUE;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ArticleImpl <em>Article</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ArticleImpl
	 * @see model.impl.ModelPackageImpl#getArticle()
	 * @generated
	 */
	int ARTICLE = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__AUTHOR = DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__ID = DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__EDITION = DOCUMENT__EDITION;

	/**
	 * The feature id for the '<em><b>Publication Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__PUBLICATION_NAME = DOCUMENT__PUBLICATION_NAME;

	/**
	 * The feature id for the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__PUBLISHED_DATE = DOCUMENT__PUBLISHED_DATE;

	/**
	 * The feature id for the '<em><b>Loan</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__LOAN = DOCUMENT__LOAN;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE__CATALOGUE = DOCUMENT__CATALOGUE;

	/**
	 * The number of structural features of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Article</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLE_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.PeriodicalImpl <em>Periodical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PeriodicalImpl
	 * @see model.impl.ModelPackageImpl#getPeriodical()
	 * @generated
	 */
	int PERIODICAL = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__TITLE = DOCUMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__AUTHOR = DOCUMENT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__ID = DOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__EDITION = DOCUMENT__EDITION;

	/**
	 * The feature id for the '<em><b>Publication Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__PUBLICATION_NAME = DOCUMENT__PUBLICATION_NAME;

	/**
	 * The feature id for the '<em><b>Published Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__PUBLISHED_DATE = DOCUMENT__PUBLISHED_DATE;

	/**
	 * The feature id for the '<em><b>Loan</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__LOAN = DOCUMENT__LOAN;

	/**
	 * The feature id for the '<em><b>Catalogue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL__CATALOGUE = DOCUMENT__CATALOGUE;

	/**
	 * The number of structural features of the '<em>Periodical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICAL_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.HistoryImpl
	 * @see model.impl.ModelPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 16;

	/**
	 * The feature id for the '<em><b>Patron Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__PATRON_ID = 0;

	/**
	 * The feature id for the '<em><b>Patron</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__PATRON = 1;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Last Borrowed Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY___LAST_BORROWED_DOCUMENT = 0;

	/**
	 * The operation id for the '<em>Last Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY___LAST_LOGIN = 1;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link model.PersonalInfo <em>Personal Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personal Info</em>'.
	 * @see model.PersonalInfo
	 * @generated
	 */
	EClass getPersonalInfo();

	/**
	 * Returns the meta object for the attribute '{@link model.PersonalInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.PersonalInfo#getName()
	 * @see #getPersonalInfo()
	 * @generated
	 */
	EAttribute getPersonalInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link model.PersonalInfo#getEmailId <em>Email Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Id</em>'.
	 * @see model.PersonalInfo#getEmailId()
	 * @see #getPersonalInfo()
	 * @generated
	 */
	EAttribute getPersonalInfo_EmailId();

	/**
	 * Returns the meta object for the attribute '{@link model.PersonalInfo#getPhoneNo <em>Phone No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone No</em>'.
	 * @see model.PersonalInfo#getPhoneNo()
	 * @see #getPersonalInfo()
	 * @generated
	 */
	EAttribute getPersonalInfo_PhoneNo();

	/**
	 * Returns the meta object for the attribute '{@link model.PersonalInfo#getOccupation <em>Occupation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupation</em>'.
	 * @see model.PersonalInfo#getOccupation()
	 * @see #getPersonalInfo()
	 * @generated
	 */
	EAttribute getPersonalInfo_Occupation();

	/**
	 * Returns the meta object for the attribute '{@link model.PersonalInfo#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see model.PersonalInfo#getAge()
	 * @see #getPersonalInfo()
	 * @generated
	 */
	EAttribute getPersonalInfo_Age();

	/**
	 * Returns the meta object for the attribute '{@link model.PersonalInfo#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see model.PersonalInfo#getAddress()
	 * @see #getPersonalInfo()
	 * @generated
	 */
	EAttribute getPersonalInfo_Address();

	/**
	 * Returns the meta object for the attribute '{@link model.PersonalInfo#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see model.PersonalInfo#getSex()
	 * @see #getPersonalInfo()
	 * @generated
	 */
	EAttribute getPersonalInfo_Sex();

	/**
	 * Returns the meta object for the '{@link model.PersonalInfo#updateRecord() <em>Update Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Record</em>' operation.
	 * @see model.PersonalInfo#updateRecord()
	 * @generated
	 */
	EOperation getPersonalInfo__UpdateRecord();

	/**
	 * Returns the meta object for class '{@link model.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see model.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute list '{@link model.Feedback#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see model.Feedback#getComment()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Comment();

	/**
	 * Returns the meta object for class '{@link model.Patron <em>Patron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patron</em>'.
	 * @see model.Patron
	 * @generated
	 */
	EClass getPatron();

	/**
	 * Returns the meta object for the reference '{@link model.Patron#getPatronDetails <em>Patron Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patron Details</em>'.
	 * @see model.Patron#getPatronDetails()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_PatronDetails();

	/**
	 * Returns the meta object for the reference '{@link model.Patron#getAuthenticationInfo <em>Authentication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Info</em>'.
	 * @see model.Patron#getAuthenticationInfo()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_AuthenticationInfo();

	/**
	 * Returns the meta object for the reference '{@link model.Patron#getSecurityQue <em>Security Que</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Que</em>'.
	 * @see model.Patron#getSecurityQue()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_SecurityQue();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getSearch_Catalogue <em>Search Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Search Catalogue</em>'.
	 * @see model.Patron#getSearch_Catalogue()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_Search_Catalogue();

	/**
	 * Returns the meta object for the reference '{@link model.Patron#getPersonalInfo <em>Personal Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Personal Info</em>'.
	 * @see model.Patron#getPersonalInfo()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_PersonalInfo();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getSecurityQuestion <em>Security Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Question</em>'.
	 * @see model.Patron#getSecurityQuestion()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_SecurityQuestion();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getPrivileges <em>Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Privileges</em>'.
	 * @see model.Patron#getPrivileges()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_Privileges();

	/**
	 * Returns the meta object for the reference '{@link model.Patron#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication</em>'.
	 * @see model.Patron#getAuthentication()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_Authentication();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getRequestForm <em>Request Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request Form</em>'.
	 * @see model.Patron#getRequestForm()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_RequestForm();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Admin</em>'.
	 * @see model.Patron#getAdmin()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_Admin();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getLoan <em>Loan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loan</em>'.
	 * @see model.Patron#getLoan()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_Loan();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedback</em>'.
	 * @see model.Patron#getFeedback()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link model.Patron#getPatronId <em>Patron Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patron Id</em>'.
	 * @see model.Patron#getPatronId()
	 * @see #getPatron()
	 * @generated
	 */
	EAttribute getPatron_PatronId();

	/**
	 * Returns the meta object for the reference '{@link model.Patron#getSubScribe <em>Sub Scribe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Scribe</em>'.
	 * @see model.Patron#getSubScribe()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_SubScribe();

	/**
	 * Returns the meta object for the reference list '{@link model.Patron#getSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscription</em>'.
	 * @see model.Patron#getSubscription()
	 * @see #getPatron()
	 * @generated
	 */
	EReference getPatron_Subscription();

	/**
	 * Returns the meta object for the '{@link model.Patron#loanDocument(java.lang.String) <em>Loan Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Loan Document</em>' operation.
	 * @see model.Patron#loanDocument(java.lang.String)
	 * @generated
	 */
	EOperation getPatron__LoanDocument__String();

	/**
	 * Returns the meta object for the '{@link model.Patron#requestToUpgradePrivileges() <em>Request To Upgrade Privileges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Request To Upgrade Privileges</em>' operation.
	 * @see model.Patron#requestToUpgradePrivileges()
	 * @generated
	 */
	EOperation getPatron__RequestToUpgradePrivileges();

	/**
	 * Returns the meta object for the '{@link model.Patron#subscribe() <em>Subscribe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscribe</em>' operation.
	 * @see model.Patron#subscribe()
	 * @generated
	 */
	EOperation getPatron__Subscribe();

	/**
	 * Returns the meta object for the '{@link model.Patron#unSubscribe() <em>Un Subscribe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Subscribe</em>' operation.
	 * @see model.Patron#unSubscribe()
	 * @generated
	 */
	EOperation getPatron__UnSubscribe();

	/**
	 * Returns the meta object for class '{@link model.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see model.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link model.Authentication#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see model.Authentication#getUserName()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_UserName();

	/**
	 * Returns the meta object for the attribute '{@link model.Authentication#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see model.Authentication#getPassword()
	 * @see #getAuthentication()
	 * @generated
	 */
	EAttribute getAuthentication_Password();

	/**
	 * Returns the meta object for the '{@link model.Authentication#logIn() <em>Log In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log In</em>' operation.
	 * @see model.Authentication#logIn()
	 * @generated
	 */
	EOperation getAuthentication__LogIn();

	/**
	 * Returns the meta object for the '{@link model.Authentication#resetPassword() <em>Reset Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Password</em>' operation.
	 * @see model.Authentication#resetPassword()
	 * @generated
	 */
	EOperation getAuthentication__ResetPassword();

	/**
	 * Returns the meta object for the '{@link model.Authentication#logOut() <em>Log Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Out</em>' operation.
	 * @see model.Authentication#logOut()
	 * @generated
	 */
	EOperation getAuthentication__LogOut();

	/**
	 * Returns the meta object for class '{@link model.SecurityQuestion <em>Security Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Question</em>'.
	 * @see model.SecurityQuestion
	 * @generated
	 */
	EClass getSecurityQuestion();

	/**
	 * Returns the meta object for the attribute '{@link model.SecurityQuestion#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see model.SecurityQuestion#getQuestion()
	 * @see #getSecurityQuestion()
	 * @generated
	 */
	EAttribute getSecurityQuestion_Question();

	/**
	 * Returns the meta object for the attribute '{@link model.SecurityQuestion#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see model.SecurityQuestion#getAnswer()
	 * @see #getSecurityQuestion()
	 * @generated
	 */
	EAttribute getSecurityQuestion_Answer();

	/**
	 * Returns the meta object for class '{@link model.Search_Catalogue <em>Search Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Catalogue</em>'.
	 * @see model.Search_Catalogue
	 * @generated
	 */
	EClass getSearch_Catalogue();

	/**
	 * Returns the meta object for the reference '{@link model.Search_Catalogue#getDocumentDetail <em>Document Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document Detail</em>'.
	 * @see model.Search_Catalogue#getDocumentDetail()
	 * @see #getSearch_Catalogue()
	 * @generated
	 */
	EReference getSearch_Catalogue_DocumentDetail();

	/**
	 * Returns the meta object for the reference list '{@link model.Search_Catalogue#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Document</em>'.
	 * @see model.Search_Catalogue#getDocument()
	 * @see #getSearch_Catalogue()
	 * @generated
	 */
	EReference getSearch_Catalogue_Document();

	/**
	 * Returns the meta object for the '{@link model.Search_Catalogue#search() <em>Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search</em>' operation.
	 * @see model.Search_Catalogue#search()
	 * @generated
	 */
	EOperation getSearch_Catalogue__Search();

	/**
	 * Returns the meta object for class '{@link model.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see model.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see model.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see model.Document#getAuthor()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Author();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see model.Document#getId()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Id();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition</em>'.
	 * @see model.Document#getEdition()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Edition();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#getPublicationName <em>Publication Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Name</em>'.
	 * @see model.Document#getPublicationName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_PublicationName();

	/**
	 * Returns the meta object for the attribute '{@link model.Document#getPublishedDate <em>Published Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published Date</em>'.
	 * @see model.Document#getPublishedDate()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_PublishedDate();

	/**
	 * Returns the meta object for the reference list '{@link model.Document#getLoan <em>Loan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Loan</em>'.
	 * @see model.Document#getLoan()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Loan();

	/**
	 * Returns the meta object for the reference '{@link model.Document#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catalogue</em>'.
	 * @see model.Document#getCatalogue()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Catalogue();

	/**
	 * Returns the meta object for class '{@link model.Loan <em>Loan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loan</em>'.
	 * @see model.Loan
	 * @generated
	 */
	EClass getLoan();

	/**
	 * Returns the meta object for the attribute list '{@link model.Loan#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Issue Date</em>'.
	 * @see model.Loan#getIssueDate()
	 * @see #getLoan()
	 * @generated
	 */
	EAttribute getLoan_IssueDate();

	/**
	 * Returns the meta object for the attribute list '{@link model.Loan#getReturnDate <em>Return Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Return Date</em>'.
	 * @see model.Loan#getReturnDate()
	 * @see #getLoan()
	 * @generated
	 */
	EAttribute getLoan_ReturnDate();

	/**
	 * Returns the meta object for the reference '{@link model.Loan#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see model.Loan#getDocument()
	 * @see #getLoan()
	 * @generated
	 */
	EReference getLoan_Document();

	/**
	 * Returns the meta object for the attribute list '{@link model.Loan#getLoanType <em>Loan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Loan Type</em>'.
	 * @see model.Loan#getLoanType()
	 * @see #getLoan()
	 * @generated
	 */
	EAttribute getLoan_LoanType();

	/**
	 * Returns the meta object for the '{@link model.Loan#borrowDocument() <em>Borrow Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Borrow Document</em>' operation.
	 * @see model.Loan#borrowDocument()
	 * @generated
	 */
	EOperation getLoan__BorrowDocument();

	/**
	 * Returns the meta object for the '{@link model.Loan#renewDocument() <em>Renew Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Renew Document</em>' operation.
	 * @see model.Loan#renewDocument()
	 * @generated
	 */
	EOperation getLoan__RenewDocument();

	/**
	 * Returns the meta object for the '{@link model.Loan#returnDocument() <em>Return Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Document</em>' operation.
	 * @see model.Loan#returnDocument()
	 * @generated
	 */
	EOperation getLoan__ReturnDocument();

	/**
	 * Returns the meta object for class '{@link model.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see model.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the reference '{@link model.Catalogue#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see model.Catalogue#getDocument()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Document();

	/**
	 * Returns the meta object for the '{@link model.Catalogue#addDocument() <em>Add Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Document</em>' operation.
	 * @see model.Catalogue#addDocument()
	 * @generated
	 */
	EOperation getCatalogue__AddDocument();

	/**
	 * Returns the meta object for the '{@link model.Catalogue#removeDocument() <em>Remove Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Document</em>' operation.
	 * @see model.Catalogue#removeDocument()
	 * @generated
	 */
	EOperation getCatalogue__RemoveDocument();

	/**
	 * Returns the meta object for the '{@link model.Catalogue#updateDocumentDetails() <em>Update Document Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Document Details</em>' operation.
	 * @see model.Catalogue#updateDocumentDetails()
	 * @generated
	 */
	EOperation getCatalogue__UpdateDocumentDetails();

	/**
	 * Returns the meta object for the '{@link model.Catalogue#updateDocumentList() <em>Update Document List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Document List</em>' operation.
	 * @see model.Catalogue#updateDocumentList()
	 * @generated
	 */
	EOperation getCatalogue__UpdateDocumentList();

	/**
	 * Returns the meta object for the '{@link model.Catalogue#updateAuthorList() <em>Update Author List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Author List</em>' operation.
	 * @see model.Catalogue#updateAuthorList()
	 * @generated
	 */
	EOperation getCatalogue__UpdateAuthorList();

	/**
	 * Returns the meta object for class '{@link model.Privileges <em>Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privileges</em>'.
	 * @see model.Privileges
	 * @generated
	 */
	EClass getPrivileges();

	/**
	 * Returns the meta object for the attribute '{@link model.Privileges#getPrivilegeType <em>Privilege Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Privilege Type</em>'.
	 * @see model.Privileges#getPrivilegeType()
	 * @see #getPrivileges()
	 * @generated
	 */
	EAttribute getPrivileges_PrivilegeType();

	/**
	 * Returns the meta object for the '{@link model.Privileges#updatePrivileges() <em>Update Privileges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Privileges</em>' operation.
	 * @see model.Privileges#updatePrivileges()
	 * @generated
	 */
	EOperation getPrivileges__UpdatePrivileges();

	/**
	 * Returns the meta object for class '{@link model.RequestForm <em>Request Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Form</em>'.
	 * @see model.RequestForm
	 * @generated
	 */
	EClass getRequestForm();

	/**
	 * Returns the meta object for the attribute list '{@link model.RequestForm#getDocumentDetails <em>Document Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Document Details</em>'.
	 * @see model.RequestForm#getDocumentDetails()
	 * @see #getRequestForm()
	 * @generated
	 */
	EAttribute getRequestForm_DocumentDetails();

	/**
	 * Returns the meta object for class '{@link model.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see model.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the reference '{@link model.Admin#getAuthenticationInfo <em>Authentication Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Info</em>'.
	 * @see model.Admin#getAuthenticationInfo()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_AuthenticationInfo();

	/**
	 * Returns the meta object for the reference list '{@link model.Admin#getSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscription</em>'.
	 * @see model.Admin#getSubscription()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Subscription();

	/**
	 * Returns the meta object for the reference '{@link model.Admin#getSearch_Catalogue <em>Search Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Search Catalogue</em>'.
	 * @see model.Admin#getSearch_Catalogue()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Search_Catalogue();

	/**
	 * Returns the meta object for the reference list '{@link model.Admin#getPrivileges <em>Privileges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Privileges</em>'.
	 * @see model.Admin#getPrivileges()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Privileges();

	/**
	 * Returns the meta object for the reference '{@link model.Admin#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication</em>'.
	 * @see model.Admin#getAuthentication()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Authentication();

	/**
	 * Returns the meta object for the reference list '{@link model.Admin#getRequestForm <em>Request Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request Form</em>'.
	 * @see model.Admin#getRequestForm()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_RequestForm();

	/**
	 * Returns the meta object for the reference '{@link model.Admin#getCatalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catalogue</em>'.
	 * @see model.Admin#getCatalogue()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Catalogue();

	/**
	 * Returns the meta object for the reference list '{@link model.Admin#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedback</em>'.
	 * @see model.Admin#getFeedback()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Feedback();

	/**
	 * Returns the meta object for the '{@link model.Admin#verifyUser() <em>Verify User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify User</em>' operation.
	 * @see model.Admin#verifyUser()
	 * @generated
	 */
	EOperation getAdmin__VerifyUser();

	/**
	 * Returns the meta object for the '{@link model.Admin#approveRequest() <em>Approve Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approve Request</em>' operation.
	 * @see model.Admin#approveRequest()
	 * @generated
	 */
	EOperation getAdmin__ApproveRequest();

	/**
	 * Returns the meta object for the '{@link model.Admin#addSubscription() <em>Add Subscription</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Subscription</em>' operation.
	 * @see model.Admin#addSubscription()
	 * @generated
	 */
	EOperation getAdmin__AddSubscription();

	/**
	 * Returns the meta object for the '{@link model.Admin#updateSubscription() <em>Update Subscription</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Subscription</em>' operation.
	 * @see model.Admin#updateSubscription()
	 * @generated
	 */
	EOperation getAdmin__UpdateSubscription();

	/**
	 * Returns the meta object for the '{@link model.Admin#removeSubcription() <em>Remove Subcription</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Subcription</em>' operation.
	 * @see model.Admin#removeSubcription()
	 * @generated
	 */
	EOperation getAdmin__RemoveSubcription();

	/**
	 * Returns the meta object for class '{@link model.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see model.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the attribute list '{@link model.Subscription#getSubscriptionName <em>Subscription Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Subscription Name</em>'.
	 * @see model.Subscription#getSubscriptionName()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_SubscriptionName();

	/**
	 * Returns the meta object for the attribute list '{@link model.Subscription#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Status</em>'.
	 * @see model.Subscription#getStatus()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Status();

	/**
	 * Returns the meta object for class '{@link model.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see model.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for class '{@link model.Article <em>Article</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Article</em>'.
	 * @see model.Article
	 * @generated
	 */
	EClass getArticle();

	/**
	 * Returns the meta object for class '{@link model.Periodical <em>Periodical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodical</em>'.
	 * @see model.Periodical
	 * @generated
	 */
	EClass getPeriodical();

	/**
	 * Returns the meta object for class '{@link model.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see model.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the attribute '{@link model.History#getPatronId <em>Patron Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patron Id</em>'.
	 * @see model.History#getPatronId()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_PatronId();

	/**
	 * Returns the meta object for the reference list '{@link model.History#getPatron <em>Patron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patron</em>'.
	 * @see model.History#getPatron()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Patron();

	/**
	 * Returns the meta object for the '{@link model.History#lastBorrowedDocument() <em>Last Borrowed Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Last Borrowed Document</em>' operation.
	 * @see model.History#lastBorrowedDocument()
	 * @generated
	 */
	EOperation getHistory__LastBorrowedDocument();

	/**
	 * Returns the meta object for the '{@link model.History#lastLogin() <em>Last Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Last Login</em>' operation.
	 * @see model.History#lastLogin()
	 * @generated
	 */
	EOperation getHistory__LastLogin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.PersonalInfoImpl <em>Personal Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PersonalInfoImpl
		 * @see model.impl.ModelPackageImpl#getPersonalInfo()
		 * @generated
		 */
		EClass PERSONAL_INFO = eINSTANCE.getPersonalInfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFO__NAME = eINSTANCE.getPersonalInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Email Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFO__EMAIL_ID = eINSTANCE.getPersonalInfo_EmailId();

		/**
		 * The meta object literal for the '<em><b>Phone No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFO__PHONE_NO = eINSTANCE.getPersonalInfo_PhoneNo();

		/**
		 * The meta object literal for the '<em><b>Occupation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFO__OCCUPATION = eINSTANCE.getPersonalInfo_Occupation();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFO__AGE = eINSTANCE.getPersonalInfo_Age();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFO__ADDRESS = eINSTANCE.getPersonalInfo_Address();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONAL_INFO__SEX = eINSTANCE.getPersonalInfo_Sex();

		/**
		 * The meta object literal for the '<em><b>Update Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSONAL_INFO___UPDATE_RECORD = eINSTANCE.getPersonalInfo__UpdateRecord();

		/**
		 * The meta object literal for the '{@link model.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FeedbackImpl
		 * @see model.impl.ModelPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__COMMENT = eINSTANCE.getFeedback_Comment();

		/**
		 * The meta object literal for the '{@link model.impl.PatronImpl <em>Patron</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PatronImpl
		 * @see model.impl.ModelPackageImpl#getPatron()
		 * @generated
		 */
		EClass PATRON = eINSTANCE.getPatron();

		/**
		 * The meta object literal for the '<em><b>Patron Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__PATRON_DETAILS = eINSTANCE.getPatron_PatronDetails();

		/**
		 * The meta object literal for the '<em><b>Authentication Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__AUTHENTICATION_INFO = eINSTANCE.getPatron_AuthenticationInfo();

		/**
		 * The meta object literal for the '<em><b>Security Que</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__SECURITY_QUE = eINSTANCE.getPatron_SecurityQue();

		/**
		 * The meta object literal for the '<em><b>Search Catalogue</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__SEARCH_CATALOGUE = eINSTANCE.getPatron_Search_Catalogue();

		/**
		 * The meta object literal for the '<em><b>Personal Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__PERSONAL_INFO = eINSTANCE.getPatron_PersonalInfo();

		/**
		 * The meta object literal for the '<em><b>Security Question</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__SECURITY_QUESTION = eINSTANCE.getPatron_SecurityQuestion();

		/**
		 * The meta object literal for the '<em><b>Privileges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__PRIVILEGES = eINSTANCE.getPatron_Privileges();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__AUTHENTICATION = eINSTANCE.getPatron_Authentication();

		/**
		 * The meta object literal for the '<em><b>Request Form</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__REQUEST_FORM = eINSTANCE.getPatron_RequestForm();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__ADMIN = eINSTANCE.getPatron_Admin();

		/**
		 * The meta object literal for the '<em><b>Loan</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__LOAN = eINSTANCE.getPatron_Loan();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__FEEDBACK = eINSTANCE.getPatron_Feedback();

		/**
		 * The meta object literal for the '<em><b>Patron Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATRON__PATRON_ID = eINSTANCE.getPatron_PatronId();

		/**
		 * The meta object literal for the '<em><b>Sub Scribe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__SUB_SCRIBE = eINSTANCE.getPatron_SubScribe();

		/**
		 * The meta object literal for the '<em><b>Subscription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATRON__SUBSCRIPTION = eINSTANCE.getPatron_Subscription();

		/**
		 * The meta object literal for the '<em><b>Loan Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATRON___LOAN_DOCUMENT__STRING = eINSTANCE.getPatron__LoanDocument__String();

		/**
		 * The meta object literal for the '<em><b>Request To Upgrade Privileges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATRON___REQUEST_TO_UPGRADE_PRIVILEGES = eINSTANCE.getPatron__RequestToUpgradePrivileges();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATRON___SUBSCRIBE = eINSTANCE.getPatron__Subscribe();

		/**
		 * The meta object literal for the '<em><b>Un Subscribe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATRON___UN_SUBSCRIBE = eINSTANCE.getPatron__UnSubscribe();

		/**
		 * The meta object literal for the '{@link model.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AuthenticationImpl
		 * @see model.impl.ModelPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__USER_NAME = eINSTANCE.getAuthentication_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION__PASSWORD = eINSTANCE.getAuthentication_Password();

		/**
		 * The meta object literal for the '<em><b>Log In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___LOG_IN = eINSTANCE.getAuthentication__LogIn();

		/**
		 * The meta object literal for the '<em><b>Reset Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___RESET_PASSWORD = eINSTANCE.getAuthentication__ResetPassword();

		/**
		 * The meta object literal for the '<em><b>Log Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___LOG_OUT = eINSTANCE.getAuthentication__LogOut();

		/**
		 * The meta object literal for the '{@link model.impl.SecurityQuestionImpl <em>Security Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SecurityQuestionImpl
		 * @see model.impl.ModelPackageImpl#getSecurityQuestion()
		 * @generated
		 */
		EClass SECURITY_QUESTION = eINSTANCE.getSecurityQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_QUESTION__QUESTION = eINSTANCE.getSecurityQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_QUESTION__ANSWER = eINSTANCE.getSecurityQuestion_Answer();

		/**
		 * The meta object literal for the '{@link model.impl.Search_CatalogueImpl <em>Search Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.Search_CatalogueImpl
		 * @see model.impl.ModelPackageImpl#getSearch_Catalogue()
		 * @generated
		 */
		EClass SEARCH_CATALOGUE = eINSTANCE.getSearch_Catalogue();

		/**
		 * The meta object literal for the '<em><b>Document Detail</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_CATALOGUE__DOCUMENT_DETAIL = eINSTANCE.getSearch_Catalogue_DocumentDetail();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_CATALOGUE__DOCUMENT = eINSTANCE.getSearch_Catalogue_Document();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEARCH_CATALOGUE___SEARCH = eINSTANCE.getSearch_Catalogue__Search();

		/**
		 * The meta object literal for the '{@link model.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.DocumentImpl
		 * @see model.impl.ModelPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__AUTHOR = eINSTANCE.getDocument_Author();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__ID = eINSTANCE.getDocument_Id();

		/**
		 * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__EDITION = eINSTANCE.getDocument_Edition();

		/**
		 * The meta object literal for the '<em><b>Publication Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__PUBLICATION_NAME = eINSTANCE.getDocument_PublicationName();

		/**
		 * The meta object literal for the '<em><b>Published Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__PUBLISHED_DATE = eINSTANCE.getDocument_PublishedDate();

		/**
		 * The meta object literal for the '<em><b>Loan</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__LOAN = eINSTANCE.getDocument_Loan();

		/**
		 * The meta object literal for the '<em><b>Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__CATALOGUE = eINSTANCE.getDocument_Catalogue();

		/**
		 * The meta object literal for the '{@link model.impl.LoanImpl <em>Loan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LoanImpl
		 * @see model.impl.ModelPackageImpl#getLoan()
		 * @generated
		 */
		EClass LOAN = eINSTANCE.getLoan();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAN__ISSUE_DATE = eINSTANCE.getLoan_IssueDate();

		/**
		 * The meta object literal for the '<em><b>Return Date</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAN__RETURN_DATE = eINSTANCE.getLoan_ReturnDate();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAN__DOCUMENT = eINSTANCE.getLoan_Document();

		/**
		 * The meta object literal for the '<em><b>Loan Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAN__LOAN_TYPE = eINSTANCE.getLoan_LoanType();

		/**
		 * The meta object literal for the '<em><b>Borrow Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOAN___BORROW_DOCUMENT = eINSTANCE.getLoan__BorrowDocument();

		/**
		 * The meta object literal for the '<em><b>Renew Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOAN___RENEW_DOCUMENT = eINSTANCE.getLoan__RenewDocument();

		/**
		 * The meta object literal for the '<em><b>Return Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOAN___RETURN_DOCUMENT = eINSTANCE.getLoan__ReturnDocument();

		/**
		 * The meta object literal for the '{@link model.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CatalogueImpl
		 * @see model.impl.ModelPackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__DOCUMENT = eINSTANCE.getCatalogue_Document();

		/**
		 * The meta object literal for the '<em><b>Add Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATALOGUE___ADD_DOCUMENT = eINSTANCE.getCatalogue__AddDocument();

		/**
		 * The meta object literal for the '<em><b>Remove Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATALOGUE___REMOVE_DOCUMENT = eINSTANCE.getCatalogue__RemoveDocument();

		/**
		 * The meta object literal for the '<em><b>Update Document Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATALOGUE___UPDATE_DOCUMENT_DETAILS = eINSTANCE.getCatalogue__UpdateDocumentDetails();

		/**
		 * The meta object literal for the '<em><b>Update Document List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATALOGUE___UPDATE_DOCUMENT_LIST = eINSTANCE.getCatalogue__UpdateDocumentList();

		/**
		 * The meta object literal for the '<em><b>Update Author List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATALOGUE___UPDATE_AUTHOR_LIST = eINSTANCE.getCatalogue__UpdateAuthorList();

		/**
		 * The meta object literal for the '{@link model.impl.PrivilegesImpl <em>Privileges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PrivilegesImpl
		 * @see model.impl.ModelPackageImpl#getPrivileges()
		 * @generated
		 */
		EClass PRIVILEGES = eINSTANCE.getPrivileges();

		/**
		 * The meta object literal for the '<em><b>Privilege Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVILEGES__PRIVILEGE_TYPE = eINSTANCE.getPrivileges_PrivilegeType();

		/**
		 * The meta object literal for the '<em><b>Update Privileges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIVILEGES___UPDATE_PRIVILEGES = eINSTANCE.getPrivileges__UpdatePrivileges();

		/**
		 * The meta object literal for the '{@link model.impl.RequestFormImpl <em>Request Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RequestFormImpl
		 * @see model.impl.ModelPackageImpl#getRequestForm()
		 * @generated
		 */
		EClass REQUEST_FORM = eINSTANCE.getRequestForm();

		/**
		 * The meta object literal for the '<em><b>Document Details</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_FORM__DOCUMENT_DETAILS = eINSTANCE.getRequestForm_DocumentDetails();

		/**
		 * The meta object literal for the '{@link model.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AdminImpl
		 * @see model.impl.ModelPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Authentication Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__AUTHENTICATION_INFO = eINSTANCE.getAdmin_AuthenticationInfo();

		/**
		 * The meta object literal for the '<em><b>Subscription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__SUBSCRIPTION = eINSTANCE.getAdmin_Subscription();

		/**
		 * The meta object literal for the '<em><b>Search Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__SEARCH_CATALOGUE = eINSTANCE.getAdmin_Search_Catalogue();

		/**
		 * The meta object literal for the '<em><b>Privileges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__PRIVILEGES = eINSTANCE.getAdmin_Privileges();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__AUTHENTICATION = eINSTANCE.getAdmin_Authentication();

		/**
		 * The meta object literal for the '<em><b>Request Form</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__REQUEST_FORM = eINSTANCE.getAdmin_RequestForm();

		/**
		 * The meta object literal for the '<em><b>Catalogue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__CATALOGUE = eINSTANCE.getAdmin_Catalogue();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__FEEDBACK = eINSTANCE.getAdmin_Feedback();

		/**
		 * The meta object literal for the '<em><b>Verify User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___VERIFY_USER = eINSTANCE.getAdmin__VerifyUser();

		/**
		 * The meta object literal for the '<em><b>Approve Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___APPROVE_REQUEST = eINSTANCE.getAdmin__ApproveRequest();

		/**
		 * The meta object literal for the '<em><b>Add Subscription</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___ADD_SUBSCRIPTION = eINSTANCE.getAdmin__AddSubscription();

		/**
		 * The meta object literal for the '<em><b>Update Subscription</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___UPDATE_SUBSCRIPTION = eINSTANCE.getAdmin__UpdateSubscription();

		/**
		 * The meta object literal for the '<em><b>Remove Subcription</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___REMOVE_SUBCRIPTION = eINSTANCE.getAdmin__RemoveSubcription();

		/**
		 * The meta object literal for the '{@link model.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SubscriptionImpl
		 * @see model.impl.ModelPackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Subscription Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__SUBSCRIPTION_NAME = eINSTANCE.getSubscription_SubscriptionName();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__STATUS = eINSTANCE.getSubscription_Status();

		/**
		 * The meta object literal for the '{@link model.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.BookImpl
		 * @see model.impl.ModelPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '{@link model.impl.ArticleImpl <em>Article</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ArticleImpl
		 * @see model.impl.ModelPackageImpl#getArticle()
		 * @generated
		 */
		EClass ARTICLE = eINSTANCE.getArticle();

		/**
		 * The meta object literal for the '{@link model.impl.PeriodicalImpl <em>Periodical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PeriodicalImpl
		 * @see model.impl.ModelPackageImpl#getPeriodical()
		 * @generated
		 */
		EClass PERIODICAL = eINSTANCE.getPeriodical();

		/**
		 * The meta object literal for the '{@link model.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.HistoryImpl
		 * @see model.impl.ModelPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Patron Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__PATRON_ID = eINSTANCE.getHistory_PatronId();

		/**
		 * The meta object literal for the '<em><b>Patron</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__PATRON = eINSTANCE.getHistory_Patron();

		/**
		 * The meta object literal for the '<em><b>Last Borrowed Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY___LAST_BORROWED_DOCUMENT = eINSTANCE.getHistory__LastBorrowedDocument();

		/**
		 * The meta object literal for the '<em><b>Last Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY___LAST_LOGIN = eINSTANCE.getHistory__LastLogin();

	}

} //ModelPackage
