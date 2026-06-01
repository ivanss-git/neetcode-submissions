class Solution {
    public int[] topKFrequent(int[] nums, int k) {
             HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            // if num not in map, gets 0 + 1. Otherwise, gets current count + 1.
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : hm.keySet()) {
            int frequency = hm.get(num);
            buckets[frequency].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int num : buckets[i]) {
                result[index] = num;
                index++;

                if (index == k) {
                    return result;
                }
            }
        }


        return result;

        
    }
}
