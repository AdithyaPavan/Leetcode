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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];

        ListNode temp = head;
        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        int ele;
        int i = 0;


        temp = head;
        while(temp !=null){
            ele = (int)Math.ceil((double)len/k);
            res[i++] = temp;
            for(int j=0;j<ele-1;j++){
                if(temp != null){
                temp = temp.next;}
            }
            ListNode next = null;
            if(temp != null){
                next = temp.next;
            }

            if(temp != null)temp.next = null;
            
            temp = next;

            k--;
            len = len-ele;
            
                
        }


        return res;
    }
}