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
public class Inductor implements Part{
    @Override
    public void properties(){
        System.out.println("Inductor, Inductance: Henry, Tolenrance: %, Price: $");
    }
}
