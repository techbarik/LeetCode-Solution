/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/BMfqGJTcoms
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode nextNode = head.next;
            head.next = null;
            ListNode rest = reverseList(nextNode);
            nextNode.next = head;
            return rest;
        }
    }
}
