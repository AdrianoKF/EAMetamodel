/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.ecore.EObject;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#isIsConst <em>Is Const</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter()
 * @model
 * @generated
 */
public interface OperationParameter extends EObject {
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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter_Notes()
     * @model
     * @generated
     */
    String getNotes();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getNotes <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notes</em>' attribute.
     * @see #getNotes()
     * @generated
     */
    void setNotes(String value);

    /**
     * Returns the value of the '<em><b>Is Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Const</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Const</em>' attribute.
     * @see #setIsConst(boolean)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter_IsConst()
     * @model
     * @generated
     */
    boolean isIsConst();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#isIsConst <em>Is Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Const</em>' attribute.
     * @see #isIsConst()
     * @generated
     */
    void setIsConst(boolean value);

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind
     * @see #setDirection(ParameterKind)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter_Direction()
     * @model
     * @generated
     */
    ParameterKind getDirection();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind
     * @see #getDirection()
     * @generated
     */
    void setDirection(ParameterKind value);

    /**
     * Returns the value of the '<em><b>Operation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' container reference.
     * @see #setOperation(Operation)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getOperationParameter_Operation()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getParameters
     * @model opposite="parameters" required="true" transient="false"
     * @generated
     */
    Operation getOperation();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getOperation <em>Operation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation</em>' container reference.
     * @see #getOperation()
     * @generated
     */
    void setOperation(Operation value);

} // OperationParameter
