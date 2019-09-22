import java.util.ArrayList;

public class BankAccountSearch
{
    public static boolean search(ArrayList<BankAccount> accounts, double findAmount)
    {
        for(int i = 0; i < accounts.size(); i++)
        {
            if(accounts.get(i).getBalance() == findAmount)
            {
                return true;
            }
        }
        return false;
    }
}
        