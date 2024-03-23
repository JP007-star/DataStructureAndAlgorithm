package dsa.singlyLinkedList;


import java.util.List;

public class SinglyLinkedList {
    private ListNode headNode;

    private static class ListNode {
        private int data;
        private ListNode tailNode;

        public ListNode (int data) {
            this.data = data;
            this.tailNode = null;
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
        singlyLinkedList.headNode.tailNode=second; // 10 -> 8
        second.tailNode=third; // 10 -> 8 -> 7
        third.tailNode=fourth; // 10 -> 8 -> 7 -> 3

        singlyLinkedList.insertFirstNode(6);
        singlyLinkedList.insertLastNode(6);

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
            current=current.tailNode;
        }
        System.out.print("null");

    }

    public int findLength(){
        if(headNode==null){
            return 0;
        }
        int count=0;
        ListNode current=headNode;
        while (current!=null){
            current=current.tailNode;
            count++;
        }
      return count;
    }

    public void insertFirstNode(int data){
        ListNode newNode=new ListNode(data);
        newNode.tailNode=headNode;
        headNode=newNode;
    }

    public void insertLastNode(int data){
        ListNode newNode=new ListNode(data);
        if(headNode==null){
            headNode=newNode;
            return;
        }
        ListNode current=headNode;
        while (current.tailNode!=null){
           current=current.tailNode;
        }
        current.tailNode=newNode;

    }
}
