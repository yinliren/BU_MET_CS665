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
public class ManningPartFactory implements PartFactory{
    @Override
    public Part createPart(String partType) {
        if("Resistor".equalsIgnoreCase(partType)){
            return new Resistor();
        }
        if("Inductor".equalsIgnoreCase(partType)){
            return new Inductor();
        }
        if("Capacitor".equalsIgnoreCase(partType)){
            return new Capacitor();
        }
        return null;
    }    
    
}
