/**
 */
package com.ravens.model.impl;

import com.ravens.database.mysqlConnection;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import com.ravens.model.Admin;
import com.ravens.model.Authentication;
import com.ravens.model.Catalogue;
import com.ravens.model.Feedback;
import com.ravens.model.ModelPackage;
import com.ravens.model.Privileges;
import com.ravens.model.RequestForm;
import com.ravens.model.Search_Catalogue;
import com.ravens.model.Subscription;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
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
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link model.impl.AdminImpl#getAuthenticationInfo <em>Authentication Info</em>}</li>
 * <li>{@link model.impl.AdminImpl#getSubscription <em>Subscription</em>}</li>
 * <li>{@link model.impl.AdminImpl#getSearch_Catalogue <em>Search Catalogue</em>}</li>
 * <li>{@link model.impl.AdminImpl#getPrivileges <em>Privileges</em>}</li>
 * <li>{@link model.impl.AdminImpl#getAuthentication <em>Authentication</em>}</li>
 * <li>{@link model.impl.AdminImpl#getRequestForm <em>Request Form</em>}</li>
 * <li>{@link model.impl.AdminImpl#getCatalogue <em>Catalogue</em>}</li>
 * <li>{@link model.impl.AdminImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdminImpl extends MinimalEObjectImpl.Container implements Admin {

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
     * The cached value of the
     * '{@link #getSubscription() <em>Subscription</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSubscription()
     * @generated
     * @ordered
     */
    protected List<Subscription> subscription;

    /**
     * The cached value of the
     * '{@link #getSearch_Catalogue() <em>Search Catalogue</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getSearch_Catalogue()
     * @generated
     * @ordered
     */
    protected Search_Catalogue search_Catalogue;

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
     * The cached value of the '{@link #getCatalogue() <em>Catalogue</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getCatalogue()
     * @generated
     * @ordered
     */
    protected Catalogue catalogue;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
//	protected AdminImpl() {
//		super();
//	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.ADMIN;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN__AUTHENTICATION_INFO, oldAuthenticationInfo, authenticationInfo));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN__AUTHENTICATION_INFO, oldAuthenticationInfo, authenticationInfo));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public List<Subscription> getSubscription() {
        if (subscription == null) {
            subscription = new EObjectResolvingEList<Subscription>(Subscription.class, this, ModelPackage.ADMIN__SUBSCRIPTION);
        }
        return subscription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Search_Catalogue getSearch_Catalogue() {
        if (search_Catalogue != null && search_Catalogue.eIsProxy()) {
            InternalEObject oldSearch_Catalogue = (InternalEObject) search_Catalogue;
            search_Catalogue = (Search_Catalogue) eResolveProxy(oldSearch_Catalogue);
            if (search_Catalogue != oldSearch_Catalogue) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN__SEARCH_CATALOGUE, oldSearch_Catalogue, search_Catalogue));
                }
            }
        }
        return search_Catalogue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Search_Catalogue basicGetSearch_Catalogue() {
        return search_Catalogue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setSearch_Catalogue(Search_Catalogue newSearch_Catalogue) {
        Search_Catalogue oldSearch_Catalogue = search_Catalogue;
        search_Catalogue = newSearch_Catalogue;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN__SEARCH_CATALOGUE, oldSearch_Catalogue, search_Catalogue));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public List<Privileges> getPrivileges() {
        if (privileges == null) {
            privileges = new EObjectResolvingEList<Privileges>(Privileges.class, this, ModelPackage.ADMIN__PRIVILEGES);
        }
        return privileges;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Authentication getAuthentication(String username, String password, String role) {

        Authentication aaa = new AuthenticationImpl();
        Admin aaaa = new AdminImpl();
        
        System.out.println("the pass" + username + password);

        try {

            Connection connectMe = mysqlConnection.connectMe();
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            preparedStatement = connectMe.prepareStatement("SELECT * FROM Admin WHERE username = ? and password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                resultSet.last();
                aaa.setUserName(username);
                aaa.setPassword(password);
                
                System.out.println("total rows is : " + resultSet.getRow());
                return aaa;

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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN__AUTHENTICATION, oldAuthentication, authentication));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public List<RequestForm> getRequestForm() {
        if (requestForm == null) {
            requestForm = new EObjectResolvingEList<RequestForm>(RequestForm.class, this, ModelPackage.ADMIN__REQUEST_FORM);
        }
        return requestForm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Catalogue getCatalogue() {
        if (catalogue != null && catalogue.eIsProxy()) {
            InternalEObject oldCatalogue = (InternalEObject) catalogue;
            catalogue = (Catalogue) eResolveProxy(oldCatalogue);
            if (catalogue != oldCatalogue) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ADMIN__CATALOGUE, oldCatalogue, catalogue));
                }
            }
        }
        return catalogue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Catalogue basicGetCatalogue() {
        return catalogue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setCatalogue(Catalogue newCatalogue) {
        Catalogue oldCatalogue = catalogue;
        catalogue = newCatalogue;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ADMIN__CATALOGUE, oldCatalogue, catalogue));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Feedback> getFeedback() {
        if (feedback == null) {
            feedback = new EObjectResolvingEList<Feedback>(Feedback.class, this, ModelPackage.ADMIN__FEEDBACK);
        }
        return feedback;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void verifyUser() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void approveRequest() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void addSubscription() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void updateSubscription() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void removeSubcription() {
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
            
            String username= null;
            String password= null;
            String role= null;
		switch (featureID) {
			case ModelPackage.ADMIN__AUTHENTICATION_INFO:
				if (resolve) return getAuthenticationInfo();
				return basicGetAuthenticationInfo();
			case ModelPackage.ADMIN__SUBSCRIPTION:
				return getSubscription();
			case ModelPackage.ADMIN__SEARCH_CATALOGUE:
				if (resolve) return getSearch_Catalogue();
				return basicGetSearch_Catalogue();
			case ModelPackage.ADMIN__PRIVILEGES:
				return getPrivileges();
			case ModelPackage.ADMIN__AUTHENTICATION:
				if (resolve) return getAuthentication( username,password,role);
				return basicGetAuthentication();
			case ModelPackage.ADMIN__REQUEST_FORM:
				return getRequestForm();
			case ModelPackage.ADMIN__CATALOGUE:
				if (resolve) return getCatalogue();
				return basicGetCatalogue();
			case ModelPackage.ADMIN__FEEDBACK:
				return getFeedback();
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
            case ModelPackage.ADMIN__AUTHENTICATION_INFO:
                setAuthenticationInfo((Authentication) newValue);
                return;
            case ModelPackage.ADMIN__SUBSCRIPTION:
                getSubscription().clear();
                getSubscription().addAll((Collection<? extends Subscription>) newValue);
                return;
            case ModelPackage.ADMIN__SEARCH_CATALOGUE:
                setSearch_Catalogue((Search_Catalogue) newValue);
                return;
            case ModelPackage.ADMIN__PRIVILEGES:
                getPrivileges().clear();
                getPrivileges().addAll((Collection<? extends Privileges>) newValue);
                return;
            case ModelPackage.ADMIN__AUTHENTICATION:
                setAuthentication((Authentication) newValue);
                return;
            case ModelPackage.ADMIN__REQUEST_FORM:
                getRequestForm().clear();
                getRequestForm().addAll((Collection<? extends RequestForm>) newValue);
                return;
            case ModelPackage.ADMIN__CATALOGUE:
                setCatalogue((Catalogue) newValue);
                return;
            case ModelPackage.ADMIN__FEEDBACK:
                getFeedback().clear();
                getFeedback().addAll((Collection<? extends Feedback>) newValue);
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
            case ModelPackage.ADMIN__AUTHENTICATION_INFO:
                setAuthenticationInfo((Authentication) null);
                return;
            case ModelPackage.ADMIN__SUBSCRIPTION:
                getSubscription().clear();
                return;
            case ModelPackage.ADMIN__SEARCH_CATALOGUE:
                setSearch_Catalogue((Search_Catalogue) null);
                return;
            case ModelPackage.ADMIN__PRIVILEGES:
                getPrivileges().clear();
                return;
            case ModelPackage.ADMIN__AUTHENTICATION:
                setAuthentication((Authentication) null);
                return;
            case ModelPackage.ADMIN__REQUEST_FORM:
                getRequestForm().clear();
                return;
            case ModelPackage.ADMIN__CATALOGUE:
                setCatalogue((Catalogue) null);
                return;
            case ModelPackage.ADMIN__FEEDBACK:
                getFeedback().clear();
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
            case ModelPackage.ADMIN__AUTHENTICATION_INFO:
                return authenticationInfo != null;
            case ModelPackage.ADMIN__SUBSCRIPTION:
                return subscription != null && !subscription.isEmpty();
            case ModelPackage.ADMIN__SEARCH_CATALOGUE:
                return search_Catalogue != null;
            case ModelPackage.ADMIN__PRIVILEGES:
                return privileges != null && !privileges.isEmpty();
            case ModelPackage.ADMIN__AUTHENTICATION:
                return authentication != null;
            case ModelPackage.ADMIN__REQUEST_FORM:
                return requestForm != null && !requestForm.isEmpty();
            case ModelPackage.ADMIN__CATALOGUE:
                return catalogue != null;
            case ModelPackage.ADMIN__FEEDBACK:
                return feedback != null && !feedback.isEmpty();
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
            case ModelPackage.ADMIN___VERIFY_USER:
                verifyUser();
                return null;
            case ModelPackage.ADMIN___APPROVE_REQUEST:
                approveRequest();
                return null;
            case ModelPackage.ADMIN___ADD_SUBSCRIPTION:
                addSubscription();
                return null;
            case ModelPackage.ADMIN___UPDATE_SUBSCRIPTION:
                updateSubscription();
                return null;
            case ModelPackage.ADMIN___REMOVE_SUBCRIPTION:
                removeSubcription();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} 
