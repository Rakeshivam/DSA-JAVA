/* Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not) */

import java.util.Scanner;

public class PS_03 {

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int rem = palindrome % 10;
            reverse = reverse * 10 + rem;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Number " + n + " is a palindrome");
        } else {
            System.out.println("Number " + n + " is not a palindrome");
        }

        sc.close();
    }
}
