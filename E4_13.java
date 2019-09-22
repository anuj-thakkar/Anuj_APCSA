import java.util.Scanner;

public class E4_13
{
    public static void main(String[]args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a integer between 1,000 and 999,999: ");
       String integer = in.nextLine();

       int index = integer.indexOf(",");
       String commaString = integer.substring(0,index) + integer.substring(index + 1);
       System.out.println(commaString);
    }
}