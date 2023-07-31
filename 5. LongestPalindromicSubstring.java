class Solution {
    public String longestPalindrome(String s) {
        int first = 0;
        int last = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = checkMiddle(s, i, i);
            int len2 = checkMiddle(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > last - first) {
                first = i - ((len - 1) / 2);
                last = i + (len / 2);
            }

        }

        return s.substring(first, last + 1);
    }

    private int checkMiddle(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
