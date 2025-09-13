import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            System.out.println(num+" is not a prime number");
        } else {
            for (int i = 2; i <= num - 1; i++) {             //for (int i = 2; i <=Math.sqrt(num) i++) {we can use for optimize} 
                if (num % i == 0) { // num is a multiple of i (i not equal to 1 or num)
                    isPrime = false;
                }

            }

            if (isPrime == true) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

        sc.close();
    }
}
