// roll a die 6,000,000 times
import java.util.Random;

public class RollDie
{
   public static void main(String[] args)
   {
      Random rand = new Random();  // initialise method
      int[] freq = new int[7];  // array of frequency counters
       
  
      for (int roll = 1; roll <= 6000000; roll++)
          ++freq[1 + rand.nextInt(6)];
         
      System.out.printf("%s%10s\n", "Face", "Frequency");
      
      // output each array elelemt's value
      for (int face = 1; face < freq.length; face++)
         System.out.printf("%4d%10d\n", face, freq[face]);
         
   } // end main
} // end class RollDie
