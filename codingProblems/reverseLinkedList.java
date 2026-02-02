package codingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import codingProblems.CustomDataStructures.ListNode;


public class reverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        System.out.println(head);

    }

    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        Stack<ListNode> stack = new Stack<>();
        while(head != null) {
            stack.add(head);
            head = head.next; 
        }

        while(!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = null;  
            current.next = node;
            current = current.next;
        }

        return result.next;
    }
}
