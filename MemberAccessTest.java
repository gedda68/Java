// private class members of class Time1 are not accessible
public class MemberAccessTest
{
   public static void main(String args[])
   {
      Time1 time = new Time1(); // create and initialise time1 class
      
      time.hour = 7; 
      time.min = 15;
      time.sec = 30;
      
   } // end main
} // end class MemberAccessTest