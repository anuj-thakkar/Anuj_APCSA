import java.util.Scanner;

public class E4_7
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = in.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is: ");
        System.out.println(area);
        
        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: ");
        System.out.println(circumference);
        
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume is: ");
        System.out.println(volume);
        
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area is: ");
        System.out.println(surfaceArea);
    }
}