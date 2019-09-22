public class R7_11abc
{
    public static void main(String[]args)
    {
        int[] values = {49, 25, 64, 9, 25, 1, 36, 16, -5};
        int largest = values[2];
        int smallest = values[5];
        int total = 0;
        
        
        
        for(int element : values)
        {
            
            System.out.print(element + " | ");
        }
        
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] > largest && values[i] < smallest)
            {
                largest = values[i];
                smallest = values[i];
            }
        }
        
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] < 0)
            {
                System.out.println("Negative number: " + values[i]);
            }
            
        }
         
        System.out.println("max: " + largest); 
        System.out.println("min: " + smallest);
    }
}

  
