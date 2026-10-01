class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;

        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        prefixMap.put(0,1);

        for (int num : nums) {
            currentSum += num;

            int targetPrefix = currentSum - k;

            if (prefixMap.containsKey(targetPrefix)) {
                count += prefixMap.get(targetPrefix);
            }

            prefixMap.put(currentSum, prefixMap.getOrDefault(currentSum, 0) + 1);

        }
        return count;
    }
}