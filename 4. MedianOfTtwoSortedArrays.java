class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // swaps arrays to find shortest array
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        // setup numbers for binary search
        int low = 0;
        int high = nums1.length;

        // gets combined length
        int combLength = nums1.length + nums2.length;

        while (low <= high) {
            // gets partitions using binary search
            int partX = (low + high) / 2;
            int partY = (combLength + 1) / 2 - partX;

            // get elements to the left and right of first partition
            int LeftX = getMax(nums1, partX);
            int RightX = getMin(nums1, partX);

            // get elements to the left and right of second partition
            int LeftY = getMax(nums2, partY);
            int RightY = getMin(nums2, partY);

            if (LeftX <= RightY && LeftY <= RightX) {
                // checks to see if comblength is an even or odd number
                if (combLength % 2 == 0) {
                    return (Math.max(LeftX, LeftY) + Math.min(RightX, RightY)) / 2.0;
                }
                return Math.max(LeftX, LeftY);
            }

            if (LeftX > RightY) {
                high = partX - 1;
            } else {
                low = partX + 1;
            }
        }
        return -1;
    }

    private int getMax(int[] nums, int part) {
        if (part == 0) {
            return (int) Double.NEGATIVE_INFINITY;
        } else {
            return nums[part - 1];
        }
    }

    private int getMin(int[] nums, int part) {
        if (part == nums.length) {
            return (int) Double.POSITIVE_INFINITY;
        } else {
            return nums[part];
        }
    }
}