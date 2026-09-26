class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        Map<Character, Integer> hm = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t1.toCharArray()) {
            if (!hm.containsKey(ch)) {
                return false;
            }

            int updatedCount = hm.get(ch) - 1;

            if (updatedCount < 0) {
                return false;
            }

            hm.put(ch, updatedCount);
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }  
            map.get(key).add(s);       
        }   
        return new ArrayList<>(map.values());     
    }
}
