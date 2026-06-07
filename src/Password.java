import java.util.*;

public class Password {
public static void analyzePassword(String pwd) {
    boolean upper = false, lower = false, digit = false;
    int special = 0;
    for (char c : pwd.toCharArray()) {
        if (Character.isUpperCase(c)) upper = true;
        else if (Character.isLowerCase(c)) lower = true;
        else if (Character.isDigit(c)) digit = true;
        else special++;
    }
    System.out.println("\n-----Password Analysis------");
    System.out.println("Has uppercase : " + upper);
    System.out.println("Has Lowercase : " + lower);
    System.out.println("Has digit : " + digit);
    System.out.println("Strong Password : " + (upper && lower && digit));
    System.out.println("Special chars : " + special);
}
    public static void maskpassword (String pwd){
    if(pwd.length()<=2) return;
    String masked = pwd.charAt(0)+" ";
    for(int i=1; i<pwd.length()-1; i++)
    {
        masked += "*";
    }
    masked+=pwd.charAt(pwd.length()-1);
    System.out.println("Masked password :"+ masked);

}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    System.out.println("Enter the password : ");
    String pwd = sc.nextLine();
    while(running)
    {
        System.out.println("=====password security menu=====");
        System.out.print("1. Analyse password 2. mask the password 3. reverse the password 4. security token 5. replace vowels 6. exit  ");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        sc.nextLine();
        switch(ch)
        {
            case 1:
                analyzePassword(pwd);
                break;
            case 2:
                maskpassword(pwd);
                break;
            case 3:
                String reversed = new StringBuilder(pwd).reverse().toString();
                System.out.println("Reverse : "+reversed);
                break;
            case 4 :
                String withtoken = pwd + "@123";
                System.out.println("With security token : "+withtoken);
                break;
            case 5:
                String novowels = pwd.replaceAll("[aeiouAEIOU]","#");
                System.out.println("No vowels : "+novowels);
                break;
            case 6:
                running = false;
                break;


        }
    }
    sc.close();

}
}
