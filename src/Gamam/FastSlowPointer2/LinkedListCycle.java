package Gamam.FastSlowPointer2;


public class LinkedListCycle {
    public static void main(String[] args) {
        // Creating a linked list with a cycle for demonstration
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head)); // Output: true
    }

    private static boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return  true;
            }
        }
        return false;
    }
}

/*
https://leetcode.com/problems/linked-list-cycle/

Steps to Solve the Problem
1) Use Two Pointers: Initialize two pointers, slow and fast. Both start at the head of the linked list.
2) Move Pointers at Different Speeds: Move slow pointer one step at a time and fast pointer two steps at a time.
3) Check for Cycle: If there is a cycle, the fast pointer will eventually meet the slow pointer. If fast reaches the end of the list (null), then there is no cycle.
 */
