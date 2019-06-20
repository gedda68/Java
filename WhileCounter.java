// counter-controlled repitition wuth the wile statement

public class WhileCounter
{
   public static void main(String args[])
   {
      int counter = 1;  // degclare and initialise variable
      
       while (counter <= 10) // loop condition
       {
          System.out.printf("%d\t", counter);
          ++counter; // increment count by 1
       } // end swhile
       
       System.out.println(); // new line
       
    } //end main
} // end class WhileCounter
