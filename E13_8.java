public class E13_8
{
    
    public static boolean find(String text, String str)
    {
        boolean found = false;
        
        if(text.startsWith(str))
        {
            return found = true;
        }
        else
        {
            String shorter = text.substring(1);
            return find(shorter, str);
        }
    }
    
}
        