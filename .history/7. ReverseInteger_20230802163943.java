class Solution {
    public int reverse(int x) {
        int end = 0;

        while (x != 0) {
            int lastnum = x % 10;
            x = x / 10;

            if (end > Integer.MAX_VALUE / 10 || (end == Integer.MAX_VALUE / 10 && lastnum > 7))
                return 0;
            if (end < Integer.MIN_VALUE / 10 || (end == Integer.MIN_VALUE / 10 && lastnum < -8))
                return 0;
            end = end * 10 + lastnum;
        }
        return end;
    }
}