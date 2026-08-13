class Solution {
    public boolean isPalindrome(String s) {
        String converted = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left  = 0;
        int right = converted.length() - 1;

        while (left < right) {
            if (converted.charAt(left) != converted.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;   
    }
}

