import PayrollManagement.Payable;

import java.util.Scanner;


public class QueueMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int c = sc.nextInt();
        Queue q = new Queue(c);
        boolean running = true;
        while(running)
        {
            System.out.println("---------Menu---------");
            System.out.println("1. Enqueue  2. Dequeue  3. Display  4. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            try {
                switch (ch) {
                    case 1:
                        System.out.print("Value to enqueue:");
                        int val = sc.nextInt();
                        q.enqueue(val);
                        break;
                    case 2:
                        q.dequeue();
                        break;
                    case 3:
                        q.display();
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice");

                }
            }
                catch(QueueOverflowException e)
                {
                    System.out.println("Error: "+e.getMessage());

                }
            catch(QueueUnderflowException e) {
                System.out.println("Error: " + e.getMessage());
            }

    }
        sc.close();
}}
