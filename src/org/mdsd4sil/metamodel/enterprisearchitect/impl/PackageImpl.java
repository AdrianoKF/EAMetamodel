/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdsd4sil.metamodel.enterprisearchitect.Diagram;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getPackageId <em>Package Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements org.mdsd4sil.metamodel.enterprisearchitect.Package {
    /**
     * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjects()
     * @generated
     * @ordered
     */
    protected EList<ModelObject> objects;

    /**
     * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagrams()
     * @generated
     * @ordered
     */
    protected EList<Diagram> diagrams;

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
     * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotes()
     * @generated
     * @ordered
     */
    protected static final String NOTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotes()
     * @generated
     * @ordered
     */
    protected String notes = NOTES_EDEFAULT;

    /**
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected String namespace = NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getPackageId() <em>Package Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageId()
     * @generated
     * @ordered
     */
    protected static final int PACKAGE_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPackageId() <em>Package Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackageId()
     * @generated
     * @ordered
     */
    protected int packageId = PACKAGE_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected org.mdsd4sil.metamodel.enterprisearchitect.Package parent;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.PACKAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ModelObject> getObjects() {
        if (objects == null) {
            objects = new EObjectContainmentWithInverseEList<ModelObject>(ModelObject.class, this, EnterpriseArchitectPackage.PACKAGE__OBJECTS, EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE);
        }
        return objects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Diagram> getDiagrams() {
        if (diagrams == null) {
            diagrams = new EObjectContainmentWithInverseEList<Diagram>(Diagram.class, this, EnterpriseArchitectPackage.PACKAGE__DIAGRAMS, EnterpriseArchitectPackage.DIAGRAM__PACKAGE);
        }
        return diagrams;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.PACKAGE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNotes(String newNotes) {
        String oldNotes = notes;
        notes = newNotes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.PACKAGE__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespace(String newNamespace) {
        String oldNamespace = namespace;
        namespace = newNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.PACKAGE__NAMESPACE, oldNamespace, namespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.PACKAGE__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPackageId() {
        return packageId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackageId(int newPackageId) {
        int oldPackageId = packageId;
        packageId = newPackageId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.PACKAGE__PACKAGE_ID, oldPackageId, packageId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.mdsd4sil.metamodel.enterprisearchitect.Package getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = (org.mdsd4sil.metamodel.enterprisearchitect.Package)eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnterpriseArchitectPackage.PACKAGE__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.mdsd4sil.metamodel.enterprisearchitect.Package basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(org.mdsd4sil.metamodel.enterprisearchitect.Package newParent) {
        org.mdsd4sil.metamodel.enterprisearchitect.Package oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.PACKAGE__PARENT, oldParent, parent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EnterpriseArchitectPackage.PACKAGE__OBJECTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjects()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.PACKAGE__DIAGRAMS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagrams()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EnterpriseArchitectPackage.PACKAGE__OBJECTS:
                return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.PACKAGE__DIAGRAMS:
                return ((InternalEList<?>)getDiagrams()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EnterpriseArchitectPackage.PACKAGE__OBJECTS:
                return getObjects();
            case EnterpriseArchitectPackage.PACKAGE__DIAGRAMS:
                return getDiagrams();
            case EnterpriseArchitectPackage.PACKAGE__NAME:
                return getName();
            case EnterpriseArchitectPackage.PACKAGE__NOTES:
                return getNotes();
            case EnterpriseArchitectPackage.PACKAGE__NAMESPACE:
                return getNamespace();
            case EnterpriseArchitectPackage.PACKAGE__VERSION:
                return getVersion();
            case EnterpriseArchitectPackage.PACKAGE__PACKAGE_ID:
                return getPackageId();
            case EnterpriseArchitectPackage.PACKAGE__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
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
            case EnterpriseArchitectPackage.PACKAGE__OBJECTS:
                getObjects().clear();
                getObjects().addAll((Collection<? extends ModelObject>)newValue);
                return;
            case EnterpriseArchitectPackage.PACKAGE__DIAGRAMS:
                getDiagrams().clear();
                getDiagrams().addAll((Collection<? extends Diagram>)newValue);
                return;
            case EnterpriseArchitectPackage.PACKAGE__NAME:
                setName((String)newValue);
                return;
            case EnterpriseArchitectPackage.PACKAGE__NOTES:
                setNotes((String)newValue);
                return;
            case EnterpriseArchitectPackage.PACKAGE__NAMESPACE:
                setNamespace((String)newValue);
                return;
            case EnterpriseArchitectPackage.PACKAGE__VERSION:
                setVersion((String)newValue);
                return;
            case EnterpriseArchitectPackage.PACKAGE__PACKAGE_ID:
                setPackageId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.PACKAGE__PARENT:
                setParent((org.mdsd4sil.metamodel.enterprisearchitect.Package)newValue);
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
            case EnterpriseArchitectPackage.PACKAGE__OBJECTS:
                getObjects().clear();
                return;
            case EnterpriseArchitectPackage.PACKAGE__DIAGRAMS:
                getDiagrams().clear();
                return;
            case EnterpriseArchitectPackage.PACKAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.PACKAGE__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.PACKAGE__NAMESPACE:
                setNamespace(NAMESPACE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.PACKAGE__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.PACKAGE__PACKAGE_ID:
                setPackageId(PACKAGE_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.PACKAGE__PARENT:
                setParent((org.mdsd4sil.metamodel.enterprisearchitect.Package)null);
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
            case EnterpriseArchitectPackage.PACKAGE__OBJECTS:
                return objects != null && !objects.isEmpty();
            case EnterpriseArchitectPackage.PACKAGE__DIAGRAMS:
                return diagrams != null && !diagrams.isEmpty();
            case EnterpriseArchitectPackage.PACKAGE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EnterpriseArchitectPackage.PACKAGE__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case EnterpriseArchitectPackage.PACKAGE__NAMESPACE:
                return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
            case EnterpriseArchitectPackage.PACKAGE__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case EnterpriseArchitectPackage.PACKAGE__PACKAGE_ID:
                return packageId != PACKAGE_ID_EDEFAULT;
            case EnterpriseArchitectPackage.PACKAGE__PARENT:
                return parent != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", notes: ");
        result.append(notes);
        result.append(", namespace: ");
        result.append(namespace);
        result.append(", version: ");
        result.append(version);
        result.append(", packageId: ");
        result.append(packageId);
        result.append(')');
        return result.toString();
    }

} //PackageImpl
