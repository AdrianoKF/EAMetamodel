/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getPropertyId <em>Property Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getValue <em>Value</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getObjectProperty()
 * @model
 * @generated
 */
public interface ObjectProperty extends EObject {
    /**
     * Returns the value of the '<em><b>Property Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property Id</em>' attribute.
     * @see #setPropertyId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getObjectProperty_PropertyId()
     * @model id="true"
     * @generated
     */
    int getPropertyId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getPropertyId <em>Property Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property Id</em>' attribute.
     * @see #getPropertyId()
     * @generated
     */
    void setPropertyId(int value);

    /**
     * Returns the value of the '<em><b>Property</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Property</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' attribute.
     * @see #setProperty(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getObjectProperty_Property()
     * @model
     * @generated
     */
    String getProperty();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getProperty <em>Property</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' attribute.
     * @see #getProperty()
     * @generated
     */
    void setProperty(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getObjectProperty_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getObjectProperty_Notes()
     * @model
     * @generated
     */
    String getNotes();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getNotes <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notes</em>' attribute.
     * @see #getNotes()
     * @generated
     */
    void setNotes(String value);

    /**
     * Returns the value of the '<em><b>Object</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getTaggedValues <em>Tagged Values</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' container reference.
     * @see #setObject(ModelObject)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getObjectProperty_Object()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getTaggedValues
     * @model opposite="taggedValues" required="true" transient="false"
     * @generated
     */
    ModelObject getObject();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getObject <em>Object</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' container reference.
     * @see #getObject()
     * @generated
     */
    void setObject(ModelObject value);

} // ObjectProperty
