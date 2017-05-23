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
public class FactoryProducer {
    public static PartFactory getPartFactory(String factoryType){
     
        if("Viking".equalsIgnoreCase(factoryType)){
            return new VikingPartFactory();
            }
        if("Manning".equalsIgnoreCase(factoryType)){
            return new ManningPartFactory();
            }
        return null;
    }
}
