public class E7_10g
{
    public int[] getSecondLargest (int[] array)
    {
        int largest = array[0];
        int secondLargest = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > largest)
            {
                largest = array[i];
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < largest && array[i] > secondLargest)
            {
                secondLargest = array[i];
            }
        }
        return array;
    }
}
        