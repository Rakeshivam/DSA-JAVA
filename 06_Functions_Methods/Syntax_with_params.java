import java.util.Scanner;

public class Syntax_with_params {

    public static int calculateSum(int num1, int num2) { // Parameters or formal Parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int add = calculateSum(a, b); // Arguments or actual Parameters
        System.out.println("Sum of numbers is : " + add);

        sc.close();
    }
}
