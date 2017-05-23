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
            return new Resistor("RE0000XXXXMN", "Discrete", 20, 2, 10, "BK", 8, 20, 6);
        }
        if("Inductor".equalsIgnoreCase(partType)){
            return new Inductor("IN0000XXXXMN", "Discrete", 12, 1, "BK", 14, 25, 4);
        }
        if("Capacitor".equalsIgnoreCase(partType)){
            return new Capacitor("CA0000XXXXMN", "Discrete", 22, 2, "BK", 5, 15, 4);
        }
        return null;
    }    
    
}
