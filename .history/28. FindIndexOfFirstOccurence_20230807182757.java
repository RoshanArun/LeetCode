class Solution {
    public int strStr(String haystack, String needle) {
        int testLength = needle.length();
        int result = 0;

        for(int i = 0; i < haystack.length() - testLength + 1; i++){

            String sub = haystack.substring(i, i + testLength);
            if(sub.equals(needle)){
                return result;
            }
            result++;

        }
        return -1;
    }
}
}
