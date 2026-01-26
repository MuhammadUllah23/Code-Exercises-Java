package codingProblems;

import java.util.HashMap;

public class topKFrequent {
    public static void main(String[] args) {
        System.out.println(topKFrequentSolution(new int[]{1,2,2,3,3,3}, 2));
        System.out.println(topKFrequentSolution(new int[]{7,7}, 1));
    }

    public static int[] topKFrequentSolution(int[] nums, int k) {
        int[] numbers = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]+1));
        }

        return numbers;
    }
}
