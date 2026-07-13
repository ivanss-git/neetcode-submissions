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

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // Fixed: must move 2 steps
        }
        
        ListNode secondHalf = slow.next;
        slow.next = null; // cut
        ListNode prev = null;

        while (secondHalf != null) {
            ListNode next = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = next;
        }

        secondHalf = prev;
        ListNode firstHalf = head; // prev is the head of the reversed half

        while (secondHalf != null) {
            ListNode tmp1 = firstHalf.next;
            ListNode tmp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = tmp1;

            firstHalf = tmp1;
            secondHalf = tmp2;
        }  
    }
}
