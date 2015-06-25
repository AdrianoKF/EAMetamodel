/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mdsd4sil.metamodel.enterprisearchitect.Diagram;
import org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramObjectImpl#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramObjectImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramObjectImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramObjectImpl extends MinimalEObjectImpl.Container implements DiagramObject {
    /**
     * The default value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstanceId()
     * @generated
     * @ordered
     */
    protected static final int INSTANCE_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getInstanceId() <em>Instance Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstanceId()
     * @generated
     * @ordered
     */
    protected int instanceId = INSTANCE_ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObject()
     * @generated
     * @ordered
     */
    protected ModelObject object;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.DIAGRAM_OBJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInstanceId() {
        return instanceId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstanceId(int newInstanceId) {
        int oldInstanceId = instanceId;
        instanceId = newInstanceId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM_OBJECT__INSTANCE_ID, oldInstanceId, instanceId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject getObject() {
        if (object != null && object.eIsProxy()) {
            InternalEObject oldObject = (InternalEObject)object;
            object = (ModelObject)eResolveProxy(oldObject);
            if (object != oldObject) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnterpriseArchitectPackage.DIAGRAM_OBJECT__OBJECT, oldObject, object));
            }
        }
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject basicGetObject() {
        return object;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObject(ModelObject newObject) {
        ModelObject oldObject = object;
        object = newObject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM_OBJECT__OBJECT, oldObject, object));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram getDiagram() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM) return null;
        return (Diagram)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagram(Diagram newDiagram, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newDiagram, EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagram(Diagram newDiagram) {
        if (newDiagram != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM && newDiagram != null)) {
            if (EcoreUtil.isAncestor(this, newDiagram))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDiagram != null)
                msgs = ((InternalEObject)newDiagram).eInverseAdd(this, EnterpriseArchitectPackage.DIAGRAM__OBJECTS, Diagram.class, msgs);
            msgs = basicSetDiagram(newDiagram, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM, newDiagram, newDiagram));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDiagram((Diagram)otherEnd, msgs);
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
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM:
                return basicSetDiagram(null, msgs);
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
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.DIAGRAM__OBJECTS, Diagram.class, msgs);
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
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__INSTANCE_ID:
                return getInstanceId();
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__OBJECT:
                if (resolve) return getObject();
                return basicGetObject();
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM:
                return getDiagram();
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
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__INSTANCE_ID:
                setInstanceId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__OBJECT:
                setObject((ModelObject)newValue);
                return;
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM:
                setDiagram((Diagram)newValue);
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
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__INSTANCE_ID:
                setInstanceId(INSTANCE_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__OBJECT:
                setObject((ModelObject)null);
                return;
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM:
                setDiagram((Diagram)null);
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
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__INSTANCE_ID:
                return instanceId != INSTANCE_ID_EDEFAULT;
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__OBJECT:
                return object != null;
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT__DIAGRAM:
                return getDiagram() != null;
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
        result.append(" (instanceId: ");
        result.append(instanceId);
        result.append(')');
        return result.toString();
    }

} //DiagramObjectImpl
