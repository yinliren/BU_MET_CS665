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
public class Resistor implements Part{
    String partNum;
    double priceIn;
    double priceOut;
    double unitWeight;
    String type;
    double resistance;
    double tolerance;
    double power;
    String packing;

    public Resistor(String partNum, String type, double resistance, double tolerance, double power, String packing, 
            double priceIn, double priceOut, double unitWeight) {
        this.partNum = partNum;
        this.type = type;
        this.resistance = resistance;
        this.tolerance = tolerance;
        this.power = power;
        this.packing = packing;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.unitWeight = unitWeight;
        
    }
    
    
    
    @Override
    public void properties(){
        System.out.println("Part Number:" + partNum);
        System.out.println("Resistor Type:" + type);
        System.out.println("Resistance:" + resistance + " Ohms");
        System.out.println("Tolerance:" + tolerance + "%");
        System.out.println("Power:" + power + " Watts");
        System.out.println("Packing:" + packing);
        System.out.println("Price In: $" + priceIn);
        System.out.println("Price Out: $" + priceOut);
        System.out.println("Unit Weight:" + unitWeight);
        System.out.println();
    }

    @Override
    public String retrievePart() {
        return "Resistor: P/N " + partNum + " | Resistance:" + resistance + " Ohms" + " | Tolerance:" + tolerance + "%" + " | Power:" + power + " Watts";
    }
}
