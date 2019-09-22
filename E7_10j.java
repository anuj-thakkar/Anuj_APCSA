public class E7_10j
{
    public boolean containsDuplicates (int[]array)
    {
        boolean found = false;
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; i++)
            {
                if(array[j] == array[i])
                {
                    found = true;
                }
            }
        }
        return found;
    }
    
}
