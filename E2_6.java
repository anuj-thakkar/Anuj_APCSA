import java.lang.String;

public class E2_6
{
    public static void main(String[]args)
    {
        String river = "Mississippi";
        String river2 = river.replace("i", "!");
        String result = river2.replace("s", "$");
        System.out.println(result);
    }
}
        