/*Enter cost of 3 items from the user (using float data type)- 
a pencil, a pen and an eraser. You have to output the total cost of the items back
 to the user as their bill.(Add on : You can also try adding 18% gst tax to the items
 in the bill as an advanced problem) */

import java.util.*;

public class PS_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of pencil");
        float pencil_price = sc.nextFloat();

        System.out.println("Enter the price of pen");
        float pen_price = sc.nextFloat();

        System.out.println("Enter the price of eraser");
        float eraser_price = sc.nextFloat();

        float total_cost = (pencil_price + pen_price + eraser_price);

        float tc_gst = total_cost + (total_cost*18/100);

        System.out.println("Total cos is : " + total_cost);
        System.out.println("Total cost with gst is : " + tc_gst);

        sc.close();


    }
}
