// Overloaded method declarations
public class MethodOverload
{
   // test overloaded square methods
   public static void main(String[] args)
   {
      System.out.printf("Square of integer 7 is %d\n", square(7));
      System.out.printf("Square of double 7.5 is %.2f\n", square(7.5));
   } // end main
   
   // square methid with int argument
   public static int square(int intValue)
   {
      System.out.printf("\nCalled square with int argument: %d\n", intValue);
      return intValue * intValue;
   } // end int method square
   
   public static double square(double doubleValue)
   {
      System.out.printf("\nCalled square with double argument: %.2f\n", doubleValue);
      return doubleValue * doubleValue;
   } // end double metohd square
} // end class MethodOverload
      