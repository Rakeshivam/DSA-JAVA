import java.util.Scanner;

public class Product {

    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int mul = product(num1, num2);
        System.out.println("Product of the numbers is : " + mul);

        sc.close();

    }
}
