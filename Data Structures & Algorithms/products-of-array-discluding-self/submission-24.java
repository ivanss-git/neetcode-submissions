
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int rightSum = 1;
        for (int i = (nums.length -1); i >= 0; i--) {
            output[i] = rightSum;
            rightSum *= nums[i];
        }

        int leftSum = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= leftSum;
            leftSum *= nums[i];
        }
    
        return output;
    }
}  
