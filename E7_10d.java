public class E7_10d
{
    public int[] replaceWithLargestNeighbor(int[] array)
    {
        for(int i = 1; i < array.length - 1; i++)
        {
            if(array[i-1] < array[i+1])
            { 
                array[i] = array[i+1];
            }
            else
            {
                array[i] = array[i-1];
            }
        }
        
        return array;
    }
}
                