/**
 */
package com.ravens.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import com.ravens.model.History;
import com.ravens.model.ModelPackage;
import com.ravens.model.Patron;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.HistoryImpl#getPatronId <em>Patron Id</em>}</li>
 *   <li>{@link model.impl.HistoryImpl#getPatron <em>Patron</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryImpl extends MinimalEObjectImpl.Container implements History {
	/**
	 * The default value of the '{@link #getPatronId() <em>Patron Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatronId()
	 * @generated
	 * @ordered
	 */
	protected static final int PATRON_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatronId() <em>Patron Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatronId()
	 * @generated
	 * @ordered
	 */
	protected int patronId = PATRON_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatron() <em>Patron</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatron()
	 * @generated
	 * @ordered
	 */
	protected EList<Patron> patron;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPatronId() {
		return patronId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatronId(int newPatronId) {
		int oldPatronId = patronId;
		patronId = newPatronId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HISTORY__PATRON_ID, oldPatronId, patronId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Patron> getPatron() {
		if (patron == null) {
			patron = new EObjectResolvingEList<Patron>(Patron.class, this, ModelPackage.HISTORY__PATRON);
		}
		return patron;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void lastBorrowedDocument() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void lastLogin() {
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
			case ModelPackage.HISTORY__PATRON_ID:
				return getPatronId();
			case ModelPackage.HISTORY__PATRON:
				return getPatron();
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
			case ModelPackage.HISTORY__PATRON_ID:
				setPatronId((Integer)newValue);
				return;
			case ModelPackage.HISTORY__PATRON:
				getPatron().clear();
				getPatron().addAll((Collection<? extends Patron>)newValue);
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
			case ModelPackage.HISTORY__PATRON_ID:
				setPatronId(PATRON_ID_EDEFAULT);
				return;
			case ModelPackage.HISTORY__PATRON:
				getPatron().clear();
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
			case ModelPackage.HISTORY__PATRON_ID:
				return patronId != PATRON_ID_EDEFAULT;
			case ModelPackage.HISTORY__PATRON:
				return patron != null && !patron.isEmpty();
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
			case ModelPackage.HISTORY___LAST_BORROWED_DOCUMENT:
				lastBorrowedDocument();
				return null;
			case ModelPackage.HISTORY___LAST_LOGIN:
				lastLogin();
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
		result.append(" (patronId: ");
		result.append(patronId);
		result.append(')');
		return result.toString();
	}

} //HistoryImpl
