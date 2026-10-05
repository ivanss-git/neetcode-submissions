class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }

        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];

        // Count frequencies for s1 and the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']++;
        }

        // Slide the window across s2
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Counts, s2Counts)) {
                return true;
            }
            // Move window: remove old character, add new character
            s2Counts[s2.charAt(i) - 'a']--;
            s2Counts[s2.charAt(i + s1.length()) - 'a']++;
        }

        // Check the very last window
        return matches(s1Counts, s2Counts);
    }

    // Helper method to compare frequency arrays
    private boolean matches(int[] s1Counts, int[] s2Counts) {
        for (int i = 0; i < 26; i++) {
            if (s1Counts[i] != s2Counts[i]) {
                return false;
            }
        }
        return true;
    }
}
