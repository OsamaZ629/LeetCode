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
        ListNode current = head;
        int nodes = 1;
        while((current=current.next) != null){
            nodes += 1;
        }

        current = head;
        nodes /= 2;
        while(nodes > 0){
            current = current.next;
            nodes--;
        }
        return current;
    }
}
