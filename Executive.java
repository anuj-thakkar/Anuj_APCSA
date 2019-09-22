public class Executive extends Employee
{
    private String name;
    private String salary;
    private String department;
    
    public Executive(String inputName, String inputDepartment, String inputSalary)
    {
        super(inputName, inputDepartment, inputSalary);
        
    }
    
    public String toString() 
    {
        return super.toString();
    }    
}