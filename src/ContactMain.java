import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class ContactMain {
    public static void main(String[] args)
    {
        ArrayList<Telephone> contacts = new ArrayList<>();
        contacts.add(new Telephone("Hannah",1234567891));
        contacts.add(new Telephone("Farhan",7894561235l));
        contacts.add(new Telephone("Sanja",8431852247l));
        LinkedList<MissedCall> mc = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running)
        {
            System.out.println("\n-----menu------\n");
            System.out.println("1. Add Missed Call");
            System.out.println("2. Display Missed Calls");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter phone number :");
                    long num = Long.parseLong(sc.nextLine());
                    String callerName = "Private Caller";
                    for(Telephone c : contacts)
                    {
                        if(c.number == num)
                        {
                            callerName = c.name;
                            break;
                        }
                    }
                    if(mc.size()==3)
                    {
                        MissedCall removed = mc.removeFirst();
                        System.out.println("Oldest call deleted: "+ removed.number);


                    }

            }

        }
    }
}
