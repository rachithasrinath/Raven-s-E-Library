/**
 */
package com.ravens.model.impl;

import java.util.Collection;

import com.ravens.model.ModelPackage;
import com.ravens.model.RequestForm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.RequestFormImpl#getDocumentDetails <em>Document Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestFormImpl extends MinimalEObjectImpl.Container implements RequestForm {
	/**
	 * The cached value of the '{@link #getDocumentDetails() <em>Document Details</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> documentDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REQUEST_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDocumentDetails() {
		if (documentDetails == null) {
			documentDetails = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.REQUEST_FORM__DOCUMENT_DETAILS);
		}
		return documentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REQUEST_FORM__DOCUMENT_DETAILS:
				return getDocumentDetails();
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
			case ModelPackage.REQUEST_FORM__DOCUMENT_DETAILS:
				getDocumentDetails().clear();
				getDocumentDetails().addAll((Collection<? extends String>)newValue);
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
			case ModelPackage.REQUEST_FORM__DOCUMENT_DETAILS:
				getDocumentDetails().clear();
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
			case ModelPackage.REQUEST_FORM__DOCUMENT_DETAILS:
				return documentDetails != null && !documentDetails.isEmpty();
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
		result.append(" (documentDetails: ");
		result.append(documentDetails);
		result.append(')');
		return result.toString();
	}

} //RequestFormImpl
