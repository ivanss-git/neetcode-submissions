class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t1.toCharArray()) {
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
        }

        return hm1.equals(hm2);
    }
}
