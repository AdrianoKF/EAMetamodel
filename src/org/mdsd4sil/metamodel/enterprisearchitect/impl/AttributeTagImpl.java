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

import org.mdsd4sil.metamodel.enterprisearchitect.Attribute;
import org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl#getPropertyId <em>Property Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeTagImpl extends MinimalEObjectImpl.Container implements AttributeTag {
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
    protected AttributeTagImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.ATTRIBUTE_TAG;
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY_ID, oldPropertyId, propertyId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY, oldProperty, property));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE_TAG__VALUE, oldValue, value));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE_TAG__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute getAttribute() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE) return null;
        return (Attribute)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newAttribute, EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute(Attribute newAttribute) {
        if (newAttribute != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE && newAttribute != null)) {
            if (EcoreUtil.isAncestor(this, newAttribute))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAttribute != null)
                msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES, Attribute.class, msgs);
            msgs = basicSetAttribute(newAttribute, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE, newAttribute, newAttribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAttribute((Attribute)otherEnd, msgs);
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
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE:
                return basicSetAttribute(null, msgs);
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
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.ATTRIBUTE__TAGGED_VALUES, Attribute.class, msgs);
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
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY_ID:
                return getPropertyId();
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY:
                return getProperty();
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__VALUE:
                return getValue();
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__NOTES:
                return getNotes();
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE:
                return getAttribute();
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
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY_ID:
                setPropertyId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY:
                setProperty((String)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__VALUE:
                setValue((String)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__NOTES:
                setNotes((String)newValue);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE:
                setAttribute((Attribute)newValue);
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
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY_ID:
                setPropertyId(PROPERTY_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY:
                setProperty(PROPERTY_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE:
                setAttribute((Attribute)null);
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
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY_ID:
                return propertyId != PROPERTY_ID_EDEFAULT;
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__PROPERTY:
                return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG__ATTRIBUTE:
                return getAttribute() != null;
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

} //AttributeTagImpl
