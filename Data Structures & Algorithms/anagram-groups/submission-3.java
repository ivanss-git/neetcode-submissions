class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Big O(m*n) is bilinear time complexity 
        // execution time depends on product of two indep. input vars 
        HashMap<String, List<String>> hashmap = new HashMap<>();
        for (String s: strs) {
            // 1. convert string to char array and sort it
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            // 2. create the uniform key
            String key = new String(chars);

            // 3. put the key in map (initialize if it doesnt exist)
            if (!hashmap.containsKey(key)) {
                hashmap.putIfAbsent(key, new ArrayList<>());
            }
            hashmap.get(key).add(s);
        }
        return new ArrayList<>(hashmap.values());
    }
}
