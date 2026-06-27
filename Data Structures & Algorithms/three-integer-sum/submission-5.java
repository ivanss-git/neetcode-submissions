class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    r--;
                    l++;
                }
                else if(sum>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}

