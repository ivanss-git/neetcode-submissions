class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Sorting helps to easily skip duplicate triplets
        Arrays.sort(nums);
        
        // Three nested loops to find every possible triplet combination
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate values for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < nums.length; j++) {
                // Skip duplicate values for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                for (int k = j + 1; k < nums.length; k++) {
                    // Skip duplicate values for the third number
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;
                    
                    // Check if the combination sums to zero
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;
    }
}