package codingProblems;

import java.util.HashMap;
import java.util.List;

public class anagramCheck {
    
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<String, Integer> freq1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            String str = String.valueOf(c);
            if(freq1.containsKey(str)) {
                freq1.put(str, freq1.get(str) + 1);
            } else {
                freq1.put(str, 1);
            }
        }
        
        for (char c : t.toCharArray()) {
            String str = String.valueOf(c);
            if(freq1.containsKey(str)) {
                freq1.put(str, freq1.get(str) - 1);
            } else {
                return false;
            } 
        }

        return freq1.values().stream().allMatch(v -> v == 0);
    }
}
