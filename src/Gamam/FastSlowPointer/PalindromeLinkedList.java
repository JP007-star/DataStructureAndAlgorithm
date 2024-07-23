package Gamam.FastSlowPointer;


public class PalindromeLinkedList {


    public static void main(String[] args) {
        ListNode listNode=new ListNode(4);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(4);
        listNode.next.next.next=new ListNode(6);
        printListNode(listNode);
        printListNode(reverseListNode(listNode));
        System.out.println(isPalindrome(listNode));


    }

    public static boolean isPalindrome(ListNode head){
        if(head==null|| head.next==null){
            return  true;
        }

        ListNode slow=head;
        ListNode fast=head;

        // Step 1: Find the middle of the linked list
        while (fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf=reverseListNode(slow);

        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalf=head;
        ListNode secondHalfTemp=secondHalf;

        while (secondHalf!=null){
            if(firstHalf.val!=secondHalf.val){
                reverseListNode(secondHalfTemp);
                return false;
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }

        reverseListNode(secondHalfTemp);
        return true;
    }



    public static void printListNode(ListNode listNode){
        ListNode current=listNode;
        while(current!=null){
            System.out.print(current.val+" -->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public static ListNode reverseListNode(ListNode listNode){
        ListNode current=listNode;
        ListNode previous=null;
        ListNode next=null;

        while (current!=null){
            next=current.next;       // pointing current.next to next
            current.next=previous;
            previous=current;
            current=next;

        }

        return previous;
    }
}

/*
https://leetcode.com/problems/palindrome-linked-list
 */
