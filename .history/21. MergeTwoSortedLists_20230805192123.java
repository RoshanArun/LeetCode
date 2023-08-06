// Definition for singly-linked list.

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode ans = temp;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                ans.next = list1;
                list1 = list1.next;
            } else {
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }

        if (list1 != null) {
            ans.next = list1;
        }
        if (list2 != null) {
            ans.next = list2;
        }

        return temp.next;
    }
}

// public class ListNode {
// int val;
// ListNode next;

// ListNode(int val) {
// this.val = val;
// }

// ListNode(int val, ListNode next) {
// this.val = val;
// this.next = next;
// }
// }