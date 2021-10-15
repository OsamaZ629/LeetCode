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
        if (head == null || head.next == null) return head;
        ListNode tmp = head.next;
        ListNode s = reverseListRecur(tmp, head);
        head.next = null;
        return s;
    }
    public ListNode reverseListRecur(ListNode current, ListNode prev) {
        if (current == null) return current;
        ListNode tmp = current.next;
        current.next = prev;
        if (tmp == null) return current;
        return reverseListRecur(tmp, current);
    }
}
