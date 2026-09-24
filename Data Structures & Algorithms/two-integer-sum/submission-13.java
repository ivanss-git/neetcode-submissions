class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hashmap to store the elements that have been seen
        Map<Integer, Integer> hashmap = new HashMap<>();

        // iterate through the nums array 
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // check if the complement for current iteration has alreasy been seen in the hashmap
            if (hashmap.containsKey(complement)) {
                return new int[] {hashmap.get(complement), i};
            }
            // if not yet seen, add the value into the index of the current iteration
            hashmap.put(nums[i],i);
        }
        // return empty array if none match
        return new int[] {};
        
    }
}
