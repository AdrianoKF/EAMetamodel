/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramId <em>Diagram Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
    /**
     * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Objects</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_Objects()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getDiagram
     * @model opposite="diagram" containment="true"
     * @generated
     */
    EList<DiagramObject> getObjects();

    /**
     * Returns the value of the '<em><b>Diagram Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Id</em>' attribute.
     * @see #setDiagramId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_DiagramId()
     * @model id="true"
     * @generated
     */
    int getDiagramId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramId <em>Diagram Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Id</em>' attribute.
     * @see #getDiagramId()
     * @generated
     */
    void setDiagramId(int value);

    /**
     * Returns the value of the '<em><b>Diagram Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram Type</em>' attribute.
     * @see #setDiagramType(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_DiagramType()
     * @model
     * @generated
     */
    String getDiagramType();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramType <em>Diagram Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Type</em>' attribute.
     * @see #getDiagramType()
     * @generated
     */
    void setDiagramType(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_Notes()
     * @model
     * @generated
     */
    String getNotes();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getNotes <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notes</em>' attribute.
     * @see #getNotes()
     * @generated
     */
    void setNotes(String value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(Diagram)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_Parent()
     * @model
     * @generated
     */
    Diagram getParent();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(Diagram value);

    /**
     * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.Connector}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectors</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectors</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_Connectors()
     * @model containment="true"
     * @generated
     */
    EList<Connector> getConnectors();

    /**
     * Returns the value of the '<em><b>Package</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getDiagrams <em>Diagrams</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' container reference.
     * @see #setPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getDiagram_Package()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getDiagrams
     * @model opposite="diagrams" required="true" transient="false"
     * @generated
     */
    org.mdsd4sil.metamodel.enterprisearchitect.Package getPackage();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getPackage <em>Package</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' container reference.
     * @see #getPackage()
     * @generated
     */
    void setPackage(org.mdsd4sil.metamodel.enterprisearchitect.Package value);

} // Diagram
