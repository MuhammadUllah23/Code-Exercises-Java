package codingProblems.BinaryTrees;

import codingProblems.ArrayAndHashing.TreeNode;

public class HasPathSum {
    public static void main(String[] args) {
    }
    

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        return hasPathSum(root.left, targetSum - root.val) ||
            hasPathSum(root.right, targetSum - root.val);
    }
}
