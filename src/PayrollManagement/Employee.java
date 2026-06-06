package PayrollManagement;

public class Employee {
    public String name, designation;
    public int age;
    public double salary;
    public Employee(String name, String designation, int age, double salary)
    {
        this.name = name;
        this.designation = designation;
        this.age= age;
        this.salary = salary;
    }
    public void display()
    {
        System.out.println("Name = "+name+" Designation = "+designation+" Age = "+age+" Salary = "+salary);
    }

}
