import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class StringSorter
{
    private ArrayList<String> listOfStrings = new ArrayList<String>();
    
    public StringSorter(int n)
    {
        for(int i = 0; i < n; i++)
        {
            String randomWord = "";
            Random generator = new Random();
            
            for(int j = 0; j < generator.nextInt(26); j++)
            {
                randomWord += (char)('a' + generator.nextInt(26));
            }
            
            listOfStrings.add(randomWord);
        }
        
        System.out.println(listOfStrings);
    }
    
    public static boolean comparable(ArrayList list)
    {
        for(int i = 0; i < list.size(); i++)
        {
        }
        
        return false;
    }
    
    public ArrayList getList()
    {
        return listOfStrings;
    }
    
    
    public static void sort(ArrayList list)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            int minPos = minimumPosition(list, 1);
            ArrayUtil.swap(list, minPos, i);
        }
    }
    
    private static int minimumPosition(ArrayList list, int from)
    {
        int minPos = from;
        for(int i = from + 1; i < list.size(); i++)
        {
            if(((String)list.get(i)).length() < ((String)list.get(minPos)).length())
            {
                minPos = i;
            }
        }
        
        return minPos;
    }
}
        
        
        
        
        
            
    