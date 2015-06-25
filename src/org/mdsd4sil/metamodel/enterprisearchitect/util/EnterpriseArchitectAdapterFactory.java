/**
 */
package org.mdsd4sil.metamodel.enterprisearchitect.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mdsd4sil.metamodel.enterprisearchitect.Attribute;
import org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag;
import org.mdsd4sil.metamodel.enterprisearchitect.Connector;
import org.mdsd4sil.metamodel.enterprisearchitect.Diagram;
import org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;
import org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty;
import org.mdsd4sil.metamodel.enterprisearchitect.Operation;
import org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectPackage
 * @generated
 */
public class EnterpriseArchitectAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EnterpriseArchitectPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnterpriseArchitectAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = EnterpriseArchitectPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnterpriseArchitectSwitch<Adapter> modelSwitch =
        new EnterpriseArchitectSwitch<Adapter>() {
            @Override
            public Adapter caseModelObject(ModelObject object) {
                return createModelObjectAdapter();
            }
            @Override
            public Adapter caseDiagram(Diagram object) {
                return createDiagramAdapter();
            }
            @Override
            public Adapter caseOperation(Operation object) {
                return createOperationAdapter();
            }
            @Override
            public Adapter caseOperationParameter(OperationParameter object) {
                return createOperationParameterAdapter();
            }
            @Override
            public Adapter casePackage(org.mdsd4sil.metamodel.enterprisearchitect.Package object) {
                return createPackageAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseAttributeTag(AttributeTag object) {
                return createAttributeTagAdapter();
            }
            @Override
            public Adapter caseConnector(Connector object) {
                return createConnectorAdapter();
            }
            @Override
            public Adapter caseDiagramObject(DiagramObject object) {
                return createDiagramObjectAdapter();
            }
            @Override
            public Adapter caseObjectProperty(ObjectProperty object) {
                return createObjectPropertyAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.ModelObject <em>Model Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ModelObject
     * @generated
     */
    public Adapter createModelObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Diagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Diagram
     * @generated
     */
    public Adapter createDiagramAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter <em>Operation Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.OperationParameter
     * @generated
     */
    public Adapter createOperationParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag <em>Attribute Tag</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.AttributeTag
     * @generated
     */
    public Adapter createAttributeTagAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.Connector
     * @generated
     */
    public Adapter createConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject <em>Diagram Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.DiagramObject
     * @generated
     */
    public Adapter createDiagramObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty <em>Object Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.mdsd4sil.metamodel.enterprisearchitect.ObjectProperty
     * @generated
     */
    public Adapter createObjectPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //EnterpriseArchitectAdapterFactory
