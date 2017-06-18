/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator_CreateSalesOrder;

/**
 *
 * @author Liren
 */
public class SalesImpl extends Sales{
    public SalesImpl(SalesOrderMediator med, String name) {
		super(med, name);
	}

	@Override
	public void create(String date, String sales, String part, double price, String customer){
		System.out.println(this.name+": creating a sales order"+"\n"+"Date: " + date + "\n"+ "Sales: " + sales
                        + "\n"+ "Part: " + part+ "\n"+"Price: "+price+ "\n"+"Customer: " + customer);
                System.out.println();
		mediator.createSalesOrder(date, sales, part, price, customer);
	}
	@Override
	public void receive(String date, String sales, String part, double price, String customer) {
		System.out.println(this.name+": Received Message:"+"\n"+"Date: " + date + "\n"+ "Sales: " + sales
                        + "\n"+ "Part: " + part+ "\n"+"Price: "+price+ "\n"+"Customer: " + customer);
                System.out.println();
	}
}
