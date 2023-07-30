/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sentry = new ListNode(0);
        ListNode cur = sentry;
        while (null != list1 && null != list2) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
                cur.next.next = null;
            } else {
                cur.next = list2;
                list2 = list2.next;
                cur.next.next = null;
            }
            cur = cur.next;
        }

        if (null != list1) {
            cur.next = list1;
        }

        if (null != list2) {
            cur.next = list2;
        }

        return sentry.next;
    }
}