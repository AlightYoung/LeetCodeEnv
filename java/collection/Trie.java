package collection;

class Trie {

    Trie[] children;
    boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie node = this;
        char[] arr = word.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            char ch = arr[i];
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    public Trie searchPrefix(String prefix) {
        Trie node = this;
        char[] arr = prefix.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            char ch = arr[i];
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

    public static void main(String[] args) {
    }

}
