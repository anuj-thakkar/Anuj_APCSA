public class E2_15
{
    public static void main(String[]args)
    {
        
    }
     public static void DayTester() {
         Day today = new Day();
         int currentDay = today.getDate();
         int newDay = currentDay + 10;
         System.out.println("the answer is " + (newDay - currentDay));
         
        }
    }