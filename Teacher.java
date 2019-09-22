public class Teacher extends Person
{
    private String salary;
    
    public Teacher(String inputName, String inputYOB, String inputSalary)
    {
        super(inputName, inputYOB);
        salary = inputSalary;
        
    }
    
    public String toString() 
    {
        super.toString();
        System.out.print(" Teacher salary: " + salary);
        return "Teacher salary: " + salary;
    }
}