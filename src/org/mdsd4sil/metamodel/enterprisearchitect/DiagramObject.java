/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getInstanceId <em>Instance Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getObject <em>Object</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagramObject()
 * @model
 * @generated
 */
public interface DiagramObject extends EObject {
    /**
     * Returns the value of the '<em><b>Instance Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Instance Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Instance Id</em>' attribute.
     * @see #setInstanceId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagramObject_InstanceId()
     * @model id="true"
     * @generated
     */
    int getInstanceId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getInstanceId <em>Instance Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Instance Id</em>' attribute.
     * @see #getInstanceId()
     * @generated
     */
    void setInstanceId(int value);

    /**
     * Returns the value of the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' reference.
     * @see #setObject(ModelObject)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagramObject_Object()
     * @model required="true"
     * @generated
     */
    ModelObject getObject();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getObject <em>Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object</em>' reference.
     * @see #getObject()
     * @generated
     */
    void setObject(ModelObject value);

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getObjects <em>Objects</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' container reference.
     * @see #setDiagram(Diagram)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagramObject_Diagram()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getObjects
     * @model opposite="objects" required="true" transient="false"
     * @generated
     */
    Diagram getDiagram();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getDiagram <em>Diagram</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' container reference.
     * @see #getDiagram()
     * @generated
     */
    void setDiagram(Diagram value);

} // DiagramObject
