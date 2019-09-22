import java.util.Arrays;

/**
This program demonstrates the merge sort algorithm by
sorting an array that is filled with random numbers.
*/
public class MergeSortDemo
{
   public static void main(String[] args)
   {
      String[] s = ArrayUtil.randomStringArray(20, 3);
      System.out.println(Arrays.toString(s));

      MergeSorter.sort(s);

      System.out.println(Arrays.toString(s));
   }
}