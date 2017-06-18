/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorANDInterpreter_EmployeeManage;

public class QuestionContext {
    private String Ques = "";
    private double result;
    
    //String[] partsOfQues;

    public QuestionContext(String input)
    {
      this.Ques = input;
      //partsOfQues = getInput().split(" ");
    }
    public String getInput() { return Ques; }
    public double getResult() { return result; }
}
