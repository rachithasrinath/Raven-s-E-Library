/**
 */
package com.ravens.model.impl;

import com.ravens.database.mysqlConnection;
import java.util.Collection;

import com.ravens.model.ModelPackage;
import com.ravens.model.Subscription;
import com.ravens.model.subBeanClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.SubscriptionImpl#getSubscriptionName <em>Subscription Name</em>}</li>
 *   <li>{@link model.impl.SubscriptionImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubscriptionImpl extends MinimalEObjectImpl.Container implements Subscription {

    public SubscriptionImpl() {
    }
	/**
	 * The cached value of the '{@link #getSubscriptionName() <em>Subscription Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subscriptionName;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Character> status;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
//	protected SubscriptionImpl() {
//		super();
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subBeanClass getSubscriptionName(int id) {
		
            subBeanClass bc = new subBeanClass();
            
            
            try {
            Connection connectMe = mysqlConnection.connectMe();
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            statement = connectMe.createStatement();

            String query = "select * from Subscription where patronId = ?";
            preparedStatement = connectMe.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
               System.out.println("total rows is : " + resultSet.getRow());
                
               
               
               
               if(resultSet.getBoolean("engineering")==true){
                    bc.setEngineering("CHECKED");
               }
               else{
                   bc.setEngineering("");
               }
               
               if(resultSet.getBoolean("fiction")==true){
                    bc.setFiction("CHECKED");
               }
               else{
                   bc.setFiction("");
               }
               if(resultSet.getBoolean("religion")==true){
                    bc.setReligion("CHECKED");
               }
               else{
                   bc.setReligion("");
               }
               if(resultSet.getBoolean("science")==true){
                    bc.setScience("CHECKED");
               }
               else{
                   bc.setScience("");
               }
               if(resultSet.getBoolean("travelLiving")==true){
                    bc.setTravel("CHECKED");
               }
               else{
                   bc.setTravel("");
               }
               
               
                
                return bc;

            } else {
                System.out.println("No Data");
              
                return bc;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Search_CatalogueImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Character> getStatus() {
		if (status == null) {
			status = new EDataTypeUniqueEList<Character>(Character.class, this, ModelPackage.SUBSCRIPTION__STATUS);
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
//			case ModelPackage.SUBSCRIPTION__SUBSCRIPTION_NAME:
//				return getSubscriptionName();
			case ModelPackage.SUBSCRIPTION__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
//			case ModelPackage.SUBSCRIPTION__SUBSCRIPTION_NAME:
//				getSubscriptionName().clear();
//				getSubscriptionName().addAll((Collection<? extends String>)newValue);
//				return;
			case ModelPackage.SUBSCRIPTION__STATUS:
				getStatus().clear();
				getStatus().addAll((Collection<? extends Character>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
//			case ModelPackage.SUBSCRIPTION__SUBSCRIPTION_NAME:
//				getSubscriptionName().clear();
//				return;
			case ModelPackage.SUBSCRIPTION__STATUS:
				getStatus().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.SUBSCRIPTION__SUBSCRIPTION_NAME:
				return subscriptionName != null && !subscriptionName.isEmpty();
			case ModelPackage.SUBSCRIPTION__STATUS:
				return status != null && !status.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (subscriptionName: ");
		result.append(subscriptionName);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //SubscriptionImpl
