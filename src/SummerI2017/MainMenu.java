package SummerI2017;

import AbstractPartFactory.Battery;
import AbstractPartFactory.Capacitor;
import AbstractPartFactory.FactoryProducer;
import AbstractPartFactory.Inductor;
import AbstractPartFactory.Part;
import AbstractPartFactory.PartFactory;
import AbstractPartFactory.Resistor;
import IteratorANDInterpreter_EmployeeManage.Alpha;
import IteratorANDInterpreter_EmployeeManage.Iterator;
import IteratorANDInterpreter_EmployeeManage.NameRepository;
import IteratorANDInterpreter_EmployeeManage.QuestionContext;
import IteratorANDInterpreter_EmployeeManage.OrderNum;
import Factory.Order;
import java.util.Scanner;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


/**
 *
 * @author Liren
 */
public class MainMenu {
    public static void main(String[] args) {
         int mainMenuOption=0;
        MainMenu newInstance = new MainMenu();
        while(mainMenuOption != 1 && mainMenuOption != 2 && mainMenuOption!= 3 && mainMenuOption != 4){
            
            mainMenuOption = newInstance.mainMenu();
            
        }
        while(mainMenuOption == 1 || mainMenuOption == 2 || mainMenuOption == 3 || mainMenuOption == 4){
            //Parts Management
            if(mainMenuOption ==1){
                List<Part> partList = new ArrayList<Part>();
                Battery b1 = new Battery("1A00001",9, 0.5, 15, "Bulk", 20, 40, 3);
                Capacitor c1 = new Capacitor("C33800998", "discrete", 25, 2, "Bulk", 2, 20.88, 2);
                Capacitor c2 = new Capacitor("C887699870", "discrete", 50, 1, "Bulk", 5, 44, 1.5);
                Inductor i3 = new Inductor("I399998688", "discrete", 23, 5, "Bulk", 12, 60, 3);
                partList.add(b1);
                partList.add(c1);
                partList.add(c2);
                partList.add(i3);
                
                int option1 = 0;
                option1 = newInstance.Option1();
                while(option1 != 1 && option1 != 2 && option1 != 3 && option1 != 4){
                    option1 = newInstance.Option1();
                }
                
                while(option1 == 1 || option1 == 2 || option1 == 3 || option1 == 4){
                    //1. Create Parts
                    if(option1 ==1){
                        int createPartType;
                        Scanner reader = new Scanner(System.in);  // Reading from System.in
                        System.out.println("Create: ");
                        System.out.println("1. Resistor");
                        System.out.println("2. Capacitor");
                        System.out.println("3. Inductor");
                        System.out.println("4. Battery");
                        createPartType = reader.nextInt();
                        if(createPartType == 1){
                            String partNum;
                            Scanner partNumReader = new Scanner(System.in);
                            System.out.println("Type in Part Number (String)");
                            partNum = partNumReader.nextLine();
                            
                            double priceIn;
                            Scanner priceInReader = new Scanner(System.in);
                            System.out.println("Type in buy in price (Double): $");
                            priceIn = priceInReader.nextDouble();
                            
                            double priceOut;
                            Scanner priceOutReader = new Scanner(System.in);
                            System.out.println("Type in sell out price (Double): $");
                            priceOut = priceOutReader.nextDouble();
                            
                            double unitWeight;
                            Scanner unitWeightReader = new Scanner(System.in);
                            System.out.println("Type in unit weight (lb) (Double): ");
                            unitWeight = unitWeightReader.nextDouble();
                            
                            String type;
                            Scanner typeReader = new Scanner(System.in);
                            System.out.println("Type in Resistor Type (String): ");
                            type = typeReader.nextLine();
                            
                            double resistance;
                            Scanner resistanceReader = new Scanner(System.in);
                            System.out.println("Type in resistance value (Double): ");
                            resistance = resistanceReader.nextDouble();
                            
                            double tolerance;
                            Scanner toleranceReader = new Scanner(System.in);
                            System.out.println("Type in tolerance (%) (Double): ");
                            tolerance = toleranceReader.nextDouble();
                            
                            double power;
                            Scanner powerReader = new Scanner(System.in);
                            System.out.println("Type in power: ");
                            power = powerReader.nextDouble();
                            
                            String packing;
                            Scanner packingReader = new Scanner(System.in);
                            System.out.println("Type in Packing Type (String): ");
                            packing = packingReader.nextLine();
                            
                            Resistor Rtemp = new Resistor(partNum, type, resistance, tolerance, power, packing, priceIn, priceOut, unitWeight);
                            partList.add(Rtemp);
                        }
                        else if(createPartType == 2){
                            
                        }
                        else if(createPartType == 3){
                            
                        }
                        else if(createPartType == 4){
                            
                        }
                    }
                    //2. Delete Parts
                    else if(option1 == 2){
                        for(int i = 0; i < partList.size(); i++){
                            System.out.println(String.valueOf(i+1) + ": " + partList.get(i).retrievePart());
                            }
                        int position;
                        Scanner reader_remove = new Scanner(System.in);
                        System.out.println("Please type in the order you want to remove:");
                        position = reader_remove.nextInt();
                        position -= 1;
                        partList.remove(position);
                    }
                    //3. List Parts
                    else if(option1 == 3){
                        for(int i = 0; i < partList.size(); i++){
                            System.out.println(String.valueOf(i+1) + ": " + partList.get(i).retrievePart());
                        }
                        System.out.println();
                    }
                    //4. Back to Main Menu
                    else if(option1 == 4){
                        break;
                    }
                    option1 = newInstance.Option1();
                }
                
            }
            
            
            else if(mainMenuOption == 2){
                ArrayList<Order> orders = new ArrayList<Order>();
                int option2 = 0;
                option2 = newInstance.Option2();
                while(option2 != 1 && option2 != 2 && option2 != 3 && option2 != 4){
                    option2 = newInstance.Option2();
                }
                
                while(option2 == 1 || option2 == 2 || option2 == 3 || option2 == 4){
                    
                    //1. Create Order
                    if(option2 ==1){     
                        String salesName;
                        Scanner reader_salesName = new Scanner(System.in);
                        System.out.println("Please Type in your name:");
                        salesName = reader_salesName.nextLine();

                        double total;
                        Scanner reader_total = new Scanner(System.in);
                        System.out.println("Please type in you total amount: $ ");
                        total = reader_total.nextDouble();

                        Order newOrder = new Order();
                        newOrder.create(salesName, total);

                        orders.add(newOrder);
                        System.out.println();
                        
                        System.out.println("There are " + orders.size() + " order(s).");
                        System.out.println();
                    }
                    //2. Delete Order
                    else if(option2 == 2){
                        for(int i = 0; i < orders.size(); i++){
                            System.out.println(String.valueOf(i+1) + ": " + orders.get(i).retrieveOrder());
                            }
                        int position;
                        Scanner reader_remove = new Scanner(System.in);
                        System.out.println("Please type in the order you want to remove:");
                        position = reader_remove.nextInt();
                        position -= 1;
                        orders.remove(position);
                    }
                    //3. List Order
                    else if(option2 == 3){
                        for(int i = 0; i < orders.size(); i++){
                            System.out.println(String.valueOf(i+1) + ": " + orders.get(i).retrieveOrder());
                        }
                        System.out.println();
                    }
                    //4. Back to Main Menu
                    else if(option2 == 4){
                        break;
                    }
                    option2 = newInstance.Option2();
                }
                
            }
            
            else if(mainMenuOption == 3){
                int option3 = 0;
                option3 = newInstance.Option3();
                while(option3 != 1 && option3 != 2 && option3 != 3 && option3 != 4){
                    option3 = newInstance.Option3();
                }
                
                while(option3 == 1 || option3 == 2 || option3 == 3){
                    //3-1 Alphabetically List
                    if(option3 ==1){
                        
                    }
                    //3-2 Number of orders sorted List
                    else if(option3 == 2){
                        
                    }
                    //3-3 Back to Main Menu
                    else if(option3 == 3){
                        break;
                    }
                     option3 = newInstance.Option3();
                }
                
            }
            else if(mainMenuOption == 4){
                break;
            }
            mainMenuOption = newInstance.mainMenu();
        }
        return;
   }
    public int mainMenu(){
        int mainMenuOption=0;
        System.out.println("============================================");
        System.out.println("1. Parts Management");
        System.out.println("2. Orders Management");
        System.out.println("3. Employees Management");
        System.out.println("4. Exit");
        System.out.println("============================================");
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        mainMenuOption = reader.nextInt();
        System.out.println();
        return mainMenuOption;
    }
    
    //1. Parts Management
    public int Option1(){
        int Option1_option = 0;
        System.out.println("============================================");
        System.out.println("1. Create Part");
        System.out.println("2. Delete Part");
        System.out.println("3. List Part");
        System.out.println("4. Back to Main Menu");
        System.out.println("============================================");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        Option1_option = reader.nextInt();
        System.out.println();
        return Option1_option;
    }
    
    //2. Order Management
    public int Option2(){
        int Option2_option = 0;
        System.out.println("============================================");
        System.out.println("1. Create Order");
        System.out.println("2. Delete Order");
        System.out.println("3. List Order");
        System.out.println("4. Back to Main Menu");
        System.out.println("============================================");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        Option2_option = reader.nextInt();
        System.out.println();
        return Option2_option;
    }
    
    //3. Employees Management
    public int Option3(){
        int Option3_option = 0;
        System.out.println("============================================");
        System.out.println("1. Alphbetically List");
        System.out.println("2. Number of Orders Sorted List");
        System.out.println("3. Back to Main Menu");
        System.out.println("============================================");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        Option3_option = reader.nextInt();
        System.out.println();
        return Option3_option;
    }    
}
    

