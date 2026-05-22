class Solution {
    public int[] twoSum(int[] nums, int target) {
        int current_number;
        int complement;
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            current_number = nums[i];
            complement = target - current_number;

            if (hashmap.containsKey(complement)) {
                return new int[] {hashmap.get(complement), i};
            } else {
                hashmap.put(current_number, i);
            }
        }
        return new int[] {};
    }
}
