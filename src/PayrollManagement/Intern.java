package PayrollManagement;

public class Intern extends Employee implements Payable{
    double stipend;
    public Intern(String name, String designation, int age, double stipend)
    {
        super(name,designation,age,stipend);

    }
    public double calculate()
    {
        return salary;
    }
}
