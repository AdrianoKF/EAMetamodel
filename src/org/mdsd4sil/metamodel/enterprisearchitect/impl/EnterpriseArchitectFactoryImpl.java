/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mdsd4sil.metamodel.enterprisearchitect.Attribute;
import org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag;
import org.mdsd4sil.metamodel.enterprisearchitect.Connector;
import org.mdsd4sil.metamodel.enterprisearchitect.Diagram;
import org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectFactory;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;
import org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty;
import org.mdsd4sil.metamodel.enterprisearchitect.Operation;
import org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnterpriseArchitectFactoryImpl extends EFactoryImpl implements EnterpriseArchitectFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EnterpriseArchitectFactory init() {
        try {
            EnterpriseArchitectFactory theEnterpriseArchitectFactory = (EnterpriseArchitectFactory)EPackage.Registry.INSTANCE.getEFactory(EnterpriseArchitectPackage.eNS_URI);
            if (theEnterpriseArchitectFactory != null) {
                return theEnterpriseArchitectFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EnterpriseArchitectFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnterpriseArchitectFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EnterpriseArchitectPackage.MODEL_OBJECT: return createModelObject();
            case EnterpriseArchitectPackage.DIAGRAM: return createDiagram();
            case EnterpriseArchitectPackage.OPERATION: return createOperation();
            case EnterpriseArchitectPackage.OPERATION_PARAMETER: return createOperationParameter();
            case EnterpriseArchitectPackage.PACKAGE: return createPackage();
            case EnterpriseArchitectPackage.ATTRIBUTE: return createAttribute();
            case EnterpriseArchitectPackage.ATTRIBUTE_TAG: return createAttributeTag();
            case EnterpriseArchitectPackage.CONNECTOR: return createConnector();
            case EnterpriseArchitectPackage.DIAGRAM_OBJECT: return createDiagramObject();
            case EnterpriseArchitectPackage.OBJECT_PROPERTY: return createObjectProperty();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelObject createModelObject() {
        ModelObjectImpl modelObject = new ModelObjectImpl();
        return modelObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Diagram createDiagram() {
        DiagramImpl diagram = new DiagramImpl();
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationParameter createOperationParameter() {
        OperationParameterImpl operationParameter = new OperationParameterImpl();
        return operationParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.mdsd4sil.metamodel.enterprisearchitect.Package createPackage() {
        PackageImpl package_ = new PackageImpl();
        return package_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeTag createAttributeTag() {
        AttributeTagImpl attributeTag = new AttributeTagImpl();
        return attributeTag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector createConnector() {
        ConnectorImpl connector = new ConnectorImpl();
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramObject createDiagramObject() {
        DiagramObjectImpl diagramObject = new DiagramObjectImpl();
        return diagramObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectProperty createObjectProperty() {
        ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
        return objectProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnterpriseArchitectPackage getEnterpriseArchitectPackage() {
        return (EnterpriseArchitectPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EnterpriseArchitectPackage getPackage() {
        return EnterpriseArchitectPackage.eINSTANCE;
    }

} //EnterpriseArchitectFactoryImpl
