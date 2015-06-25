/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getNote <em>Note</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getPackage <em>Package</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getIncomingConnectors <em>Incoming Connectors</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOutgoingConnectors <em>Outgoing Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject()
 * @model
 * @generated
 */
public interface ModelObject extends EObject {
    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Attributes()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getObject
     * @model opposite="object" containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.Operation}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Operations()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getObject
     * @model opposite="object" containment="true"
     * @generated
     */
    EList<Operation> getOperations();

    /**
     * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tagged Values</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_TaggedValues()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getObject
     * @model opposite="object" containment="true"
     * @generated
     */
    EList<ObjectProperty> getTaggedValues();

    /**
     * Returns the value of the '<em><b>Object Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Id</em>' attribute.
     * @see #setObjectId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_ObjectId()
     * @model id="true"
     * @generated
     */
    int getObjectId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectId <em>Object Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Id</em>' attribute.
     * @see #getObjectId()
     * @generated
     */
    void setObjectId(int value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Note</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' attribute.
     * @see #setNote(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Note()
     * @model
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getNote <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Note</em>' attribute.
     * @see #getNote()
     * @generated
     */
    void setNote(String value);

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #setScope(Scope)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Scope()
     * @model
     * @generated
     */
    Scope getScope();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #getScope()
     * @generated
     */
    void setScope(Scope value);

    /**
     * Returns the value of the '<em><b>Object Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType
     * @see #setObjectType(ObjectType)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_ObjectType()
     * @model
     * @generated
     */
    ObjectType getObjectType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectType <em>Object Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Type</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType
     * @see #getObjectType()
     * @generated
     */
    void setObjectType(ObjectType value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Stereotype()
     * @model
     * @generated
     */
    String getStereotype();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' attribute.
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(String value);

    /**
     * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Abstract</em>' attribute.
     * @see #setIsAbstract(boolean)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_IsAbstract()
     * @model
     * @generated
     */
    boolean isIsAbstract();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#isIsAbstract <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Abstract</em>' attribute.
     * @see #isIsAbstract()
     * @generated
     */
    void setIsAbstract(boolean value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(ModelObject)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Parent()
     * @model
     * @generated
     */
    ModelObject getParent();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(ModelObject value);

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getObjects <em>Objects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_Package()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getObjects
     * @model opposite="objects" required="true" transient="false"
     * @generated
     */
    org.mdsd4sil.metamodel.enterprisearchitect.Package getPackage();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package value);

    /**
     * Returns the value of the '<em><b>Incoming Connectors</b></em>' reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.Connector}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestObject <em>Dest Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Connectors</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Connectors</em>' reference list.
     * @see #isSetIncomingConnectors()
     * @see #unsetIncomingConnectors()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_IncomingConnectors()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestObject
     * @model opposite="destObject" unsettable="true" transient="true" derived="true"
     * @generated
     */
    EList<Connector> getIncomingConnectors();

    /**
     * Unsets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getIncomingConnectors <em>Incoming Connectors</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncomingConnectors()
     * @see #getIncomingConnectors()
     * @generated
     */
    void unsetIncomingConnectors();

    /**
     * Returns whether the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getIncomingConnectors <em>Incoming Connectors</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incoming Connectors</em>' reference list is set.
     * @see #unsetIncomingConnectors()
     * @see #getIncomingConnectors()
     * @generated
     */
    boolean isSetIncomingConnectors();

    /**
     * Returns the value of the '<em><b>Outgoing Connectors</b></em>' reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.Connector}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceObject <em>Source Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Connectors</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Connectors</em>' reference list.
     * @see #isSetOutgoingConnectors()
     * @see #unsetOutgoingConnectors()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getModelObject_OutgoingConnectors()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceObject
     * @model opposite="sourceObject" unsettable="true" transient="true" derived="true"
     * @generated
     */
    EList<Connector> getOutgoingConnectors();

    /**
     * Unsets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOutgoingConnectors <em>Outgoing Connectors</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutgoingConnectors()
     * @see #getOutgoingConnectors()
     * @generated
     */
    void unsetOutgoingConnectors();

    /**
     * Returns whether the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOutgoingConnectors <em>Outgoing Connectors</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outgoing Connectors</em>' reference list is set.
     * @see #unsetOutgoingConnectors()
     * @see #getOutgoingConnectors()
     * @generated
     */
    boolean isSetOutgoingConnectors();

} // ModelObject
