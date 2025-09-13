// Display all numbers entered by user expect multiples of 10

import java.util.Scanner;

public class PQ_02 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            do {
                System.out.println("Enter yor number");
                int num = sc.nextInt();

                if (num%10==0) {
                    continue;
                }

                System.out.println(num);
            } while (true);

        }
    }
}
