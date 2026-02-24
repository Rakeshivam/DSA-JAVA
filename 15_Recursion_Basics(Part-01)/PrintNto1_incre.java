public class PrintNto1_incre {

    public static void printIncre(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        printIncre(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int a = 10;
        printIncre(a);
    }
}
