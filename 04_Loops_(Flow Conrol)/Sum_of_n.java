import java.util.Scanner;

public class Sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int sum = 0;;
        // int i = 1;

        // while (i<=n) {
        //     sum = sum+i;
        //     i++;
        // }
        // System.out.println("Sum of 1 to " +n+ " is "+ sum);

        for(int i=1; i<=n; i++) {
            sum +=i;
        }

        System.out.println("Sum of 1 to " +n+ " is "+ sum);

            sc.close();
    }
}
