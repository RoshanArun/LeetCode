class Solution {
    public boolean isPalindrome(int x) {
        int result = 0;

        if (x % 10 == 0 && x != 0) {
            return false;
        }

        while (x > result) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result == x || result / 10 == x;
    }
}