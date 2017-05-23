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
public class VikingPartFactory implements PartFactory{

    @Override
    public Part createPart(String partType) {
        if("Inductor".equalsIgnoreCase(partType)){
            return new Inductor();
        }
        if("Capacitor".equalsIgnoreCase(partType)){
            return new Capacitor();
        }
        if("Battery".equalsIgnoreCase(partType)){
            return new Battery();
        }
        return null;
    }    
}
