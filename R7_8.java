public class R7_8
{
    public static void main(String[]args)
    {
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (Math.random() * 100);
            System.out.print(array[i] + ",");
        }
    }
}