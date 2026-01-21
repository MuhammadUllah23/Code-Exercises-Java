package codingProblems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class positiveMeetingsMax {
        public static void main (String[] args) { 
        // Basic Case
        System.out.println(positiveMeetingsMaxSolution(new ArrayList(List.of(3))));
        // Negative Numbers
        System.out.println(positiveMeetingsMaxSolution(new ArrayList(List.of(-3,4,3,90))));
        // Duplicate Values
        System.out.println(positiveMeetingsMaxSolution(new ArrayList(List.of(3))));
        // Larger Array
        System.out.println(positiveMeetingsMaxSolution(new ArrayList(List.of(1,5,7,2,8))));
        // Mixed Positive Negative Numbers
        System.out.println(positiveMeetingsMaxSolution(new ArrayList(List.of(0,4,3,0))));
    }

    public static int positiveMeetingsMaxSolution(List<Integer> nums) {
        // create sum and Priority Queue variable
        int sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i < nums.size(); i++) {
            sum+=nums.get(i);
            queue.add(nums.get(i));

            if (sum <= 0) {
                int removed = queue.poll();
                sum -= removed;
            }
        }
        return queue.size();
    }

}
