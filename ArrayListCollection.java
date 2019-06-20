// generic arraylist(T) collection
import java.util.ArrayList;

public class ArrayListCollection
{
   public static void main(String args[])
   {
      // create a new ArrayList of strings witn an initial capacity of 10
      ArrayList< String > items = new ArrayList< String >();
      
      items.add("red"); // append an item to the list
      items.add(0, "yellow");  // insert new value at index 0
      
      // header
      System.out.println("Display list contents with counter-controlled loop");
      
      // Display the colours in the list
      for (int i = 0; i < items.size(); i++)
         System.out.printf(" %s", items.get(i));
         
      // display colours using foreach in the display method
      display(items, "\nDisplay list conents with enhanced for statment");
      
      items.add("green");
      items.add("yellow");
      display( items, "List with two new elements:" );
      
      items.remove("yellow");  // removes the first yellow
      display(items, "Remove first instance of yellow");
      
      items.remove(1);   // remove item at index 1
      display(items, "Remove 2nd list element (green)");
      
      // check if a value is in the list
      System.out.printf("\"Red\" is %nin the list\n", items.contains("red") ? "": "not ");
         
      // display number of elements in the list
      System.out.printf("Size: %s\n", items.size());
   } // end main
   
   // display the ArrayList's elements on the console
   public static void display(ArrayList< String > items, String header)
   {
      System.out.println(header);  // display header
      
      // display each element in items
      for(String item : items)
         System.out.printf(" %s", item);
      
      System.out.println();
   } // end display method
} // end class ArrayListCollection
      