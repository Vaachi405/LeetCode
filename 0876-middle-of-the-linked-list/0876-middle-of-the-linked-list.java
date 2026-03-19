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
    public ListNode middleNode(ListNode head) {
        // ListNode Fast = head;
        // ListNode Slow = head;

        // while(Fast !=null && Fast.next!= null){
        //     Slow = Slow.next;
        //     Fast = Fast.next.next;
        // }
        // return Slow;
        ListNode mid = head;
        int count=0;
        while(head !=null){
            if(count%2==1){
                mid= mid.next;
            }
            count++;
            head = head.next;
        }
        return mid;
    }
}