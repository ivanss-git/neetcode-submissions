class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }
        
    PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

    for (int num : map.keySet()) {
        heap.add(num);
        if (heap.size() > k) {
            heap.poll();
        }
    }

        int[] topk = new int[k];
        for (int i = k-1; i >= 0; i--) {
            topk[i] = heap.poll();
        }

        return topk;  
    }
}
