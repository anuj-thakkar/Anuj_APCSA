/**
   A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount
{
   private int withdrawals;
   private int transactionCount;

   /**
      Constructs a checking account with a zero balance.
   */
   public CheckingAccount()
   {
      withdrawals = 0;
   }

   public void withdraw(double amount)
   {
      final int FREE_WITHDRAWALS = 3;
      final int WITHDRAWAL_FEE = 1;
      
      super.withdraw(amount);  
      withdrawals++;
      if (withdrawals > FREE_WITHDRAWALS)
      {
         super.withdraw(WITHDRAWAL_FEE);  
      }
   }

   public void monthEnd()
   {
      withdrawals = 0;
   }
   
   public void levyFee()
   {
       if(transactionCount > 1)
       {
           super.withdraw(1);
       }
   }
   
   public void deposit(double amount)
   {
       super.deposit(amount);
   }
}