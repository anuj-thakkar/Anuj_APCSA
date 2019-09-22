public class E14_17
{
    public static void main(String[] args)
    {
       StringSorter sorter = new StringSorter(10);
       sorter.sort(sorter.getList());
       System.out.println(sorter);
    }
}
