// prefix increment and postfix increment operators
public class Increment
{
   public static void main(String args[])
   {
      int c;
      
      // demonstrate the postfix increment operator
      c = 5;  // assign value
      System.out.println("c = " + c);  // prints 5
      System.out.println("c++ = " + c++); // then prints 5 then postincrmements
      System.out.println("c = " + c);  // no prints 6
      
      System.out.println(); // blank line
      
      // demonstrate the prefix inrement operator
      c = 5; // reassign value
      System.out.println("c = " + c);  // prints 5
      System.out.println("++c = " + ++c); // preincrements then prints 6
      System.out.println("c = " + c);  // print 6
   }
} // end class Increments
      