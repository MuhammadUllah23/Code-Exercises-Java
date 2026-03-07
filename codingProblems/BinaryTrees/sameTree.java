package codingProblems.BinaryTrees;

import codingProblems.ArrayAndHashing.TreeNode;

public class sameTree {

    public static void main(String[] args) {
    }
    

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
