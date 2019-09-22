public class R7_12abc
{
    public static void main(String[]args)
    {
     int[] partA = {1, 2, 3, 4, 5, 6};  // part A
     double total = 0;
     for(int i = 0; i < partA.length; i++) 
     {
         total = total + partA[i];
     }
     
     int[] partB = {1, 2, 3, 4, 5};  // part B 
     boolean found = false;
     for(int i = 0; i < partB.length; i++)
     {
         if(partB[i] == 3)
         {
             found = true;
         }
     }
     System.out.println(found);
     
     int[] partC = {1, 2, 3, 4, 5};
     for(int i = 0; i < partC.length; i++)
     {
         partC[i] = i * 2;
     }
    }
}
     
     