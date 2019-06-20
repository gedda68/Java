// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest
{

   // main method begins execution of Java application
   public static void main(String args[])
   {
      Account account1 = new Account(50.00); // create account object
      Account account2 = new Account(-7.53); // create account object

      // display balance of each account object
      System.out.printf("Account 1 balance: $%.2f\n", account1.getBalance());
      System.out.printf("Account 2 balance: $%.2f\n", account2.getBalance());

      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);
      double depositAmount;  //deposit amount read from input

      System.out.println("Enter deposit amount for account1: ");  // prompt
      depositAmount = input.nextDouble(); //obtaing user amount
      System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
      account1.credit(depositAmount);  // add to account 1 balance

      // display balances
      System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
      System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

      System.out.println("Enter deposit amount for account2: ");  // prompt
      depositAmount = input.nextDouble(); //obtaing user amount
      System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
      account2.credit(depositAmount);  // add to account 1 balance

      // display balances
      System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
      System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
      System.out.println("End Program");
   } //end main
}  // end class AccountTest
