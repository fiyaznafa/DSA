package linkedListImp;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head){
        ListNode rev = null,temp = null;
        while(head!=null){
            temp=head.next;
            head.next=rev;
            rev=head;
            head=temp;
        }
        return rev;
    }
}
