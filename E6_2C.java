public class E6_2C
{
    public static void main(String[]args)
    {
        double power = 0;
        double sum = 0;
        for (double n = 2; power <= 20; power++)
        {
            sum = sum + Math.pow(n, power);
            System.out.println(sum);
        }
    }
}
            