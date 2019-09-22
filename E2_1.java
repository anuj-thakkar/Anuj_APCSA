import java.awt.Rectangle;
public class E2_1
{
    public static void main(String[]args)
    {
        Rectangle box = new Rectangle(5,10,20,30);
        
        System.out.print("Area: ");
        System.out.println(box.getWidth()*box.getHeight());
        System.out.println("Expected: 600");
    }
}
        