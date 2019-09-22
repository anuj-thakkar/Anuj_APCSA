import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
   An action listener that prints a message.
*/
public class AddInterestListener implements ActionListener
{
   private static final double INTEREST_RATE = 10;
   private static double INITIAL_BALANCE = 1000;
   BankAccount account1 = new BankAccount(INITIAL_BALANCE); 
   public void actionPerformed(ActionEvent event)
    {
      // The listener method accesses the account variable
      // from the surrounding block
      double interest = account1.getBalance() * (INTEREST_RATE / 100);
      account1.deposit(interest);
      System.out.println("balance: " + account1.getBalance() );
    }
}