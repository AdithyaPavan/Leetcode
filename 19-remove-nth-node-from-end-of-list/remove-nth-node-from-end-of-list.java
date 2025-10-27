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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(n==len)return head.next;
        int pos=len-n;
        int val=0;
        ListNode temp2=head;
        while(pos>1){
            temp2=temp2.next;
            pos--;
        }
        temp2.next=temp2.next.next;
        return head;

    }
}