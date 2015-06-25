/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;

import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.DatatypesFactory;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.DatatypesPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope;

import org.mdsd4sil.metamodel.enterprisearchitect.impl.EnterpriseArchitectPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum scopeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum aggregationTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum connectorTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum objectTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum parameterKindEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.DatatypesPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DatatypesPackageImpl() {
        super(eNS_URI, DatatypesFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DatatypesPackage init() {
        if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

        // Obtain or create and register package
        DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        EnterpriseArchitectPackageImpl theEnterpriseArchitectPackage = (EnterpriseArchitectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnterpriseArchitectPackage.eNS_URI) instanceof EnterpriseArchitectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnterpriseArchitectPackage.eNS_URI) : EnterpriseArchitectPackage.eINSTANCE);

        // Create package meta-data objects
        theDatatypesPackage.createPackageContents();
        theEnterpriseArchitectPackage.createPackageContents();

        // Initialize created meta-data
        theDatatypesPackage.initializePackageContents();
        theEnterpriseArchitectPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDatatypesPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
        return theDatatypesPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getScope() {
        return scopeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAggregationType() {
        return aggregationTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getConnectorType() {
        return connectorTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getObjectType() {
        return objectTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getParameterKind() {
        return parameterKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DatatypesFactory getDatatypesFactory() {
        return (DatatypesFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create enums
        scopeEEnum = createEEnum(SCOPE);
        aggregationTypeEEnum = createEEnum(AGGREGATION_TYPE);
        connectorTypeEEnum = createEEnum(CONNECTOR_TYPE);
        objectTypeEEnum = createEEnum(OBJECT_TYPE);
        parameterKindEEnum = createEEnum(PARAMETER_KIND);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Initialize enums and add enum literals
        initEEnum(scopeEEnum, Scope.class, "Scope");
        addEEnumLiteral(scopeEEnum, Scope.PRIVATE);
        addEEnumLiteral(scopeEEnum, Scope.PUBLIC);
        addEEnumLiteral(scopeEEnum, Scope.PROTECTED);
        addEEnumLiteral(scopeEEnum, Scope.PACKAGE);

        initEEnum(aggregationTypeEEnum, AggregationType.class, "AggregationType");
        addEEnumLiteral(aggregationTypeEEnum, AggregationType.NONE);
        addEEnumLiteral(aggregationTypeEEnum, AggregationType.AGGREGATION);
        addEEnumLiteral(aggregationTypeEEnum, AggregationType.COMPOSITION);

        initEEnum(connectorTypeEEnum, ConnectorType.class, "ConnectorType");
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.ABSTRACTION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.AGGREGATION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.ASSEMBLY);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.ASSOCIATION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.COLLABORATION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.COMMUNICATION_PATH);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.CONNECTOR);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.CONTROL_FLOW);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.DELEGATE);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.DEPENDENCY);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.DEPLOYMENT);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.ER_LINK);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.EXTENSION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.GENERALIZATION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.INFORMATION_FLOW);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.INSTANTIATION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.INTERRUPT_FLOW);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.MANIFEST);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.NESTING);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.NOTE_LINK);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.OBJECT_FLOW);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.PACKAGE);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.PROTOCOL_CONFORMANCE);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.PROTOCOL_TRANSITION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.REALISATION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.SEQUENCE);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.STATE_FLOW);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.SUBSTITUTION);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.USAGE);
        addEEnumLiteral(connectorTypeEEnum, ConnectorType.USE_CASE);

        initEEnum(objectTypeEEnum, ObjectType.class, "ObjectType");
        addEEnumLiteral(objectTypeEEnum, ObjectType.ACTION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ACTION_PIN);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ACTIVITY);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ACTIVITY_PARAMETER);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ACTIVITY_PARTITION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ACTIVITY_REGION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ACTOR);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ARTIFACT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ASSOCIATION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.BOUNDARY);
        addEEnumLiteral(objectTypeEEnum, ObjectType.CENTRAL_BUFFER_NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.CHANGE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.CLASS);
        addEEnumLiteral(objectTypeEEnum, ObjectType.COLLABORATION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.COLLABORATION_OCCURRENCE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.COMMENT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.COMPONENT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.CONDITIONAL_NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.CONSTRAINT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.DATA_STORE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.DATA_TYPE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.DECISION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.DEPLOYMENT_SPECIFICATION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.DEVICE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.DIAGRAM_FRAME);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ENTITY);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ENTRY_POINT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ENUMERATION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.EVENT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.EXCEPTION_HANDLER);
        addEEnumLiteral(objectTypeEEnum, ObjectType.EXECUTION_ENVIRONMENT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.EXIT_POINT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.EXPANSION_NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.EXPANSION_REGION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.FEATURE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.GUI_ELEMENT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.INFORMATION_ITEM);
        addEEnumLiteral(objectTypeEEnum, ObjectType.INTERACTION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.INTERACTION_FRAGMENT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.INTERACTION_OCCURRENCE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.INTERACTION_STATE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.INTERFACE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.INTERRUPTIBLE_ACTIVITY_REGION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.ISSUE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.LABEL);
        addEEnumLiteral(objectTypeEEnum, ObjectType.LOOP_NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.MERGE_NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.MESSAGE_ENDPOINT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.NOTE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.OBJECT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.OBJECT_NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.PACKAGE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.PARAMETER);
        addEEnumLiteral(objectTypeEEnum, ObjectType.PART);
        addEEnumLiteral(objectTypeEEnum, ObjectType.PORT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.PRIMITIVE_TYPE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.PROTOCOL_STATE_MACHINE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.PROVIDED_INTERFACE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.REGION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.REPORT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.REQUIRED_INTERFACE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.REQUIREMENT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.RISK);
        addEEnumLiteral(objectTypeEEnum, ObjectType.SCREEN);
        addEEnumLiteral(objectTypeEEnum, ObjectType.SEQUENCE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.SIGNAL);
        addEEnumLiteral(objectTypeEEnum, ObjectType.STATE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.STATE_MACHINE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.STATE_NODE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.SYNCHRONIZATION);
        addEEnumLiteral(objectTypeEEnum, ObjectType.TASK);
        addEEnumLiteral(objectTypeEEnum, ObjectType.TEXT);
        addEEnumLiteral(objectTypeEEnum, ObjectType.TIME_LINE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.TRIGGER);
        addEEnumLiteral(objectTypeEEnum, ObjectType.UML_DIAGRAM);
        addEEnumLiteral(objectTypeEEnum, ObjectType.USE_CASE);
        addEEnumLiteral(objectTypeEEnum, ObjectType.USER);

        initEEnum(parameterKindEEnum, ParameterKind.class, "ParameterKind");
        addEEnumLiteral(parameterKindEEnum, ParameterKind.IN);
        addEEnumLiteral(parameterKindEEnum, ParameterKind.OUT);
        addEEnumLiteral(parameterKindEEnum, ParameterKind.INOUT);
    }

} //DatatypesPackageImpl
