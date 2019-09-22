import java.util.ArrayList;

/**
   This program tests the Bank class.
*/
public class BankTester
{
   public static void main(String[] args)
   {
      ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
      
      accounts.add(new BankAccount(1001, 20000));
      accounts.add(new BankAccount(1015, 10000));
      accounts.add(new BankAccount(1729, 15000));

      double targetAmt = 20000;
     
      
      //Add in code to call your search method and print out a message based on the value returned
      //from the method
      
      
     // BankAccountSearch bas = new BankAccountSearch();
     
     
     if(BankAccountSearch.search(accounts, targetAmt) == false)
     {
         System.out.println("There is no bank account with a balance of " + targetAmt);
     }
     else
     {
         System.out.println("There is a bank account with a balance of " + targetAmt);
     }
   }
}