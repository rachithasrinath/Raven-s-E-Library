/**
 */
package com.ravens.model;

import com.ravens.model.impl.PatronImpl;
import java.util.List;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Subscription#getSubscriptionName <em>Subscription Name</em>}</li>
 *   <li>{@link model.Subscription#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ModelPackage#getSubscription()
 * @model
 * @generated
 */
public interface Subscription extends EObject {
	/**
	 * Returns the value of the '<em><b>Subscription Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Name</em>' attribute list.
	 * @see model.ModelPackage#getSubscription_SubscriptionName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	subBeanClass getSubscriptionName(int p);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Character}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute list.
	 * @see model.ModelPackage#getSubscription_Status()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Character> getStatus();

} // Subscription
