import java.util.Scanner;

public class PrimePrinter
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        PrimeGenerator primeGenerator = new PrimeGenerator();
        int i;
        int input = in.nextInt();
        boolean statement = true;
        String primeNumber = " ";
        for (i = 1; i<= input; i++)
        {
            statement = primeGenerator.isPrime(i);
            if(statement)
            {
                primeNumber = primeNumber + i + " ";
            }
        }
        System.out.println(primeNumber);
    }
}