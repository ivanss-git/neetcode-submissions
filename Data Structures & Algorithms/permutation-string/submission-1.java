class Solution {

    public boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        String one = str1.toLowerCase();
        String two = str2.toLowerCase();

        HashMap<Character, Integer> hm = new HashMap<>();

        if (one.length() != two.length()) {
            return false;
        }

        for (char c : one.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : two.toCharArray()) {
            // check 
            if (!hm.containsKey(c)) {
                return false;
            }
            // update
            int updatedCount = hm.get(c) -1;
            // valid count ?
            if (updatedCount < 0) {
                return false;
            }
            // put updated count
            hm.put(c, updatedCount);
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }

        int len1 = s1.length();
        int len2 = s2.length();

        // Loop through s2 and check every substring window of length s1
        for (int i = 0; i <= len2 - len1; i++) {
            String window = s2.substring(i, i + len1);
            
            // If any window is an anagram of s1, a permutation exists
            if (isAnagram(s1, window)) {
                return true;
            }
        }
        
        return false;
    }
}
