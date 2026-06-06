import java.util.Scanner;
public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Create Bank Account-------");
        System.out.print("Account no: ");
        long acc = sc.nextLong();
        sc.nextLine();
        System.out.print("Name : ");
        String na = sc.nextLine();
        System.out.print("Address : ");
        String ad = sc.nextLine();
        System.out.print("Initial balance :");
        double bal = sc.nextDouble();
        sc.nextLine();
        String email;
        do {
            System.out.print("Email: ");
            email = sc.nextLine();
            if (!Bank.isValidEmail(email))
                System.out.println("Invalid email format, try again!");
        }
        while (!Bank.isValidEmail(email));
        String phoneStr;
        do {
            System.out.print("Phone: ");
            phoneStr = sc.nextLine();
            if (!Bank.isValidPhone(phoneStr))
                System.out.println("Phone number must contain exactly 10 digits");
        }
        while (!Bank.isValidPhone(phoneStr));
        long phone = Long.parseLong(phoneStr);
        Bank account = new Bank(acc, na, ad, bal, email, phone);
        boolean running = true;
        while (running) {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Display  2. Deposit  3. Withdraw  4. Get Balance  5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    account.display();
                    break;
                case 2:
                    System.out.print("Amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 4:
                    account.getBalance();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }
        sc.close();
    }
}
