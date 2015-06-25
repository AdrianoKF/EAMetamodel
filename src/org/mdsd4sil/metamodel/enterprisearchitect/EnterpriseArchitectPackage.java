/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectFactory
 * @model kind="package"
 * @generated
 */
public interface EnterpriseArchitectPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "enterprisearchitect";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.ds-lab.org/mdsd4sil/metamodel/ea";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "ea";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EnterpriseArchitectPackage eINSTANCE = org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl.init();

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl <em>Model Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getModelObject()
     * @generated
     */
    int MODEL_OBJECT = 0;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__ATTRIBUTES = 0;

    /**
     * The feature id for the '<em><b>Operations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__OPERATIONS = 1;

    /**
     * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__TAGGED_VALUES = 2;

    /**
     * The feature id for the '<em><b>Object Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__OBJECT_ID = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__NAME = 4;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__NOTE = 5;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__SCOPE = 6;

    /**
     * The feature id for the '<em><b>Object Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__OBJECT_TYPE = 7;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__STEREOTYPE = 8;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__IS_ABSTRACT = 9;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__PARENT = 10;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__PACKAGE = 11;

    /**
     * The feature id for the '<em><b>Incoming Connectors</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__INCOMING_CONNECTORS = 12;

    /**
     * The feature id for the '<em><b>Outgoing Connectors</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT__OUTGOING_CONNECTORS = 13;

    /**
     * The number of structural features of the '<em>Model Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT_FEATURE_COUNT = 14;

    /**
     * The number of operations of the '<em>Model Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OBJECT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getDiagram()
     * @generated
     */
    int DIAGRAM = 1;

    /**
     * The feature id for the '<em><b>Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__OBJECTS = 0;

    /**
     * The feature id for the '<em><b>Diagram Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__DIAGRAM_ID = 1;

    /**
     * The feature id for the '<em><b>Diagram Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__DIAGRAM_TYPE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__NAME = 3;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__NOTES = 4;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__PARENT = 5;

    /**
     * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__CONNECTORS = 6;

    /**
     * The feature id for the '<em><b>Package</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM__PACKAGE = 7;

    /**
     * The number of structural features of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Diagram</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getOperation()
     * @generated
     */
    int OPERATION = 2;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__PARAMETERS = 0;

    /**
     * The feature id for the '<em><b>Operation Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__OPERATION_ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__NAME = 2;

    /**
     * The feature id for the '<em><b>Behavior</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__BEHAVIOR = 3;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__NOTES = 4;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__SCOPE = 5;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__TYPE = 6;

    /**
     * The feature id for the '<em><b>Is Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__IS_STATIC = 7;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__IS_ABSTRACT = 8;

    /**
     * The feature id for the '<em><b>Object</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION__OBJECT = 9;

    /**
     * The number of structural features of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_FEATURE_COUNT = 10;

    /**
     * The number of operations of the '<em>Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getOperationParameter()
     * @generated
     */
    int OPERATION_PARAMETER = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER__TYPE = 1;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER__DEFAULT_VALUE = 2;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER__NOTES = 3;

    /**
     * The feature id for the '<em><b>Is Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER__IS_CONST = 4;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER__DIRECTION = 5;

    /**
     * The feature id for the '<em><b>Operation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER__OPERATION = 6;

    /**
     * The number of structural features of the '<em>Operation Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Operation Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getPackage()
     * @generated
     */
    int PACKAGE = 4;

    /**
     * The feature id for the '<em><b>Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__OBJECTS = 0;

    /**
     * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__DIAGRAMS = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__NAME = 2;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__NOTES = 3;

    /**
     * The feature id for the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__NAMESPACE = 4;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__VERSION = 5;

    /**
     * The feature id for the '<em><b>Package Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__PACKAGE_ID = 6;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__PARENT = 7;

    /**
     * The number of structural features of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 5;

    /**
     * The feature id for the '<em><b>Tagged Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TAGGED_VALUES = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__ID = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = 2;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__SCOPE = 3;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DEFAULT_VALUE = 4;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__TYPE = 5;

    /**
     * The feature id for the '<em><b>Object</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__OBJECT = 6;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getAttributeTag()
     * @generated
     */
    int ATTRIBUTE_TAG = 6;

    /**
     * The feature id for the '<em><b>Property Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TAG__PROPERTY_ID = 0;

    /**
     * The feature id for the '<em><b>Property</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TAG__PROPERTY = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TAG__VALUE = 2;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TAG__NOTES = 3;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TAG__ATTRIBUTE = 4;

    /**
     * The number of structural features of the '<em>Attribute Tag</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TAG_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Attribute Tag</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TAG_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getConnector()
     * @generated
     */
    int CONNECTOR = 7;

    /**
     * The feature id for the '<em><b>Connector Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__CONNECTOR_ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__NAME = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__TYPE = 2;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__STEREOTYPE = 3;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__DIRECTION = 4;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__NOTES = 5;

    /**
     * The feature id for the '<em><b>Source Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__SOURCE_ROLE = 6;

    /**
     * The feature id for the '<em><b>Dest Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__DEST_ROLE = 7;

    /**
     * The feature id for the '<em><b>Source Access</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__SOURCE_ACCESS = 8;

    /**
     * The feature id for the '<em><b>Dest Acccess</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__DEST_ACCCESS = 9;

    /**
     * The feature id for the '<em><b>Source Aggregation Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__SOURCE_AGGREGATION_TYPE = 10;

    /**
     * The feature id for the '<em><b>Dest Aggregation Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__DEST_AGGREGATION_TYPE = 11;

    /**
     * The feature id for the '<em><b>Source Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__SOURCE_OBJECT = 12;

    /**
     * The feature id for the '<em><b>Dest Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR__DEST_OBJECT = 13;

    /**
     * The number of structural features of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_FEATURE_COUNT = 14;

    /**
     * The number of operations of the '<em>Connector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramObjectImpl <em>Diagram Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramObjectImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getDiagramObject()
     * @generated
     */
    int DIAGRAM_OBJECT = 8;

    /**
     * The feature id for the '<em><b>Instance Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OBJECT__INSTANCE_ID = 0;

    /**
     * The feature id for the '<em><b>Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OBJECT__OBJECT = 1;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OBJECT__DIAGRAM = 2;

    /**
     * The number of structural features of the '<em>Diagram Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OBJECT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Diagram Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_OBJECT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl
     * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getObjectProperty()
     * @generated
     */
    int OBJECT_PROPERTY = 9;

    /**
     * The feature id for the '<em><b>Property Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_PROPERTY__PROPERTY_ID = 0;

    /**
     * The feature id for the '<em><b>Property</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_PROPERTY__PROPERTY = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_PROPERTY__VALUE = 2;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_PROPERTY__NOTES = 3;

    /**
     * The feature id for the '<em><b>Object</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_PROPERTY__OBJECT = 4;

    /**
     * The number of structural features of the '<em>Object Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_PROPERTY_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Object Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_PROPERTY_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject <em>Model Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject
     * @generated
     */
    EClass getModelObject();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getAttributes()
     * @see #getModelObject()
     * @generated
     */
    EReference getModelObject_Attributes();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operations</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOperations()
     * @see #getModelObject()
     * @generated
     */
    EReference getModelObject_Operations();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getTaggedValues <em>Tagged Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getTaggedValues()
     * @see #getModelObject()
     * @generated
     */
    EReference getModelObject_TaggedValues();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectId <em>Object Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Object Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectId()
     * @see #getModelObject()
     * @generated
     */
    EAttribute getModelObject_ObjectId();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getName()
     * @see #getModelObject()
     * @generated
     */
    EAttribute getModelObject_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getNote()
     * @see #getModelObject()
     * @generated
     */
    EAttribute getModelObject_Note();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getScope()
     * @see #getModelObject()
     * @generated
     */
    EAttribute getModelObject_Scope();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectType <em>Object Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Object Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getObjectType()
     * @see #getModelObject()
     * @generated
     */
    EAttribute getModelObject_ObjectType();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stereotype</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getStereotype()
     * @see #getModelObject()
     * @generated
     */
    EAttribute getModelObject_Stereotype();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#isIsAbstract <em>Is Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Abstract</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#isIsAbstract()
     * @see #getModelObject()
     * @generated
     */
    EAttribute getModelObject_IsAbstract();

    /**
     * Returns the meta object for the reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getParent()
     * @see #getModelObject()
     * @generated
     */
    EReference getModelObject_Parent();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getPackage()
     * @see #getModelObject()
     * @generated
     */
    EReference getModelObject_Package();

    /**
     * Returns the meta object for the reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getIncomingConnectors <em>Incoming Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Connectors</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getIncomingConnectors()
     * @see #getModelObject()
     * @generated
     */
    EReference getModelObject_IncomingConnectors();

    /**
     * Returns the meta object for the reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOutgoingConnectors <em>Outgoing Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Connectors</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject#getOutgoingConnectors()
     * @see #getModelObject()
     * @generated
     */
    EReference getModelObject_OutgoingConnectors();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram
     * @generated
     */
    EClass getDiagram();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getObjects <em>Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Objects</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getObjects()
     * @see #getDiagram()
     * @generated
     */
    EReference getDiagram_Objects();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramId <em>Diagram Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Diagram Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramId()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_DiagramId();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramType <em>Diagram Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Diagram Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getDiagramType()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_DiagramType();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getName()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getNotes()
     * @see #getDiagram()
     * @generated
     */
    EAttribute getDiagram_Notes();

    /**
     * Returns the meta object for the reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getParent()
     * @see #getDiagram()
     * @generated
     */
    EReference getDiagram_Parent();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getConnectors <em>Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connectors</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getConnectors()
     * @see #getDiagram()
     * @generated
     */
    EReference getDiagram_Connectors();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Package</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram#getPackage()
     * @see #getDiagram()
     * @generated
     */
    EReference getDiagram_Package();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation
     * @generated
     */
    EClass getOperation();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getParameters()
     * @see #getOperation()
     * @generated
     */
    EReference getOperation_Parameters();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getOperationId <em>Operation Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operation Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getOperationId()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_OperationId();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getName()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getBehavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Behavior</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getBehavior()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Behavior();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getNotes()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Notes();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getScope()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Scope();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getType()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_Type();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsStatic <em>Is Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Static</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsStatic()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_IsStatic();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsAbstract <em>Is Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Abstract</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#isIsAbstract()
     * @see #getOperation()
     * @generated
     */
    EAttribute getOperation_IsAbstract();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation#getObject()
     * @see #getOperation()
     * @generated
     */
    EReference getOperation_Object();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter <em>Operation Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Parameter</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter
     * @generated
     */
    EClass getOperationParameter();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getName()
     * @see #getOperationParameter()
     * @generated
     */
    EAttribute getOperationParameter_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getType()
     * @see #getOperationParameter()
     * @generated
     */
    EAttribute getOperationParameter_Type();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDefaultValue()
     * @see #getOperationParameter()
     * @generated
     */
    EAttribute getOperationParameter_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getNotes()
     * @see #getOperationParameter()
     * @generated
     */
    EAttribute getOperationParameter_Notes();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#isIsConst <em>Is Const</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Const</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#isIsConst()
     * @see #getOperationParameter()
     * @generated
     */
    EAttribute getOperationParameter_IsConst();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getDirection()
     * @see #getOperationParameter()
     * @generated
     */
    EAttribute getOperationParameter_Direction();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Operation</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter#getOperation()
     * @see #getOperationParameter()
     * @generated
     */
    EReference getOperationParameter_Operation();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package
     * @generated
     */
    EClass getPackage();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getObjects <em>Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Objects</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getObjects()
     * @see #getPackage()
     * @generated
     */
    EReference getPackage_Objects();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getDiagrams <em>Diagrams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Diagrams</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getDiagrams()
     * @see #getPackage()
     * @generated
     */
    EReference getPackage_Diagrams();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getName()
     * @see #getPackage()
     * @generated
     */
    EAttribute getPackage_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getNotes()
     * @see #getPackage()
     * @generated
     */
    EAttribute getPackage_Notes();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getNamespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Namespace</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getNamespace()
     * @see #getPackage()
     * @generated
     */
    EAttribute getPackage_Namespace();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getVersion()
     * @see #getPackage()
     * @generated
     */
    EAttribute getPackage_Version();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getPackageId <em>Package Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Package Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getPackageId()
     * @see #getPackage()
     * @generated
     */
    EAttribute getPackage_PackageId();

    /**
     * Returns the meta object for the reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package#getParent()
     * @see #getPackage()
     * @generated
     */
    EReference getPackage_Parent();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getTaggedValues <em>Tagged Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Tagged Values</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getTaggedValues()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_TaggedValues();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getId()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Id();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getName()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getScope()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Scope();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getDefaultValue()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getType()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Type();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute#getObject()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_Object();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag <em>Attribute Tag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Tag</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag
     * @generated
     */
    EClass getAttributeTag();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getPropertyId <em>Property Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Property Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getPropertyId()
     * @see #getAttributeTag()
     * @generated
     */
    EAttribute getAttributeTag_PropertyId();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Property</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getProperty()
     * @see #getAttributeTag()
     * @generated
     */
    EAttribute getAttributeTag_Property();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getValue()
     * @see #getAttributeTag()
     * @generated
     */
    EAttribute getAttributeTag_Value();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getNotes()
     * @see #getAttributeTag()
     * @generated
     */
    EAttribute getAttributeTag_Notes();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Attribute</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag#getAttribute()
     * @see #getAttributeTag()
     * @generated
     */
    EReference getAttributeTag_Attribute();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector
     * @generated
     */
    EClass getConnector();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getConnectorId <em>Connector Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connector Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getConnectorId()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_ConnectorId();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getName()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_Name();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getType()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_Type();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stereotype</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getStereotype()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_Stereotype();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDirection()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_Direction();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getNotes()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_Notes();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceRole <em>Source Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Role</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceRole()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_SourceRole();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestRole <em>Dest Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dest Role</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestRole()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_DestRole();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAccess <em>Source Access</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Access</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAccess()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_SourceAccess();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAcccess <em>Dest Acccess</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dest Acccess</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAcccess()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_DestAcccess();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAggregationType <em>Source Aggregation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Aggregation Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceAggregationType()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_SourceAggregationType();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAggregationType <em>Dest Aggregation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dest Aggregation Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestAggregationType()
     * @see #getConnector()
     * @generated
     */
    EAttribute getConnector_DestAggregationType();

    /**
     * Returns the meta object for the reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceObject <em>Source Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getSourceObject()
     * @see #getConnector()
     * @generated
     */
    EReference getConnector_SourceObject();

    /**
     * Returns the meta object for the reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestObject <em>Dest Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Dest Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector#getDestObject()
     * @see #getConnector()
     * @generated
     */
    EReference getConnector_DestObject();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject <em>Diagram Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject
     * @generated
     */
    EClass getDiagramObject();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getInstanceId <em>Instance Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Instance Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getInstanceId()
     * @see #getDiagramObject()
     * @generated
     */
    EAttribute getDiagramObject_InstanceId();

    /**
     * Returns the meta object for the reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getObject()
     * @see #getDiagramObject()
     * @generated
     */
    EReference getDiagramObject_Object();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Diagram</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject#getDiagram()
     * @see #getDiagramObject()
     * @generated
     */
    EReference getDiagramObject_Diagram();

    /**
     * Returns the meta object for class '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty <em>Object Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object Property</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty
     * @generated
     */
    EClass getObjectProperty();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getPropertyId <em>Property Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Property Id</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getPropertyId()
     * @see #getObjectProperty()
     * @generated
     */
    EAttribute getObjectProperty_PropertyId();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getProperty <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Property</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getProperty()
     * @see #getObjectProperty()
     * @generated
     */
    EAttribute getObjectProperty_Property();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getValue()
     * @see #getObjectProperty()
     * @generated
     */
    EAttribute getObjectProperty_Value();

    /**
     * Returns the meta object for the attribute '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getNotes()
     * @see #getObjectProperty()
     * @generated
     */
    EAttribute getObjectProperty_Notes();

    /**
     * Returns the meta object for the container reference '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Object</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty#getObject()
     * @see #getObjectProperty()
     * @generated
     */
    EReference getObjectProperty_Object();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EnterpriseArchitectFactory getEnterpriseArchitectFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl <em>Model Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.ModelObjectImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getModelObject()
         * @generated
         */
        EClass MODEL_OBJECT = eINSTANCE.getModelObject();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_OBJECT__ATTRIBUTES = eINSTANCE.getModelObject_Attributes();

        /**
         * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_OBJECT__OPERATIONS = eINSTANCE.getModelObject_Operations();

        /**
         * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_OBJECT__TAGGED_VALUES = eINSTANCE.getModelObject_TaggedValues();

        /**
         * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_OBJECT__OBJECT_ID = eINSTANCE.getModelObject_ObjectId();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_OBJECT__NAME = eINSTANCE.getModelObject_Name();

        /**
         * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_OBJECT__NOTE = eINSTANCE.getModelObject_Note();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_OBJECT__SCOPE = eINSTANCE.getModelObject_Scope();

        /**
         * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_OBJECT__OBJECT_TYPE = eINSTANCE.getModelObject_ObjectType();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_OBJECT__STEREOTYPE = eINSTANCE.getModelObject_Stereotype();

        /**
         * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_OBJECT__IS_ABSTRACT = eINSTANCE.getModelObject_IsAbstract();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_OBJECT__PARENT = eINSTANCE.getModelObject_Parent();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_OBJECT__PACKAGE = eINSTANCE.getModelObject_Package();

        /**
         * The meta object literal for the '<em><b>Incoming Connectors</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_OBJECT__INCOMING_CONNECTORS = eINSTANCE.getModelObject_IncomingConnectors();

        /**
         * The meta object literal for the '<em><b>Outgoing Connectors</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_OBJECT__OUTGOING_CONNECTORS = eINSTANCE.getModelObject_OutgoingConnectors();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl <em>Diagram</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getDiagram()
         * @generated
         */
        EClass DIAGRAM = eINSTANCE.getDiagram();

        /**
         * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM__OBJECTS = eINSTANCE.getDiagram_Objects();

        /**
         * The meta object literal for the '<em><b>Diagram Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__DIAGRAM_ID = eINSTANCE.getDiagram_DiagramId();

        /**
         * The meta object literal for the '<em><b>Diagram Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__DIAGRAM_TYPE = eINSTANCE.getDiagram_DiagramType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__NAME = eINSTANCE.getDiagram_Name();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM__NOTES = eINSTANCE.getDiagram_Notes();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM__PARENT = eINSTANCE.getDiagram_Parent();

        /**
         * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM__CONNECTORS = eINSTANCE.getDiagram_Connectors();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM__PACKAGE = eINSTANCE.getDiagram_Package();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl <em>Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getOperation()
         * @generated
         */
        EClass OPERATION = eINSTANCE.getOperation();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

        /**
         * The meta object literal for the '<em><b>Operation Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__OPERATION_ID = eINSTANCE.getOperation_OperationId();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

        /**
         * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__BEHAVIOR = eINSTANCE.getOperation_Behavior();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__NOTES = eINSTANCE.getOperation_Notes();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__SCOPE = eINSTANCE.getOperation_Scope();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__TYPE = eINSTANCE.getOperation_Type();

        /**
         * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__IS_STATIC = eINSTANCE.getOperation_IsStatic();

        /**
         * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION__IS_ABSTRACT = eINSTANCE.getOperation_IsAbstract();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION__OBJECT = eINSTANCE.getOperation_Object();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.OperationParameterImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getOperationParameter()
         * @generated
         */
        EClass OPERATION_PARAMETER = eINSTANCE.getOperationParameter();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_PARAMETER__NAME = eINSTANCE.getOperationParameter_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_PARAMETER__TYPE = eINSTANCE.getOperationParameter_Type();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_PARAMETER__DEFAULT_VALUE = eINSTANCE.getOperationParameter_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_PARAMETER__NOTES = eINSTANCE.getOperationParameter_Notes();

        /**
         * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_PARAMETER__IS_CONST = eINSTANCE.getOperationParameter_IsConst();

        /**
         * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_PARAMETER__DIRECTION = eINSTANCE.getOperationParameter_Direction();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_PARAMETER__OPERATION = eINSTANCE.getOperationParameter_Operation();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl <em>Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.PackageImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getPackage()
         * @generated
         */
        EClass PACKAGE = eINSTANCE.getPackage();

        /**
         * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE__OBJECTS = eINSTANCE.getPackage_Objects();

        /**
         * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE__DIAGRAMS = eINSTANCE.getPackage_Diagrams();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGE__NOTES = eINSTANCE.getPackage_Notes();

        /**
         * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGE__NAMESPACE = eINSTANCE.getPackage_Namespace();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

        /**
         * The meta object literal for the '<em><b>Package Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGE__PACKAGE_ID = eINSTANCE.getPackage_PackageId();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGE__PARENT = eINSTANCE.getPackage_Parent();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '<em><b>Tagged Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__TAGGED_VALUES = eINSTANCE.getAttribute_TaggedValues();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__ID = eINSTANCE.getAttribute_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__SCOPE = eINSTANCE.getAttribute_Scope();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__OBJECT = eINSTANCE.getAttribute_Object();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl <em>Attribute Tag</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.AttributeTagImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getAttributeTag()
         * @generated
         */
        EClass ATTRIBUTE_TAG = eINSTANCE.getAttributeTag();

        /**
         * The meta object literal for the '<em><b>Property Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TAG__PROPERTY_ID = eINSTANCE.getAttributeTag_PropertyId();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TAG__PROPERTY = eINSTANCE.getAttributeTag_Property();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TAG__VALUE = eINSTANCE.getAttributeTag_Value();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TAG__NOTES = eINSTANCE.getAttributeTag_Notes();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TAG__ATTRIBUTE = eINSTANCE.getAttributeTag_Attribute();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl <em>Connector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.ConnectorImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getConnector()
         * @generated
         */
        EClass CONNECTOR = eINSTANCE.getConnector();

        /**
         * The meta object literal for the '<em><b>Connector Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__CONNECTOR_ID = eINSTANCE.getConnector_ConnectorId();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__STEREOTYPE = eINSTANCE.getConnector_Stereotype();

        /**
         * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__DIRECTION = eINSTANCE.getConnector_Direction();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__NOTES = eINSTANCE.getConnector_Notes();

        /**
         * The meta object literal for the '<em><b>Source Role</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__SOURCE_ROLE = eINSTANCE.getConnector_SourceRole();

        /**
         * The meta object literal for the '<em><b>Dest Role</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__DEST_ROLE = eINSTANCE.getConnector_DestRole();

        /**
         * The meta object literal for the '<em><b>Source Access</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__SOURCE_ACCESS = eINSTANCE.getConnector_SourceAccess();

        /**
         * The meta object literal for the '<em><b>Dest Acccess</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__DEST_ACCCESS = eINSTANCE.getConnector_DestAcccess();

        /**
         * The meta object literal for the '<em><b>Source Aggregation Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__SOURCE_AGGREGATION_TYPE = eINSTANCE.getConnector_SourceAggregationType();

        /**
         * The meta object literal for the '<em><b>Dest Aggregation Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR__DEST_AGGREGATION_TYPE = eINSTANCE.getConnector_DestAggregationType();

        /**
         * The meta object literal for the '<em><b>Source Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR__SOURCE_OBJECT = eINSTANCE.getConnector_SourceObject();

        /**
         * The meta object literal for the '<em><b>Dest Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR__DEST_OBJECT = eINSTANCE.getConnector_DestObject();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramObjectImpl <em>Diagram Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.DiagramObjectImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getDiagramObject()
         * @generated
         */
        EClass DIAGRAM_OBJECT = eINSTANCE.getDiagramObject();

        /**
         * The meta object literal for the '<em><b>Instance Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_OBJECT__INSTANCE_ID = eINSTANCE.getDiagramObject_InstanceId();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_OBJECT__OBJECT = eINSTANCE.getDiagramObject_Object();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_OBJECT__DIAGRAM = eINSTANCE.getDiagramObject_Diagram();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.ObjectPropertyImpl
         * @see org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl#getObjectProperty()
         * @generated
         */
        EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

        /**
         * The meta object literal for the '<em><b>Property Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OBJECT_PROPERTY__PROPERTY_ID = eINSTANCE.getObjectProperty_PropertyId();

        /**
         * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OBJECT_PROPERTY__PROPERTY = eINSTANCE.getObjectProperty_Property();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OBJECT_PROPERTY__VALUE = eINSTANCE.getObjectProperty_Value();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OBJECT_PROPERTY__NOTES = eINSTANCE.getObjectProperty_Notes();

        /**
         * The meta object literal for the '<em><b>Object</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBJECT_PROPERTY__OBJECT = eINSTANCE.getObjectProperty_Object();

    }

} //EnterpriseArchitectPackage
