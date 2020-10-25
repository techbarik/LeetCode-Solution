public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        // First round: make copy of each node,
        // and link them together side-by-side in a single list.
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = new Node(cur.val, next, null);
            cur = next;
        }
        
        // Second round: assign random pointers for the copy nodes.
        cur = head;
        while (cur != null) {
            if (cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        
        // Third round: restore the original list, and extract the copy list.
        cur = head;
        Node copyHead = head.next;
        while (cur != null) {
            Node next = cur.next.next;
            
            // extract the copy
            Node copy = cur.next;
            cur.next = next;
            
            // restore the original list
            if (next != null)
                copy.next = next.next;
            cur = next;
        }
        return copyHead;
    }
}
