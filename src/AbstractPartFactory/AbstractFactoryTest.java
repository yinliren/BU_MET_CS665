/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractPartFactory;

/**
 *
 * @author Liren
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
