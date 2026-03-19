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
    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null){
            return true;
        }

        //middle of the list
        ListNode slow= head;
        ListNode fast= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse the right half of the list
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }

        //compare both the halves
        ListNode dummy=head;
        while(prev!=null){
            if(dummy.val!=prev.val) return false;
            dummy=dummy.next;
            prev=prev.next;
        }
        return true;
    }
}