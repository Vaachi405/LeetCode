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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {
            // detect duplicates
            if (head.next != null && head.val == head.next.val) {
                int dupVal = head.val;

                // skip all nodes with dupVal
                while (head != null && head.val == dupVal) {
                    head = head.next;
                }

                prev.next = head; // remove all duplicates
            } else {
                prev = prev.next; // move prev only if unique
                head = head.next;
            }
        }

        return dummy.next;
    }
}