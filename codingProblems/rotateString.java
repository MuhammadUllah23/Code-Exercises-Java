package codingProblems;

import java.util.List;

public class rotateString {
    public static void main(String[] args) {
        System.out.println(rotateStringSolution("abcde","cdeab"));
        System.out.println(rotateStringSolution("abcde", "abced"));
        System.out.println(rotateStringSolution("defdefdefabcabc", "defdefabcabcdef"));
    }

    public static boolean rotateStringSolution(String s, String goal) {
        if (s.length() != goal.length() ) return false;

        return (s+s).contains(goal);
    }
}
