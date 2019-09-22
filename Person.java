public class Person
{
    private String name;
    private String YOB;
    
    public Person(String inputName, String inputYOB )
    {
        name = inputName;
        YOB = inputYOB;
    }
    
    public String toString() {
        String studentInfo = "Name: " + name + " YOB : " +  YOB;
        System.out.print(studentInfo);
        return studentInfo;
    }
}
        
        
    