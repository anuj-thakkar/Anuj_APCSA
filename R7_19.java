public class R7_19
{
    public static void main(String[]args)
    {
        int[] values = {110, 90, 100, 120, 80};
        int pos = 0;
        int currentSize = values.length;
        values[2] = values[currentSize - 1];
        currentSize--;
        
        for(int i = pos; i < currentSize; i++)
        {
            System.out.println(values[i]);
        }
        
    }
}
