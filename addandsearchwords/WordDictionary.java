package addandsearchwords;

public class WordDictionary {
    private final Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
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

        return match(word, root,0);
    }

    private boolean match(String word, Node node, int index) {
        for (int idx = index; idx < word.length(); idx++) {
            char c = word.charAt(idx);
            if (c == '.') {
                for (Node child : node.children) {
                    if (child != null && match(word, child, idx + 1)) {
                        return true;
                    }
                }

                return false;
            } else {
                node = node.getChildNode(c);

                if (node == null) {
                    return false;
                }
            }
        }
        return node.endOfWord;
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
