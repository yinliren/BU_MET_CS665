/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator_CreateSalesOrder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Liren
 */
public class SalesOrderMediatorImpl implements SalesOrderMediator{
    private List<Sales> saleses;
	
	public SalesOrderMediatorImpl(){
		this.saleses=new ArrayList<>();
	}
	
	@Override
	public void addSales(Sales user){
		this.saleses.add(user);
	}
	
	@Override
	public void createSalesOrder(String date, String sales, String part, double price, String customer) {
		
	}
}
