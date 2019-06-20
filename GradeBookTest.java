// Create Gradebook object and pass a String to 
// its displayMessage method.

public class GradeBookTest 
{
   // main method begins program execution
   public static void main(String args[])
   {       

      // array of student grades
      int[][] gradesArray = { { 87, 96, 70 },
                              { 68, 87, 90 },
                              { 94, 100, 90 },
                              { 100, 81, 82 },
                              { 83, 65, 85 },
                              { 78, 87, 65 },
                              { 85, 75, 83 },
                              { 91, 94, 100 },
                              { 76, 72, 84 },
                              { 87, 93, 73 } };
      
      // create a Gradebook object and assign it to MyGreadeBook
      GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming", gradesArray);
      
      myGradeBook.displayMessage();  // display welcome message
      myGradeBook.processGrades(); // read grades from user
  } // end main
} // end class GradeBookTest