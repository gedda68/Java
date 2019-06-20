// application to display drawPanel
import javax.swing.JFrame;

public class DrawPanelTest
{
   public static void main(String args[])
   {
      // create a panel that contains the drawing
      DrawPanel panel = new DrawPanel();
      
      // Create the frame to hold the panel
      JFrame application = new JFrame();
      
      // set the frame to exit when it's closed
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      application.add(panel); // add the panel to the frame
      application.setSize(500,375); // set the of the frame
      application.setVisible(true); // make the frame visibe
      
   } //end main
} // end class DrawPanelTest
      