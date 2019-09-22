import java.util.Scanner;

public class E4_6
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in meters: ");
	double meters = in.nextDouble();
	
	final double METERS_TO_MILES = 0.000621371;
	final double METERS_TO_FEET = 3.28084;
	final double METERS_TO_INCHES = 39.37008;
	
	double miles  = meters * METERS_TO_MILES;
	System.out.println("The amount of miles in this amount of meters is: ");
	System.out.println(miles);
	
	double feet = meters * METERS_TO_FEET;
	System.out.println("The amount of feet in this amount of meters is: ");
	System.out.println(feet);
	
	double inches = meters * METERS_TO_INCHES;
	System.out.println("The amount of inches in this amount of meters is: ");
	System.out.println(inches);
}
}
