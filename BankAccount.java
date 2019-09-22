/**
   A bank account has a balance and a mechanism for applying interest or fees at 
   the end of the month.
*/
public class BankAccount 
{
   private double balance;

   /**
      Constructs a bank account with zero balance.
   */
   public BankAccount()
   {
      balance = 0;
   }

  /**
      Constructs a bank account with a balance.
   */
  public BankAccount(double amount)
  {
      balance = amount;
      
      if (amount < 0)
      {
          throw new NegativeBalanceException("balance is less than zero");
      }
      balance = balance - amount;
  }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
  public void deposit(double amount)
  {
     
      if(amount < 0)
      {
          throw new NegativeAmountException("cannot deposit a negative amount");
      }
      
      balance = balance + amount;
  }
   
  /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
  public void withdraw(double amount)
  {
      
      if(amount > balance)
      {
          throw new InsufficientFundsException("cannot withdeaw more than your balance");
      }
      balance = balance - amount;
  }
  
  /**
      Carries out the end of month processing that is appropriate
      for this account.
   */
  public void monthEnd() 
  {
  }
   
  /**
      Gets the current balance of this bank account.
      @return the current balance
   */
  public double getBalance()
  {
      return balance;
  }
   
  
}