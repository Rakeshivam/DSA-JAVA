import java.util.Scanner;

public class Factorial {

    public static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        factorial(n);

        sc.close();
    }
}
