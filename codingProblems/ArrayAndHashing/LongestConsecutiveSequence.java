package codingProblems.ArrayAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
        public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{2,20,4,10,3,4,5}));
        System.out.println(longestConsecutive(new int[]{0,3,2,5,4,6,1,1}));

    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int best = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while(set.contains(num + length)) {
                    length++;
                }
                best = Math.max(length, best);
            }
        }

        return best;
    }
}
