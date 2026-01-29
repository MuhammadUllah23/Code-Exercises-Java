package codingProblems;

public class maxArea {
    public static void main (String[] args) { 
        System.out.println(maxAreaSolution(new int[]{1,7,2,5,4,7,3,6}));
        System.out.println(maxAreaSolution(new int[]{2,2,2}));

        // System.out.println(maxAreaBadSolution(new int[]{1,7,2,5,4,7,3,6}));
        // System.out.println(maxAreaBadSolution(new int[]{2,2,2}));
    }

    public static int maxAreaSolution(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int max = 0;

        while (i < j) {
            int xAxis = j - i;
            int yAxis = heights[i] <= heights[j] ? heights[i] : heights[j];
            int area = xAxis * yAxis;

            max = Math.max(max, area);

            if(heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            } 
        }

        return max;
    }

    public static int maxAreaBadSolution(int[] heights) {

        int max = 0;

        for(int i = 0; i < heights.length - 1; i++) {
            for(int j = i+1; j < heights.length; j++) {
                int xAxis = j - i;
                int yAxis = heights[i] <= heights[j] ? heights[i] : heights[j];
                int area = xAxis * yAxis;

                max = Math.max(max, area);

            }
        }

        return max;
    }
}
