// poll analysis program
public class StudentPoll
{
   public static void main(String[] args)
   {
   
      // student response array 
      int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
   
      int[] freq = new int[6]; // array of freq counters
   
      // for each answer. select repsonses element and use that value
      // as frequency index to determine elelement to increment
      for (int ans = 0; ans < responses.length; ans++)
      {
         try
         {   
            ++freq[responses[ans]];
         } // end try
         catch(ArrayIndexOutOfBoundsException e)
         {
            System.out.println(e);
            System.out.printf("    responses[%d] = %d\n\n", ans, responses[ans]);
         } // end catch
      } // end for
   
      System.out.printf("%s%10s\n", "Rating", "Frequency");
   
      // output each array element's value
      for (int rate = 1; rate < freq.length; rate++)
         System.out.printf("%6d%10d\n", rate, freq[rate]);
      
   } // end main
} // end class StudentPoll