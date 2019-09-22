import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   This program demonstrates how to install an action listener.
*/
public class E10_19
{  
   private static final int FRAME_WIDTH = 100;
   private static final int FRAME_HEIGHT = 60;
   
   public static void main(String[] args)
   {  
      JFrame frame = new JFrame();
      JButton button = new JButton("A");
      frame.add(button);
      
      JButton button2 = new JButton("B");
      frame.add(button2);
     
      ActionListener listener = new ClickListener_A();
      button.addActionListener(listener);
      
      ActionListener listener2 = new ClickListener_B();
      button2.addActionListener(listener2);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(button2);
      frame.add(panel);
   }
}