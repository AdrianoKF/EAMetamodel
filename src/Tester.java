import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.mdsd4sil.metamodel.enterprisearchitect.Connector;
import org.mdsd4sil.metamodel.enterprisearchitect.EnterpriseArchitectFactory;
import org.mdsd4sil.metamodel.enterprisearchitect.ModelObject;
import org.mdsd4sil.metamodel.enterprisearchitect.datatypes.ConnectorType;

public class Tester {
    public static void main(String[] args) {
        final EnterpriseArchitectFactory factory = EnterpriseArchitectFactory.eINSTANCE;

        ModelObject b1 = factory.createModelObject();
        b1.setObjectId(1);
        b1.setName("COMPFAIL1");
        b1.setStereotype("BasicEvent");
        b1.setNote("Component 1 Failure");

        ModelObject b2 = factory.createModelObject();
        b2.setObjectId(2);
        b2.setName("COMPFAIL2");
        b2.setStereotype("BasicEvent");
        b2.setNote("Component 2 Failure");
        
        ModelObject b3 = factory.createModelObject();
        b3.setObjectId(999);
        b3.setName("MONFAIL");
        b3.setStereotype("BasicEvent");
        b3.setNote("Monitor Failure");

        ModelObject gate = factory.createModelObject();
        gate.setObjectId(3);
        gate.setName("G_AND");
        gate.setStereotype("AndGate");
        gate.setNote("Gate");
        
        ModelObject gate2 = factory.createModelObject();
        gate2.setObjectId(5);
        gate2.setName("G_OR");
        gate2.setStereotype("OrGate");
        gate2.setNote("Top-level gate");

        ModelObject intEv = factory.createModelObject();
        intEv.setObjectId(4);
        intEv.setName("COMPFAIL_BOTH");
        intEv.setStereotype("IntermediateEvent");
        intEv.setNote("Both components failure");
        
        ModelObject intEv2 = factory.createModelObject();
        intEv2.setObjectId(6);
        intEv2.setName("COMP_MON_FAIL");
        intEv2.setStereotype("IntermediateEvent");
        intEv2.setNote("Both components or monitor failure");

        Connector b1gate = factory.createConnector();
        b1gate.setConnectorId(1);
        b1gate.setType(ConnectorType.ASSOCIATION);
        b1gate.setDestObject(gate);
        b1gate.setSourceObject(b1);

        Connector b2gate = factory.createConnector();
        b2gate.setConnectorId(2);
        b2gate.setType(ConnectorType.ASSOCIATION);
        b2gate.setDestObject(gate);
        b2gate.setSourceObject(b2);
        
        Connector b3gate2 = factory.createConnector();
        b3gate2.setConnectorId(4);
        b3gate2.setType(ConnectorType.ASSOCIATION);
        b3gate2.setDestObject(gate2);
        b3gate2.setSourceObject(b3);

        Connector gateIntEv = factory.createConnector();
        gateIntEv.setConnectorId(3);
        gateIntEv.setType(ConnectorType.ASSOCIATION);
        gateIntEv.setDestObject(intEv);
        gateIntEv.setSourceObject(gate);
        
        Connector intEvGate2 = factory.createConnector();
        intEvGate2.setConnectorId(6);
        intEvGate2.setType(ConnectorType.ASSOCIATION);
        intEvGate2.setDestObject(gate2);
        intEvGate2.setSourceObject(intEv);
        
        Connector gateIntEv2 = factory.createConnector();
        gateIntEv2.setConnectorId(5);
        gateIntEv2.setType(ConnectorType.ASSOCIATION);
        gateIntEv2.setDestObject(intEv2);
        gateIntEv2.setSourceObject(gate2);

        final ResourceSet rset = new ResourceSetImpl();

        final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        reg.getExtensionToFactoryMap().put("eamod",
                new XMIResourceFactoryImpl());
        final Resource res = rset.createResource(URI
                .createURI("resources/test.eamod"));

        res.getContents().add(b1);
        res.getContents().add(b2);
        res.getContents().add(b3);
        res.getContents().add(gate);
        res.getContents().add(gate2);
        res.getContents().add(intEv);
        res.getContents().add(intEv2);
        res.getContents().add(b1gate);
        res.getContents().add(b2gate);
        res.getContents().add(b3gate2);
        res.getContents().add(gateIntEv);
        res.getContents().add(intEvGate2);
        res.getContents().add(gateIntEv2);

        try {
            res.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
