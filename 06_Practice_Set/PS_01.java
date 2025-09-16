/* Write a Java method to compute the averageof three numbers */

import java.util.Scanner;

public class PS_01 {

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number");
        double a = sc.nextDouble();

        System.out.print("Enter the second number");
        double b = sc.nextDouble();

        System.out.print("Enter the third number");
        double c = sc.nextDouble();

        System.out.print("Average of numbers = " + average(a, b, c) + "\n");

        sc.close();
    }
}
