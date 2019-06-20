// summing integers with the for statement
public class Sum
{
   public static void main(String arg[])
   {
      int total = 0; // initialise total
      
      // total even integers from 2 --> 20
      for (int number = 2; number <= 20; number += 2)
      {
         System.out.printf("%d ", number);
         System.out.println();
         total += number;
         System.out.printf("Running total: %d\n", total);

      }  
      System.out.printf("Final Sum is %d\n", total); // display results
   } // end main
}  // end class Sum