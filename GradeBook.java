// class declaration with one method
import java.util.Scanner;


public class GradeBook
{
   private String courseName;  // cousename for this gradeBook
   private int[][] grades; // array of student grades
   
   // 2 argument constructor initialises courseName and grades array
   public GradeBook (String name, int[][] gradesArray)
   {
      courseName = name; // initialise courseName
      grades = gradesArray; // store grades
   }  // end constructor
   
   // method to set the courseName
   public void setCourseName(String name)
   { 
      courseName = name; // stores the courseName
   } // end method setCourseName
   
   // method to get the courseName
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName
   
   // display a welcome message to the GradeBook user.
   public void displayMessage()
   {
      System.out.printf("Welcome to the Grade Book for \n%s!\n", getCourseName());
   }  // end method displayMessage
   
   public void processGrades()
   {
      // output grades array
      outputGrades();
      
      // call the method getAverage to calculate the average grade
  //    System.out.printf("\nClass average is %.2f\n", getAverage());
      
      // call methods getMinimum and getMaximum
      System.out.printf("Lowest grade is: %d\nHighest grade is: %d\n\n", getMinimum(), getMaximum());
      
      // call outputBarChart to print grade distribution chart
      outputBarChart();
      
   } // end method processGrades
   
   // find minimum grade
   public int getMinimum()
   {  
      int lowGrade = grades[0][0];  // assume grades[0] is smallest
      
      // loop through rows grades array
      for(int[] studentGrades : grades)
      {
         // loop through columns of current row
         for(int grade : studentGrades)
         {  
             // if grade lower than lowGrade, assign it to lowGrade
             if (grade < lowGrade)
             lowGrade = grade; // new lowest grade
         } // end inner for loop         
       } // end outer for loop
      
      return lowGrade;
   } // end method getMinimum
   
   // get maximum grade
   public int getMaximum()
   {
      int highGrade = grades[0][0]; // assume grades[0] is highest grade
      
      // loop through the rows of grades array
      for (int[] studentGrades : grades)
      {
         for (int grade : studentGrades)
         {
            // if grade greater than highGrade, assign to highGrade
            if (grade > highGrade)
                highGrade = grade; // new highest grade
          } // end inner for loop
       } // end outer for loop
       
       return highGrade; // return the maximum grade
    } // end method getMaximum
    
    // determine the average grade for the test
    public double getAverage(int[] setOfGrades)
    {
       int total = 0; //intitalise total
       
       // sum grades for one student
       for(int grade : setOfGrades)
          total += grade;
       
       // return average of grades
       return (double)total / setOfGrades.length;
    } // end method getAverage
    
    public void outputBarChart() 
    {
       System.out.println("Overall grade distribution:");
       
       // stores frequency of grades in each range of 10 grades
       int[] freq = new int[11];
       
       // for each grade, increment the appropriate frequency
       for(int[] studentGrades : grades)
       {
         for (int grade : studentGrades)
          ++freq[grade/10];
       } // end outer for loop
       
          
       // for each frequency, print bar in chart
       for(int count = 0; count < freq.length; count++)
       {
           //output bar label
           if (count == 10)
              System.out.printf("%5d: ", 100);
           else
              System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
              
           // print bar of asterisks
           for (int stars = 0; stars < freq[count]; stars++)
              System.out.print("*");
              
           System.out.println(); // start a new line of output
        } // end outer for
        
     }// end method outputBarChart
     
     // output the contents of the array
     public void outputGrades()
     {
        System.out.println("The grades are:\n");
        System.out.print("            "); // align colum headers
        
        // create column headings for each of the tests
        for(int test = 0; test < grades[0].length; test++)
           System.out.printf("Test %d ", test + 1);
           
        System.out.println("Average"); // student average column heading        
        
        // output each student's grade
        for (int student = 0; student < grades.length; student++)
        {
           System.out.printf("Student %2d", student + 1);
           
           for (int test :grades[student]) // output student's grades
              System.out.printf("%8d", test);
              
           // call method getAverage to calculate student's average grade
           // pass row of grades as the argument to getAverage
           double average = getAverage(grades[student]);
           System.out.printf("%9.2f\n", average);
        } // end outer for
           
     } // end method outputGrades
} // end class GradeBook 
        
   

