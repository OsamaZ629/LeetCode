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
        ListNode first = head, second = head;
        int counter = 1;
        while (second.next != null) {
            second = second.next;
            if (counter > n) {
                first = first.next;
            }
            counter++;
        }
        if (counter - n == 0) return head.next;
        if (counter < n){
            while (first.next != second) first = first.next;
            first.next = null;
            return head;
        }
        first.next = first.next.next;
        return head;
    }
}
