// time1 object used in an application
public class Time1Test
{
   public static void main(String[] args)
   {
      // create and initialise time object
      Time1 time = new Time1(); // invokes time1 constructor
      
      // output String representations of the time
      System.out.print("The initial universal time is: ");
      System.out.println(time.toUniversalString());
      System.out.print("The initial standard time is: ");
      System.out.println(time.toString());
      System.out.println();
      
      // change time and output
      System.out.print("The initial universal time is: ");
      System.out.println(time.toUniversalString());
      System.out.print("The initial standard time is: ");
      System.out.println(time.toString());
      System.out.println();
      
      time.setTime(14,25,34);
      
      // attempt to set an invalid time 
      try
      {
         time.setTime(99,99,99); // all values are out of range
      }
      catch(IllegalArgumentException e)
      {       
         System.out.printf("Exception %s\n\n", e.getMessage());
      }
      
      // display time after attempt to set invalid times
      System.out.print("After attempting invalid settings:");
      System.out.print("Universal time: ");
      System.out.println(time.toUniversalString());
      System.out.print("Standard time: ");
      System.out.println(time.toString());
      System.out.println();
      
   } // end main
} // end class Time1
