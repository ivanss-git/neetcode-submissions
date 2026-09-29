class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return 0;
        }

        int candidate = nums[0];
        int count = 0;
        int i = 0;

        while ( i < nums.length) {
            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            i++;
        }
        return candidate;
    }
}