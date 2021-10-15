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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        ListNode resHead = new ListNode();
        ListNode res = resHead;
        
        int i = 0, j = 0;
        while (i != -1 && j != -1){
            if (l1 == null) {
                i = -1;
                break;
            }
            if (l2 == null){
                j = -1;
                break;
            }
            if (l1.val < l2.val){
                res.val = l1.val;
                l1 = l1.next;
            }else{
                res.val = l2.val;
                l2 = l2.next;  
            }
            res.next = new ListNode();
            res = res.next;
        }
        while (i != -1){
            res.val = l1.val;
            if (l1.next == null){
                res.next = null;
                break;
            }
            l1 = l1.next;
            res.next = new ListNode();
            res = res.next;
        }
        while (j != -1){
            res.val = l2.val;
            if (l2.next == null){
                res.next = null;
                break;
            }
            l2 = l2.next;  
            res.next = new ListNode();
            res = res.next;
        }
        return resHead;
    }
}
