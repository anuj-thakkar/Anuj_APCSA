public class E7_10a
{
    public int[] swapElement(int[] array)
    {
        int i = 0;
        int j = array.length - 1;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
        return array;
    }
}
        