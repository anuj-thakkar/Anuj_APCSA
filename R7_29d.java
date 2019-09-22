public class R7_29d
{
    public static void main(String[]args)
    {
        int[][] values = new int[10][10];
        int sum = 0;
        
        for(int i = 0; i < values.length; i++)
        {
            for(int j = 0; j < values[0].length; i++)
            {
                values[i][j] = i*j;
                sum = sum + values[i][j];
            }
        }
        System.out.print(sum);
    }
}
