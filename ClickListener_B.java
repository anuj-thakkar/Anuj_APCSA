import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class ClickListener_B implements ActionListener
{
   private double numberOfClicks = 0;
   
   public void actionPerformed(ActionEvent event)
   {
      numberOfClicks++;
      System.out.println("I was clicked by B");
   }            
}