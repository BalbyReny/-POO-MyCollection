package prueba;

import java.util.Collection;

public class Main 
{
   public static void main(String[] xd)
   {
        MyCollection<String> myStr = new MyCollection<> ();
        myStr.add("Obiwan");
        myStr.add("Anakin");
        myStr.add("Lea");
        myStr.add("Rey");
        
        MyCollection<Double> myDbl = new MyCollection<> ();
        myDbl.add(1.0);
        myDbl.add(2.0);
        
        print(myStr);
        System.out.println();
        print(myDbl);
   }
   //Function to print MyCollections
   private static void print(Collection c) 
   {
        c.forEach(System.out::println);
   } 
}
