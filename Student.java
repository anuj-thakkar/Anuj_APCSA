public class Student extends Person
{
    private String major;
    
    public Student(String inputName, String inputYOB, String inputMajor)
    {
        super(inputName, inputYOB);
        major = inputMajor;
        
    }
    
    public String toString() 
    {
        super.toString();
        System.out.print("Major: " + major);
        return "Student major: " + major;
    }    
}