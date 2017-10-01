package homework2;

import java.util.Scanner;
import java.lang.StringBuilder;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s1 = s.toLowerCase();
        System.out.println((s1.equals((new StringBuilder(s1)).reverse().toString())) ? "Palindrome" : "No palindrome");
    }
}
