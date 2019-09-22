public class R7_29a
{
    public static void main(String[]args)
    {
        final int ROWS = 10;
        final int COLUMNS = 10;
        
        int[][] values = new int[10][10];
        
        for(int i =0; i < values.length; i++)
        {
            for(int j = 0; j < values[0].length; j++)
            {
                values[i][j] = 0;
                System.out.printf("%8d",values[i][j]);
            }
        }
        System.out.println();
    }
}