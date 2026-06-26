class Solution {
    public boolean isPalindrome(String s) {
        String converted = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (converted.isEmpty()) { return true;}

        for (int i = 0; i < converted.length() / 2; i++) {
            char left  = converted.charAt(i);
            char right = converted.charAt(converted.length() - i - 1);

            if (left != right) { return false;}
        }
        return true;
    }
}
