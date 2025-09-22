public class String_functions {
    public static void main(String[] args) {
        String s1 = "Rakesh";
        // String s2 = "Rakesh";
        String s3 = new String("Rakesh");

        // if (s1 == s2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are Not equal");
        // }

        // if (s1 == s3) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
