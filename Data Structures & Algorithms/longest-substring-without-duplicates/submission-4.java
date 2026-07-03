class Solution {
    public int lengthOfLongestSubstring(String s) {
        // You're comparing everything to the first character, 
        // but the longest substring can start anywhere.
        // Think in terms of a sliding window with a left and right pointer, 
        // and track which characters are currently in the window.
        if (s == null) {
            return -1;
        }
        int left = 0;
        int longest = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
