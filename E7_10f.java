public class E7_10f
{
    public int[] moveEvenToFront (int[] array)
    {



        
        for(int i = 0; i < array.length; i++)
        {
            if(i % 2 == 0)
            {
                array[i] = array[array.length - 3];
            }
            else if(i % 2 == 1)
            {
                array[i] = array[array.length + 3];
            }
        }
        return array;
    }
}
