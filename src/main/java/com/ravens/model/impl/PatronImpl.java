/**
 */
package com.ravens.model.impl;

import com.ravens.database.mysqlConnection;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import com.ravens.model.Admin;
import com.ravens.model.Authentication;
import com.ravens.model.Feedback;
import com.ravens.model.Loan;
import com.ravens.model.ModelPackage;
import com.ravens.model.Patron;
import com.ravens.model.PersonalInfo;
import com.ravens.model.Privileges;
import com.ravens.model.RequestForm;
import com.ravens.model.Search_Catalogue;
import com.ravens.model.SecurityQuestion;
import com.ravens.model.Subscription;
import com.ravens.model.subBeanClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patron</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link model.impl.PatronImpl#getPatronDetails <em>Patron Details</em>}</li>
 * <li>{@link model.impl.PatronImpl#getAuthenticationInfo <em>Authentication Info</em>}</li>
 * <li>{@link model.impl.PatronImpl#getSecurityQue <em>Security Que</em>}</li>
 * <li>{@link model.impl.PatronImpl#getSearch_Catalogue <em>Search Catalogue</em>}</li>
 * <li>{@link model.impl.PatronImpl#getPersonalInfo <em>Personal Info</em>}</li>
 * <li>{@link model.impl.PatronImpl#getSecurityQuestion <em>Security Question</em>}</li>
 * <li>{@link model.impl.PatronImpl#getPrivileges <em>Privileges</em>}</li>
 * <li>{@link model.impl.PatronImpl#getAuthentication <em>Authentication</em>}</li>
 * <li>{@link model.impl.PatronImpl#getRequestForm <em>Request Form</em>}</li>
 * <li>{@link model.impl.PatronImpl#getAdmin <em>Admin</em>}</li>
 * <li>{@link model.impl.PatronImpl#getLoan <em>Loan</em>}</li>
 * <li>{@link model.impl.PatronImpl#getFeedback <em>Feedback</em>}</li>
 * <li>{@link model.impl.PatronImpl#getPatronId <em>Patron Id</em>}</li>
 * <li>{@link model.impl.PatronImpl#getSubScribe <em>Sub Scribe</em>}</li>
 * <li>{@link model.impl.PatronImpl#getSubscription <em>Subscription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatronImpl extends MinimalEObjectImpl.Container implements Patron {

    /**
     * The cached value of the
     * '{@link #getPatronDetails() <em>Patron Details</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPatronDetails()
     * @generated
     * @ordered
     */
    protected PersonalInfo patronDetails;

    /**
     * The cached value of the
     * '{@link #getAuthenticationInfo() <em>Authentication Info</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getAuthenticationInfo()
     * @generated
     * @ordered
     */
    protected Authentication authenticationInfo;

    /**
     * The cached value of the '{@link #getSecurityQue() <em>Security Que</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSecurityQue()
     * @generated
     * @ordered
     */
    protected SecurityQuestion securityQue;

    /**
     * The cached value of the
     * '{@link #getSearch_Catalogue() <em>Search Catalogue</em>}' reference
     * list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSearch_Catalogue()
     * @generated
     * @ordered
     */
    protected EList<Search_Catalogue> search_Catalogue;

    /**
     * The cached value of the
     * '{@link #getPersonalInfo() <em>Personal Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPersonalInfo()
     * @generated
     * @ordered
     */
    protected PersonalInfo personalInfo;

    /**
     * The cached value of the
     * '{@link #getSecurityQuestion() <em>Security Question</em>}' reference
     * list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSecurityQuestion()
     * @generated
     * @ordered
     */
    protected EList<SecurityQuestion> securityQuestion;

    /**
     * The cached value of the '{@link #getPrivileges() <em>Privileges</em>}'
     * reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPrivileges()
     * @generated
     * @ordered
     */
    protected EList<Privileges> privileges;

    /**
     * The cached value of the
     * '{@link #getAuthentication() <em>Authentication</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getAuthentication()
     * @generated
     * @ordered
     */
    protected Authentication authentication;

    /**
     * The cached value of the '{@link #getRequestForm() <em>Request Form</em>}'
     * reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getRequestForm()
     * @generated
     * @ordered
     */
    protected EList<RequestForm> requestForm;

    /**
     * The cached value of the '{@link #getAdmin() <em>Admin</em>}' reference
     * list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getAdmin()
     * @generated
     * @ordered
     */
    protected EList<Admin> admin;

    /**
     * The cached value of the '{@link #getLoan() <em>Loan</em>}' reference
     * list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getLoan()
     * @generated
     * @ordered
     */
    protected EList<Loan> loan;

    /**
     * The cached value of the '{@link #getFeedback() <em>Feedback</em>}'
     * reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getFeedback()
     * @generated
     * @ordered
     */
    protected EList<Feedback> feedback;

    /**
     * The default value of the '{@link #getPatronId() <em>Patron Id</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPatronId()
     * @generated
     * @ordered
     */
    protected static final int PATRON_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPatronId() <em>Patron Id</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getPatronId()
     * @generated
     * @ordered
     */
    protected int patronId = PATRON_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getSubScribe() <em>Sub Scribe</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSubScribe()
     * @generated
     * @ordered
     */
    protected Subscription subScribe;

    /**
     * The cached value of the
     * '{@link #getSubscription() <em>Subscription</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSubscription()
     * @generated
     * @ordered
     */
    protected EList<Subscription> subscription;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
//	protected PatronImpl() {
//		super();
//	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.PATRON;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public PersonalInfo getPatronDetails() {
        if (patronDetails != null && patronDetails.eIsProxy()) {
            InternalEObject oldPatronDetails = (InternalEObject) patronDetails;
            patronDetails = (PersonalInfo) eResolveProxy(oldPatronDetails);
            if (patronDetails != oldPatronDetails) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PATRON__PATRON_DETAILS, oldPatronDetails, patronDetails));
                }
            }
        }
        return patronDetails;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public PersonalInfo basicGetPatronDetails() {
        return patronDetails;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setPatronDetails(PersonalInfo newPatronDetails) {
        PersonalInfo oldPatronDetails = patronDetails;
        patronDetails = newPatronDetails;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PATRON__PATRON_DETAILS, oldPatronDetails, patronDetails));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Authentication getAuthenticationInfo() {
        if (authenticationInfo != null && authenticationInfo.eIsProxy()) {
            InternalEObject oldAuthenticationInfo = (InternalEObject) authenticationInfo;
            authenticationInfo = (Authentication) eResolveProxy(oldAuthenticationInfo);
            if (authenticationInfo != oldAuthenticationInfo) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PATRON__AUTHENTICATION_INFO, oldAuthenticationInfo, authenticationInfo));
                }
            }
        }
        return authenticationInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Authentication basicGetAuthenticationInfo() {
        return authenticationInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setAuthenticationInfo(Authentication newAuthenticationInfo) {
        Authentication oldAuthenticationInfo = authenticationInfo;
        authenticationInfo = newAuthenticationInfo;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PATRON__AUTHENTICATION_INFO, oldAuthenticationInfo, authenticationInfo));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SecurityQuestion getSecurityQue() {
        if (securityQue != null && securityQue.eIsProxy()) {
            InternalEObject oldSecurityQue = (InternalEObject) securityQue;
            securityQue = (SecurityQuestion) eResolveProxy(oldSecurityQue);
            if (securityQue != oldSecurityQue) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PATRON__SECURITY_QUE, oldSecurityQue, securityQue));
                }
            }
        }
        return securityQue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public SecurityQuestion basicGetSecurityQue() {
        return securityQue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setSecurityQue(SecurityQuestion newSecurityQue) {
        SecurityQuestion oldSecurityQue = securityQue;
        securityQue = newSecurityQue;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PATRON__SECURITY_QUE, oldSecurityQue, securityQue));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Search_Catalogue> getSearch_Catalogue() {
        if (search_Catalogue == null) {
            search_Catalogue = new EObjectResolvingEList<Search_Catalogue>(Search_Catalogue.class, this, ModelPackage.PATRON__SEARCH_CATALOGUE);
        }
        return search_Catalogue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public PersonalInfo getPersonalInfo() {
        if (personalInfo != null && personalInfo.eIsProxy()) {
            InternalEObject oldPersonalInfo = (InternalEObject) personalInfo;
            personalInfo = (PersonalInfo) eResolveProxy(oldPersonalInfo);
            if (personalInfo != oldPersonalInfo) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PATRON__PERSONAL_INFO, oldPersonalInfo, personalInfo));
                }
            }
        }
        return personalInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public PersonalInfo basicGetPersonalInfo() {
        return personalInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setPersonalInfo(PersonalInfo newPersonalInfo) {
        PersonalInfo oldPersonalInfo = personalInfo;
        personalInfo = newPersonalInfo;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PATRON__PERSONAL_INFO, oldPersonalInfo, personalInfo));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<SecurityQuestion> getSecurityQuestion() {
        if (securityQuestion == null) {
            securityQuestion = new EObjectResolvingEList<SecurityQuestion>(SecurityQuestion.class, this, ModelPackage.PATRON__SECURITY_QUESTION);
        }
        return securityQuestion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Privileges> getPrivileges() {
        if (privileges == null) {
            privileges = new EObjectResolvingEList<Privileges>(Privileges.class, this, ModelPackage.PATRON__PRIVILEGES);
        }
        return privileges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Patron getAuthentication(String username, String password, String role) {

        Authentication aaa = new AuthenticationImpl();
        Patron aaaa = new PatronImpl();
        PersonalInfo personalInfo = new PersonalInfoImpl();
        System.out.println("the pass" + username + password);

        try {

            Connection connectMe = mysqlConnection.connectMe();
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            preparedStatement = connectMe.prepareStatement("SELECT * FROM Patron WHERE username = ? and password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                resultSet.last();
                aaa.setUserName(username);
                aaa.setPassword(password);
                personalInfo.setName(resultSet.getString("Name"));
                aaaa.setAuthentication(aaa);
                aaaa.setPatronId(resultSet.getInt("id"));
                aaaa.setPatronDetails(personalInfo);
                System.out.println("total rows is : " + resultSet.getRow());
                return aaaa;

            } else {
                System.out.println("No Data");

                return null;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Search_CatalogueImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Authentication basicGetAuthentication() {
        return authentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setAuthentication(Authentication newAuthentication) {
        Authentication oldAuthentication = authentication;
        authentication = newAuthentication;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PATRON__AUTHENTICATION, oldAuthentication, authentication));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<RequestForm> getRequestForm() {
        if (requestForm == null) {
            requestForm = new EObjectResolvingEList<RequestForm>(RequestForm.class, this, ModelPackage.PATRON__REQUEST_FORM);
        }
        return requestForm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Admin> getAdmin() {
        if (admin == null) {
            admin = new EObjectResolvingEList<Admin>(Admin.class, this, ModelPackage.PATRON__ADMIN);
        }
        return admin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Loan> getLoan() {
        if (loan == null) {
            loan = new EObjectResolvingEList<Loan>(Loan.class, this, ModelPackage.PATRON__LOAN);
        }
        return loan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Feedback> getFeedback() {
        if (feedback == null) {
            feedback = new EObjectResolvingEList<Feedback>(Feedback.class, this, ModelPackage.PATRON__FEEDBACK);
        }
        return feedback;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public int getPatronId() {
        return patronId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setPatronId(int newPatronId) {
        int oldPatronId = patronId;
        patronId = newPatronId;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PATRON__PATRON_ID, oldPatronId, patronId));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Subscription getSubScribe() {
        if (subScribe != null && subScribe.eIsProxy()) {
            InternalEObject oldSubScribe = (InternalEObject) subScribe;
            subScribe = (Subscription) eResolveProxy(oldSubScribe);
            if (subScribe != oldSubScribe) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PATRON__SUB_SCRIBE, oldSubScribe, subScribe));
                }
            }
        }
        return subScribe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Subscription basicGetSubScribe() {
        return subScribe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setSubScribe(Subscription newSubScribe) {
        Subscription oldSubScribe = subScribe;
        subScribe = newSubScribe;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PATRON__SUB_SCRIBE, oldSubScribe, subScribe));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Subscription> getSubscription() {
        if (subscription == null) {
            subscription = new EObjectResolvingEList<Subscription>(Subscription.class, this, ModelPackage.PATRON__SUBSCRIPTION);
        }
        return subscription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void loanDocument(String loanType) {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void requestToUpgradePrivileges() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void subscribe(subBeanClass ssss) {

        try {
            Connection connectMe = mysqlConnection.connectMe();
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            statement = connectMe.createStatement();

            preparedStatement = 
                    
                    
         connectMe.prepareStatement("UPDATE Subscription SET science = ?, engineering = ?,travelLiving = ?,fiction = ?,religion = ? where patronId = ?");
      
             if (ssss.getScience().equals("CHECKED") )
             {
                 System.out.println("I am in true");
                preparedStatement.setBoolean(1, true);
            } else {
                preparedStatement.setBoolean(1, false);
            }System.out.println(ssss.getScience());

            if (ssss.getEngineering().equals("CHECKED")){
                preparedStatement.setBoolean(2, true);
            } else {
                preparedStatement.setBoolean(2, false);
            }System.out.println(ssss.getEngineering());

            if (ssss.getTravel().equals("CHECKED")){
                preparedStatement.setBoolean(3, true);
            } else {
                preparedStatement.setBoolean(3, false);
            }System.out.println(ssss.getTravel() );
            
            
            
            if (ssss.getFiction().equals("CHECKED")) {
                preparedStatement.setBoolean(4, true);
            } else {
                preparedStatement.setBoolean(4, false);
            }System.out.println(ssss.getFiction());
            
            
            if (ssss.getReligion().equals("CHECKED")) {
                preparedStatement.setBoolean(5, true);
            } else {
                preparedStatement.setBoolean(5, false);
            }System.out.println(ssss.getReligion());
            
            preparedStatement.setInt(6, ssss.getPatID());
            
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Search_CatalogueImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void unSubscribe() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.PATRON__PATRON_DETAILS:
                if (resolve) {
                    return getPatronDetails();
                }
                return basicGetPatronDetails();
            case ModelPackage.PATRON__AUTHENTICATION_INFO:
                if (resolve) {
                    return getAuthenticationInfo();
                }
                return basicGetAuthenticationInfo();
            case ModelPackage.PATRON__SECURITY_QUE:
                if (resolve) {
                    return getSecurityQue();
                }
                return basicGetSecurityQue();
            case ModelPackage.PATRON__SEARCH_CATALOGUE:
                return getSearch_Catalogue();
            case ModelPackage.PATRON__PERSONAL_INFO:
                if (resolve) {
                    return getPersonalInfo();
                }
                return basicGetPersonalInfo();
            case ModelPackage.PATRON__SECURITY_QUESTION:
                return getSecurityQuestion();
            case ModelPackage.PATRON__PRIVILEGES:
                return getPrivileges();
//			case ModelPackage.PATRON__AUTHENTICATION:
//				if (resolve) return getAuthentication();
//				return basicGetAuthentication();
            case ModelPackage.PATRON__REQUEST_FORM:
                return getRequestForm();
            case ModelPackage.PATRON__ADMIN:
                return getAdmin();
            case ModelPackage.PATRON__LOAN:
                return getLoan();
            case ModelPackage.PATRON__FEEDBACK:
                return getFeedback();
            case ModelPackage.PATRON__PATRON_ID:
                return getPatronId();
            case ModelPackage.PATRON__SUB_SCRIBE:
                if (resolve) {
                    return getSubScribe();
                }
                return basicGetSubScribe();
            case ModelPackage.PATRON__SUBSCRIPTION:
                return getSubscription();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.PATRON__PATRON_DETAILS:
                setPatronDetails((PersonalInfo) newValue);
                return;
            case ModelPackage.PATRON__AUTHENTICATION_INFO:
                setAuthenticationInfo((Authentication) newValue);
                return;
            case ModelPackage.PATRON__SECURITY_QUE:
                setSecurityQue((SecurityQuestion) newValue);
                return;
            case ModelPackage.PATRON__SEARCH_CATALOGUE:
                getSearch_Catalogue().clear();
                getSearch_Catalogue().addAll((Collection<? extends Search_Catalogue>) newValue);
                return;
            case ModelPackage.PATRON__PERSONAL_INFO:
                setPersonalInfo((PersonalInfo) newValue);
                return;
            case ModelPackage.PATRON__SECURITY_QUESTION:
                getSecurityQuestion().clear();
                getSecurityQuestion().addAll((Collection<? extends SecurityQuestion>) newValue);
                return;
            case ModelPackage.PATRON__PRIVILEGES:
                getPrivileges().clear();
                getPrivileges().addAll((Collection<? extends Privileges>) newValue);
                return;
            case ModelPackage.PATRON__AUTHENTICATION:
                setAuthentication((Authentication) newValue);
                return;
            case ModelPackage.PATRON__REQUEST_FORM:
                getRequestForm().clear();
                getRequestForm().addAll((Collection<? extends RequestForm>) newValue);
                return;
            case ModelPackage.PATRON__ADMIN:
                getAdmin().clear();
                getAdmin().addAll((Collection<? extends Admin>) newValue);
                return;
            case ModelPackage.PATRON__LOAN:
                getLoan().clear();
                getLoan().addAll((Collection<? extends Loan>) newValue);
                return;
            case ModelPackage.PATRON__FEEDBACK:
                getFeedback().clear();
                getFeedback().addAll((Collection<? extends Feedback>) newValue);
                return;
            case ModelPackage.PATRON__PATRON_ID:
                setPatronId((Integer) newValue);
                return;
            case ModelPackage.PATRON__SUB_SCRIBE:
                setSubScribe((Subscription) newValue);
                return;
            case ModelPackage.PATRON__SUBSCRIPTION:
                getSubscription().clear();
                getSubscription().addAll((Collection<? extends Subscription>) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ModelPackage.PATRON__PATRON_DETAILS:
                setPatronDetails((PersonalInfo) null);
                return;
            case ModelPackage.PATRON__AUTHENTICATION_INFO:
                setAuthenticationInfo((Authentication) null);
                return;
            case ModelPackage.PATRON__SECURITY_QUE:
                setSecurityQue((SecurityQuestion) null);
                return;
            case ModelPackage.PATRON__SEARCH_CATALOGUE:
                getSearch_Catalogue().clear();
                return;
            case ModelPackage.PATRON__PERSONAL_INFO:
                setPersonalInfo((PersonalInfo) null);
                return;
            case ModelPackage.PATRON__SECURITY_QUESTION:
                getSecurityQuestion().clear();
                return;
            case ModelPackage.PATRON__PRIVILEGES:
                getPrivileges().clear();
                return;
            case ModelPackage.PATRON__AUTHENTICATION:
                setAuthentication((Authentication) null);
                return;
            case ModelPackage.PATRON__REQUEST_FORM:
                getRequestForm().clear();
                return;
            case ModelPackage.PATRON__ADMIN:
                getAdmin().clear();
                return;
            case ModelPackage.PATRON__LOAN:
                getLoan().clear();
                return;
            case ModelPackage.PATRON__FEEDBACK:
                getFeedback().clear();
                return;
            case ModelPackage.PATRON__PATRON_ID:
                setPatronId(PATRON_ID_EDEFAULT);
                return;
            case ModelPackage.PATRON__SUB_SCRIBE:
                setSubScribe((Subscription) null);
                return;
            case ModelPackage.PATRON__SUBSCRIPTION:
                getSubscription().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ModelPackage.PATRON__PATRON_DETAILS:
                return patronDetails != null;
            case ModelPackage.PATRON__AUTHENTICATION_INFO:
                return authenticationInfo != null;
            case ModelPackage.PATRON__SECURITY_QUE:
                return securityQue != null;
            case ModelPackage.PATRON__SEARCH_CATALOGUE:
                return search_Catalogue != null && !search_Catalogue.isEmpty();
            case ModelPackage.PATRON__PERSONAL_INFO:
                return personalInfo != null;
            case ModelPackage.PATRON__SECURITY_QUESTION:
                return securityQuestion != null && !securityQuestion.isEmpty();
            case ModelPackage.PATRON__PRIVILEGES:
                return privileges != null && !privileges.isEmpty();
            case ModelPackage.PATRON__AUTHENTICATION:
                return authentication != null;
            case ModelPackage.PATRON__REQUEST_FORM:
                return requestForm != null && !requestForm.isEmpty();
            case ModelPackage.PATRON__ADMIN:
                return admin != null && !admin.isEmpty();
            case ModelPackage.PATRON__LOAN:
                return loan != null && !loan.isEmpty();
            case ModelPackage.PATRON__FEEDBACK:
                return feedback != null && !feedback.isEmpty();
            case ModelPackage.PATRON__PATRON_ID:
                return patronId != PATRON_ID_EDEFAULT;
            case ModelPackage.PATRON__SUB_SCRIBE:
                return subScribe != null;
            case ModelPackage.PATRON__SUBSCRIPTION:
                return subscription != null && !subscription.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case ModelPackage.PATRON___LOAN_DOCUMENT__STRING:
                loanDocument((String) arguments.get(0));
                return null;
            case ModelPackage.PATRON___REQUEST_TO_UPGRADE_PRIVILEGES:
                requestToUpgradePrivileges();
                return null;
//			case ModelPackage.PATRON___SUBSCRIBE:
//				subscribe();
//				return null;
            case ModelPackage.PATRON___UN_SUBSCRIBE:
                unSubscribe();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (patronId: ");
        result.append(patronId);
        result.append(')');
        return result.toString();
    }

} //PatronImpl
