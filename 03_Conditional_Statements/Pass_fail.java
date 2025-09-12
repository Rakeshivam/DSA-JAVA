import java.util.Scanner;

public class Pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        // if (marks>=33) {
        // System.out.println("Passed");
        // } else {
        // System.out.println("Failed");
        // }

        String staus = ((marks >= 33) ? "Passed" : "Failed"); // Using Ternary operator
        System.out.println(staus);
        sc.close();
    }
}
