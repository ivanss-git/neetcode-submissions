class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>((int) (nums.length / .75) + 1);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hashmap.containsKey(complement)) {
                return new int[] {hashmap.get(complement), i};
            } 
            hashmap.put(nums[i], i);
        }
        return new int[] {};
    }
}
