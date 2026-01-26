package codingProblems;

public class validPalindrome {
        public static void main (String[] args) { 
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("tab a cat"));

        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        System.out.println(isPalindrome("tab a cat"));
    }

    public static boolean isPalindrome(String s) {
        // First Step remove spaces and special characters from string
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Second Step Use two pointers to check letters on each end match. 
        // Third Step if letters do not match then return false fast
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        
        // once two pointers is finished then return true
        return true;
    }

    public static boolean isPalindrome2(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

}
