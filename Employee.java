public class Employee
{
    private String name;
    private String salary;
    private String department;
    
    public Employee(String inputName, String inputDepartment, String inputSalary )
    {
        name = inputName;
        salary = inputSalary;
        department = inputDepartment;
    }
    
    public String toString() {
        
        return "Name: " + name + " Salary: " + salary + " Department: " + department;
    }
}
        
        
    