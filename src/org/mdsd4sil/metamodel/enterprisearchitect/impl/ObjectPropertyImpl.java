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
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;
import org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl#getPropertyId <em>Property Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends MinimalEObjectImpl.Container implements ObjectProperty {
    /**
     * The default value of the '{@link #getPropertyId() <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyId()
     * @generated
     * @ordered
     */
    protected static final int PROPERTY_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPropertyId() <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPropertyId()
     * @generated
     * @ordered
     */
    protected int propertyId = PROPERTY_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected static final String PROPERTY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected String property = PROPERTY_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ObjectPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.OBJECT_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPropertyId() {
        return propertyId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPropertyId(int newPropertyId) {
        int oldPropertyId = propertyId;
        propertyId = newPropertyId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY_ID, oldPropertyId, propertyId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProperty() {
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperty(String newProperty) {
        String oldProperty = property;
        property = newProperty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY, oldProperty, property));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OBJECT_PROPERTY__VALUE, oldValue, value));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OBJECT_PROPERTY__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject getObject() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT) return null;
        return (ModelObject)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObject(ModelObject newObject, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newObject, EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObject(ModelObject newObject) {
        if (newObject != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT && newObject != null)) {
            if (EcoreUtil.isAncestor(this, newObject))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newObject != null)
                msgs = ((InternalEObject)newObject).eInverseAdd(this, EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES, ModelObject.class, msgs);
            msgs = basicSetObject(newObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT, newObject, newObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT:
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
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT:
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
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES, ModelObject.class, msgs);
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
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY_ID:
                return getPropertyId();
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY:
                return getProperty();
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__VALUE:
                return getValue();
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__NOTES:
                return getNotes();
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT:
                return getObject();
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
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY_ID:
                setPropertyId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY:
                setProperty((String)newValue);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__VALUE:
                setValue((String)newValue);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__NOTES:
                setNotes((String)newValue);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT:
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
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY_ID:
                setPropertyId(PROPERTY_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY:
                setProperty(PROPERTY_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT:
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
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY_ID:
                return propertyId != PROPERTY_ID_EDEFAULT;
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__PROPERTY:
                return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT:
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
        result.append(" (propertyId: ");
        result.append(propertyId);
        result.append(", property: ");
        result.append(property);
        result.append(", value: ");
        result.append(value);
        result.append(", notes: ");
        result.append(notes);
        result.append(')');
        return result.toString();
    }

} //ObjectPropertyImpl
