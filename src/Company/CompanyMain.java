/*Write a Java Program for the following Payroll System. Create a package called PayrollManagement.
Define an interface Payable with a method calculate(). Create a super class called Employee with the
following data members name, age, salary and designation. Use a parameterised constructor to
initialize all the data members. The Employee class is inherited by three sub-classes namely FullTime,
PartTime and Intern and these subclasses implement the Payable interface. Full-Time Employee
receives monthly salary and Part-Time Employee receives hourly wages. Intern takes a fixed stipend.
Create another package “Company” and import these classes to complete the payroll system. Create
a reference to the Employee class and identify the types of employee , compute salary and display. */
package Company;
import PayrollManagement.*;
import java.util.Scanner;
public class CompanyMain {
    public static void main(String[] args)
    {
    Scanner sc  = new Scanner(System.in);
    boolean running = true;
    while(running)
    {
        System.out.println("-------Menu------");
        System.out.println("1.FullTime");
        System.out.println("2.PartTime");
        System.out.println("3.Intern");
        System.out.println("4.Quit");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        sc.nextLine();
        if(ch==4) {
            running = false;
            break;
        }
        System.out.print("Name = ");
        String na = sc.nextLine();
        System.out.print("Designation = ");
        String de = sc.nextLine();
        System.out.println("Age = ");
        int age = sc.nextInt();
       Employee emp = null;
       if(ch==1)
       {
           System.out.print("Monthly salary: ");
           double sa = sc.nextDouble();
           emp = new FullTime(na,de,age,sa);
           System.out.println("Employee type : FullTime");

       }
       else if(ch==2)
       {
           System.out.print("Hours worked :");
           int hw = sc.nextInt();
           System.out.print("Hourly rate: ");
           double hr = sc.nextDouble();
           emp = new PartTime(na,de,age,hr,hw);
           System.out.println("Employee Type : PartTime");

       }
       else if(ch == 3)
       {
           System.out.print("Stipend: ");
           double st = sc.nextDouble();
           emp = new Intern(na,de,age,st);

       }
       if(emp!=null)
       {
           emp.display();
           System.out.println("Net pay : "+((Payable)emp).calculate());
       }


    }
    sc.close();
    }
}
