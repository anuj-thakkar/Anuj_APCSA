public class Manager extends Employee
{
    private String name;
    private String salary;
    private String department;
    
    public Manager(String inputName, String inputDepartment, String inputSalary)
    {
        super(inputName, inputDepartment, inputSalary);
        
    }
    
    public String toString() 
    {
        return super.toString();
    }    
}
