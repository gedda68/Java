// using drawline to connect the corners of a panel
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   // draws an x from the corners of the panel
   public void paintComponent (Graphics g)
   {
      // call paintComponent to ensure the panel draws correctly
      super.paintComponent(g);
      
      int width = getWidth(); // total width
      int height = getHeight(); // total height
      
      // draw a line from upper-left to lower-right
      g.drawLine(0,0,width,height); 
      
      // drw a line from lower-left to upper-right
      g.drawLine(0,height, width,0);
   }// end patinComponent method
} // end class DrawPanel

