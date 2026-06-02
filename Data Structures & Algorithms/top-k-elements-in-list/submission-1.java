class Solution {
   public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert keys to list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort frequency in descending order
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Take top k element
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
