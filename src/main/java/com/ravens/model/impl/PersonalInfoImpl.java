/**
 */
package com.ravens.model.impl;

import java.lang.reflect.InvocationTargetException;

import com.ravens.model.ModelPackage;
import com.ravens.model.PersonalInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.PersonalInfoImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.PersonalInfoImpl#getEmailId <em>Email Id</em>}</li>
 *   <li>{@link model.impl.PersonalInfoImpl#getPhoneNo <em>Phone No</em>}</li>
 *   <li>{@link model.impl.PersonalInfoImpl#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link model.impl.PersonalInfoImpl#getAge <em>Age</em>}</li>
 *   <li>{@link model.impl.PersonalInfoImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link model.impl.PersonalInfoImpl#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalInfoImpl extends MinimalEObjectImpl.Container implements PersonalInfo {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailId() <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailId() <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailId()
	 * @generated
	 * @ordered
	 */
	protected String emailId = EMAIL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNo() <em>Phone No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNo()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhoneNo() <em>Phone No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNo()
	 * @generated
	 * @ordered
	 */
	protected int phoneNo = PHONE_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccupation() <em>Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupation()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCUPATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccupation() <em>Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupation()
	 * @generated
	 * @ordered
	 */
	protected String occupation = OCCUPATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final char SEX_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected char sex = SEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERSONAL_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONAL_INFO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailId(String newEmailId) {
		String oldEmailId = emailId;
		emailId = newEmailId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONAL_INFO__EMAIL_ID, oldEmailId, emailId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhoneNo() {
		return phoneNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNo(int newPhoneNo) {
		int oldPhoneNo = phoneNo;
		phoneNo = newPhoneNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONAL_INFO__PHONE_NO, oldPhoneNo, phoneNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccupation(String newOccupation) {
		String oldOccupation = occupation;
		occupation = newOccupation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONAL_INFO__OCCUPATION, oldOccupation, occupation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONAL_INFO__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONAL_INFO__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(char newSex) {
		char oldSex = sex;
		sex = newSex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONAL_INFO__SEX, oldSex, sex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRecord() {
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
			case ModelPackage.PERSONAL_INFO__NAME:
				return getName();
			case ModelPackage.PERSONAL_INFO__EMAIL_ID:
				return getEmailId();
			case ModelPackage.PERSONAL_INFO__PHONE_NO:
				return getPhoneNo();
			case ModelPackage.PERSONAL_INFO__OCCUPATION:
				return getOccupation();
			case ModelPackage.PERSONAL_INFO__AGE:
				return getAge();
			case ModelPackage.PERSONAL_INFO__ADDRESS:
				return getAddress();
			case ModelPackage.PERSONAL_INFO__SEX:
				return getSex();
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
			case ModelPackage.PERSONAL_INFO__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PERSONAL_INFO__EMAIL_ID:
				setEmailId((String)newValue);
				return;
			case ModelPackage.PERSONAL_INFO__PHONE_NO:
				setPhoneNo((Integer)newValue);
				return;
			case ModelPackage.PERSONAL_INFO__OCCUPATION:
				setOccupation((String)newValue);
				return;
			case ModelPackage.PERSONAL_INFO__AGE:
				setAge((Integer)newValue);
				return;
			case ModelPackage.PERSONAL_INFO__ADDRESS:
				setAddress((String)newValue);
				return;
			case ModelPackage.PERSONAL_INFO__SEX:
				setSex((Character)newValue);
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
			case ModelPackage.PERSONAL_INFO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PERSONAL_INFO__EMAIL_ID:
				setEmailId(EMAIL_ID_EDEFAULT);
				return;
			case ModelPackage.PERSONAL_INFO__PHONE_NO:
				setPhoneNo(PHONE_NO_EDEFAULT);
				return;
			case ModelPackage.PERSONAL_INFO__OCCUPATION:
				setOccupation(OCCUPATION_EDEFAULT);
				return;
			case ModelPackage.PERSONAL_INFO__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case ModelPackage.PERSONAL_INFO__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ModelPackage.PERSONAL_INFO__SEX:
				setSex(SEX_EDEFAULT);
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
			case ModelPackage.PERSONAL_INFO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PERSONAL_INFO__EMAIL_ID:
				return EMAIL_ID_EDEFAULT == null ? emailId != null : !EMAIL_ID_EDEFAULT.equals(emailId);
			case ModelPackage.PERSONAL_INFO__PHONE_NO:
				return phoneNo != PHONE_NO_EDEFAULT;
			case ModelPackage.PERSONAL_INFO__OCCUPATION:
				return OCCUPATION_EDEFAULT == null ? occupation != null : !OCCUPATION_EDEFAULT.equals(occupation);
			case ModelPackage.PERSONAL_INFO__AGE:
				return age != AGE_EDEFAULT;
			case ModelPackage.PERSONAL_INFO__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ModelPackage.PERSONAL_INFO__SEX:
				return sex != SEX_EDEFAULT;
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
			case ModelPackage.PERSONAL_INFO___UPDATE_RECORD:
				updateRecord();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", emailId: ");
		result.append(emailId);
		result.append(", phoneNo: ");
		result.append(phoneNo);
		result.append(", occupation: ");
		result.append(occupation);
		result.append(", age: ");
		result.append(age);
		result.append(", address: ");
		result.append(address);
		result.append(", sex: ");
		result.append(sex);
		result.append(')');
		return result.toString();
	}

} //PersonalInfoImpl
