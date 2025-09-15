public class Function_overloading {

    // Function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Function to calculate sum of 2 float numbers
    public static float sum(float a, float b) {
        return a + b;
    }

    // Function to calculate sum of 2 double numbers
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
        System.out.println(sum(2, 6, 9));
        System.out.println(sum(6.5, 3.5));
    }
}
