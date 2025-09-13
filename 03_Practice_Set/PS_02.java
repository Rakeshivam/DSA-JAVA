import java.util.Scanner;

public class PS_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your body temperature");
        double temp = sc.nextDouble();

        if (temp >= 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You dont have a fever");
        }
        sc.close();
    }
}
