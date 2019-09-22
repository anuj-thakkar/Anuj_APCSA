public class R7_5f
{
    public static void main(String[]args)
    {
        int[] values = new int[10];
        for(int i = 0; i< values.length; i++)
        {
            if(i % 2 == 0)
            {
                values[i]=0;
            }
            else
            {
                values[i]=1;
            }
            System.out.println(values[i] + " ");
        }
    }
}
