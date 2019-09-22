public class E6_17
{
    public static void main(String[]args)
    {
        final int NMAX = 10;
        final double XMAX = 10;
        
        System.out.println();
        for (double x = 1; x<= XMAX; x++)
        {
            for (double n = 1; n <= NMAX; n++)
        {
            System.out.printf("%10.0f", x*n);
        }
        System.out.println();
    }
}
}