// analysis of examination results using nested control statements;
import java.util.Scanner;

public class Analysis
{ 
   public static void main(String args[])
   {
      // create scanner input 
      Scanner input = new Scanner(System.in);
      
      // initialising variables
      int passes = 0;  // number of passes
      int failures = 0; // number of failures
      int studentCounter = 1;  // student counter
      int result; // one exam result 
      
      // process 10 students user loop
      while (studentCounter <=10)
      {
         // prompt user for input 
         System.out.print("Enter result (1 = pass, 2 = fail): ");
         result = input.nextInt();
         
         // if..else is nested in while loop
         if (result == 1)
         { 
            passes = passes +1;
         }
         else 
            failures = failures + 1;
            
         // increment studentCounter
         studentCounter = studentCounter + 1;
      } // end while
      
      // termination phase: prepare and display results
      System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
      
      // determine whether more that 8 students passed
      if(passes > 8)
      {
         System.out.println("Bonus to instructor");
      }
      else 
         System.out.println("Instructor needs to work harder");
      
   } // end main
} // end class Analysis
      