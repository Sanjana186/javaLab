package PayrollManagement;

public class FullTime extends Employee implements Payable{

    public FullTime(String name, String designation, int age, double salary)
    {
            super(name,designation,age,salary);
    }
    public double calculate()
    {
        return salary;
    }
}
