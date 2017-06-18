
package AbstractPartFactory;

/**
 *
 * @author Liren
 */
public class Capacitor implements Part{
    String partNum;
    String type;
    double capacitance;
    double tolerance;
    String packing;
    double priceIn;
    double priceOut;
    double unitWeight;
    
      public Capacitor(String partNum, String type, double capacitance, double tolerance, String packing, 
            double priceIn, double priceOut, double unitWeight) {
        this.partNum = partNum;
        this.type = type;
        this.capacitance = capacitance;
        this.tolerance = tolerance;
        this.packing = packing;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.unitWeight = unitWeight;
        
    }
    
    @Override
    public void properties(){
         System.out.println("Part Number:" + partNum);
        System.out.println("Inductor Type:" + type);
        System.out.println("Capacitance:" + capacitance + " Farad");
        System.out.println("Tolerance:" + tolerance + "%");
        System.out.println("Packing:" + packing);
        System.out.println("Price In: $" + priceIn);
        System.out.println("Price Out: $" + priceOut);
        System.out.println("Unit Weight:" + unitWeight);
        System.out.println();
    }
}
