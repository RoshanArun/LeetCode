class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int mid = 0;
        int end = x;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid == x) {
                return mid;
            } else if ((long) mid * (long) mid > (long) x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}