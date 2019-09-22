/**
   A question with a text and an answer.
*/
public class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with a question and answer.
   */
   public Question(String inText, String inAnswer) 
   {
      text = inText;
      answer = inAnswer;
   }

   /**
      Sets the question text, in case you need to change it
      @param questionText the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }


  /**
      Gets the question text.
      @returns questionText the text of this question
   */
   public String getText()   
   {
      return text;
   }
   
   
   /**
      Sets the answer for this question, in case you need to change it
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Gets the answer for this question, in case you need to change it
      @return correctResponse the answer
   */
   public String getAnswer()
   {
      return answer;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equals(answer);
   }
}
