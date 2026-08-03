class WordDictionary {

    private WordDictionary[] children;
    private boolean isEndOfWord;

    private WordDictionary root;

    public WordDictionary() {
        children = new WordDictionary[26];
        isEndOfWord = false;
    }

    public void addWord(String word) {
        WordDictionary curr = this;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.children[i] == null) {
                curr.children[i] = new WordDictionary();
            }
            curr = curr.children[i];
        }
        curr.isEndOfWord = true;
    }

    public boolean search(String word) {
        return match(word, this, 0);
    }

    public boolean match(String word, WordDictionary curr, int index) {
        if (index == word.length()) {
            return curr.isEndOfWord;
        }

        char c = word.charAt(index);

        if (c == '.') {
            for (WordDictionary child : curr.children) {
                if (child != null && match(word, child, index + 1)) {
                    return true;
                }
            }
            return false;
        }
        int i = c - 'a';
        if (curr.children[i] == null) { 
            return false;
        }
        return match(word, curr.children[i], index + 1);
    }
}
