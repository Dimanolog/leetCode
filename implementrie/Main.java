package implementrie;


public class Main {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("app");
        trie.insert("application");

        trie.search("app");
        trie.startsWith("app");


    }
}
