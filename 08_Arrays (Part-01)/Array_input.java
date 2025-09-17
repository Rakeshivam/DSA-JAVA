// Array input output & update

import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt()

        marks[0] = sc.nextInt(); // Physics
        marks[1] = sc.nextInt(); // Chemistry
        marks[2] = sc.nextInt(); // Maths

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        // System.out.println("Length of array = "+marks.length);

        // marks[2] = 100;
        // marks[2] = marks[2]+5;
        // System.out.println("Maths updated : "+marks[2]);

        int percentage = (marks[0] + marks[1] + marks[1]) / 3;
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
