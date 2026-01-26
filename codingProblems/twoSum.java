package codingProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSum {
    public static void main (String[] args) { 
        // Basic Case
        System.out.println(twoSumSolution(List.of(2,7,11,15), 9));
        // Negative Numbers
        System.out.println(twoSumSolution(List.of(-3,4,3,90), 0));
        // Duplicate Values
        System.out.println(twoSumSolution(List.of(3,3), 6));
        // Larger Array
        System.out.println(twoSumSolution(List.of(1,5,7,2,8), 7));
        // Mixed Positive Negative Numbers
        System.out.println(twoSumSolution(List.of(0,4,3,0), 0));

        System.out.println("twoSumPointers: ");
        // Basic Case
        System.out.println(twoSumPointers(new int[]{2,7,11,15}, 9));
        // Negative Numbers
        System.out.println(twoSumPointers(new int[]{-3,4,3,90}, 0));
        // Duplicate Values
        System.out.println(twoSumPointers(new int[]{3,3}, 6));
        // Larger Array
        System.out.println(twoSumPointers(new int[]{1,5,7,2,8}, 7));
        // Mixed Positive Negative Numbers
        System.out.println(twoSumPointers(new int[]{0,4,3,0}, 0));
    }

    public static List<Integer> twoSumSolution(List<Integer> nums, int target) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            int diff = target - nums.get(i);

            if (indexMap.containsKey(diff)) {
                result.add(indexMap.get(diff));
                result.add(i);
                return result;
            }

            indexMap.put(nums.get(i), i);
        }

        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public static int[] twoSumPointers(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[] {i, j};
            } else if(sum < target) {
                i++;
            } else if(sum > target) {
                j--;
            }
        }

        return new int[]{};
    }

}
