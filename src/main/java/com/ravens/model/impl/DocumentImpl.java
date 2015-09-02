/**
 */
package com.ravens.model.impl;

import java.util.Collection;
import java.util.Date;

import com.ravens.model.Catalogue;
import com.ravens.model.Document;
import com.ravens.model.Loan;
import com.ravens.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link model.impl.DocumentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getId <em>Id</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getPublicationName <em>Publication Name</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getPublishedDate <em>Published Date</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getLoan <em>Loan</em>}</li>
 *   <li>{@link model.impl.DocumentImpl#getCatalogue <em>Catalogue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements Document {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected String edition ;

	/**
	 * The default value of the '{@link #getPublicationName() <em>Publication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationName() <em>Publication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationName()
	 * @generated
	 * @ordered
	 */
	protected String publicationName = PUBLICATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublishedDate() <em>Published Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PUBLISHED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishedDate() <em>Published Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishedDate()
	 * @generated
	 * @ordered
	 */
	protected Date publishedDate = PUBLISHED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoan() <em>Loan</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoan()
	 * @generated
	 * @ordered
	 */
	protected EList<Loan> loan;

	/**
	 * The cached value of the '{@link #getCatalogue() <em>Catalogue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalogue()
	 * @generated
	 * @ordered
	 */
	protected Catalogue catalogue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(String newEdition) {
		String oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__EDITION, oldEdition, edition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicationName() {
		return publicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationName(String newPublicationName) {
		String oldPublicationName = publicationName;
		publicationName = newPublicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__PUBLICATION_NAME, oldPublicationName, publicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishedDate(Date newPublishedDate) {
		Date oldPublishedDate = publishedDate;
		publishedDate = newPublishedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__PUBLISHED_DATE, oldPublishedDate, publishedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Loan> getLoan() {
		if (loan == null) {
			loan = new EObjectResolvingEList<Loan>(Loan.class, this, ModelPackage.DOCUMENT__LOAN);
		}
		return loan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogue getCatalogue() {
		if (catalogue != null && catalogue.eIsProxy()) {
			InternalEObject oldCatalogue = (InternalEObject)catalogue;
			catalogue = (Catalogue)eResolveProxy(oldCatalogue);
			if (catalogue != oldCatalogue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.DOCUMENT__CATALOGUE, oldCatalogue, catalogue));
			}
		}
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogue basicGetCatalogue() {
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalogue(Catalogue newCatalogue) {
		Catalogue oldCatalogue = catalogue;
		catalogue = newCatalogue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENT__CATALOGUE, oldCatalogue, catalogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DOCUMENT__TITLE:
				return getTitle();
			case ModelPackage.DOCUMENT__AUTHOR:
				return getAuthor();
			case ModelPackage.DOCUMENT__ID:
				return getId();
			case ModelPackage.DOCUMENT__EDITION:
				return getEdition();
			case ModelPackage.DOCUMENT__PUBLICATION_NAME:
				return getPublicationName();
			case ModelPackage.DOCUMENT__PUBLISHED_DATE:
				return getPublishedDate();
			case ModelPackage.DOCUMENT__LOAN:
				return getLoan();
			case ModelPackage.DOCUMENT__CATALOGUE:
				if (resolve) return getCatalogue();
				return basicGetCatalogue();
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
			case ModelPackage.DOCUMENT__TITLE:
				setTitle((String)newValue);
				return;
			case ModelPackage.DOCUMENT__AUTHOR:
				setAuthor((String)newValue);
				return;
			case ModelPackage.DOCUMENT__ID:
				setId((Integer)newValue);
				return;
//			case ModelPackage.DOCUMENT__EDITION:
//				setEdition((Character)newValue);
//				return;
			case ModelPackage.DOCUMENT__PUBLICATION_NAME:
				setPublicationName((String)newValue);
				return;
			case ModelPackage.DOCUMENT__PUBLISHED_DATE:
				setPublishedDate((Date)newValue);
				return;
			case ModelPackage.DOCUMENT__LOAN:
				getLoan().clear();
				getLoan().addAll((Collection<? extends Loan>)newValue);
				return;
			case ModelPackage.DOCUMENT__CATALOGUE:
				setCatalogue((Catalogue)newValue);
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
			case ModelPackage.DOCUMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__ID:
				setId(ID_EDEFAULT);
				return;
//			case ModelPackage.DOCUMENT__EDITION:
//				setEdition(EDITION_EDEFAULT);
//				return;
			case ModelPackage.DOCUMENT__PUBLICATION_NAME:
				setPublicationName(PUBLICATION_NAME_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__PUBLISHED_DATE:
				setPublishedDate(PUBLISHED_DATE_EDEFAULT);
				return;
			case ModelPackage.DOCUMENT__LOAN:
				getLoan().clear();
				return;
			case ModelPackage.DOCUMENT__CATALOGUE:
				setCatalogue((Catalogue)null);
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
			case ModelPackage.DOCUMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ModelPackage.DOCUMENT__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case ModelPackage.DOCUMENT__ID:
				return id != ID_EDEFAULT;
//			case ModelPackage.DOCUMENT__EDITION:
//				return edition != EDITION_EDEFAULT;
			case ModelPackage.DOCUMENT__PUBLICATION_NAME:
				return PUBLICATION_NAME_EDEFAULT == null ? publicationName != null : !PUBLICATION_NAME_EDEFAULT.equals(publicationName);
			case ModelPackage.DOCUMENT__PUBLISHED_DATE:
				return PUBLISHED_DATE_EDEFAULT == null ? publishedDate != null : !PUBLISHED_DATE_EDEFAULT.equals(publishedDate);
			case ModelPackage.DOCUMENT__LOAN:
				return loan != null && !loan.isEmpty();
			case ModelPackage.DOCUMENT__CATALOGUE:
				return catalogue != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", author: ");
		result.append(author);
		result.append(", id: ");
		result.append(id);
		result.append(", edition: ");
		result.append(edition);
		result.append(", publicationName: ");
		result.append(publicationName);
		result.append(", publishedDate: ");
		result.append(publishedDate);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
