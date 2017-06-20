
package IteratorANDInterpreter_EmployeeManage;

import java.util.ArrayList;

/**
 *
 * @author Liren
 */
public class NameRepository implements Container{
   public int numOrders[] = {10 , 8, 12, 9,7};
   data d1 = new data("Maryrose",20);
   data d2 = new data("Truman",18);
   data d3 = new data("Charisse",12);
   data d4 = new data("Olinda",8);
   data d5 = new data("Belle",24);
   data d6 = new data("Kathaleen",28);
   data d7 = new data("Kami",30);
   data d8 = new data("Amalia",15);
   data d9 = new data("Cierra",11);
   data d10 = new data("Margene",18);
   data d11 = new data("Isabelle",17);
   data d12 = new data("Eura",27);
   data d13 = new data("Bert",25);
   data d14 = new data("Jarrod",21);
   data d15 = new data("Moshe",11);
   data d16 = new data("Shanae",15);
   data d17 = new data("Darin",9);
   data d18 = new data("Miriam",17);
   data d19 = new data("Willy",23);
   data d20 = new data("Norris",16);
   
     
   
   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }
   
   
   public class NameIterator implements Iterator{
      int index;

      @Override
      public boolean hasNext() {
      
         if(index < numOrders.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return numOrders[index++];
         }
         return null;

     }

    }
}
