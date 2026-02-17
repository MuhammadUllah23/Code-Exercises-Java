package codingProblems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequent {
    public static void main(String[] args) {
        System.out.println(topKFrequentSolution(new int[]{1,2,2, 4, 4, 4, 4, 3,3,3}, 2));
        System.out.println(topKFrequentSolution(new int[]{7,7}, 1));
    }

    public static int[] topKFrequentSolution(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            heap.offer(e);
            if (heap.size() > k) heap.poll(); 
        }

        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) {   
            res[i] = heap.poll().getKey();
        }
        return res;
    }
}
