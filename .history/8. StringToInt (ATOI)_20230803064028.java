class Solution {
    public int myAtoi(String s) {
        char[] test = s.toCharArray();
        int start = 0;
        long result = 0;
        int neg = 1;

        if (test.length == 0) {
            return 0;
        }

        while (test[start] == ' ') {
            start++;
            if (start == test.length) {
                return 0;
            }
        }

        if (test[start] == '+') {
            start++;
        } else if (test[start] == '-') {
            neg = -1;
            start++;
        }

        for (int i = start; i < test.length; i++) {
            if (test[i] < '0' || test[i] > '9') {
                break;
            }
            if (test[i] >= '0' && test[i] <= '9') {
                result = ((result * 10) + (test[i] - '0'));
            }

            if (neg * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        result = result * neg;
        return (int) result;
    }
}