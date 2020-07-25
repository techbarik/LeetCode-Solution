/*
  Contributed by: Md. A. Barik
  Video Explanation: https://youtu.be/pfg3fM12mdo
*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p1 != p2) {
            if (p2 == null || p2.next == null) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return true;
    }
}
