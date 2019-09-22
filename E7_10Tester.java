public class E7_10Tester
{
    public static void main(String[] args)
    {
        
      int[] randoms = new int[10];
      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = (int) (Math.random() * 100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      //Part(a) -  Swap the first and last elements in the array
      //E7_10a  a = new E7_10a();
      //a.swapElement(randoms);
      
      //Part(b) -  Shift elements to the right
      //E7_10b  b = new E7_10b();
      //b.rotateRight(randoms);
      
      //Part(c) -  Replace on even elements with zero
      //E7_10c  c = new E7_10c();
      //c.replaceEven(randoms);
      
      //Part(d) -  Replace each element except first and last with larger of its two neighbors
      //E7_10d  d = new E7_10d();
      //d.replaceWithLargestNeighbor(randoms);
      
      //Part(e) -  Remove middle element if array length is odd, two middle if even
      //E7_10e  e = new E7_10e();
      //e.removeMiddle(randoms);
      
      //Use the following code to test part (e) with an odd array length
      /** 
      randoms = new int[11];
      // Create a test array containing random numbers
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = (int) (Math.random() * 100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " " );
      }
      System.out.println();

      // Remove the middle element(s)
       E7_10e  e = new E7_10e();
       e.removeMiddle(randoms)

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
      
      */
            
      //Part(f) -  Move all even elements to the front, preserving the order
      //E7_10f  f = new E7_10f();
      //f.moveEvenToFront(randoms);
      
      //Part(g) -  Return the second largest element in the array 
      //E7_10g  g = new E7_10g();
      //System.out.println("The second largest number is " + g.getSecondLargest(randoms));
      
      //Part(h) -  Return true if the array is currently sorted in increasing order
      //E7_10h  h = new E7_10h();
      // Use the following code to test part (h) with a sorted and a non-sorted array
      /**
      int[] arrOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 42};
      int[] arrNotOrder = {2, 1, 3, 4, 5, 6, 7, 8, 9, 42};

      // Check if array 1 is ordered or not.
      if (h.inOrder(arrOrder))
      {
         System.out.println("The array is in order.");
      }
      else
      {
         System.out.println("The array is NOT in order.");
      }
      System.out.println("Expected: The array is in order.");


      // Check if array 2 is ordered or not.
      if (h.inOrder(arrNotOrder))
      {
         System.out.println("The array is in order.");
      }
      else
      {
         System.out.println("The array is NOT in order.");
      }
      System.out.println("Expected: The array is NOT in order.");
       */
      
      //Part(i) -  Return true if the array contains two adjacent duplicate elements
      //E7_10i  i = new E7_10i();
      //Use the following code to test part (i) with an array that contains duplicates and that does not
      /**
      int[] arr1 = {1, 2, 3, 4, 4, 6, 7, 8, 9, 42};
      int[] arr2 = {2, 1, 3, 4, 5, 4, 7, 4, 9, 4};

      // Check if array 1 has adjacent dupes.
      if (i.adjacentDupes(arr1))
      {
         System.out.println("Array contains adjacent duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain adjacent duplicates."); 
      }
      System.out.println("Expected: Array contains adjacent duplicates.");

      // Check if array 2 has adjacent dupes.
      if (i.adjacentDupes(arr2))
      {
         System.out.println("Array contains adjacent duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain adjacent duplicates." );
      }
      System.out.println("Expected: Array does NOT contain adjacent duplicates.");
       */
      
      //Part(j) -  Return true if the array contains two duplicate elements
      //E7_10j  j = new E7_10j();
      //Use the following code to test part (j) with an array that contains duplicates
      /*
      int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 42};
      int[] arr2 = {2, 1, 3, 4, 5, 4, 7, 4, 9, 4};

      // Check if array 1 has dupes.
      if (containsDuplicates(arr1))
      {
         System.out.println("Array contains duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain duplicates.");
      }
      System.out.println("Expected: Array does NOT contain duplicates.");

      // Check if array 2 has dupes.
      if (containsDuplicates(arr2))
      {
         System.out.println("Array contains duplicates.");
      }
      else
      {
         System.out.println("Array does NOT contain duplicates.");
      }
      System.out.println("Expected: Array contains duplicates.");
       */

      // Print again to see new order.
      /**for (int i = 0; i < 10; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();*/
   }
        
        
        
        
        
        
        
}
