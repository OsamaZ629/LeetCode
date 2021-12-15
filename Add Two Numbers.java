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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resHead = new ListNode();
        ListNode res = resHead;
        boolean carret = false;
        int total;
        while(true){
            if (l1 != null && l2 != null){
                total = l1.val + l2.val;
                if (carret) total ++;
                res.next = new ListNode(total % 10);
                res = res.next;
                l1 = l1.next;
                l2 = l2.next;
                carret = total > 9;
                
            }else if (l1 == null && l2 == null){
                if (carret) res.next = new ListNode(1);
                break;
            }
            else if (l1 == null){
                total = l2.val;
                if (carret) total++;
                res.next = new ListNode(total % 10);
                res = res.next;
                l2 = l2.next;
                carret = total > 9;
                
            }else if (l2 == null){
                total = l1.val;
                if (carret) total++;
                res.next = new ListNode(total % 10);
                res = res.next;
                l1 = l1.next;
                carret = total > 9;
            }
        }
        return resHead.next;
    }
}
