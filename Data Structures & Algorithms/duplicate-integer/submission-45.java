class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])!=true) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }   
        return false;  
    }
}