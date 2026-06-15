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
        if(head == null || head.next == null && n == 1)
          return null;

        int pos = 0, c = 0;
        ListNode temp = head;

        while(temp != null){
            c++;
            temp = temp.next;
        }
        pos = c - n + 1;
        if(pos == 1){
            head = head.next;
         return head;
        }

        temp = head;
        c = 0;
        while(temp != null){
            c++;
          if(c+1 == pos)
            temp.next = (temp.next).next;
          temp = temp.next;
        }
        return head;
    }
}