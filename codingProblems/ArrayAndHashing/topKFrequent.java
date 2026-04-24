package codingProblems.ArrayAndHashing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequent {
    public static void main(String[] args) {
        System.out.println(topKFrequentSolution(new int[]{1,2,2, 4, 4, 4, 4, 3,3,3}, 2));
        // System.out.println(topKFrequentSolution(new int[]{7,7}, 1));
    }

    public static int[] topKFrequentSolution(int[] nums, int k) {
        // insert into hashmap value as key and its frequency in the array.
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // create new priority queue with comparing value of of map::getValue
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        // iterate through map
        for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {

            // add entry to priority queue
            queue.add(entry);

            // if queue size > k then poll
            if(queue.size() > k) {
                queue.poll();
            }
        }

        // put values from queue to array
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {   
            res[i] = queue.poll().getKey();
        }
        return res;
    }

}
