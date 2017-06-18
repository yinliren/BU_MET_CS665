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
    String partNum;
    String type;
    double inductance;
    double tolerance;
    String packing;
    double priceIn;
    double priceOut;
    double unitWeight;
    
      public Inductor(String partNum, String type, double inductance, double tolerance, String packing, 
            double priceIn, double priceOut, double unitWeight) {
        this.partNum = partNum;
        this.type = type;
        this.inductance = inductance;
        this.tolerance = tolerance;
        this.packing = packing;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.unitWeight = unitWeight;
        
    }
    
    @Override
    public void properties(){
         System.out.println("Part Number:" + partNum);
        System.out.println("Capacitor Type:" + type);
        System.out.println("Capacitance:" + inductance + " Henry");
        System.out.println("Tolerance:" + tolerance + "%");
        System.out.println("Packing:" + packing);
        System.out.println("Price In: $" + priceIn);
        System.out.println("Price Out: $" + priceOut);
        System.out.println("Unit Weight:" + unitWeight);
        System.out.println();
    }
}
