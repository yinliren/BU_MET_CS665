/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorANDInterpreter_EmployeeManage;

public class AVG extends Expression{
    @Override
    public double evaluate(QuestionContext keywords) {
//       NameRepository namesRepository = new NameRepository();
//       int index = 0;
//       double sum = 0;
//       for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
//           int numberofOrder = (int)iter.next();
//           sum += numberofOrder;
//           index++;
//    }
//       double avg = sum/(index+1);
//       return avg;
//    }
        String expression = keywords.getInput();
        double result = keywords.getResult();
        NameRepository namesRepository = new NameRepository();
        double sum = 0;
        for(int i = 0; i < namesRepository.numOrders.length; i++){
            sum += namesRepository.numOrders[i];
        }
        double avg = 0;
        avg = sum/namesRepository.numOrders.length;
        return avg;
    }
    
}
