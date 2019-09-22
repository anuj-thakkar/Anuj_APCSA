public class CoinTester
{
    public static void main(String[]args)
    {
        Coin dime = new Coin(10,"dime");
        Coin nickel = new Coin(5, "nickel");
        System.out.println(dime.compareTo(nickel));
        
        
    }
}
        