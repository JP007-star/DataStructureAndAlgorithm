/*
 * @project DataStructureAndAlgorithm
 * @fileName SinglyLinkedList
 * @author Jaya Prasad.M --> jaya_muthukrishnan
 * @email jaya_muthukrishnan@thbs.com
 * @date 28 11 2021 04:56 PM
 */

public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
       private int data;
       private ListNode next=null;

        public ListNode(int data) {
            this.data = data;
        }

    }
    public void display(){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
        singlyLinkedList.head=new ListNode(10);
        ListNode second=new ListNode(8);
        ListNode third=new ListNode(1);
        ListNode forth=new ListNode(11);

        singlyLinkedList.head.next=second; // 10 -->8
        second.next=third;  //10 -->8 --> 1
        third.next=forth;   //10 -->8 -->1 -->11 --> null
        singlyLinkedList.display();
        System.out.println(singlyLinkedList.length());
    }

}
