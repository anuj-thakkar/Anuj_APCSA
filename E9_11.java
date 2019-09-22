public class E9_11 // this is the tester class
{
    private String student;
    private String teacher;
    
    public static void main(String[]args)
    {
        Student newStudent = new Student("Anuj", "2001", "Computer Science");
        newStudent.toString();
       
        Teacher newTeacher = new Teacher("Mrs. Keil", "1955", "150,000");
        newTeacher.toString();
    }
}
        