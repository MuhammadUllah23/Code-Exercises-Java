package codingProblems.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CarFleet {
    
    public static void main(String[] args) {
        System.out.println(fleet(10, new int[]{1, 4}, new int[]{3, 2}));
        System.out.println(fleet(10, new int[]{4, 1, 0, 7}, new int[]{2, 2, 1, 1}));

    }

    public static int fleet(int target, int[] position, int[] speed) {

        int n = position.length;
        
        // pair positions with their times and sort by position descending
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Deque<Double> stack = new ArrayDeque<>();

        for (double[] car : cars) {
            double time = car[1];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
