/**
   A coin with a monetary value.
*/
public class Coin
{
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double aValue) 
   { 
      value = aValue; 
      
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

  
   public String toString()
   {
      return "Coin[value=" + value + "]";
   }

   private double value;
   private String name;
}