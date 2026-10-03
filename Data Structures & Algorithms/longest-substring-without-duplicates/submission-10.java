class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Tracks the count of characters in the current window (ASCII size 128)
        int[] counts = new int[128];
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Include the current character in the window
            counts[s.charAt(right)]++;

            // If the character is a duplicate, shrink the window from the left 
            // until the count drops back to 1
            while (counts[s.charAt(right)] > 1) {
                counts[s.charAt(left)]--;
                left++;
            }

            // Calculate the valid window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
