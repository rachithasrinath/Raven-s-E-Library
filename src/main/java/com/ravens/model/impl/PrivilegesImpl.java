/**
 */
package com.ravens.model.impl;

import java.lang.reflect.InvocationTargetException;

import com.ravens.model.ModelPackage;
import com.ravens.model.Privileges;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privileges</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.PrivilegesImpl#getPrivilegeType <em>Privilege Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrivilegesImpl extends MinimalEObjectImpl.Container implements Privileges {
	/**
	 * The default value of the '{@link #getPrivilegeType() <em>Privilege Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeType()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVILEGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivilegeType() <em>Privilege Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeType()
	 * @generated
	 * @ordered
	 */
	protected String privilegeType = PRIVILEGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivilegesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRIVILEGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivilegeType() {
		return privilegeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivilegeType(String newPrivilegeType) {
		String oldPrivilegeType = privilegeType;
		privilegeType = newPrivilegeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRIVILEGES__PRIVILEGE_TYPE, oldPrivilegeType, privilegeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePrivileges() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PRIVILEGES__PRIVILEGE_TYPE:
				return getPrivilegeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PRIVILEGES__PRIVILEGE_TYPE:
				setPrivilegeType((String)newValue);
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
			case ModelPackage.PRIVILEGES__PRIVILEGE_TYPE:
				setPrivilegeType(PRIVILEGE_TYPE_EDEFAULT);
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
			case ModelPackage.PRIVILEGES__PRIVILEGE_TYPE:
				return PRIVILEGE_TYPE_EDEFAULT == null ? privilegeType != null : !PRIVILEGE_TYPE_EDEFAULT.equals(privilegeType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.PRIVILEGES___UPDATE_PRIVILEGES:
				updatePrivileges();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (privilegeType: ");
		result.append(privilegeType);
		result.append(')');
		return result.toString();
	}

} //PrivilegesImpl
