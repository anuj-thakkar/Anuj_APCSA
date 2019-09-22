import java.util.Scanner;

public class Lab4_10
{
    public static void main(String[]args)
    {
        String userInput = "The quick brown fox jumps over the lazy dog";
        String t = userInput.substring(0,1);
        String e = userInput.substring(2,3);
        String m = userInput.substring(22,23);
        String p = userInput.substring(23,24);
        String u = userInput.substring(5,6);
        String s = userInput.substring(24,25);
        String space = userInput.substring(3,4);
        String f = userInput.substring(16,17);
        String u2 = userInput.substring(5,6);
        String g = userInput.substring(42);
        String i = userInput.substring(6,7);
        String t2 = userInput.substring(31,32);
        System.out.println(t+e+m+p+u+s+space + f + u2 + g + i + t2);  
    }
}
        
        
        