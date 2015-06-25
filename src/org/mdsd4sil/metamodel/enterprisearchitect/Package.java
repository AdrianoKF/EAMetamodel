/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getPackageId <em>Package Id</em>}</li>
 *   <li>{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
    /**
     * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Objects</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_Objects()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<ModelObject> getObjects();

    /**
     * Returns the value of the '<em><b>Diagrams</b></em>' containment reference list.
     * The list contents are of type {@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram}.
     * It is bidirectional and its opposite is '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagrams</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagrams</em>' containment reference list.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_Diagrams()
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getPackage
     * @model opposite="package" containment="true"
     * @generated
     */
    EList<Diagram> getDiagrams();

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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getName <em>Name</em>}' attribute.
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
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_Notes()
     * @model
     * @generated
     */
    String getNotes();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getNotes <em>Notes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notes</em>' attribute.
     * @see #getNotes()
     * @generated
     */
    void setNotes(String value);

    /**
     * Returns the value of the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' attribute.
     * @see #setNamespace(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_Namespace()
     * @model
     * @generated
     */
    String getNamespace();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getNamespace <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' attribute.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_Version()
     * @model
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Returns the value of the '<em><b>Package Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package Id</em>' attribute.
     * @see #setPackageId(int)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_PackageId()
     * @model id="true"
     * @generated
     */
    int getPackageId();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getPackageId <em>Package Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package Id</em>' attribute.
     * @see #getPackageId()
     * @generated
     */
    void setPackageId(int value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' reference.
     * @see #setParent(Package)
     * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage#getPackage_Parent()
     * @model
     * @generated
     */
    Package getParent();

    /**
     * Sets the value of the '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getParent <em>Parent</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' reference.
     * @see #getParent()
     * @generated
     */
    void setParent(Package value);

} // Package
