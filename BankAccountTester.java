public class BankAccountTester
{
    public static void main(String[]args)
    {
        System.out.println("Expected: 1) balance is less than zero, 2) cannot deposit a negative amount, 3) cannot withdraw more than your balance");
        
        
        try
        {
            BankAccount anujsBankAccount = new BankAccount(-5);
        }
        catch (NegativeBalanceException exception)
        {
            System.out.println("balance is less than zero");
        }
        
        try
        {
            BankAccount anujsBankAccount = new BankAccount(5);
            anujsBankAccount.deposit(-10);
        }
        catch (NegativeAmountException exception)
        {
            System.out.println("cannot deposit a negative amount");
        }
        
        try
        {
             BankAccount anujsBankAccount = new BankAccount(50); 
             anujsBankAccount.withdraw(60);
        }
        catch (InsufficientFundsException exception)
        {
            System.out.println("cannot withdraw more than your balance");
        }
        
       
        
    }
}


        