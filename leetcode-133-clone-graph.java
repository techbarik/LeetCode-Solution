class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // **new node to return
        // MUST BE DEFINED OUTSIDE SO THAT IT CAN BE RETURNED
        Node newNode = new Node(node.val, new ArrayList<>());
        // store visited nodes
        // key is the ORIGINAL node, value is the NEW node
        HashMap<Node, Node> map = new HashMap();
        // add starting node to HashMap
        map.put(node, newNode);

        // store ORIGINAL nodes to be visited in a queue
        Queue<Node> queue = new LinkedList();
        // add the start node to the queue
        queue.add(node);
        //if more nodes need to be visited
        while (!queue.isEmpty()) {
            //search neighbors of top node in the queue
            Node polledOrigNode = queue.poll();

            for (Node origNeighbor : polledOrigNode.neighbors) {
                // if the map does not contain the neighbor that means
                // the node needs to be cloned and added to map
                // check if map contains 2 then 3
                if (!map.containsKey(origNeighbor)) {
                    // if map does not contain 2 or 3 create a clone 2c, 3c
                    Node newNeighborNode = new Node(origNeighbor.val, new ArrayList<>());
                    map.put(origNeighbor, newNeighborNode);
                    // add 2,3 to queue
                    queue.add(origNeighbor);
                }
                // get the cloned node of the original node
                // add the new neighbor to the cloned nodes neighbor list
                map.get(polledOrigNode).neighbors.add(map.get(origNeighbor));
            }
        }

        return newNode;
    }
}
