package codingProblems;

public class trappingRainWater {
    public static void main (String[] args) { 
        System.out.println(trapSolution(new int[]{0,2,0,3,1,0,1,3,2,1}));
        System.out.println(trapSolution(new int[]{2,2,2}));
    }

    public static int trapSolution(int[] height) {
        int res = 0;
        if( height == null || height.length == 0) {
            return 0;
        }
        
        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];

        while(l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }


        return res;
    }

}
