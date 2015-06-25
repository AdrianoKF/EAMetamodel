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

import org.mdsd4sil.metamodel.enterprisearchitect.Attribute;
import org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
    /**
     * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaggedValues()
     * @generated
     * @ordered
     */
    protected EList<AttributeTag> taggedValues;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeTag> getTaggedValues() {
        if (taggedValues == null) {
            taggedValues = new EObjectContainmentWithInverseEList<AttributeTag>(AttributeTag.class, this, EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES, EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE);
        }
        return taggedValues;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE__SCOPE, oldScope, scope));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject getObject() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.ATTRIBUTE__OBJECT) return null;
        return (ModelObject)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObject(ModelObject newObject, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newObject, EnterpriseArchitectPackage.ATTRIBUTE__OBJECT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObject(ModelObject newObject) {
        if (newObject != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.ATTRIBUTE__OBJECT && newObject != null)) {
            if (EcoreUtil.isAncestor(this, newObject))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newObject != null)
                msgs = ((InternalEObject)newObject).eInverseAdd(this, EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES, ModelObject.class, msgs);
            msgs = basicSetObject(newObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE__OBJECT, newObject, newObject));
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
            case EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaggedValues()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.ATTRIBUTE__OBJECT:
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
            case EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES:
                return ((InternalEList<?>)getTaggedValues()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.ATTRIBUTE__OBJECT:
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
            case EnterpriseArchitectPackage.ATTRIBUTE__OBJECT:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES, ModelObject.class, msgs);
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
            case EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES:
                return getTaggedValues();
            case EnterpriseArchitectPackage.ATTRIBUTE__ID:
                return getId();
            case EnterpriseArchitectPackage.ATTRIBUTE__NAME:
                return getName();
            case EnterpriseArchitectPackage.ATTRIBUTE__SCOPE:
                return getScope();
            case EnterpriseArchitectPackage.ATTRIBUTE__DEFAULT_VALUE:
                return getDefaultValue();
            case EnterpriseArchitectPackage.ATTRIBUTE__TYPE:
                return getType();
            case EnterpriseArchitectPackage.ATTRIBUTE__OBJECT:
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
            case EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES:
                getTaggedValues().clear();
                getTaggedValues().addAll((Collection<? extends AttributeTag>)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__ID:
                setId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__NAME:
                setName((String)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__SCOPE:
                setScope((Scope)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__DEFAULT_VALUE:
                setDefaultValue((String)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__TYPE:
                setType((String)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__OBJECT:
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
            case EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES:
                getTaggedValues().clear();
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__ID:
                setId(ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__SCOPE:
                setScope(SCOPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__DEFAULT_VALUE:
                setDefaultValue(DEFAULT_VALUE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE__OBJECT:
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
            case EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES:
                return taggedValues != null && !taggedValues.isEmpty();
            case EnterpriseArchitectPackage.ATTRIBUTE__ID:
                return id != ID_EDEFAULT;
            case EnterpriseArchitectPackage.ATTRIBUTE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EnterpriseArchitectPackage.ATTRIBUTE__SCOPE:
                return scope != SCOPE_EDEFAULT;
            case EnterpriseArchitectPackage.ATTRIBUTE__DEFAULT_VALUE:
                return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
            case EnterpriseArchitectPackage.ATTRIBUTE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case EnterpriseArchitectPackage.ATTRIBUTE__OBJECT:
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
        result.append(" (id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", scope: ");
        result.append(scope);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //AttributeImpl
