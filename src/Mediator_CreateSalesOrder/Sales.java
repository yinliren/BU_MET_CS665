/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator_CreateSalesOrder;


public abstract class Sales {
    protected SalesOrderMediator mediator;
	public String name;
	
	public Sales(SalesOrderMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void create(String date, String name, String part, double price, String customer);
	
	public abstract void receive(String date, String name, String part, double price, String customer);
}
