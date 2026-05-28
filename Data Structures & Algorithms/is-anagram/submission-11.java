class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashmap1 = new HashMap<>();
        HashMap<Character, Integer> hashmap2 = new HashMap<>();
        // if they are not equal in length, they cannot possibly be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            hashmap1.put(s.charAt(i), hashmap1.getOrDefault(s.charAt(i), 0) + 1);
            
        }
        for (int j = 0; j < t.length(); j++) {
            hashmap2.put(t.charAt(j), hashmap2.getOrDefault(t.charAt(j), 0) + 1);
        }

        // modify this so that we're not using == since it checks address not value
          if (hashmap1 != null && hashmap2 != null) {
            return hashmap1.equals(hashmap2);
        } 
        return false;
    }
}
