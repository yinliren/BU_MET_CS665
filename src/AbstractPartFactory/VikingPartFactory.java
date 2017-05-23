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
            return new Inductor("IN0000XXXXVK", "Discrete", 11, 2, "BK", 10, 20, 3);
        }
        if("Capacitor".equalsIgnoreCase(partType)){
            return new Capacitor("CA0000XXXXVK", "Discrete", 20, 5, "BK", 4, 10, 5);
        }
        if("Battery".equalsIgnoreCase(partType)){
            return new Battery("BA0000XXXXVK",15, 0.05, 10, "BK", 30, 80, 20);
        }
        return null;
    }    
}
