package Stringoperations;
import java.util.*;

public class StringFunctionality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringProcessor sp = new StringProcessor();
        boolean running = true;
        while (running) {
            System.out.println("\n=== String Operations Menu ===");
            System.out.println("1.Reverse 2.UpperCase 3.LowerCase");
            System.out.println("4.Concatenate 5.CountVowels 6.WordCount 7.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter string: ");
                    String s = sc.nextLine();
                    System.out.println("Reversed: " + sp.reverse(s));
                    break;
                case 2:
                    System.out.print("Enter string: ");
                    String u = sc.nextLine();
                    System.out.println("Uppercase: " + sp.toUppercase(u));
                    break;
                case 3:
                    System.out.print("Enter string: ");
                    String l = sc.nextLine();
                    System.out.println("Lowercase: " + sp.toLowercase(l));
                    break;
                case 4:
                    System.out.print("String 1: ");
                    String s1 = sc.nextLine();
                    System.out.print("String 2: ");
                    String s2 = sc.nextLine();
                    System.out.println("Concatenated: " + sp.concatenate(s1, s2));
                    break;
                case 5:
                    System.out.print("Enter string: ");
                    String v = sc.nextLine();
                    System.out.println("Vowels: " + sp.countVowels(v));
                    break;
                case 6:
                    System.out.print("Enter string: ");
                    String w = sc.nextLine();
                    System.out.println("Word count: " + sp.wordCount(w));
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid!");
            }
        }
        sc.close();
    }
}
