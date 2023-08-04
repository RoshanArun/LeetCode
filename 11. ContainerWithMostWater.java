class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int start = 0;
        int last = height.length - 1;

        while (start < last) {
            if (height[start] < height[last]) {
                max = Math.max(max, height[start] * (last - start));
                start++;
            } else {
                max = Math.max(max, height[last] * (last - start));
                last--;
            }
        }
        return max;
    }
}