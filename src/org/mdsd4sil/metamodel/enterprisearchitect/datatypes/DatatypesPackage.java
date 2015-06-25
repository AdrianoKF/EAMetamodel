/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect.datatypes;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "datatypes";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "org.dslab.mdsd4sil.metamodel.ea.datatypes";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "eadata";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DatatypesPackage eINSTANCE = org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl.init();

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope <em>Scope</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getScope()
     * @generated
     */
    int SCOPE = 0;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType <em>Aggregation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getAggregationType()
     * @generated
     */
    int AGGREGATION_TYPE = 1;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType <em>Connector Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getConnectorType()
     * @generated
     */
    int CONNECTOR_TYPE = 2;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType <em>Object Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getObjectType()
     * @generated
     */
    int OBJECT_TYPE = 3;

    /**
     * The meta object id for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind <em>Parameter Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getParameterKind()
     * @generated
     */
    int PARAMETER_KIND = 4;


    /**
     * Returns the meta object for enum '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Scope</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
     * @generated
     */
    EEnum getScope();

    /**
     * Returns the meta object for enum '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType <em>Aggregation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Aggregation Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType
     * @generated
     */
    EEnum getAggregationType();

    /**
     * Returns the meta object for enum '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType <em>Connector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Connector Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType
     * @generated
     */
    EEnum getConnectorType();

    /**
     * Returns the meta object for enum '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType <em>Object Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Object Type</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType
     * @generated
     */
    EEnum getObjectType();

    /**
     * Returns the meta object for enum '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind <em>Parameter Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Parameter Kind</em>'.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind
     * @generated
     */
    EEnum getParameterKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DatatypesFactory getDatatypesFactory();

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
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope <em>Scope</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.Scope
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getScope()
         * @generated
         */
        EEnum SCOPE = eINSTANCE.getScope();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType <em>Aggregation Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.AggregationType
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getAggregationType()
         * @generated
         */
        EEnum AGGREGATION_TYPE = eINSTANCE.getAggregationType();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType <em>Connector Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getConnectorType()
         * @generated
         */
        EEnum CONNECTOR_TYPE = eINSTANCE.getConnectorType();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType <em>Object Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ObjectType
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getObjectType()
         * @generated
         */
        EEnum OBJECT_TYPE = eINSTANCE.getObjectType();

        /**
         * The meta object literal for the '{@link org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind <em>Parameter Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ParameterKind
         * @see org.mdsd4sil.metamodel.enterprisearchitect.datatypes.impl.DatatypesPackageImpl#getParameterKind()
         * @generated
         */
        EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

    }

} //DatatypesPackage
