class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(nums[i])==false) {
                hashmap.put(nums[i], i);
            } else {
                return true;
            }
        }   
        return false;  
    }
}