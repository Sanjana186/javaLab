package PayrollManagement;

public class PartTime extends Employee implements Payable {
    int hoursworked;
    double hourlyrate;
    public PartTime(String name, String designation, int age, double hourlyrate,int hoursworked)
    {
        super(name,designation,age,hourlyrate);
        this.hoursworked = hoursworked;
        this.hourlyrate=hourlyrate;
    }
    public double calculate(){
        return hourlyrate*hoursworked;
        }
}
