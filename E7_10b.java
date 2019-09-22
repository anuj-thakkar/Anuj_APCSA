public class E7_10b
{
    public int[]rotateRight(int[] array)
    {

        
        
        for(int i = array.length - 1; i > 0; i--)
        {
             array[i] = array[i-1];
             
        }
        
        return array;
    }
    
}
