// scope class demonstrates field and local varaible scopes.
public class Scope
{
   // field that is accessible to all method of this class
   private static int x =1;
   
   // method main creates and initialised local variable x
   // and calls methods useLocalVar and useField
   public static void main(String[] args)
   {
      int x = 5; // mothod's local variable x shadows field x
      
      System.out.printf("local x in main is %d\n", x);
      
      useLocalVariable();  // useLocalVariable has loca x
      useField(); // useField uses class Scope's field x
      useLocalVariable(); // useLocalVariuable reinitialises local x
      useField(); // class Scope's field x retains its value
      
      
      System.out.printf("\nLocal x in main is %d\n", x);
   } // end main
   
   // create and intialise local variuable x during each call
   public static void useLocalVariable()
   {
      int x = 25; // initialised each time useLocalVAriable is called
      
      System.out.printf("\nlocal x on entering method useLocalVariable is %d\n", x);
      ++x; // modifies this metohd's local variable x
      System.out.printf("local variable before exiting method useLocalVariable is %d\n", x);
   } // end mothod useLocalVariable
   
   // modify class Sope's field x during call
   public static void useField()
   {
      System.out.printf("\nfield x on learning method useField is %d\n", x);
      x *= 10;  // modifies class Scope's field x
      System.out.printf("field x beofre exiting moethod useField is %d\n", x);
   } // end method useField
} // end class Scope
      
      