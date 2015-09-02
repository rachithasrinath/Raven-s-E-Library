/**
 */
package com.ravens.model.impl;

import com.ravens.database.mysqlConnection;
import com.ravens.model.Book;
import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import com.ravens.model.Document;
import com.ravens.model.ModelPackage;
import com.ravens.model.Search_Catalogue;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
 * An implementation of the model object '<em><b>Search Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link model.impl.Search_CatalogueImpl#getDocumentDetail <em>Document Detail</em>}</li>
 * <li>{@link model.impl.Search_CatalogueImpl#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Search_CatalogueImpl extends MinimalEObjectImpl.Container implements Search_Catalogue {

    /**
     * The cached value of the
     * '{@link #getDocumentDetail() <em>Document Detail</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDocumentDetail()
     * @generated
     * @ordered
     */
    protected Document documentDetail;

    /**
     * The cached value of the '{@link #getDocument() <em>Document</em>}'
     * reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDocument()
     * @generated
     * @ordered
     */
    protected EList<Document> document;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
//    protected Search_CatalogueImpl() {
//        super();
//    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.SEARCH_CATALOGUE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public Document getDocumentDetail(Document newDocumentDetail) {
        try {
            Connection connectMe = mysqlConnection.connectMe();
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            statement = connectMe.createStatement();

            String query = "select * from Catalogue where DocName = ?";
            preparedStatement = connectMe.prepareStatement(query);
            preparedStatement.setString(1, newDocumentDetail.getTitle());
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                resultSet.last();
                System.out.println("total rows is : " + resultSet.getRow());
                return newDocumentDetail;

            } else {
                System.out.println("No Data");
//                newDocumentDetail.setTitle("");
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
    public Document basicGetDocumentDetail() {
        return documentDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void setDocumentDetail(Document newDocumentDetail) {
        try {

            Connection connectMe = mysqlConnection.connectMe();
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            statement = connectMe.createStatement();
            preparedStatement
                    = connectMe.prepareStatement("INSERT into Catalogue (DocName, AuthorName,Edition,PublishedDate,Publication) VALUES (?,?,?,?,?)");

            preparedStatement.setString(1, newDocumentDetail.getTitle());
            preparedStatement.setString(2, newDocumentDetail.getAuthor());
            preparedStatement.setString(3, newDocumentDetail.getEdition());
            preparedStatement.setDate(4, new java.sql.Date(newDocumentDetail.getPublishedDate().getTime()));
            preparedStatement.setString(5, newDocumentDetail.getPublicationName());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Search_CatalogueImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public List<Document> getDocument() {
        try {
            

            List<Document> docList = new ArrayList<Document>();
            Connection connectMe = mysqlConnection.connectMe();
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            statement = connectMe.createStatement();
            resultSet = statement
                    .executeQuery("select * from sql458286.Catalogue");

            while (resultSet.next()) {

                String DocName = resultSet.getString("DocName");
                String AuthorName = resultSet.getString("AuthorName");
                String Edition = resultSet.getString("Edition");
                Date PublicationDate = resultSet.getDate("PublishedDate");
                String Published = resultSet.getString("Publication");

                Document doc = new BookImpl();
                doc.setAuthor(AuthorName);
                doc.setTitle(DocName);
                doc.setEdition(Edition);
                doc.setPublicationName(Published);
                doc.setPublishedDate(PublicationDate);

                docList.add(doc);

            }

            return docList;
        } catch (SQLException ex) {
            Logger.getLogger(Search_CatalogueImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc --> @generated
     */
    public void search() {
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
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT_DETAIL:
                if (resolve) {
                    return getDocumentDetail(documentDetail);
                }
                return basicGetDocumentDetail();
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT:
                return getDocument();
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
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT_DETAIL:
                setDocumentDetail((Document) newValue);
                return;
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT:
                getDocument().clear();
                getDocument().addAll((Collection<? extends Document>) newValue);
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
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT_DETAIL:
                setDocumentDetail((Document) null);
                return;
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT:
                getDocument().clear();
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
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT_DETAIL:
                return documentDetail != null;
            case ModelPackage.SEARCH_CATALOGUE__DOCUMENT:
                return document != null && !document.isEmpty();
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
            case ModelPackage.SEARCH_CATALOGUE___SEARCH:
                search();
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

} //Search_CatalogueImpl
