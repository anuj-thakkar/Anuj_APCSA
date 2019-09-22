import java.util.Scanner;
public class Date
{
    private static int newMonth;
    private int newDay;
    private String season;
    
    public void getSeason(int newMonth, int newDay)
    {   
       Scanner userInput = new Scanner(System.in);
       System.out.println("Enter a number from 1-12: ");
       newMonth = userInput.nextInt();
       System.out.println("Enter a date from 1-31: ");
       newDay = userInput.nextInt(); 
        if (newMonth >= 1 && newMonth <= 3)
       {
           season = "Winter"; 
           System.out.println(season);
       }
       else if (newMonth >= 4 && newMonth <= 6)
       {
           season = "Spring";
           System.out.println(season);
       }
       else if (newMonth >= 7 && newMonth <= 9)
       {
           season = "Summer";
           System.out.println(season);
       }
      
       else if(newMonth >= 10 && newMonth <= 12)
       {
           season = "Fall";
           System.out.println(season);
       }
       else 
       {
           System.out.println("Not a month");
       }
       
       if (newMonth%3 == 0 && newDay >= 21)
       {
           if (season.equals("Winter"))
           {
               season = "Spring";
               System.out.println(season);
           }
           else if (season.equals("Spring"))
           {
               season = "Summer";
               System.out.println(season);
           }
           else if (season.equals("Summer"))
           {
               season = "Fall";
               System.out.println(season);
           }
           else if (season.equals("Fall"))
           {
               season = "Winter";
               System.out.println(season);
           }
        }
    }
}