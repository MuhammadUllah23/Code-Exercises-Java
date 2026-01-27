package codingProblems;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindromeSolution("babad"));
        System.out.println(longestPalindromeSolution("cbbd"));
        System.out.println(longestPalindromeSolution("b"));
        System.out.println(longestPalindromeSolution("bb"));
        System.out.println(longestPalindromeSolution("ac"));

    }

    public static String longestPalindromeSolution(String s) {
        if(s.length() <= 1 || s.isBlank()) return s;
        String palindrome = "";
        for (int i = 0; i < s.length(); i++) {
            int right = i;
            while(right <= s.length()) {
                String str = s.substring(i, right);
                String reversed = new StringBuilder(str).reverse().toString();
                // System.out.println(str);
                if (str.equals(reversed)) {
                    palindrome = str.length() > palindrome.length() ? str : palindrome;
                }
                right++;
            }
        }
        return palindrome;
    }    
}
