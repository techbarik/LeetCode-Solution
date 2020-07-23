/*
  Contributed by: Md. A. Barik
  Video explanation: https://youtu.be/buydNBNmg88
*/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(0);
        ListNode head = newList;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 == null && l2 != null) {
            head.next = l2;
        }
        if (l2 == null && l1 != null) {
            head.next = l1;
        }
        return newList.next;
    }
}
