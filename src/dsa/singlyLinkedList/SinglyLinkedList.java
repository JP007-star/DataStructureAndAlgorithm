package dsa.singlyLinkedList;


import java.util.List;

public class SinglyLinkedList {
    private ListNode headNode;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode (int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();

        // initialization of linkedList
        singlyLinkedList.headNode=new ListNode(10);
        ListNode second=new ListNode(8);
        ListNode third=new ListNode(7);
        ListNode fourth=new ListNode(3);

        // Linking of linkedList
        singlyLinkedList.headNode.next=second; // 10 -> 8
        second.next=third; // 10 -> 8 -> 7
        third.next=fourth; // 10 -> 8 -> 7 -> 3

        singlyLinkedList.insertFirstNode(6);
        singlyLinkedList.insertLastNode(6);
        singlyLinkedList.insertAtPos(2,9);
        singlyLinkedList.firstDelete();

        singlyLinkedList.lastNode();
        // printing List Node
        singlyLinkedList.printListNode();

        System.out.println();
        // finding the length of List Node
        System.out.println("The Length of List Node :"+singlyLinkedList.findLength());
    }


    public void printListNode(){
        ListNode current=headNode;
        while(current!=null){
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public int findLength(){
        if(headNode==null){
            return 0;
        }
        int count=0;
        ListNode current=headNode;
        while (current!=null){
            current=current.next;
            count++;
        }
      return count;
    }

    public void insertFirstNode(int data){
        ListNode newNode=new ListNode(data);
        newNode.next=headNode;
        headNode=newNode;
    }

    public void insertLastNode(int data){
        ListNode newNode=new ListNode(data);
        if(headNode==null){
            headNode=newNode;
            return;
        }
        ListNode current=headNode;
        while (current.next  !=null){
           current=current.next;
        }
        current.next=newNode;

    }


    public void insertAtPos(int position,int value){
        ListNode node=new ListNode(value);
        if(position==1){
            node.next=headNode;
            headNode=node;
        }
        else {
            ListNode previous=headNode;
            int count=0;
            while(count!=position-1){
               previous=previous.next;
               count ++;
            }
            ListNode current=previous.next;    // storing last half
            previous.next=node;    // after first half points to new Node
            node.next=current;     // after new node points to last half

        }


    }

    public ListNode firstDelete(){
        if(headNode==null)
            return null;

        ListNode temp=headNode;
        headNode=headNode.next;    // removing first node
        temp.next=null  ;
        return temp;
    }

    public ListNode lastNode(){
        if(headNode==null|| headNode.next==null){
            return headNode;
        }
        ListNode current=headNode;
        ListNode previous=null;
        while (current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
}
