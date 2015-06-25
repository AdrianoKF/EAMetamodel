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

import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.Operation;
import org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationParameterImpl extends MinimalEObjectImpl.Container implements OperationParameter {
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
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

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
     * The default value of the '{@link #isIsConst() <em>Is Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsConst()
     * @generated
     * @ordered
     */
    protected static final boolean IS_CONST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsConst() <em>Is Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsConst()
     * @generated
     * @ordered
     */
    protected boolean isConst = IS_CONST_EDEFAULT;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final ParameterKind DIRECTION_EDEFAULT = ParameterKind.IN;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected ParameterKind direction = DIRECTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.OPERATION_PARAMETER;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION_PARAMETER__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION_PARAMETER__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue(String newDefaultValue) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION_PARAMETER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION_PARAMETER__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsConst() {
        return isConst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsConst(boolean newIsConst) {
        boolean oldIsConst = isConst;
        isConst = newIsConst;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION_PARAMETER__IS_CONST, oldIsConst, isConst));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterKind getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(ParameterKind newDirection) {
        ParameterKind oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION_PARAMETER__DIRECTION, oldDirection, direction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION) return null;
        return (Operation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newOperation, EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(Operation newOperation) {
        if (newOperation != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION && newOperation != null)) {
            if (EcoreUtil.isAncestor(this, newOperation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newOperation != null)
                msgs = ((InternalEObject)newOperation).eInverseAdd(this, EnterpriseArchitectPackage.OPERATION__PARAMETERS, Operation.class, msgs);
            msgs = basicSetOperation(newOperation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION, newOperation, newOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetOperation((Operation)otherEnd, msgs);
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
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION:
                return basicSetOperation(null, msgs);
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
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.OPERATION__PARAMETERS, Operation.class, msgs);
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
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NAME:
                return getName();
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__TYPE:
                return getType();
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DEFAULT_VALUE:
                return getDefaultValue();
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NOTES:
                return getNotes();
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__IS_CONST:
                return isIsConst();
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DIRECTION:
                return getDirection();
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION:
                return getOperation();
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
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NAME:
                setName((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__TYPE:
                setType((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DEFAULT_VALUE:
                setDefaultValue((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NOTES:
                setNotes((String)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__IS_CONST:
                setIsConst((Boolean)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DIRECTION:
                setDirection((ParameterKind)newValue);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION:
                setOperation((Operation)newValue);
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
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DEFAULT_VALUE:
                setDefaultValue(DEFAULT_VALUE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__IS_CONST:
                setIsConst(IS_CONST_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DIRECTION:
                setDirection(DIRECTION_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION:
                setOperation((Operation)null);
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
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DEFAULT_VALUE:
                return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__IS_CONST:
                return isConst != IS_CONST_EDEFAULT;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__DIRECTION:
                return direction != DIRECTION_EDEFAULT;
            case EnterpriseArchitectPackage.OPERATION_PARAMETER__OPERATION:
                return getOperation() != null;
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
        result.append(", type: ");
        result.append(type);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(", notes: ");
        result.append(notes);
        result.append(", isConst: ");
        result.append(isConst);
        result.append(", direction: ");
        result.append(direction);
        result.append(')');
        return result.toString();
    }

} //OperationParameterImpl
