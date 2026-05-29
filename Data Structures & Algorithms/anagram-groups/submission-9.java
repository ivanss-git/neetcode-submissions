class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashmap = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!hashmap.containsKey(key)){
                hashmap.putIfAbsent(key, new ArrayList<>());
            }
            hashmap.get(key).add(s);
        }
        return new ArrayList<>(hashmap.values());
    }
}
