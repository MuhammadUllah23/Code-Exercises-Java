package codingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class fizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzzSolution(3));
        System.out.println(fizzBuzzSolution(5));
        System.out.println(fizzBuzzSolution(15));
    }

    public static List<String> fizzBuzzSolution(int n) {
        List<String> answer = new ArrayList<>();

        IntStream.range(1, n+1).forEach(i -> {
            boolean threeDiv = i % 3 == 0;
            boolean fiveDiv = i % 5 == 0;

            if(threeDiv && fiveDiv) {
                answer.add("FizzBuzz");
            } else if(threeDiv) {
                answer.add("Fizz");
            } else if (fiveDiv) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        });

        for (int i = 1; i <= n; i++) {
            boolean threeDiv = i % 3 == 0;
            boolean fiveDiv = i % 5 == 0;

            if(threeDiv && fiveDiv) {
                answer.add("FizzBuzz");
            } else if(threeDiv) {
                answer.add("Fizz");
            } else if (fiveDiv) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }

}
