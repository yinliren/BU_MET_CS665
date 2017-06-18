/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorANDInterpreter_EmployeeManage;

/**
 *
 * @author Liren
 */
public class TOP extends Expression{
    @Override
    public double evaluate(QuestionContext keywords) {
       NameRepository namesRepository = new NameRepository();
       int index = 0;
       double top = 0;
       for(int i = 0; i < namesRepository.numOrders.length; i++){
           if(namesRepository.numOrders[i] > top){
               top = namesRepository.numOrders[i];
           }
       }
       return top;
    }
}
