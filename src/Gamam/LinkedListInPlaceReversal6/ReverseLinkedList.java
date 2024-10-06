package Gamam.LinkedListInPlaceReversal6;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Reverse the linked list
        ListNode reversedHead = reverseList(head);

        // Print the reversed list
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        // Output: 5 4 3 2 1
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;


        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }


        return  prev;
    }
}
