import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.BasicStroke;
/*
   A component that draws an alien face
*/
public class FaceComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D 
     
      
      Graphics2D g2 = (Graphics2D) g;
    //if they want to change the thickness of the lines, use
    // Might have to figure out how to import the command below, find it in API 
        //g2.setStroke(new BasicStroke(3));
        
      g2.setStroke(new BasicStroke(15));
      
      // Draw the head
      Ellipse2D.Double ring1 = new Ellipse2D.Double(170.0, 10.0, 150.0, 150.0);
      g2.draw(ring1);
      g2.setColor(Color.BLUE);
      
      // Draw the head
      Ellipse2D.Double ring2 = new Ellipse2D.Double(10.0, 10.0, 150.0, 150.0);
      g2.draw(ring2);
      g2.setColor(Color.BLACK);
      
      
            // Draw the head
      g2.setColor(Color.YELLOW);  
      Ellipse2D.Double ring4 = new Ellipse2D.Double(335.0, 10.0, 150.0, 150.0);
      g2.draw(ring4);
      
      // Draw the head
          g2.setColor(Color.RED); 
      Ellipse2D.Double ring3 = new Ellipse2D.Double(85.0, 100.0, 150.0, 150.0);
      g2.draw(ring3);
  
     
      
      
      // Draw the head
      g2.setColor(Color.GREEN); 
      Ellipse2D.Double ring5 = new Ellipse2D.Double(255.0, 100.0, 150.0, 150.0);
      g2.draw(ring5);


   }
}