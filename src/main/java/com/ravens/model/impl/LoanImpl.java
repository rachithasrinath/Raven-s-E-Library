/**
 */
package com.ravens.model.impl;

import com.ravens.database.mysqlConnection;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import com.ravens.model.Document;
import com.ravens.model.Loan;
import com.ravens.model.ModelPackage;
import com.ravens.model.loanBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link model.impl.LoanImpl#getIssueDate <em>Issue Date</em>}</li>
 * <li>{@link model.impl.LoanImpl#getReturnDate <em>Return Date</em>}</li>
 * <li>{@link model.impl.LoanImpl#getDocument <em>Document</em>}</li>
 * <li>{@link model.impl.LoanImpl#getLoanType <em>Loan Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoanImpl extends MinimalEObjectImpl.Container implements Loan {

    /**
     * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}'
     * attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getIssueDate()
     * @generated
     * @ordered
     */
    protected EList<Date> issueDate;

    /**
     * The cached value of the '{@link #getReturnDate() <em>Return Date</em>}'
     * attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getReturnDate()
     * @generated
     * @ordered
     */
    protected EList<Date> returnDate;

    /**
     * The cached value of the '{@link #getDocument() <em>Document</em>}'
     * reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDocument()
     * @generated
     * @ordered
     */
    protected Document document;

    /**
     * The cached value of the '{@link #getLoanType() <em>Loan Type</em>}'
     * attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getLoanType()
     * @generated
     * @ordered
     */
    protected EList<String> loanType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated //
     */
//	protected LoanImpl() {
//		super();
//	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.LOAN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Date> getIssueDate() {
        if (issueDate == null) {
            issueDate = new EDataTypeUniqueEList<Date>(Date.class, this, ModelPackage.LOAN__ISSUE_DATE);
        }
        return issueDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<Date> getReturnDate() {
        if (returnDate == null) {
            returnDate = new EDataTypeUniqueEList<Date>(Date.class, this, ModelPackage.LOAN__RETURN_DATE);
        }
        return returnDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Document getDocument() {
        if (document != null && document.eIsProxy()) {
            InternalEObject oldDocument = (InternalEObject) document;
            document = (Document) eResolveProxy(oldDocument);
            if (document != oldDocument) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.LOAN__DOCUMENT, oldDocument, document));
                }
            }
        }
        return document;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Document basicGetDocument() {
        return document;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setDocument(Document newDocument) {
        Document oldDocument = document;
        document = newDocument;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LOAN__DOCUMENT, oldDocument, document));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public EList<String> getLoanType() {
        if (loanType == null) {
            loanType = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.LOAN__LOAN_TYPE);
        }
        return loanType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public List<loanBean> borrowDocument(loanBean document) {

        
        List<loanBean> retLoan = new ArrayList<loanBean>();
        
        try {

            Connection connectMe = mysqlConnection.connectMe();
            PreparedStatement preparedStatement = null;
           
   ResultSet resultSet = null;  
            
            preparedStatement
                    = connectMe.prepareStatement("INSERT into Loan (documentName, borrowDate,returndate,patronId) VALUES (?,?,?,?)");

            preparedStatement.setString(1, document.getDocumentName());
            preparedStatement.setDate(2, new java.sql.Date(document.getIssuedate().getTime()));

            preparedStatement.setDate(3, new java.sql.Date(document.getReturndate().getTime()));
            preparedStatement.setInt(4, document.getPatID());
            preparedStatement.executeUpdate();
            
            
           PreparedStatement preparedStatement1 = null;
           

            
            preparedStatement1
                    = connectMe.prepareStatement("SELECT * from Loan where patronId = ?");
            preparedStatement1.setInt(1, document.getPatID());
            
          resultSet= preparedStatement1.executeQuery();
            
            
                    
           
             while(resultSet.next()){
                 
                 loanBean singRetLoan = new loanBean();

                 singRetLoan.setDocumentName(resultSet.getString("documentName"));
                 singRetLoan.setIssuedate(resultSet.getDate("borrowDate"));
                 singRetLoan.setReturndate(resultSet.getDate("returndate"));
                 retLoan.add(singRetLoan);
                 
             }
             return retLoan;

        } catch (SQLException ex) {
            Logger.getLogger(Search_CatalogueImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
        
        return null;
    }
    
    
    
    
    

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void renewDocument() {
		// TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void returnDocument() {
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
            case ModelPackage.LOAN__ISSUE_DATE:
                return getIssueDate();
            case ModelPackage.LOAN__RETURN_DATE:
                return getReturnDate();
            case ModelPackage.LOAN__DOCUMENT:
                if (resolve) {
                    return getDocument();
                }
                return basicGetDocument();
            case ModelPackage.LOAN__LOAN_TYPE:
                return getLoanType();
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
            case ModelPackage.LOAN__ISSUE_DATE:
                getIssueDate().clear();
                getIssueDate().addAll((Collection<? extends Date>) newValue);
                return;
            case ModelPackage.LOAN__RETURN_DATE:
                getReturnDate().clear();
                getReturnDate().addAll((Collection<? extends Date>) newValue);
                return;
            case ModelPackage.LOAN__DOCUMENT:
                setDocument((Document) newValue);
                return;
            case ModelPackage.LOAN__LOAN_TYPE:
                getLoanType().clear();
                getLoanType().addAll((Collection<? extends String>) newValue);
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
            case ModelPackage.LOAN__ISSUE_DATE:
                getIssueDate().clear();
                return;
            case ModelPackage.LOAN__RETURN_DATE:
                getReturnDate().clear();
                return;
            case ModelPackage.LOAN__DOCUMENT:
                setDocument((Document) null);
                return;
            case ModelPackage.LOAN__LOAN_TYPE:
                getLoanType().clear();
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
            case ModelPackage.LOAN__ISSUE_DATE:
                return issueDate != null && !issueDate.isEmpty();
            case ModelPackage.LOAN__RETURN_DATE:
                return returnDate != null && !returnDate.isEmpty();
            case ModelPackage.LOAN__DOCUMENT:
                return document != null;
            case ModelPackage.LOAN__LOAN_TYPE:
                return loanType != null && !loanType.isEmpty();
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
//			case ModelPackage.LOAN___BORROW_DOCUMENT:
//				borrowDocument();
            //return null;
            case ModelPackage.LOAN___RENEW_DOCUMENT:
                renewDocument();
                return null;
            case ModelPackage.LOAN___RETURN_DOCUMENT:
                returnDocument();
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
        result.append(" (issueDate: ");
        result.append(issueDate);
        result.append(", returnDate: ");
        result.append(returnDate);
        result.append(", loanType: ");
        result.append(loanType);
        result.append(')');
        return result.toString();
    }

} //LoanImpl
