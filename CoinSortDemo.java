import java.util.Arrays;

public class CoinSortDemo
{  
   public static void main(String[] args)
   {  
      Coin[] a = ArrayUtil.randomCoinArray(20, 100);
      System.out.println(Arrays.toString(a));

      CoinSort.sort(a);

      System.out.println(Arrays.toString(a));
   }
}