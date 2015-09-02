/**
 */
package com.ravens.model.impl;

import com.ravens.model.ModelPackage;
import com.ravens.model.Catalogue;
import com.ravens.model.RequestForm;
import com.ravens.model.Loan;
import com.ravens.model.History;
import com.ravens.model.Feedback;
import com.ravens.model.Authentication;
import com.ravens.model.Privileges;
import com.ravens.model.Document;
import com.ravens.model.Admin;
import com.ravens.model.PersonalInfo;
import com.ravens.model.Periodical;
import com.ravens.model.Patron;
import com.ravens.model.SecurityQuestion;
import com.ravens.model.Book;
import com.ravens.model.Search_Catalogue;
import com.ravens.model.Subscription;
import com.ravens.model.ModelFactory;
import com.ravens.model.Article;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.PERSONAL_INFO: return createPersonalInfo();
			case ModelPackage.FEEDBACK: return createFeedback();
			case ModelPackage.PATRON: return createPatron();
			case ModelPackage.AUTHENTICATION: return createAuthentication();
			case ModelPackage.SECURITY_QUESTION: return createSecurityQuestion();
			case ModelPackage.SEARCH_CATALOGUE: return createSearch_Catalogue();
			case ModelPackage.DOCUMENT: return createDocument();
			case ModelPackage.LOAN: return createLoan();
			case ModelPackage.CATALOGUE: return createCatalogue();
			case ModelPackage.PRIVILEGES: return createPrivileges();
			case ModelPackage.REQUEST_FORM: return createRequestForm();
			case ModelPackage.ADMIN: return createAdmin();
			case ModelPackage.SUBSCRIPTION: return createSubscription();
			case ModelPackage.BOOK: return createBook();
			case ModelPackage.ARTICLE: return createArticle();
			case ModelPackage.PERIODICAL: return createPeriodical();
			case ModelPackage.HISTORY: return createHistory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonalInfo createPersonalInfo() {
		PersonalInfoImpl personalInfo = new PersonalInfoImpl();
		return personalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback createFeedback() {
		FeedbackImpl feedback = new FeedbackImpl();
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patron createPatron() {
		PatronImpl patron = new PatronImpl();
		return patron;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication createAuthentication() {
		AuthenticationImpl authentication = new AuthenticationImpl();
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityQuestion createSecurityQuestion() {
		SecurityQuestionImpl securityQuestion = new SecurityQuestionImpl();
		return securityQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search_Catalogue createSearch_Catalogue() {
		Search_CatalogueImpl search_Catalogue = new Search_CatalogueImpl();
		return search_Catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loan createLoan() {
		LoanImpl loan = new LoanImpl();
		return loan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privileges createPrivileges() {
		PrivilegesImpl privileges = new PrivilegesImpl();
		return privileges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestForm createRequestForm() {
		RequestFormImpl requestForm = new RequestFormImpl();
		return requestForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription createSubscription() {
		SubscriptionImpl subscription = new SubscriptionImpl();
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Article createArticle() {
		ArticleImpl article = new ArticleImpl();
		return article;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Periodical createPeriodical() {
		PeriodicalImpl periodical = new PeriodicalImpl();
		return periodical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
