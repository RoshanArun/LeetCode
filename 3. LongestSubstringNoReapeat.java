import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash = new HashSet();
        int pointer = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!hash.contains(s.charAt(i))) {
                hash.add(s.charAt(i));
                max = Math.max(hash.size(), max);

            } else {
                hash.remove(s.charAt(pointer));
                pointer++;
                i--;
            }
        }
        return max;
    }
}