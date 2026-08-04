class Solution {

    List<List<Integer>> result = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result.clear();
        this.nums = nums;
        List<Integer> current = new ArrayList<>();
        backtrack(0, target, current);
        return result;
    }    

    public void backtrack(int index, int remainingTarget, List<Integer> current) {

        if (remainingTarget == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (remainingTarget < 0 || index == nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(i, remainingTarget - nums[i], current);
            current.remove(current.size() - 1);
        }
    }  
}
