class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        int start = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (currentValue <= start) {
                start = currentValue;
            }
        }
        return start;
    }
}
