// Compare integers using if statements, relational operators
// and equality operators. 
import java.util.Scanner;

public class Comparison
{
   // main method begins exexution of Java applciation
   public static void main(String args[])
   {
      // create Scanner to obtain input from the command line
      Scanner input = new Scanner(System.in);
      
      int number1; 
      int number2;
      
      System.out.print("Enter first Integer: ");
      number1 = input.nextInt();
      
      System.out.print("Enter second number: ");
      number2 = input.nextInt();
      
      if (number1 == number2)
         System.out.printf("%d == %d\n", number1, number2);
         
      if (number1 != number2)
         System.out.printf("%d != %d\n", number1, number2);
         
      if (number1 < number2)
         System.out.printf("%d < %d\n", number1, number2);
         
      if (number1 > number2)
         System.out.printf("D5 > %d\n", number1, number2);
      
      if ( number1 <= number2 )
         System.out.printf( "%d <= %d\n", number1, number2 );
      
      if ( number1 >= number2 )
         System.out.printf( "%d >= %d\n", number1, number2 );
   }
} 