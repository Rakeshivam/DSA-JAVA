public class Binomial_coefficient {

    public static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int Binomial_coefficient = fact_n / (fact_r * fact_nmr);
        return Binomial_coefficient;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 02));
    }
}