class Solution {
    public boolean isAnagram(String s, String t) {

               
        
        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        Map<Character, Integer> hm1 = new HashMap<>();

        if (s1.length() != t1.length()) {
            return false;
        }         

        for (char ch : s1.toCharArray()) {
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t1.toCharArray()) {
            if (!hm1.containsKey(ch)) {
                return false;
            }

            int updatedCount = hm1.get(ch) -1;

            if (updatedCount < 0) {
                return false;
            }

            hm1.put(ch, updatedCount);
        }
        return true;
    }
}
