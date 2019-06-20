// Addition program that displays the sum of 2 numbers
import java.util.Scanner; // program uses class scanner

public class Addition 
{
   // main method begins execution of Java application
   public static void main(String args[])
   {
      // Create a scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);
      
      int number1; // first number to add
      int number2; // second number to add
      int sum; // sum of number 1 and number 2
      
      System.out.print("Enter the first integer: "); // prompt
      number1 = input.nextInt(); // Read the first number from the user
      
      System.out.print("Enter the second integer: "); // prompt
      number2 = input.nextInt(); // Read the second number from the user
      
      sum = number1 + number2; // add numbers, then"", sum store total in sum.
      
      System.out.printf("Sum is %d\n", sum); // display sum
   } // end main method
} // end class Addition



