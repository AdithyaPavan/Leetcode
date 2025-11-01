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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        ListNode dup=new ListNode();
        dup.next=head;
        ListNode prev=dup,curr=head;
        while(curr!=null){
            if(s.contains(curr.val)){
                prev.next=curr.next;
            }else prev=curr;
            curr=curr.next;
        }
        return dup.next;
    }
}