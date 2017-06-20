/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Liren
 */
public class Order implements SalesOrder{
    String sales;
    double total;
    
    @Override
    public void create(String salesName, double total) {
        this.sales = salesName;
        this.total = total;
    }
    
    public String retrieveOrder(){
        return("Sales: " + this.sales + "||" + "Total: $" + this.total);
    }
}
