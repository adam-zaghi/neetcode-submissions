/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
      

        ListNode slow=head;
        ListNode fast=head.next;
        //split the linked list 
        while(fast!=null){
            if(fast.next==null){
                break;
            }
            slow=slow.next;

            fast=fast.next.next;

        }
        //reverse linked list iteratively
        ListNode p=null;
        ListNode c=slow.next;
        slow.next=null;
        while(c!=null){
            ListNode nxt=c.next;
            c.next=p;
            p=c;
            c=nxt;
        }
        //p=new head

        //merging
        ListNode current= new ListNode();

        while(head!=null || p!=null){
            
            if(p == null){
                current.next=head;
                break;
            }
            ListNode t1=head.next;
            ListNode t2=p.next;
            

            current.next=head;
            current.next.next=p;

            current=p;
            head=t1;
            p=t2;
           
        }


    }
}
