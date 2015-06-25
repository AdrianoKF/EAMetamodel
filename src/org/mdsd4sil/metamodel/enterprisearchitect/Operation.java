/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_Parameters()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getOperation
     * @model opposite="operation" containment="true"
     * @generated
     */
    EList<OperationParameter> getParameters();

    /**
     * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation Id</em>' attribute.
     * @see #setOperationId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_OperationId()
     * @model id="true"
     * @generated
     */
    int getOperationId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getOperationId <em>Operation Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation Id</em>' attribute.
     * @see #getOperationId()
     * @generated
     */
    void setOperationId(int value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Behavior</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior</em>' attribute.
     * @see #setBehavior(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_Behavior()
     * @model
     * @generated
     */
    String getBehavior();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getBehavior <em>Behavior</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior</em>' attribute.
     * @see #getBehavior()
     * @generated
     */
    void setBehavior(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_Notes()
     * @model
     * @generated
     */
    String getNotes();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getNotes <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notes</em>' attribute.
     * @see #getNotes()
     * @generated
     */
    void setNotes(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_Scope()
     * @model
     * @generated
     */
    Scope getScope();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #getScope()
     * @generated
     */
    void setScope(Scope value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Is Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Static</em>' attribute.
     * @see #setIsStatic(boolean)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_IsStatic()
     * @model
     * @generated
     */
    boolean isIsStatic();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsStatic <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Static</em>' attribute.
     * @see #isIsStatic()
     * @generated
     */
    void setIsStatic(boolean value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_IsAbstract()
     * @model
     * @generated
     */
    boolean isIsAbstract();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsAbstract <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Abstract</em>' attribute.
     * @see #isIsAbstract()
     * @generated
     */
    void setIsAbstract(boolean value);

    /**
     * Returns the value of the '<em><b>Object</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' container reference.
     * @see #setObject(ModelObject)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperation_Object()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOperations
     * @model opposite="operations" transient="false"
     * @generated
     */
    ModelObject getObject();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getObject <em>Object</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' container reference.
     * @see #getObject()
     * @generated
     */
    void setObject(ModelObject value);

} // Operation
