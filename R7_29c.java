public class R7_29c
{
    public static void main(String[]args)
    {
        int[][] values = new int[10][10];
        for(int i = 0; i < values.length; i++)
        {
            for(int j = 0; j < values[0].length; i++)
            {
                if(i == 0 || i == (values.length - 1))
                {
                    values[i][j] = 0;
                    System.out.print(values[i][j]);
                }
            }
        }
        System.out.println();
    }
}
                
             