/* Write a program that reads a set of integers, and the n prints the sum of the even and odd integers. */

import java.util.Scanner;

public class PS_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        

        while (true) {
            System.out.println("Enter integers separated by space (enter 0 to stop):");
            int num = sc.nextInt();

            if (num == 0) {
                break; // stop input when user enters 0
            }

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        sc.close();
    }
}


