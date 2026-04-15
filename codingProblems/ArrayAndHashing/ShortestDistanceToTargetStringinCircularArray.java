package codingProblems.ArrayAndHashing;

public class ShortestDistanceToTargetStringinCircularArray {
    
    public static void main(String[] args) {
        System.out.println(closestTarget(new String[]{"hello","i","am","leetcode","hello"}, "hello", 1)); // 1
        System.out.println(closestTarget(new String[]{"a","b","leetcode"}, "leetcode", 0)); // 1
        System.out.println(closestTarget(new String[]{"a","b","leetcode"}, "ate", 0)); // -1
        System.out.println(closestTarget(new String[]{"ibkgecmeyx","jsdkekkjsb","gdjgdtjtrs","jsdkekkjsb","jsdkekkjsb","jsdkekkjsb","gdjgdtjtrs","msjlfpawbx","pbgjhutcwb","gdjgdtjtrs"}, 
        "pbgjhutcwb", 0)); // 2
        System.out.println(closestTarget(new String[]{"fwyzdhjqwn","swgfvpxmky","miiylnccum","swgfvpxmky","odsiosadwj","pslegdboxh","odsiosadwj","pslegdboxh","odsiosadwj","bjnsofzsjg"}, 
        "cbjinsoapx", 9)); // -1
    }

    public static int closestTarget(String[] words, String target, int startIndex) {
        int left = startIndex;
        int leftCount = 0;
        while (!target.equals(words[left])) {
            leftCount++;
            left--;
            if (left < 0) {
                left = words.length - 1;
            } 
            if (left == startIndex) {
                return -1;
            }
        }

        int right = startIndex;
        int rightCount = 0;
        while (!target.equals(words[right])) {
            rightCount++;
            right++;
            if (right == words.length ) {
                right = 0;
            }
        }

        return Math.min(leftCount, rightCount);
    }
}
