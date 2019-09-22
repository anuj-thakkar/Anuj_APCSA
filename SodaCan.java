public class SodaCan
{
    private double height;
    private double diameter;
    
    public SodaCan(double givenHeight, double givenDiameter)
    {
        height = givenHeight;
        diameter = givenDiameter;
    }
    
    public double getVolume ()
    {
        double volume = Math.PI * Math.pow((diameter/2), 2) * height;
        return volume;
    }
    
    public double getSurfaceArea ()
    {
      double surfaceArea = (2 * Math.PI * (diameter/2) * height) + (2 * Math.PI * Math.pow(diameter/2, 2));
      return surfaceArea;
    }
}
        