public class E7_10c
{
    public int[] replaceEven(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]%2 == 0)
            {
                array[i] = 0;
            }
        }
        return array;
    }
}
