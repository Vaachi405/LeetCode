/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode two= headB;

        // while(headA!=null){
        //     while(headB!=null ){
        //         if(headA==headB){
        //             return headA;
        //         }
        //         headB= headB.next;
        //     }
        //     headB=two;
        //     headA= headA.next;
        // }
        // return null;

        if(headA==null || headB==null ) return null;

        ListNode pA= headA;
        ListNode pB= headB;

        while(pA!=pB){
            pA = (pA==null) ? headB : pA.next;
            pB = (pB==null) ? headA : pB.next;
        }
        return pA;
    }
}