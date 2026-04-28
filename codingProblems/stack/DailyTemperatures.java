package  codingProblems.stack;

import java.util.ArrayDeque;
import java.util.Deque;


public class DailyTemperatures {
    public static void main(String[] args) {
        System.out.println(dailyTemps(new int[]{30,38,30,36,35,40,28}));
        System.out.println(dailyTemps(new int[]{22,21,20}));

    }

    public static int[] dailyTemps(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        // iterate through temperatures
        for (int i = 0; i < temperatures.length; i++) {
            // while temperature[i] > temperatures[stack.peek] then set result[stack.pop] = temperature[i] > temperatures[stack.peek]
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int j = stack.pop();
                result[j] = i - j;
            }
            // store indicie i to stack
            stack.push(i);
        }

        return result;
    }

}
