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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mdsd4sil.metamodel.enterprisearchitect.Attribute;
import org.mdsd4sil.metamodel.enterprisearchitect.Connector;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;
import org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty;
import org.mdsd4sil.metamodel.enterprisearchitect.Operation;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelObjectImpl extends MinimalEObjectImpl.Container implements ModelObject {
    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

    /**
     * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperations()
     * @generated
     * @ordered
     */
    protected EList<Operation> operations;

    /**
     * The cached value of the '{@link #getTaggedValues() <em>Tagged Values</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTaggedValues()
     * @generated
     * @ordered
     */
    protected EList<ObjectProperty> taggedValues;

    /**
     * The default value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectId()
     * @generated
     * @ordered
     */
    protected static final int OBJECT_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectId()
     * @generated
     * @ordered
     */
    protected int objectId = OBJECT_ID_EDEFAULT;

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
     * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected static final String NOTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected String note = NOTE_EDEFAULT;

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
     * The default value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectType()
     * @generated
     * @ordered
     */
    protected static final ObjectType OBJECT_TYPE_EDEFAULT = ObjectType.ACTION;

    /**
     * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectType()
     * @generated
     * @ordered
     */
    protected ObjectType objectType = OBJECT_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
    protected static final String STEREOTYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
    protected String stereotype = STEREOTYPE_EDEFAULT;

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
     * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected ModelObject parent;

    /**
     * The cached value of the '{@link #getIncomingConnectors() <em>Incoming Connectors</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingConnectors()
     * @generated
     * @ordered
     */
    protected EList<Connector> incomingConnectors;

    /**
     * The cached value of the '{@link #getOutgoingConnectors() <em>Outgoing Connectors</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingConnectors()
     * @generated
     * @ordered
     */
    protected EList<Connector> outgoingConnectors;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.MODEL_OBJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES, EnterpriseArchitectPackage.ATTRIBUTE__OBJECT);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Operation> getOperations() {
        if (operations == null) {
            operations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS, EnterpriseArchitectPackage.OPERATION__OBJECT);
        }
        return operations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectProperty> getTaggedValues() {
        if (taggedValues == null) {
            taggedValues = new EObjectContainmentWithInverseEList<ObjectProperty>(ObjectProperty.class, this, EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES, EnterpriseArchitectPackage.OBJECT_PROPERTY__OBJECT);
        }
        return taggedValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getObjectId() {
        return objectId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObjectId(int newObjectId) {
        int oldObjectId = objectId;
        objectId = newObjectId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_ID, oldObjectId, objectId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNote() {
        return note;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNote(String newNote) {
        String oldNote = note;
        note = newNote;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__NOTE, oldNote, note));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__SCOPE, oldScope, scope));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObjectType(ObjectType newObjectType) {
        ObjectType oldObjectType = objectType;
        objectType = newObjectType == null ? OBJECT_TYPE_EDEFAULT : newObjectType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_TYPE, oldObjectType, objectType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStereotype() {
        return stereotype;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStereotype(String newStereotype) {
        String oldStereotype = stereotype;
        stereotype = newStereotype;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__STEREOTYPE, oldStereotype, stereotype));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__IS_ABSTRACT, oldIsAbstract, isAbstract));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject getParent() {
        if (parent != null && parent.eIsProxy()) {
            InternalEObject oldParent = (InternalEObject)parent;
            parent = (ModelObject)eResolveProxy(oldParent);
            if (parent != oldParent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnterpriseArchitectPackage.MODEL_OBJECT__PARENT, oldParent, parent));
            }
        }
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject basicGetParent() {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(ModelObject newParent) {
        ModelObject oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__PARENT, oldParent, parent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.mdsd4sil.metamodel.enterprisearchitect.Package getPackage() {
        if (eContainerFeatureID() != EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE) return null;
        return (org.mdsd4sil.metamodel.enterprisearchitect.Package)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package newPackage, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newPackage, EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package newPackage) {
        if (newPackage != eInternalContainer() || (eContainerFeatureID() != EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE && newPackage != null)) {
            if (EcoreUtil.isAncestor(this, newPackage))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPackage != null)
                msgs = ((InternalEObject)newPackage).eInverseAdd(this, EnterpriseArchitectPackage.PACKAGE__OBJECTS, org.mdsd4sil.metamodel.enterprisearchitect.Package.class, msgs);
            msgs = basicSetPackage(newPackage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE, newPackage, newPackage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Connector> getIncomingConnectors() {
        if (incomingConnectors == null) {
            incomingConnectors = new EObjectWithInverseResolvingEList.Unsettable<Connector>(Connector.class, this, EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS, EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT);
        }
        return incomingConnectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIncomingConnectors() {
        if (incomingConnectors != null) ((InternalEList.Unsettable<?>)incomingConnectors).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIncomingConnectors() {
        return incomingConnectors != null && ((InternalEList.Unsettable<?>)incomingConnectors).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Connector> getOutgoingConnectors() {
        if (outgoingConnectors == null) {
            outgoingConnectors = new EObjectWithInverseResolvingEList.Unsettable<Connector>(Connector.class, this, EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS, EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT);
        }
        return outgoingConnectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOutgoingConnectors() {
        if (outgoingConnectors != null) ((InternalEList.Unsettable<?>)outgoingConnectors).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOutgoingConnectors() {
        return outgoingConnectors != null && ((InternalEList.Unsettable<?>)outgoingConnectors).isSet();
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
            case EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaggedValues()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPackage((org.mdsd4sil.metamodel.enterprisearchitect.Package)otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnectors()).basicAdd(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingConnectors()).basicAdd(otherEnd, msgs);
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
            case EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS:
                return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES:
                return ((InternalEList<?>)getTaggedValues()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE:
                return basicSetPackage(null, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS:
                return ((InternalEList<?>)getIncomingConnectors()).basicRemove(otherEnd, msgs);
            case EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS:
                return ((InternalEList<?>)getOutgoingConnectors()).basicRemove(otherEnd, msgs);
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
            case EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE:
                return eInternalContainer().eInverseRemove(this, EnterpriseArchitectPackage.PACKAGE__OBJECTS, org.mdsd4sil.metamodel.enterprisearchitect.Package.class, msgs);
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
            case EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES:
                return getAttributes();
            case EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS:
                return getOperations();
            case EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES:
                return getTaggedValues();
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_ID:
                return getObjectId();
            case EnterpriseArchitectPackage.MODEL_OBJECT__NAME:
                return getName();
            case EnterpriseArchitectPackage.MODEL_OBJECT__NOTE:
                return getNote();
            case EnterpriseArchitectPackage.MODEL_OBJECT__SCOPE:
                return getScope();
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_TYPE:
                return getObjectType();
            case EnterpriseArchitectPackage.MODEL_OBJECT__STEREOTYPE:
                return getStereotype();
            case EnterpriseArchitectPackage.MODEL_OBJECT__IS_ABSTRACT:
                return isIsAbstract();
            case EnterpriseArchitectPackage.MODEL_OBJECT__PARENT:
                if (resolve) return getParent();
                return basicGetParent();
            case EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE:
                return getPackage();
            case EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS:
                return getIncomingConnectors();
            case EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS:
                return getOutgoingConnectors();
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
            case EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS:
                getOperations().clear();
                getOperations().addAll((Collection<? extends Operation>)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES:
                getTaggedValues().clear();
                getTaggedValues().addAll((Collection<? extends ObjectProperty>)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_ID:
                setObjectId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__NAME:
                setName((String)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__NOTE:
                setNote((String)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__SCOPE:
                setScope((Scope)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_TYPE:
                setObjectType((ObjectType)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__STEREOTYPE:
                setStereotype((String)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__IS_ABSTRACT:
                setIsAbstract((Boolean)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__PARENT:
                setParent((ModelObject)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE:
                setPackage((org.mdsd4sil.metamodel.enterprisearchitect.Package)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS:
                getIncomingConnectors().clear();
                getIncomingConnectors().addAll((Collection<? extends Connector>)newValue);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS:
                getOutgoingConnectors().clear();
                getOutgoingConnectors().addAll((Collection<? extends Connector>)newValue);
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
            case EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES:
                getAttributes().clear();
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS:
                getOperations().clear();
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES:
                getTaggedValues().clear();
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_ID:
                setObjectId(OBJECT_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__NOTE:
                setNote(NOTE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__SCOPE:
                setScope(SCOPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_TYPE:
                setObjectType(OBJECT_TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__STEREOTYPE:
                setStereotype(STEREOTYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__IS_ABSTRACT:
                setIsAbstract(IS_ABSTRACT_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__PARENT:
                setParent((ModelObject)null);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE:
                setPackage((org.mdsd4sil.metamodel.enterprisearchitect.Package)null);
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS:
                unsetIncomingConnectors();
                return;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS:
                unsetOutgoingConnectors();
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
            case EnterpriseArchitectPackage.MODEL_OBJECT__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case EnterpriseArchitectPackage.MODEL_OBJECT__OPERATIONS:
                return operations != null && !operations.isEmpty();
            case EnterpriseArchitectPackage.MODEL_OBJECT__TAGGED_VALUES:
                return taggedValues != null && !taggedValues.isEmpty();
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_ID:
                return objectId != OBJECT_ID_EDEFAULT;
            case EnterpriseArchitectPackage.MODEL_OBJECT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EnterpriseArchitectPackage.MODEL_OBJECT__NOTE:
                return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
            case EnterpriseArchitectPackage.MODEL_OBJECT__SCOPE:
                return scope != SCOPE_EDEFAULT;
            case EnterpriseArchitectPackage.MODEL_OBJECT__OBJECT_TYPE:
                return objectType != OBJECT_TYPE_EDEFAULT;
            case EnterpriseArchitectPackage.MODEL_OBJECT__STEREOTYPE:
                return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
            case EnterpriseArchitectPackage.MODEL_OBJECT__IS_ABSTRACT:
                return isAbstract != IS_ABSTRACT_EDEFAULT;
            case EnterpriseArchitectPackage.MODEL_OBJECT__PARENT:
                return parent != null;
            case EnterpriseArchitectPackage.MODEL_OBJECT__PACKAGE:
                return getPackage() != null;
            case EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS:
                return isSetIncomingConnectors();
            case EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS:
                return isSetOutgoingConnectors();
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
        result.append(" (objectId: ");
        result.append(objectId);
        result.append(", name: ");
        result.append(name);
        result.append(", note: ");
        result.append(note);
        result.append(", scope: ");
        result.append(scope);
        result.append(", objectType: ");
        result.append(objectType);
        result.append(", stereotype: ");
        result.append(stereotype);
        result.append(", isAbstract: ");
        result.append(isAbstract);
        result.append(')');
        return result.toString();
    }

} //ModelObjectImpl
