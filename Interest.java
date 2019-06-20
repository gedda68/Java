// compund interest calculations using for

public class Interest
{
   public static void main(String args[])
   {
      double amount; // amount on deposit at end of each year
      double principal = 1000.0; // initial amount before interest
      double rate = 0.089; // interest rate
      
      // display headers
      System.out.printf("%s%20s\n", "Yest", "Amount on deposit");
      
      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; year++)
      {
         // calculate amount on deposit for each year 
         amount = principal * Math.pow(1.0 + rate, year);
         
         // displat the year and the amount
         System.out.printf("%4d%,20.2f\n", year, amount);
         
      } // end for loop
   } // end main
} // end class interest