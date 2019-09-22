import java.util.Scanner;

public class QuestionTester
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       Question q1 = new Question();
       q1.setText("What is the capital of Jamaica?");
       q1.setAnswer("Kingston");
       q1.setComplexity(4);
       
       q1.display();
       System.out.println("(Level: " + q1.getComplexity()+ ")");
       String response = in.nextLine();
       if(q1.checkAnswer(response))
       {
           System.out.println("Correct!");
       }
       else
       {
           System.out.println("Incorrect.");
       }
       
       
   }
    
}