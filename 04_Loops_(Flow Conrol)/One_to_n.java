import java.util.Scanner;

public class One_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        int count = 1;

        while (count<=n) {
            System.out.println(count);
            count++;
        }
        System.out.println("1 to "+ n +" are Printed");
        sc.close();
    }
}
