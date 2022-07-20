package problems;

public class MergeSortedLinkedList {
    public static void main(String[] args) {

    }

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode dummy=new ListNode(0);
            ListNode tail=dummy;
            while(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    tail.next=list1;
                    list1=list1.next;
                }
                else{
                    tail.next=list2;
                    list2=list2.next;
                }
                tail=tail.next;
            }
            if(list1==null){
                tail.next=list2;
            }
            else tail.next=list1;
            return dummy.next;
        }
    }
}

/*
https://www.youtube.com/watch?v=IMWiPqoneT4&list=PL6Zs6LgrJj3v9gBrV7xwiMod-EA3nMjWl&index=3

https://leetcode.com/problems/merge-two-sorted-lists/submissions/
 */
