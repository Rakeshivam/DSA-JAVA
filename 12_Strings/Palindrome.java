//! Check if a String is a Palindrome

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // Not a Palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";

        System.out.println(isPalindrome(str));
    }
}
