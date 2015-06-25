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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;
import org.mdsd4sil.metamodel.enterprisearchitect.Operation;
import org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<OperationParameter> parameters;

    /**
     * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationId()
     * @generated
     * @ordered
     */
    protected static final int OPERATION_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationId()
     * @generated
     * @ordered
     */
    protected int operationId = OPERATION_ID_EDEFAULT;

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
     * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehavior()
     * @generated
     * @ordered
     */
    protected static final String BEHAVIOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBehavior()
     * @generated
     * @ordered
     */
    protected String behavior = BEHAVIOR_EDEFAULT;

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
     * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected static final Scope SCOPE_EDEFAULT = Scope.PRIVATE;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected Scope scope = SCOPE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected static final boolean IS_STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected boolean isStatic = IS_STATIC_EDEFAULT;

    /**
     * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OperationParameter> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentWithInverseEList<OperationParameter>(OperationParameter.class, this, EnterpriseArchitectPackage.OPERATION__PARAMETERS, EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getOperationId() {
        return operationId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperationId(int newOperationId) {
        int oldOperationId = operationId;
        operationId = newOperationId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__OPERATION_ID, oldOperationId, operationId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBehavior() {
        return behavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBehavior(String newBehavior) {
        String oldBehavior = behavior;
        behavior = newBehavior;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__BEHAVIOR, oldBehavior, behavior));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScope(Scope newScope) {
        Scope oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__SCOPE, oldScope, scope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsStatic() {
        return isStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsStatic(boolean newIsStatic) {
        boolean oldIsStatic = isStatic;
        isStatic = newIsStatic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__IS_STATIC, oldIsStatic, isStatic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsAbstract() {
        return isAbstract;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsAbstract(boolean newIsAbstract) {
        boolean oldIsAbstract = isAbstract;
        isAbstract = newIsAbstract;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject getObject() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.OPERATION__OBJECT) return null;
        return (ModelObject)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObject(ModelObject newObject, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newObject, EnterpriseArchitectPackage.OPERATION__OBJECT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObject(ModelObject newObject) {
        if (newObject != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.OPERATION__OBJECT && newObject != null)) {
            if (EcoreUtil.isAncestor(this, newObject))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newObject != null)
                msgs = ((InternalEObject)newObject).eInverseAdd(this, EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS, ModelObject.class, msgs);
            msgs = basicSetObject(newObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION__OBJECT, newObject, newObject));
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
            case EnterpriseArchitectPackage.OPERATION__PARAMETERS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.OPERATION__OBJECT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetObject((ModelObject)otherEnd, msgs);
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
            case EnterpriseArchitectPackage.OPERATION__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.OPERATION__OBJECT:
                return basicSetObject(null, msgs);
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
            case EnterpriseArchitectPackage.OPERATION__OBJECT:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS, ModelObject.class, msgs);
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
            case EnterpriseArchitectPackage.OPERATION__PARAMETERS:
                return getParameters();
            case EnterpriseArchitectPackage.OPERATION__OPERATION_ID:
                return getOperationId();
            case EnterpriseArchitectPackage.OPERATION__NAME:
                return getName();
            case EnterpriseArchitectPackage.OPERATION__BEHAVIOR:
                return getBehavior();
            case EnterpriseArchitectPackage.OPERATION__NOTES:
                return getNotes();
            case EnterpriseArchitectPackage.OPERATION__SCOPE:
                return getScope();
            case EnterpriseArchitectPackage.OPERATION__TYPE:
                return getType();
            case EnterpriseArchitectPackage.OPERATION__IS_STATIC:
                return isIsStatic();
            case EnterpriseArchitectPackage.OPERATION__IS_ABSTRACT:
                return isIsAbstract();
            case EnterpriseArchitectPackage.OPERATION__OBJECT:
                return getObject();
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
            case EnterpriseArchitectPackage.OPERATION__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends OperationParameter>)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__OPERATION_ID:
                setOperationId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__NAME:
                setName((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__BEHAVIOR:
                setBehavior((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__NOTES:
                setNotes((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__SCOPE:
                setScope((Scope)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__TYPE:
                setType((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__IS_STATIC:
                setIsStatic((Boolean)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__IS_ABSTRACT:
                setIsAbstract((Boolean)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION__OBJECT:
                setObject((ModelObject)newValue);
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
            case EnterpriseArchitectPackage.OPERATION__PARAMETERS:
                getParameters().clear();
                return;
            case EnterpriseArchitectPackage.OPERATION__OPERATION_ID:
                setOperationId(OPERATION_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__BEHAVIOR:
                setBehavior(BEHAVIOR_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__SCOPE:
                setScope(SCOPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__IS_STATIC:
                setIsStatic(IS_STATIC_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__IS_ABSTRACT:
                setIsAbstract(IS_ABSTRACT_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION__OBJECT:
                setObject((ModelObject)null);
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
            case EnterpriseArchitectPackage.OPERATION__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case EnterpriseArchitectPackage.OPERATION__OPERATION_ID:
                return operationId != OPERATION_ID_EDEFAULT;
            case EnterpriseArchitectPackage.OPERATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EnterpriseArchitectPackage.OPERATION__BEHAVIOR:
                return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
            case EnterpriseArchitectPackage.OPERATION__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case EnterpriseArchitectPackage.OPERATION__SCOPE:
                return scope != SCOPE_EDEFAULT;
            case EnterpriseArchitectPackage.OPERATION__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case EnterpriseArchitectPackage.OPERATION__IS_STATIC:
                return isStatic != IS_STATIC_EDEFAULT;
            case EnterpriseArchitectPackage.OPERATION__IS_ABSTRACT:
                return isAbstract != IS_ABSTRACT_EDEFAULT;
            case EnterpriseArchitectPackage.OPERATION__OBJECT:
                return getObject() != null;
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
        result.append(" (operationId: ");
        result.append(operationId);
        result.append(", name: ");
        result.append(name);
        result.append(", behavior: ");
        result.append(behavior);
        result.append(", notes: ");
        result.append(notes);
        result.append(", scope: ");
        result.append(scope);
        result.append(", type: ");
        result.append(type);
        result.append(", isStatic: ");
        result.append(isStatic);
        result.append(", isAbstract: ");
        result.append(isAbstract);
        result.append(')');
        return result.toString();
    }

} //OperationImpl
