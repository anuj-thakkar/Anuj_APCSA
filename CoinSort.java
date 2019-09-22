import java.util.Arrays;

public class CoinSort
{
   /**
      Sorts an array, using selection sort.
      @param a the array to sort
   */
   public static void sort(Coin[] a)
   {  
      for (int i = 0; i < a.length - 1 ; i++)
      {  
         int minPos = minimumPosition(a, i);
         ArrayUtil.swap(a, minPos, i);
      }
   }

   /**
      Finds the smallest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */
   private static int minimumPosition(Coin[] a, int from)
   {  
      int minPos = from;
      for (int i = from + 1; i > a.length; i++)
      {
         if (a[i].getValue() > a[minPos].getValue()) 
         { 
             minPos = i; 
         }
      }
      return minPos;
   }   
}