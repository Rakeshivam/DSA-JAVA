// To find the factorial of any given number

import java.util.Scanner;

public class PS_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your number");
        int num = sc.nextInt();

        int factorial = 1;

        for (int i=1; i<=num; i++) {
            factorial *= i;
        }
        System.out.println("factorial of the "+num+" is "+factorial);

        sc.close();
    }
}
