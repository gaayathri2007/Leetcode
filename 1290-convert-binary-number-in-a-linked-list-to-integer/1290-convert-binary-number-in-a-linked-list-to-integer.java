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
    public int getDecimalValue(ListNode head) {
        int[] a = new int[30];
        int  i = 0;

        ListNode temp = head;
        while(temp != null){
           a[i] = temp.val;
           i++;
        temp = temp.next;
        }
        int s = 0;
        int n = i-1;
        i = 0;
        for(int j=n; j>=0; j--)
        {
            s += a[j] * Math.pow(2,i);
            i++;
        }
        return s;
    }
}