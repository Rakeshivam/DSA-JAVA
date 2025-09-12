import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        

        switch (operator) {
            case '+':
                System.out.println("Sum = "+(a+b));
                break;
            case '-':
                System.out.println("Sub = "+(a-b));
                break;
            case '*':
                System.out.println("Mulitply = "+(a*b));
                break;
            case '/':
                System.out.println("Divide = "+(a/b));
                break;
            case '%':
                System.out.println("Modulo = "+(a%b));
                break;    
            default:
                System.out.println("wrong operator");
                break;
        }sc.close();


    }
}
