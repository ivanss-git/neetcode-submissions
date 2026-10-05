class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       // Base case: if k is 0 or array has less than 2 elements, no pair can exist
        if (nums == null || nums.length <= 1 || k <= 0) {
            return false;
        }

        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the window, we found a duplicate within distance k
            if (window.contains(nums[i])) {
                return true;
            }

            // Add the current element to the window
            window.add(nums[i]);

            // If the window size exceeds k, remove the oldest element
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;  
    }
}