// Floyd's triangle

public class Floyds_triangle {

    public static void floydsTriangle(int n) {
        int count = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop - how many times will counter be printed
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydsTriangle(5);
    }
}
