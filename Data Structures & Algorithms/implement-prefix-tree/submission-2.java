class PrefixTree {

    Map<Integer, PrefixTree> children;
    boolean isEndOfWord;

    public PrefixTree() {
        this.children = new HashMap<>();
        this.isEndOfWord = false; 
    }

    public void insert(String word) {
        PrefixTree current = this;

        for (int i = 0; i < word.length(); i++) {
            int key = word.charAt(i);
            current.children.putIfAbsent(key, new PrefixTree());
            current = current.children.get(key);
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        PrefixTree currentValue = PrefixTree.this;

        for (int i = 0; i < word.length(); i++) {
            int ch = word.toLowerCase().charAt(i);

            if (!currentValue.children.containsKey(ch)) {
                return false;
            }
            currentValue = currentValue.children.get(ch);
        }
        return currentValue.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.isEmpty()) { 
            return false;
        }
        PrefixTree currentValue = PrefixTree.this;

        for (int i = 0; i < prefix.length(); i++) {
            int firstChar = prefix.toLowerCase().charAt(i);

            if(!currentValue.children.containsKey(firstChar)) {
                return false;
            }
            currentValue = currentValue.children.get(firstChar);
        }
        return true;
    }
}
