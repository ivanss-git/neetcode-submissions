class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int end = nums.length - 1;

        while (left < end) {
            int middle = left + (end - left) / 2;

            if (nums[middle] > nums[end]) {
                left = middle + 1;
            }else {
                end = middle;
            }
        }
        return nums[left];
    }
}
