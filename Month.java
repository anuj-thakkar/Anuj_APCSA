import java.util.Scanner;

public class Month
{
    public Month(int month)
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
        {
            System.out.println("31");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("30");
        }
        else if (month == 2)
        {
            System.out.println("28");
        }
    }
    
    public void getDays()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number from 1-12: ");
        int month = userInput.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
        {
            System.out.println("31");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("30");
        }
        else if (month == 2)
        {
            System.out.println("28");
        }
    }
}
