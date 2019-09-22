public class E13_5
{
    
    
    public static String reverse(String text)
    {
        
        
        if(text.length() == 1)
        {
            System.out.println(text);
        }
        else
        {
            reverse(text.substring(text.length()-1, text.length()));
            reverse(text.substring(0, text.length() - 1));
            
        }
        
        return text;
    }
}
        