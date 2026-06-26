/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode t = head;
        ListNode h = head;

        do{
           if(t.next == null || h.next == null || h.next.next == null) return false;
           t = t.next;
           h = h.next.next;
        }while(t != h);
        return true;
    }
}