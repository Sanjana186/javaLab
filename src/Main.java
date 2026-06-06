import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean isrunning = true;
        while(isrunning)
        {
            System.out.println("------Menu------");
            System.out.println("1.Enter and display complex numbers");
            System.out.println("2.Multiply complex numbers");
            System.out.println("3.Exit ");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1 :
                    System.out.println("Enter the real and imaginary part of the number respectively:");
                    double r1 = sc.nextDouble();
                    double i1 = sc.nextDouble();
                    Complex c1 = new Complex(r1,i1);
                    System.out.println("c1: ");
                    c1.display();
                    break;
                case 2:
                    System.out.println("enter real part of c1:");
                    double a = sc.nextDouble();
                    System.out.println("enter imaginary part of c1:");
                    double b = sc.nextDouble();
                    Complex C1 = new Complex(a,b);
                    System.out.println("enter real part of c2:");
                    double c = sc.nextDouble();
                    System.out.println("enter imaginary part of c2:");
                    double d = sc.nextDouble();
                    Complex C2 = new Complex(c,d);
                    Complex result =  C1.multiply(C2);
                    System.out.println("Product :");
                    result.display();
                    break;
                case 3:
                    isrunning = false;
                    break;
                default:
                    System.out.println("'Invalid choice");


            }
        }
        sc.close();
    }

}