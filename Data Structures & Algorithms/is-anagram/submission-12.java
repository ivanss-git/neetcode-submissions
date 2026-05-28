class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashmap1 = new HashMap<>();
        HashMap<Character, Integer> hashmap2 = new HashMap<>();
        // if they are not equal in length, they cannot possibly be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            charCounts[t.charAt(i) - 'a']--;
            int index = t.charAt(i) - 'a';
            if (charCounts[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
