/* Write a method named is Even that accepts an int argument.
The method should return true if the argument is even, or false otherwise. 
Also write a program to test your method. */

import java.util.Scanner;

public class PS_02 {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter an integer");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }

        sc.close();
    }
}
