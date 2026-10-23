import common.Node;

import java.util.*;

public class Solution {

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Node rootCloneNode = new Node(node.val);

        Deque<Node> nodeDeque = new LinkedList<>();
        nodeDeque.push(node);

        Map<Node, Node> mapVisited = new HashMap<>();
        mapVisited.put(node, rootCloneNode);

        while (!nodeDeque.isEmpty()) {
            Node current = nodeDeque.pop();
            Node cloneCurrent = mapVisited.get(current);

            for (Node neighbor : current.neighbors) {
                if (!mapVisited.containsKey(neighbor)) {
                    mapVisited.put(neighbor, new Node(neighbor.val));
                    nodeDeque.push(neighbor);
                }
                cloneCurrent.neighbors.add(mapVisited.get(neighbor));
            }
        }

        return rootCloneNode;
    }

}
