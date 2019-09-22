import java.util.Scanner;

public class  E4_4
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = in.nextInt();
        
        System.out.println("Enter the second number: ");
        int numberTwo = in.nextInt();
        
        System.out.println("The sum is: ");
        System.out.println(numberOne + numberTwo);
        
        System.out.println("The difference is: " );
        System.out.println(numberOne - numberTwo);
        
        System.out.println("The product is: " );
        System.out.println(numberOne * numberTwo);
        
        System.out.println("The average is: " );
        System.out.println(numberOne/2 + numberTwo/2);
        
        System.out.println("The max is: ");
        System.out.println(Math.max(numberOne, numberTwo));
        
        System.out.println("The min is: ");
        System.out.println(Math.min(numberOne, numberTwo));
    }
}