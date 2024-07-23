package Gamam.FastSlowPointer;

public class MiddleLinkedList {

    public static void main(String[] args) {
        // Creating a linked list for demonstration
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = findMiddle(head);
        System.out.println(middle.val); // Output: 3
    }

    public static ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null; // No middle if the list is empty
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // move slow pointer by 1 step
            fast = fast.next.next;   // move fast pointer by 2 steps
        }

        return slow; // slow is now pointing to the middle node
    }
}

/*
https://leetcode.com/problems/middle-of-the-linked-list

Initial Check:

If the head is null, return null because the list is empty and there is no middle node.
Initialize Pointers:

Both slow and fast pointers start at the head of the linked list.
Move Pointers:

slow moves one step at a time (slow = slow.next).
fast moves two steps at a time (fast = fast.next.next).
Determine Middle:

Continue moving the pointers until fast reaches the end of the list (fast == null or fast.next == null).
At this point, the slow pointer will be at the middle node of the list.
 */
