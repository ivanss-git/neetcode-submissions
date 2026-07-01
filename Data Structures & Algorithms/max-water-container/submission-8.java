class Solution {
    public int maxArea(int[] heights) {
        // implementation for the naive solution
        int result = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int containerHeight = Math.min(heights[i], heights[j]);
                int area = containerHeight * width;
                result = Math.max(result, area);
            }
        }
        return result;
        
    }
}
