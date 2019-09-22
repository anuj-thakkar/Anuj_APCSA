public class R7_9
{
    public static void main(String[]args)
    {
        int[] array = {5, 20, 25, 15, 10};
        int largest = array[2];
        int smallest = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > largest && array[i] < smallest)
            {
                largest = array[i];
                smallest = array[i];
            }
        }
        
        System.out.println("max: " + largest); 
        System.out.println("min: " + smallest);
    }
}
