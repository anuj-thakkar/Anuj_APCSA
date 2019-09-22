import java.util.ArrayList;
import java.util.Arrays;

public class R7_17
{
    public static void main(String[]args)
    {
        ArrayList<Double> element = new ArrayList<Double>();
        element.add(110.0);
        element.add(90.0);
        element.add(100.0);
        element.add(120.0);
        element.add(80.0);
        
        ArrayList<Double> matches = new ArrayList<Double>();
        for(double value : element)
        {
            if(value > 100)
            {
                matches.add(value);
            }
        }
        System.out.println(matches);
    }
}
