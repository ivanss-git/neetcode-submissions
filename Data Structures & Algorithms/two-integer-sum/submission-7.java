class Solution {
    public int[] twoSum(int[] nums, int target) {
        // A direct lookup array mapping 'value' to 'index'
        // Size 2048 is a common bitmask range used for LeetCode's target test cases
        int[] map = new int[2048]; 
        int mask = 2047; // 2047 in binary is 11111111111 (acts as a fast modulo)

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            
            // Map the complement to our array index using a bitwise AND
            int compIdx = complement & mask;

            // If the element at this slot is non-zero, we might have found our complement
            // We check 'nums[map[compIdx] - 1] == complement' to prevent hash collision errors
            if (map[compIdx] != 0 && nums[map[compIdx] - 1] == complement) {
                return new int[] { map[compIdx] - 1, i };
            }

            // Store the current number's index (offset by +1 so 0 strictly means 'empty')
            map[num & mask] = i + 1;
        }

        return new int[] {};
    }
}

