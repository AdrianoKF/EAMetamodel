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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdsd4sil.metamodel.enterprisearchitect.Connector;
import org.mdsd4sil.metamodel.enterprisearchitect.Diagram;
import org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getDiagramId <em>Diagram Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends MinimalEObjectImpl.Container implements Diagram {
    /**
     * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjects()
     * @generated
     * @ordered
     */
    protected EList<DiagramObject> objects;

    /**
     * The default value of the '{@link #getDiagramId() <em>Diagram Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramId()
     * @generated
     * @ordered
     */
    protected static final int DIAGRAM_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getDiagramId() <em>Diagram Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramId()
     * @generated
     * @ordered
     */
    protected int diagramId = DIAGRAM_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getDiagramType() <em>Diagram Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramType()
     * @generated
     * @ordered
     */
    protected static final String DIAGRAM_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiagramType() <em>Diagram Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagramType()
     * @generated
     * @ordered
     */
    protected String diagramType = DIAGRAM_TYPE_EDEFAULT;

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
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected Diagram parent;

    /**
     * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectors()
     * @generated
     * @ordered
     */
    protected EList<Connector> connectors;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.DIAGRAM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DiagramObject> getObjects() {
        if (objects == null) {
            objects = new EObjectContainmentWithInverseEList<DiagramObject>(DiagramObject.class, this, EnterpriseArchitectPackage.DIAGRAM__OBJECTS, EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM);
        }
        return objects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getDiagramId() {
        return diagramId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagramId(int newDiagramId) {
        int oldDiagramId = diagramId;
        diagramId = newDiagramId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_ID, oldDiagramId, diagramId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDiagramType() {
        return diagramType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagramType(String newDiagramType) {
        String oldDiagramType = diagramType;
        diagramType = newDiagramType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_TYPE, oldDiagramType, diagramType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = (Diagram)eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnterpriseArchitectPackage.DIAGRAM__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(Diagram newParent) {
        Diagram oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM__PARENT, oldParent, parent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Connector> getConnectors() {
        if (connectors == null) {
            connectors = new EObjectContainmentEList<Connector>(Connector.class, this, EnterpriseArchitectPackage.DIAGRAM__CONNECTORS);
        }
        return connectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.mdsd4sil.metamodel.enterprisearchitect.Package getPackage() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.DIAGRAM__PACKAGE) return null;
        return (org.mdsd4sil.metamodel.enterprisearchitect.Package)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, EnterpriseArchitectPackage.DIAGRAM__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.DIAGRAM__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, EnterpriseArchitectPackage.PACKAGE__DIAGRAMS, org.mdsd4sil.metamodel.enterprisearchitect.Package.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM__PACKAGE, newPackage, newPackage));
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
            case EnterpriseArchitectPackage.DIAGRAM__OBJECTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjects()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.DIAGRAM__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((org.mdsd4sil.metamodel.enterprisearchitect.Package)otherEnd, msgs);
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
            case EnterpriseArchitectPackage.DIAGRAM__OBJECTS:
                return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.DIAGRAM__CONNECTORS:
                return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.DIAGRAM__PACKAGE:
                return basicSetPackage(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case EnterpriseArchitectPackage.DIAGRAM__PACKAGE:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.PACKAGE__DIAGRAMS, org.mdsd4sil.metamodel.enterprisearchitect.Package.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EnterpriseArchitectPackage.DIAGRAM__OBJECTS:
                return getObjects();
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_ID:
                return getDiagramId();
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_TYPE:
                return getDiagramType();
            case EnterpriseArchitectPackage.DIAGRAM__NAME:
                return getName();
            case EnterpriseArchitectPackage.DIAGRAM__NOTES:
                return getNotes();
            case EnterpriseArchitectPackage.DIAGRAM__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case EnterpriseArchitectPackage.DIAGRAM__CONNECTORS:
                return getConnectors();
            case EnterpriseArchitectPackage.DIAGRAM__PACKAGE:
                return getPackage();
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
            case EnterpriseArchitectPackage.DIAGRAM__OBJECTS:
                getObjects().clear();
                getObjects().addAll((Collection<? extends DiagramObject>)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_ID:
                setDiagramId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_TYPE:
                setDiagramType((String)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__NAME:
                setName((String)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__NOTES:
                setNotes((String)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__PARENT:
                setParent((Diagram)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__CONNECTORS:
                getConnectors().clear();
                getConnectors().addAll((Collection<? extends Connector>)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__PACKAGE:
                setPackage((org.mdsd4sil.metamodel.enterprisearchitect.Package)newValue);
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
            case EnterpriseArchitectPackage.DIAGRAM__OBJECTS:
                getObjects().clear();
                return;
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_ID:
                setDiagramId(DIAGRAM_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_TYPE:
                setDiagramType(DIAGRAM_TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__PARENT:
                setParent((Diagram)null);
                return;
            case EnterpriseArchitectPackage.DIAGRAM__CONNECTORS:
                getConnectors().clear();
                return;
            case EnterpriseArchitectPackage.DIAGRAM__PACKAGE:
                setPackage((org.mdsd4sil.metamodel.enterprisearchitect.Package)null);
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
            case EnterpriseArchitectPackage.DIAGRAM__OBJECTS:
                return objects != null && !objects.isEmpty();
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_ID:
                return diagramId != DIAGRAM_ID_EDEFAULT;
            case EnterpriseArchitectPackage.DIAGRAM__DIAGRAM_TYPE:
                return DIAGRAM_TYPE_EDEFAULT == null ? diagramType != null : !DIAGRAM_TYPE_EDEFAULT.equals(diagramType);
            case EnterpriseArchitectPackage.DIAGRAM__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EnterpriseArchitectPackage.DIAGRAM__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case EnterpriseArchitectPackage.DIAGRAM__PARENT:
                return parent != null;
            case EnterpriseArchitectPackage.DIAGRAM__CONNECTORS:
                return connectors != null && !connectors.isEmpty();
            case EnterpriseArchitectPackage.DIAGRAM__PACKAGE:
                return getPackage() != null;
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
        result.append(" (diagramId: ");
        result.append(diagramId);
        result.append(", diagramType: ");
        result.append(diagramType);
        result.append(", name: ");
        result.append(name);
        result.append(", notes: ");
        result.append(notes);
        result.append(')');
        return result.toString();
    }

} //DiagramImpl
