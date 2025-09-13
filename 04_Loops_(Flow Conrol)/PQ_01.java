/* Keep entering the numbers till user enters a multiple of 10 */

import java.util.Scanner;

public class PQ_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter a number");
            int num = sc.nextInt();
            
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        } while (true);

        sc.close();
    }
}
