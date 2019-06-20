// Programmer declared method maximum with 3 double parameters.
import java.util.Scanner;

public class MaxumumFinder
{
   // obtaining 3 floating-poit values and locate the maximum
   public static void main(String args[])
   {
      // create scanner fo input
      Scanner input = new Scanner(System.in);
      
      // prompt for and input 3 floating-point values
      System.out.println("Enter 3 floating-point values separated by spaces: ");
      
      double number1 = input.nextDouble(); // first number
      double number2 = input.nextDouble(); // 2nd number
      double number3 = input.nextDouble(); // 3rd number
      
      // determine the maximum value
      double result = maximum(number1, number2, number3);
      
      // display the maximum
      System.out.printf("Maximum is: %.2f", result);
   } // end main
   
   // return the max of its 3 double parameters
   public static double maximum(double x, double y, double z)
   {
      double maximumValue = x;  // assume x is the largest to start
      
      // determine whether y is > maximumValue
      if (y > maximumValue)
         maximumValue = y;
         
      // determine if z is greater than maximumValue
      if (z > maximumValue)
         maximumValue = z;
         
      return maximumValue;
   } // end method maxiumum
} // end class MAximumFinder