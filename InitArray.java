// initialising 2 dimensional arrays
public class InitArray
{
   // create and output 2 dimensional arrays
   public static void main (String args[])
   {
      //check number of command-line arguments
      if (args.length != 3)
         System.out.println("Error: PLease re-enter the entire command including\n" + 
                            "an array size, initial value and increment.");
      else
      {
         // get array sie from first command-line argument
         int arrayLength = Integer.parseInt(args[0]);
         int[] array = new int[arrayLength];  // create array
         
         // get inital value and increment from command-line arguments
         int initValue = Integer.parseInt(args[1]);
         int increment = Integer.parseInt(args[2]);
         
         // calculate value for each array elementfor 
         for (int counter = 0; counter < array.length; counter++)
            array[counter] = initValue + increment * counter;
            
            System.out.printf("%s%8s\n", "Index", "Value");
            
            // display array index and value
            for (int counter = 0; counter < array.length; counter++)
               System.out.printf("%5d%8d\n", counter, array[counter]);
        } // end else
     } // end main
  } // end class InitArray
  
         
