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
public interface SalesOrderMediator {
    public void createSalesOrder(String date, String sales, String part, double price, String customer);

    void addSales(Sales sales);
}
