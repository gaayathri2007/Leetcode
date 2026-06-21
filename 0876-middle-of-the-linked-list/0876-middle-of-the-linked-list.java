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
        if(head == null)
          return null;
        ListNode temp = head;
        int c = 0;
        while(temp != null){
            c++;
          temp = temp.next;
        }
        int mid = c/2;
        c = 0;
        temp = head;
        while(temp != null){
            c++;
          if(c == mid+1)
            return temp;
            temp = temp.next;
        }
        return head;
    }
}