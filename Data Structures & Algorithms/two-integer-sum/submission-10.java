class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a standard map to dynamically handle any large number without collisions
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists, we are guaranteed an instant, accurate match
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store the value and its index
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
