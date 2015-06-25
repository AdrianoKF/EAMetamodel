/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.ecore.EObject;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * I am the main connector
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getConnectorId <em>Connector Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceRole <em>Source Role</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestRole <em>Dest Role</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAccess <em>Source Access</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAcccess <em>Dest Acccess</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAggregationType <em>Source Aggregation Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAggregationType <em>Dest Aggregation Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestObject <em>Dest Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
    /**
     * Returns the value of the '<em><b>Connector Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connector Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connector Id</em>' attribute.
     * @see #setConnectorId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_ConnectorId()
     * @model id="true"
     * @generated
     */
    int getConnectorId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getConnectorId <em>Connector Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connector Id</em>' attribute.
     * @see #getConnectorId()
     * @generated
     */
    void setConnectorId(int value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType
     * @see #setType(ConnectorType)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_Type()
     * @model
     * @generated
     */
    ConnectorType getType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType
     * @see #getType()
     * @generated
     */
    void setType(ConnectorType value);

    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' attribute.
     * @see #setStereotype(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_Stereotype()
     * @model
     * @generated
     */
    String getStereotype();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' attribute.
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(String value);

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see #setDirection(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_Direction()
     * @model
     * @generated
     */
    String getDirection();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see #getDirection()
     * @generated
     */
    void setDirection(String value);

    /**
     * Returns the value of the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notes</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Notes</em>' attribute.
     * @see #setNotes(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_Notes()
     * @model
     * @generated
     */
    String getNotes();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getNotes <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notes</em>' attribute.
     * @see #getNotes()
     * @generated
     */
    void setNotes(String value);

    /**
     * Returns the value of the '<em><b>Source Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Role</em>' attribute.
     * @see #setSourceRole(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_SourceRole()
     * @model
     * @generated
     */
    String getSourceRole();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceRole <em>Source Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Role</em>' attribute.
     * @see #getSourceRole()
     * @generated
     */
    void setSourceRole(String value);

    /**
     * Returns the value of the '<em><b>Dest Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dest Role</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dest Role</em>' attribute.
     * @see #setDestRole(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_DestRole()
     * @model
     * @generated
     */
    String getDestRole();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestRole <em>Dest Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dest Role</em>' attribute.
     * @see #getDestRole()
     * @generated
     */
    void setDestRole(String value);

    /**
     * Returns the value of the '<em><b>Source Access</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Access</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Access</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #setSourceAccess(Scope)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_SourceAccess()
     * @model
     * @generated
     */
    Scope getSourceAccess();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAccess <em>Source Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Access</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #getSourceAccess()
     * @generated
     */
    void setSourceAccess(Scope value);

    /**
     * Returns the value of the '<em><b>Dest Acccess</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dest Acccess</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dest Acccess</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #setDestAcccess(Scope)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_DestAcccess()
     * @model
     * @generated
     */
    Scope getDestAcccess();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAcccess <em>Dest Acccess</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dest Acccess</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #getDestAcccess()
     * @generated
     */
    void setDestAcccess(Scope value);

    /**
     * Returns the value of the '<em><b>Source Aggregation Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Aggregation Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Aggregation Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType
     * @see #setSourceAggregationType(AggregationType)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_SourceAggregationType()
     * @model
     * @generated
     */
    AggregationType getSourceAggregationType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAggregationType <em>Source Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Aggregation Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType
     * @see #getSourceAggregationType()
     * @generated
     */
    void setSourceAggregationType(AggregationType value);

    /**
     * Returns the value of the '<em><b>Dest Aggregation Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dest Aggregation Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dest Aggregation Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType
     * @see #setDestAggregationType(AggregationType)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_DestAggregationType()
     * @model
     * @generated
     */
    AggregationType getDestAggregationType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAggregationType <em>Dest Aggregation Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dest Aggregation Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType
     * @see #getDestAggregationType()
     * @generated
     */
    void setDestAggregationType(AggregationType value);

    /**
     * Returns the value of the '<em><b>Source Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOutgoingConnectors <em>Outgoing Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Object</em>' reference.
     * @see #setSourceObject(ModelObject)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_SourceObject()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOutgoingConnectors
     * @model opposite="outgoingConnectors" resolveProxies="false"
     * @generated
     */
    ModelObject getSourceObject();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceObject <em>Source Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Object</em>' reference.
     * @see #getSourceObject()
     * @generated
     */
    void setSourceObject(ModelObject value);

    /**
     * Returns the value of the '<em><b>Dest Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getIncomingConnectors <em>Incoming Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dest Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dest Object</em>' reference.
     * @see #setDestObject(ModelObject)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getConnector_DestObject()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getIncomingConnectors
     * @model opposite="incomingConnectors" resolveProxies="false"
     * @generated
     */
    ModelObject getDestObject();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestObject <em>Dest Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dest Object</em>' reference.
     * @see #getDestObject()
     * @generated
     */
    void setDestObject(ModelObject value);

} // Connector
