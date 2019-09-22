import java.util.ArrayList;

public class Sequence
{
   private ArrayList<Integer> values;
   
   //constructor
   public Sequence()
   {
       values = new ArrayList<Integer>();
   }
   
   //add a value to the end of the arraylist
   public void add(int n)
   {
       values.add(n);
   }
   
   //return a string of all the arraylist values
   public String toString()
   {
       return values.toString();
   }
   
   //E7.22 - complete this method
   public Sequence append(Sequence other)
   {
       Sequence newSequence = new Sequence();
       for(int i = 0; i < values.size(); i++)
       {
           newSequence.values.add(values.get(i));
       }
       for(int i = 0; i < other.values.size(); i++)
       {
           newSequence.values.add(other.values.get(i));
       }
       return newSequence;
   }
    
    
  //E7.23 - complete this method
  public Sequence merge(Sequence other)
  {
      int max;
      if(values.size() > other.values.size())
      {
          max = values.size();
      }
      else
      {
          max = other.values.size();
      }
      
      Sequence newSequence = new Sequence();
      for(int i = 0; i < max; i++)
      {
          if(i < values.size())
          {
              newSequence.values.add(values.get(i));
          }
      }
      return newSequence;  
  } 
}