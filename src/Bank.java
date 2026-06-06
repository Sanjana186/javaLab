public class Bank {
   private long accno ;
   private String name;
   private String address;
   private  double balance;
   private String email;
   private long phoneno;
   private static final double minBalance = 500.0;

   public Bank()
   {
       accno = 0;
       name = "N/A";
       address = "N/A";
       balance = 0;
       email = "N/A";
       phoneno = 0;

   }
   public Bank(long accno, String name, String address, double balance,String email,long phoneno)
   {
       this.accno = accno;
       this.name = name;
       this.address = address;
       this.balance = balance;
       this.email = email;
       this.phoneno =phoneno;

   }
   public static boolean isValidEmail(String email)
   {
       String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
       return email.matches(emailRegex);
   }
   public static boolean isValidPhone(String phone)
   {
       String phoneRegex = "^[0-9]{10}$";
       return phone.matches(phoneRegex);
   }
   public void display() {
       System.out.println("\n------Account details -------\n");
       System.out.println("Account no: " + accno);
       System.out.println("Name: " + name);
       System.out.println("Address: " + address);
       System.out.println("Email: " + email);
       System.out.println("Phone: " + phoneno);
       System.out.println("Balance: " + balance);
   }
   public void deposit(double amount)
   {
       if(amount<=0)
       {
           System.out.println("Invalid deposit amount");
           return;
       }
       balance+=amount;
       System.out.println("Deposited amount : "+amount+"\n Balance : "+balance);


   }
   public void withdraw(double amount)
   {
       if(amount<=0)
       {
           System.out.println("Invalid withdrawal amount");
           return;
       }
       if(balance - amount<minBalance)
       {
           System.out.println("Cannot withdraw. Minimum balance is 500 rs");
       }
       else {
           balance = balance - amount;
           System.out.println("withdrew amount: "+amount+"\n balance : "+balance);
       }

   }
   public void getBalance()
   {
       System.out.println("Balance = rs."+balance);
   }
}

