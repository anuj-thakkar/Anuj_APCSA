import java.util.Random;

/**
   This class contains utility methods for array manipulation.
*/  
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static int[] randomIntArray(int length, int n)
   {  
      int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);
      }
      
      return a;
   }

   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static Coin[] randomCoinArray(int length, int n)
   {  
      Coin[] a = new Coin[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = new Coin(generator.nextInt(n));
      }
      
      return a;
   }

   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(Coin[] a, int i, int j)
   {
      Coin temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
   
   public static String[] randomStringArray(int length, int n)
   {  
      String[] s = new String[length - 1];      
      for (int i = 0; i < s.length; i++)
      {
         s[i] = randomString(3);
      }
      
      return s;
   }
   
   public static String randomString(int n)
   {
       String s = " ";
       s += (char)('a' + generator.nextInt(26));
       return s;
   }
}
      