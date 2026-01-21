package codingProblems;

import java.util.HashSet;
import java.util.Set;

public class hasDuplicate {
    public static void main(String[] args) {
 
    }

    public static Boolean hasDuplicateSolution(int[] nums) {
        if(nums.length <= 1) return false;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
        
    }
}
