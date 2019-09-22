public class E9_12 // this is the tester class
{
    private String manager;
    private String executive;
    
    public static void main(String[]args)
    {
        Manager newManager = new Manager("Tom Haverford", "Parks and Recreation", "150,000");
        System.out.println(newManager.toString());
        
        Executive newExecutive = new Executive("Anuj Thakkar", "Human Resources", "200,000");
        System.out.println(newExecutive.toString());
    }
}