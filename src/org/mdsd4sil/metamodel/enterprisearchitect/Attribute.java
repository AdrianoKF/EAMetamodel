/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getTaggedValues <em>Tagged Values</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getId <em>Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getScope <em>Scope</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
    /**
     * Returns the value of the '<em><b>Tagged Values</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tagged Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tagged Values</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute_TaggedValues()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getAttribute
     * @model opposite="attribute" containment="true"
     * @generated
     */
    EList<AttributeTag> getTaggedValues();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute_Id()
     * @model id="true"
     * @generated
     */
    int getId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(int value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute_Scope()
     * @model
     * @generated
     */
    Scope getScope();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see #getScope()
     * @generated
     */
    void setScope(Scope value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Object</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' container reference.
     * @see #setObject(ModelObject)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getAttribute_Object()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getAttributes
     * @model opposite="attributes" required="true" transient="false"
     * @generated
     */
    ModelObject getObject();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getObject <em>Object</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' container reference.
     * @see #getObject()
     * @generated
     */
    void setObject(ModelObject value);

} // Attribute
