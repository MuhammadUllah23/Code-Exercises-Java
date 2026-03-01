package codingProblems.ArrayAndHashing;


public class productExceptSelf {

    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 4, 6};
        int[] second = new int[]{-1, 0, 1, 2, 3};


        System.out.println(first);
        System.out.println(second);
    }

    public static int[] solution(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0;

        while (i < nums.length) {
            int left = i - 1;
            int right = i + 1;
            int product = 1;

            while (left >= 0) {
                product = product * nums[left];
                left--;
            }

            while (right < nums.length) {
                product = product * nums[right];
                right++; 
            }
            ans[i] = product;
            i++;
        }
        return ans;
    }
    
}
