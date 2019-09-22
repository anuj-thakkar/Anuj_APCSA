public class R7_13c
{
    public static void main(String[]args)
    {
        double[] values = {1, 2, 3, 4, 5};
        double total = 0;
        double target = values[4];
        
        for(double element : values)
        {
            if(element == target)
            {
                System.out.print(target);
            }
        }
    }
}
            

