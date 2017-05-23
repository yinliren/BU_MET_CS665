package AbstractPartFactory;

/**
 *
 * @author Liren
 */

/* This part of test is creating different electronic parts produced by different
manufacturers. If the test is successful, the console will display the parts
we create.
*/
public class AbstractFactoryTest {
    public static void main(String[] args){
        PartFactory VikingPartFactory = FactoryProducer.getPartFactory("Viking");
        Part capacitor = VikingPartFactory.createPart("Capacitor");
        capacitor.properties();
        
        Part battery = VikingPartFactory.createPart("Battery");
        battery.properties();
        
        PartFactory ManningPartFactory = FactoryProducer.getPartFactory("Manning");
        Part resistor = ManningPartFactory.createPart("Resistor");
        resistor.properties();
    }
}
