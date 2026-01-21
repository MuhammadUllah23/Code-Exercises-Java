package codingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import codingProblems.CustomDataStructures.TreeNode;


public class inOrderTraversal {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /* 
    Given the root of a binary tree, return the inorder traversal of its nodes' values.
    
    Example 1:
    Input: root = [1,null,2,3]
    Output: [1,3,2]

    Example 2:
    Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
    Output: [4,2,6,5,7,1,3,9,8]
    */
    public List<Integer> inorderTraversalSolution(TreeNode root) {
        // 3 variables. Result, Current, Stack;
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        while(current != null || !stack.isEmpty()) {
            // go all the way to the left and add each node to stack on top
            while(current != null) {
                stack.add(current);
                current = current.left; 
            }

            // once all the way to the left; pop nodes out of stack and set to current 
            // Add current to result.
            current = stack.pop();
            result.add(current.val);

            // set Current to the right node whether its null to keep moving to the left
            current = current.right;
        }

        return result;
    }
}
