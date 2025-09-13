// Half_pyramid pattern of given number

import java.util.Scanner;

public class Half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int number = 1; number <= i; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
        sc.close();
    }
}
