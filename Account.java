// Account class witht a constructor to validate
// and initialise instance variable balance of type double

public class Account
{
   private double balance; // instance varialble that stores the balance
   
   // constructor
   public Account(double initalBalance)
   {
      // validate that initalBalance is greater than 0.0
      // if not, balance is initialised to the default value of 0.0
      if (initalBalance > 0.0)
         balance = initalBalance;
   } // end Account constructor
   
   
   // credit (add) an amount to Account
   public void credit(double amount)
   {
      balance = balance + amount; // add amount to balance
   } // end method credit
   
   // return the account balance
   public double getBalance()
   {
      return balance; // gives the value of balance to the calling method
   } // end method getBalance
} // end class Account


   

  