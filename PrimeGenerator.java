public class PrimeGenerator
{
    public boolean isPrime(int check)
    {
        int remainder;
        for (int i = 2; i <= check / 2; i++)
        {
            remainder = check % i;
            if (remainder == 0)
            {
                return false;
            }
        }
        return true;
    }
}