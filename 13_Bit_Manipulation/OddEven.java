// Check a number is odd or even

public class OddEven {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n&bitMask)==0) {
            // Even number
            System.out.println("Even number");
        } else { // odd number
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(11);
        oddOrEven(3);
        oddOrEven(14);
    }
}
