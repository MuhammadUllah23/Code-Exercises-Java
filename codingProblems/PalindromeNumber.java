package codingProblems;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));

    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }

    public boolean isPalindrome2(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        // Even length: x == rev
        // Odd length: x == rev / 10 (discard middle digit)
        return x == rev || x == rev / 10;
    }
}
