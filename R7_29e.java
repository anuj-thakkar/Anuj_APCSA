public class R7_29e
{
    public static void main(String[]args)
    {
        int[][] values = new int[10][10];
        
        for(int i = 0; i < values.length; i++)
        {
            for(int j = 0; j < values[0].length; i++)
            {
                values[i][j] = (j+1)*(i+1);
                System.out.print(values[i][j] + " ");
            }
        }
        System.out.println();
    }
}

