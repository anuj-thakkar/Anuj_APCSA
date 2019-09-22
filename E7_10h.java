public class E7_10h
{
    public static boolean inOrder(int[] array)
    {
        boolean number = true;
        for(int i = 1; i < array.length; i++)
        {
            if(!(array[i] > array[i-1]))
            {
                number = true;
            }
        }
        return number;
    }
}