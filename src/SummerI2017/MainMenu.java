package SummerI2017;

import AbstractPartFactory.FactoryProducer;
import AbstractPartFactory.Part;
import AbstractPartFactory.PartFactory;
import IteratorANDInterpreter_EmployeeManage.AVG;
import IteratorANDInterpreter_EmployeeManage.Iterator;
import IteratorANDInterpreter_EmployeeManage.NameRepository;
import IteratorANDInterpreter_EmployeeManage.QuestionContext;
import IteratorANDInterpreter_EmployeeManage.TOP;
import Mediator_CreateSalesOrder.SalesOrderMediator;
import Mediator_CreateSalesOrder.SalesOrderMediatorImpl;
import Mediator_CreateSalesOrder.SalesImpl;
import Mediator_CreateSalesOrder.Sales;
import java.util.Scanner;

import java.lang.reflect.*;
import javax.swing.*;


/**
 *
 * @author Liren
 */
public class MainMenu {
    public static void main(String[] args) {
        int userType = 0;
        do{
            System.out.println("Please Choose User Type (Manager is 1, Sales is 2): ");
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Enter a number: ");
            userType = reader.nextInt();
        }while(userType != 1 && userType != 2);
    
    while(userType == 1){
        int ManagerOption = 0;
        System.out.println("**********************************************");
        System.out.println("1. Employees Management");
        System.out.println("2. Parts Management");
        System.out.println("3. Search Parts");
        System.out.println("4. Exit");
        System.out.println("**********************************************");
        Scanner managerreader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        ManagerOption = managerreader.nextInt();
            if(ManagerOption ==1) {
                    //Iterator design pattern: List sales people's performance
                    NameRepository namesRepository = new NameRepository();
                    String nameList[] = {"Pankaj", "Lisa", "John", "Lora", "John"};
                    int index = 0;
                    for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
                    int numberofOrder = (int)iter.next();
                    System.out.println(nameList[index] + ": " + numberofOrder);
                    index++;  
                }
             System.out.println("Please Enter request data process:");
             Scanner scanner = new Scanner( System.in );
             String input = scanner.nextLine();
             QuestionContext optionContext = new QuestionContext(input);
             AVG avg = new AVG();
             TOP top = new TOP();
             if(input == "avg" && input == "AVG" && input == "Average" && input == "average" ){
                 System.out.println("The average number of sales orders is: " + avg.evaluate(optionContext));
             }
             else if(input == "top" || input == "TOP" || input == "Top"){
                 System.out.println("The largest number of sales orders is: " + top.evaluate(optionContext));
             }
             else{
                 System.out.println("This request is under construction.");
             }
                    
        }
        else if(ManagerOption == 2) {
            PartFactory VikingPartFactory = FactoryProducer.getPartFactory("Viking");
            Part capacitor = VikingPartFactory.createPart("Capacitor");
            capacitor.properties();

            Part battery = VikingPartFactory.createPart("Battery");
            battery.properties();

            PartFactory ManningPartFactory = FactoryProducer.getPartFactory("Manning");
            Part resistor = ManningPartFactory.createPart("Resistor");
            resistor.properties();
            
        
        }
        else if(ManagerOption == 3) {System.out.println("Function under construction, please re-enter option.");}
        else {break;}
    }
    
    
    
    
    
    while(userType == 2){
        int SalesOption = 0;
        System.out.println("**********************************************");
        System.out.println("1. Create Sales Order");
        System.out.println("2. Parts Management");
        System.out.println("3. Search Parts");
        System.out.println("4. Exit");
        System.out.println("**********************************************");
        Scanner salesreader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        SalesOption = salesreader.nextInt();
        if(SalesOption ==1) {
            //Mediator design patter: Create Sales Order
            SalesOrderMediator mediator = new SalesOrderMediatorImpl();
            Sales sales1 = new SalesImpl(mediator, "Pankaj");
            Sales sales2 = new SalesImpl(mediator, "Lisa");

            mediator.addSales(sales1);
            mediator.addSales(sales2);

            String date = "05/10/2017";
            String sales_in_main = sales1.name
                    ;
            String part = "1N000002344";
            double price = 12.86;
            String customer =  "Ford Car Inc.";
            sales1.create(date, sales_in_main,part, price,customer);
            sales2.receive(date, sales_in_main,part, price,customer);
        
        }
        else if(SalesOption == 2) {
            PartFactory VikingPartFactory = FactoryProducer.getPartFactory("Viking");
            Part capacitor = VikingPartFactory.createPart("Capacitor");
            capacitor.properties();

            Part battery = VikingPartFactory.createPart("Battery");
            battery.properties();

            PartFactory ManningPartFactory = FactoryProducer.getPartFactory("Manning");
            Part resistor = ManningPartFactory.createPart("Resistor");
            resistor.properties();
        }
        else if(SalesOption == 3) {System.out.println("Function under construction, please re-enter option.");}
        else {break;}
    }
    }
    
}
