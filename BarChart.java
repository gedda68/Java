// Bar char printing program
public class BarChart
{
   public static void main(String[] args)
   {
      int[] array = {90,0,7,0,0,110,1,2,4,2,1};
      
      System.out.println("Grade distribution:");
      
      // for each array element, output a bar of the chart
      for (int counter = 0; counter < array.length; counter++)
      {
         // output bar label("00-09:
         if (counter == 10)
            System.out.printf("%5d: ", 100);
         else 
            System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            
         // print bar of asterisks
         for(int stars = 0; stars < array[counter]; stars++)
            System.out.print("*");
         
         
         System.out.println();  // new line
      } // end outer for 
   } // end main
} // end class BarChart