
package AbstractPartFactory;

/**
 *
 * @author Liren
 */
public class Capacitor implements Part{
    @Override
    public void properties(){
        System.out.println("Capacitor, Capacitance: Farad, Tolerance: %, Price: $");
    }
}
