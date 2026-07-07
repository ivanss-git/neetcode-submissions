class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];

        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] <= start) {
                start = nums[i];
            }
        }
        return start;
    }
}
