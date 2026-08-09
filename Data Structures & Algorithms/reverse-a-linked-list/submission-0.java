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
    public ListNode reverseList(ListNode head) {
        if(head==null ){
            return head;
        }
        if(head.next==null ){
            return head;
        }

        recursion(head,head.next);
        head.next=null;
        return res;
    }
    ListNode res=new ListNode();

    public void recursion(ListNode prevNode,ListNode current){
        if(current.next!=null){
            recursion(current,current.next);
        }else{
            res=current;
        }
        current.next=prevNode;
    }
}

