/* In a program, input 3 numbers : 
A, B and C. You have to output the average of these 3 numbers */

import java.util.*;

public class PS_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        float a = sc.nextFloat();

        System.out.println("Enter the second number :");
        float b = sc.nextFloat();

        System.out.println("Enter the third number :");
        float c = sc.nextFloat();

        float avg = (a+b+c)*1/3;
        System.out.println("Average of the numbers is :"+avg);

        sc.close();


        
    }
}