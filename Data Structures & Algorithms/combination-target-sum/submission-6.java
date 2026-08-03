class Solution {

    List<List<Integer>> list = new ArrayList<>();
    int[] nums;

    public void backtrack(int index, int remain, List<Integer> current) {

        if (remain == 0) {
            list.add(new ArrayList<>(current));
            return;
        }
        if (remain < 0 || index == nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            backtrack(i, remain - nums[i], current);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        list.clear();
        this.nums = nums;
        List<Integer> current = new ArrayList<>();
        backtrack(0, target, current);
        return list;
    }
}
