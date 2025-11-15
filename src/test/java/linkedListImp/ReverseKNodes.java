package linkedListImp;

public class ReverseKNodes {

    public static ListNode reverseKNodes(ListNode head,int k){
        if(head == null || k==1) return head;
        int count=0;
        ListNode node= head;
        while(node!=null && count<k){
            node=node.next;
            count++;
        }
        if(count<k)return head;
        ListNode prev=null,curr=head,next;
        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next=prev;
            prev= curr;
            curr=next;
        }
        head.next = reverseKNodes(curr,k);
        return  prev;
    }
}
