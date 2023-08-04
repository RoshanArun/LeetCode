class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String word = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(word) != 0) {
                word = word.substring(0, word.length() - 1);
            }
        }
        return word;
    }
}