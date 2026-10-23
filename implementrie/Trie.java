package implementrie;

public class Trie {
    private final Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }
        Node currentNode = root;
        for (char c : word.toCharArray()) {
            Node childNode = currentNode.getChildNode(c);

            if (childNode == null) {
                childNode = new Node();
                currentNode.addChildNode(c, childNode);
            }

            currentNode = childNode;
        }

        currentNode.endOfWord = true;
    }

    public boolean search(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        Node node = getNodeLast(word);
        if (node == null) return false;

        return node.endOfWord;
    }

    private Node getNodeLast(String word) {
        Node node = root;
        for (char c : word.toCharArray()) {
            node = node.getChildNode(c);

            if (node == null) {
                return null;
            }
        }
        return node;
    }

    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return false;
        }

        Node node = getNodeLast(prefix);

        return node != null;
    }

    private static class Node {
        private static final char CHAR = 'a';
        private final Node[] children = new Node[26];
        private boolean endOfWord;

        private Node getChildNode(char letter) {
            return this.children[letter - CHAR];
        }

        private void addChildNode(char letter, Node node) {
            this.children[letter - CHAR] = node;
        }

    }
}
