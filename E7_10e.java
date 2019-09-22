public class E7_10e
{
    public int[] removeMiddle(int[] array)
    {
        int currentSize = array.length;
        

       
        if(currentSize % 2 != 0)
        {
            int middle = currentSize / 2;
            int tempVariable = array[middle];
            array[middle] = array[currentSize - 1];
            array[currentSize - 1] = tempVariable;
            for(int i = 0; i < currentSize - 1; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
        else if(currentSize % 2 == 0)
        {
            int middle1 = currentSize / 2;
            int middle2 = (currentSize / 2) - 1;
            array[middle1] = 0;
            array[middle2] = 0;
            int tempVariable1 = array[middle1];
            int tempVariable2 = array[middle2];
            array[middle1] = array[currentSize - 1];
            array[middle2] = array[currentSize - 2];
            array[currentSize - 1] = tempVariable1;
            array[currentSize - 2] = tempVariable2;
            
            for(int i = 0; i < currentSize - 2; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
       
        return array;
    }
}
            
