/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mdsd4sil.metamodel.enterprisearchitect.Connector;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getDestRole <em>Dest Role</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getSourceAccess <em>Source Access</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getDestAcccess <em>Dest Acccess</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getSourceAggregationType <em>Source Aggregation Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getDestAggregationType <em>Dest Aggregation Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl#getDestObject <em>Dest Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
    /**
     * The default value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectorId()
     * @generated
     * @ordered
     */
    protected static final int CONNECTOR_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getConnectorId() <em>Connector Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectorId()
     * @generated
     * @ordered
     */
    protected int connectorId = CONNECTOR_ID_EDEFAULT;

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
    protected static final ConnectorType TYPE_EDEFAULT = ConnectorType.ABSTRACTION;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected ConnectorType type = TYPE_EDEFAULT;

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
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final String DIRECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected String direction = DIRECTION_EDEFAULT;

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
     * The default value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRole()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_ROLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceRole() <em>Source Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRole()
     * @generated
     * @ordered
     */
    protected String sourceRole = SOURCE_ROLE_EDEFAULT;

    /**
     * The default value of the '{@link #getDestRole() <em>Dest Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestRole()
     * @generated
     * @ordered
     */
    protected static final String DEST_ROLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDestRole() <em>Dest Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestRole()
     * @generated
     * @ordered
     */
    protected String destRole = DEST_ROLE_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceAccess() <em>Source Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceAccess()
     * @generated
     * @ordered
     */
    protected static final Scope SOURCE_ACCESS_EDEFAULT = Scope.PRIVATE;

    /**
     * The cached value of the '{@link #getSourceAccess() <em>Source Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceAccess()
     * @generated
     * @ordered
     */
    protected Scope sourceAccess = SOURCE_ACCESS_EDEFAULT;

    /**
     * The default value of the '{@link #getDestAcccess() <em>Dest Acccess</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestAcccess()
     * @generated
     * @ordered
     */
    protected static final Scope DEST_ACCCESS_EDEFAULT = Scope.PRIVATE;

    /**
     * The cached value of the '{@link #getDestAcccess() <em>Dest Acccess</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestAcccess()
     * @generated
     * @ordered
     */
    protected Scope destAcccess = DEST_ACCCESS_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceAggregationType() <em>Source Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceAggregationType()
     * @generated
     * @ordered
     */
    protected static final AggregationType SOURCE_AGGREGATION_TYPE_EDEFAULT = AggregationType.NONE;

    /**
     * The cached value of the '{@link #getSourceAggregationType() <em>Source Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceAggregationType()
     * @generated
     * @ordered
     */
    protected AggregationType sourceAggregationType = SOURCE_AGGREGATION_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getDestAggregationType() <em>Dest Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestAggregationType()
     * @generated
     * @ordered
     */
    protected static final AggregationType DEST_AGGREGATION_TYPE_EDEFAULT = AggregationType.NONE;

    /**
     * The cached value of the '{@link #getDestAggregationType() <em>Dest Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestAggregationType()
     * @generated
     * @ordered
     */
    protected AggregationType destAggregationType = DEST_AGGREGATION_TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceObject()
     * @generated
     * @ordered
     */
    protected ModelObject sourceObject;

    /**
     * The cached value of the '{@link #getDestObject() <em>Dest Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestObject()
     * @generated
     * @ordered
     */
    protected ModelObject destObject;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EnterpriseArchitectPackage.Literals.CONNECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getConnectorId() {
        return connectorId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectorId(int newConnectorId) {
        int oldConnectorId = connectorId;
        connectorId = newConnectorId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__CONNECTOR_ID, oldConnectorId, connectorId));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(ConnectorType newType) {
        ConnectorType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__STEREOTYPE, oldStereotype, stereotype));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(String newDirection) {
        String oldDirection = direction;
        direction = newDirection;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__DIRECTION, oldDirection, direction));
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
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__NOTES, oldNotes, notes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSourceRole() {
        return sourceRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceRole(String newSourceRole) {
        String oldSourceRole = sourceRole;
        sourceRole = newSourceRole;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__SOURCE_ROLE, oldSourceRole, sourceRole));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDestRole() {
        return destRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestRole(String newDestRole) {
        String oldDestRole = destRole;
        destRole = newDestRole;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__DEST_ROLE, oldDestRole, destRole));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope getSourceAccess() {
        return sourceAccess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceAccess(Scope newSourceAccess) {
        Scope oldSourceAccess = sourceAccess;
        sourceAccess = newSourceAccess == null ? SOURCE_ACCESS_EDEFAULT : newSourceAccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__SOURCE_ACCESS, oldSourceAccess, sourceAccess));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Scope getDestAcccess() {
        return destAcccess;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestAcccess(Scope newDestAcccess) {
        Scope oldDestAcccess = destAcccess;
        destAcccess = newDestAcccess == null ? DEST_ACCCESS_EDEFAULT : newDestAcccess;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__DEST_ACCCESS, oldDestAcccess, destAcccess));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AggregationType getSourceAggregationType() {
        return sourceAggregationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceAggregationType(AggregationType newSourceAggregationType) {
        AggregationType oldSourceAggregationType = sourceAggregationType;
        sourceAggregationType = newSourceAggregationType == null ? SOURCE_AGGREGATION_TYPE_EDEFAULT : newSourceAggregationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__SOURCE_AGGREGATION_TYPE, oldSourceAggregationType, sourceAggregationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AggregationType getDestAggregationType() {
        return destAggregationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestAggregationType(AggregationType newDestAggregationType) {
        AggregationType oldDestAggregationType = destAggregationType;
        destAggregationType = newDestAggregationType == null ? DEST_AGGREGATION_TYPE_EDEFAULT : newDestAggregationType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__DEST_AGGREGATION_TYPE, oldDestAggregationType, destAggregationType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject getSourceObject() {
        return sourceObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourceObject(ModelObject newSourceObject, NotificationChain msgs) {
        ModelObject oldSourceObject = sourceObject;
        sourceObject = newSourceObject;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT, oldSourceObject, newSourceObject);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceObject(ModelObject newSourceObject) {
        if (newSourceObject != sourceObject) {
            NotificationChain msgs = null;
            if (sourceObject != null)
                msgs = ((InternalEObject)sourceObject).eInverseRemove(this, EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS, ModelObject.class, msgs);
            if (newSourceObject != null)
                msgs = ((InternalEObject)newSourceObject).eInverseAdd(this, EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS, ModelObject.class, msgs);
            msgs = basicSetSourceObject(newSourceObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT, newSourceObject, newSourceObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject getDestObject() {
        return destObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDestObject(ModelObject newDestObject, NotificationChain msgs) {
        ModelObject oldDestObject = destObject;
        destObject = newDestObject;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT, oldDestObject, newDestObject);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestObject(ModelObject newDestObject) {
        if (newDestObject != destObject) {
            NotificationChain msgs = null;
            if (destObject != null)
                msgs = ((InternalEObject)destObject).eInverseRemove(this, EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS, ModelObject.class, msgs);
            if (newDestObject != null)
                msgs = ((InternalEObject)newDestObject).eInverseAdd(this, EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS, ModelObject.class, msgs);
            msgs = basicSetDestObject(newDestObject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT, newDestObject, newDestObject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT:
                if (sourceObject != null)
                    msgs = ((InternalEObject)sourceObject).eInverseRemove(this, EnterpriseArchitectPackage.MODEL_OBJECT__OUTGOING_CONNECTORS, ModelObject.class, msgs);
                return basicSetSourceObject((ModelObject)otherEnd, msgs);
            case EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT:
                if (destObject != null)
                    msgs = ((InternalEObject)destObject).eInverseRemove(this, EnterpriseArchitectPackage.MODEL_OBJECT__INCOMING_CONNECTORS, ModelObject.class, msgs);
                return basicSetDestObject((ModelObject)otherEnd, msgs);
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
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT:
                return basicSetSourceObject(null, msgs);
            case EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT:
                return basicSetDestObject(null, msgs);
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
            case EnterpriseArchitectPackage.CONNECTOR__CONNECTOR_ID:
                return getConnectorId();
            case EnterpriseArchitectPackage.CONNECTOR__NAME:
                return getName();
            case EnterpriseArchitectPackage.CONNECTOR__TYPE:
                return getType();
            case EnterpriseArchitectPackage.CONNECTOR__STEREOTYPE:
                return getStereotype();
            case EnterpriseArchitectPackage.CONNECTOR__DIRECTION:
                return getDirection();
            case EnterpriseArchitectPackage.CONNECTOR__NOTES:
                return getNotes();
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ROLE:
                return getSourceRole();
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ROLE:
                return getDestRole();
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ACCESS:
                return getSourceAccess();
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ACCCESS:
                return getDestAcccess();
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_AGGREGATION_TYPE:
                return getSourceAggregationType();
            case EnterpriseArchitectPackage.CONNECTOR__DEST_AGGREGATION_TYPE:
                return getDestAggregationType();
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT:
                return getSourceObject();
            case EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT:
                return getDestObject();
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
            case EnterpriseArchitectPackage.CONNECTOR__CONNECTOR_ID:
                setConnectorId((Integer)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__NAME:
                setName((String)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__TYPE:
                setType((ConnectorType)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__STEREOTYPE:
                setStereotype((String)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DIRECTION:
                setDirection((String)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__NOTES:
                setNotes((String)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ROLE:
                setSourceRole((String)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ROLE:
                setDestRole((String)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ACCESS:
                setSourceAccess((Scope)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ACCCESS:
                setDestAcccess((Scope)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_AGGREGATION_TYPE:
                setSourceAggregationType((AggregationType)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_AGGREGATION_TYPE:
                setDestAggregationType((AggregationType)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT:
                setSourceObject((ModelObject)newValue);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT:
                setDestObject((ModelObject)newValue);
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
            case EnterpriseArchitectPackage.CONNECTOR__CONNECTOR_ID:
                setConnectorId(CONNECTOR_ID_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__STEREOTYPE:
                setStereotype(STEREOTYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DIRECTION:
                setDirection(DIRECTION_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__NOTES:
                setNotes(NOTES_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ROLE:
                setSourceRole(SOURCE_ROLE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ROLE:
                setDestRole(DEST_ROLE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ACCESS:
                setSourceAccess(SOURCE_ACCESS_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ACCCESS:
                setDestAcccess(DEST_ACCCESS_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_AGGREGATION_TYPE:
                setSourceAggregationType(SOURCE_AGGREGATION_TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_AGGREGATION_TYPE:
                setDestAggregationType(DEST_AGGREGATION_TYPE_EDEFAULT);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT:
                setSourceObject((ModelObject)null);
                return;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT:
                setDestObject((ModelObject)null);
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
            case EnterpriseArchitectPackage.CONNECTOR__CONNECTOR_ID:
                return connectorId != CONNECTOR_ID_EDEFAULT;
            case EnterpriseArchitectPackage.CONNECTOR__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EnterpriseArchitectPackage.CONNECTOR__TYPE:
                return type != TYPE_EDEFAULT;
            case EnterpriseArchitectPackage.CONNECTOR__STEREOTYPE:
                return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
            case EnterpriseArchitectPackage.CONNECTOR__DIRECTION:
                return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
            case EnterpriseArchitectPackage.CONNECTOR__NOTES:
                return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ROLE:
                return SOURCE_ROLE_EDEFAULT == null ? sourceRole != null : !SOURCE_ROLE_EDEFAULT.equals(sourceRole);
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ROLE:
                return DEST_ROLE_EDEFAULT == null ? destRole != null : !DEST_ROLE_EDEFAULT.equals(destRole);
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_ACCESS:
                return sourceAccess != SOURCE_ACCESS_EDEFAULT;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_ACCCESS:
                return destAcccess != DEST_ACCCESS_EDEFAULT;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_AGGREGATION_TYPE:
                return sourceAggregationType != SOURCE_AGGREGATION_TYPE_EDEFAULT;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_AGGREGATION_TYPE:
                return destAggregationType != DEST_AGGREGATION_TYPE_EDEFAULT;
            case EnterpriseArchitectPackage.CONNECTOR__SOURCE_OBJECT:
                return sourceObject != null;
            case EnterpriseArchitectPackage.CONNECTOR__DEST_OBJECT:
                return destObject != null;
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
        result.append(" (connectorId: ");
        result.append(connectorId);
        result.append(", name: ");
        result.append(name);
        result.append(", type: ");
        result.append(type);
        result.append(", stereotype: ");
        result.append(stereotype);
        result.append(", direction: ");
        result.append(direction);
        result.append(", notes: ");
        result.append(notes);
        result.append(", sourceRole: ");
        result.append(sourceRole);
        result.append(", destRole: ");
        result.append(destRole);
        result.append(", sourceAccess: ");
        result.append(sourceAccess);
        result.append(", destAcccess: ");
        result.append(destAcccess);
        result.append(", sourceAggregationType: ");
        result.append(sourceAggregationType);
        result.append(", destAggregationType: ");
        result.append(destAggregationType);
        result.append(')');
        return result.toString();
    }

} //ConnectorImpl
