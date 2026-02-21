package codingProblems.TwoPointers;

public class twoSumPointers {
    public static void main (String[] args) { 
        // Basic Case
        System.out.println(twoSumPointersSolution(new int[]{2,7,11,15}, 9));
        // Negative Numbers
        System.out.println(twoSumPointersSolution(new int[]{-3,4,3,90}, 0));
        // Duplicate Values
        System.out.println(twoSumPointersSolution(new int[]{3,3}, 6));
        // Larger Array
        System.out.println(twoSumPointersSolution(new int[]{1,5,7,2,8}, 7));
        // Mixed Positive Negative Numbers
        System.out.println(twoSumPointersSolution(new int[]{0,4,3,0}, 0));
    }

    public static int[] twoSumPointersSolution(int[] numbers, int target) {
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
