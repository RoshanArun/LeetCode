class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int spacce = 0;

        if (s.length() == 1) {
            if (s.equals(" ")) {
                return -1; // If the string is a single space, return -1 (no last word)
            }
            return 1; // If the string contains a single non-space character, return 1 (length of the
                      // last word)
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z') {
                length++;
            } else if (s.charAt(i) == ' ') {
                spacce++;
            }

            if (s.charAt(i) == ' ' && i != s.length() - 1 && s.charAt(i + 1) != ' ') {
                return length;
            }
        }

        return s.length() - spacce;
    }
}