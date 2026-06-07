import java.util.*;
public class PalindromeChecker {
    public static void checkPalindrome(String input)

        throws InvalidInputException, ShortStringException
        {
            if(!input.matches("[a-zA-Z]+"))
            {
                throw new InvalidInputException("Input should only contain alphabets");

        }
            if(input.length()<3)
                throw new ShortStringException("minimum 3 characters required!");
            StringBuffer sb = new StringBuffer(input.toLowerCase());
            String reversed = sb.reverse().toString();
            if(input.toLowerCase().equals(reversed))
                System.out.println("\"" + input + "\" is a Palindrome!");
            else
                System.out.println("\"" + input + "\" is NOT a Palindrome.");

    }
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    boolean running = true;
    while (running) {
        System.out.println("\n=== Palindrome Checker ===");
        System.out.println("1. Check Palindrome  2. Exit");
        System.out.print("Choice: "); int ch = sc.nextInt(); sc.nextLine();
        if (ch == 1) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            try { checkPalindrome(input); }
            catch (InvalidInputException | ShortStringException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        } else if (ch == 2) running = false;
        else System.out.println("Invalid choice!");
    }
    sc.close();
}
}
