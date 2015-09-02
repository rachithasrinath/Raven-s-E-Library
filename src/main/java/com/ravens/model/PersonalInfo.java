/**
 */
package com.ravens.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personal Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.PersonalInfo#getName <em>Name</em>}</li>
 *   <li>{@link model.PersonalInfo#getEmailId <em>Email Id</em>}</li>
 *   <li>{@link model.PersonalInfo#getPhoneNo <em>Phone No</em>}</li>
 *   <li>{@link model.PersonalInfo#getOccupation <em>Occupation</em>}</li>
 *   <li>{@link model.PersonalInfo#getAge <em>Age</em>}</li>
 *   <li>{@link model.PersonalInfo#getAddress <em>Address</em>}</li>
 *   <li>{@link model.PersonalInfo#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getPersonalInfo()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Personal Info'"
 * @generated
 */
public interface PersonalInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getPersonalInfo_Name()
	 * @model unique="false" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.PersonalInfo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Id</em>' attribute.
	 * @see #setEmailId(String)
	 * @see model.ModelPackage#getPersonalInfo_EmailId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmailId();

	/**
	 * Sets the value of the '{@link model.PersonalInfo#getEmailId <em>Email Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Id</em>' attribute.
	 * @see #getEmailId()
	 * @generated
	 */
	void setEmailId(String value);

	/**
	 * Returns the value of the '<em><b>Phone No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone No</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone No</em>' attribute.
	 * @see #setPhoneNo(int)
	 * @see model.ModelPackage#getPersonalInfo_PhoneNo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPhoneNo();

	/**
	 * Sets the value of the '{@link model.PersonalInfo#getPhoneNo <em>Phone No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone No</em>' attribute.
	 * @see #getPhoneNo()
	 * @generated
	 */
	void setPhoneNo(int value);

	/**
	 * Returns the value of the '<em><b>Occupation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupation</em>' attribute.
	 * @see #setOccupation(String)
	 * @see model.ModelPackage#getPersonalInfo_Occupation()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getOccupation();

	/**
	 * Sets the value of the '{@link model.PersonalInfo#getOccupation <em>Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupation</em>' attribute.
	 * @see #getOccupation()
	 * @generated
	 */
	void setOccupation(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see model.ModelPackage#getPersonalInfo_Age()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link model.PersonalInfo#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see model.ModelPackage#getPersonalInfo_Address()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link model.PersonalInfo#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see #setSex(char)
	 * @see model.ModelPackage#getPersonalInfo_Sex()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getSex();

	/**
	 * Sets the value of the '{@link model.PersonalInfo#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see #getSex()
	 * @generated
	 */
	void setSex(char value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateRecord();

} // PersonalInfo
