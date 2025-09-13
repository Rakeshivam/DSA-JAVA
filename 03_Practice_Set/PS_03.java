/*  Write a Java program to input week number (1-7) and print 
 day of week name using switch case.*/

import java.util.Scanner;


public class PS_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter your day number (1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");            
                break;
            default:
                System.out.println("Enter tha correct weekday number");
                break;
        }
        sc.close();
    }
}
