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
public class Battery implements Part{
    String partNum;
    double voltage;
    double current;
    double impedence;
    String packing;
    double priceIn;
    double priceOut;
    double unitWeight;

      public Battery(String partNum,double voltage, double current, double impedence, String packing, 
            double priceIn, double priceOut, double unitWeight) {
        this.partNum = partNum;
        this.voltage = voltage;
        this.current = current;
        this.impedence = impedence;
        this.packing = packing;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.unitWeight = unitWeight;
        
    }
    
    @Override
    public void properties() {
         System.out.println("Part Number:" + partNum);
        System.out.println("Voltage: " + voltage);
        System.out.println("Current:" + current + " Amps");
        System.out.println("Impedence:" + impedence + " Ohms");
        System.out.println("Packing:" + packing);
        System.out.println("Price In: $" + priceIn);
        System.out.println("Price Out: $" + priceOut);
        System.out.println("Unit Weight:" + unitWeight);
        System.out.println();
    }
    
}
