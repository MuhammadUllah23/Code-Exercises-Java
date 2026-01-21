package codingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
        public static void main (String[] args) { 
        // Basic Case
        System.out.println(threeSumSolution(List.of(2,7,11,15)));
        // Negative Numbers
        System.out.println(threeSumSolution(List.of(-3,4,3,90)));
        // Duplicate Values
        System.out.println(threeSumSolution(List.of(3,3)));
        // Larger Array
        System.out.println(threeSumSolution(List.of(1,5,7,2,8)));
        // Mixed Positive Negative Numbers
        System.out.println(threeSumSolution(List.of(0,4,3,0)));
    }
    
    public static List<List<Integer>> threeSumSolution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if(nums.length < 3) return result;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++) {
            if(nums[i] > 0) break;

            // Skip duplicates
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // if sum is 0 then add to result and shift left/right
                // if sum is greater than 0 then shift left
                // if sum is less than 0 than shift right

                if(sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // skip duplicates
                    if(left < right && nums[left] == nums[left+1]) left++;
                    if(left < right && nums[right] == nums[right-1]) right--; 

                } else if(sum > 0) {
                    left++;
                } else if(sum < 0) {
                    right--;
                }

            }
        }
        return result;
    }
}
