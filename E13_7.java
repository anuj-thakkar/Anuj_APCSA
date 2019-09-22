public class E13_7
{
    public static String reverse(String text)
    {
        String newString = "";
        
        for(int i = text.length(); i > 0; i--)
        {
            newString += text.charAt(i-1);
        }
        
        return newString;
    }
}
