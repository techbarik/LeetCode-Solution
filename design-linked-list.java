class MyLinkedList {
       
    private int size;
    private Node head, tail;
    
    private class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = tail = null;
    }
    
    private Node getNode(int index) {
        Node p = head;
        for (int i = 0; i < index; ++i) p = p.next;
        return p;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        return getNode(index).val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val, head);
        if (size == 0) head = tail = node; 
        else head = node;
        ++size;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (size == 0) head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        ++size;    
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) addAtHead(val);
        else if (index == size) addAtTail(val);
        else {
            Node p = getNode(index - 1);
            Node node = new Node(val, p.next);
            p.next = node;
            ++size;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (size == 1) {
            head = tail = null;
        }
        else if (index == 0) {
            head = head.next;
        }
        else {
           Node p = getNode(index - 1);
           p.next = p.next.next;
           if (index == size-1) tail = p; 
        }
        --size;
   }
}
