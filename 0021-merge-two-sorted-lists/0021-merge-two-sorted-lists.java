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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
        return null;
        else if(list1 == null)
         return list2;
        else if(list2 == null)
         return list1;

      ListNode mlist = new ListNode();
        ListNode head = mlist;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
           mlist.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
           mlist.next = new ListNode(list2.val);
                list2 = list2.next;
            }
        mlist = mlist.next;
        }
         if(list1 == null){
            while(list2 != null){
            mlist.next = new ListNode(list2.val);
            list2 = list2.next;
            mlist = mlist.next;
            }
         }

        if(list2 == null){
            while(list1 != null){
            mlist.next = new ListNode(list1.val);
            list1 = list1.next;
            mlist = mlist.next;
            }
         }

        return head.next;
    }
}