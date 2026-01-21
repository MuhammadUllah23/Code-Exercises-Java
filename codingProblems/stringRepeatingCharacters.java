package codingProblems;

import java.util.HashSet;
import java.util.Set;

public class stringRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(repeatingCharacters("abcabcbb")); // 3
        System.out.println(repeatingCharacters("bbbbb")); // 1
        System.out.println(repeatingCharacters("pwwkew")); // 3
        System.out.println(repeatingCharacters("")); // 0
        System.out.println(repeatingCharacters("a")); // 1
        System.out.println(repeatingCharacters("aA")); // 2
        System.out.println(repeatingCharacters("a b!c a")); // 5
        System.out.println(repeatingCharacters("abba")); // 2
        System.out.println(repeatingCharacters("dvdf")); // 3
    }

    public static Integer repeatingCharacters(String s) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        int left = 0;
        int right = 0;

        while(right < s.length() && left < s.length()) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                result = Math.max(result, right - left);
            }
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return result;
    }

}
