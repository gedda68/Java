// Shifted and scaled random integers
import java.util.Random;

public class RandomIntegers
{
   public static void main(String[] args)
   {
      Random randomNumbers = new Random();  // get a new instance of the Random method
   
      int face;  // stores each randon int generated
      
      // loop 72 times
      for (int counter = 1; counter <= 72; counter++)
      {
         // pick random integer from 1 to 40
         face = 1 + randomNumbers.nextInt(40);
         int currentNum = face;
         
         
         System.out.printf("%d ", face); // display generated value
         
         // if counter is divisible by 6, start a new line for output
         if (counter %6 == 0)
            System.out.println();
      } // end for
   } // end main
} // end class RandonIntegers 
   
   