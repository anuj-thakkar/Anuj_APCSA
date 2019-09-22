public class powers
{
    public static void main(String[]args)
    {
        int n = 0;
        double power = 0;
        while(n <= 20)
        {
            power += Math.pow(2,n);
            n++;
        }
        System.out.println(power);
    }
    
}