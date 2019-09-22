public class E9_4
{
    private double answer;
   
    public double setAnswer(double correctResponse)
    {
        answer = correctResponse;
        return correctResponse;
    }
    
    public boolean checkAnswer(String response)
    {
        double newAnswer = Double.parseDouble(response);
        return Math.abs(newAnswer - answer) <= .01;
    }
}
