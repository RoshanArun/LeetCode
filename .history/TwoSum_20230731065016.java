import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap <Integer, Integer> Solution = new Hashmap <Integer, Integer>();
        // Brute Force Method
        //// int[] result = new int[2];
        // for(int i = 0; i < nums.length; i++){
        // for(int j = i + 1; j < nums.length; j++){
        // if(nums[i] + nums[j] == target){
        // return new int[] {i, j}
        //// result[0] = i;
        //// result[1] = j;
        //// return result;
        // }
        // }
        // }
        // return result;

        // Hashmap Method
        HashMap<Integer, Integer> Solution = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            // gives the complement of number in array
            int reqNum = target - nums[i];
            // gets index of the required num
            Integer index = Solution.get(reqNum);
            if (Solution.containsKey(reqNum)) {
                return new int[] { i, index };
            }
            Solution.put((nums[i]), i);
        }
        return new int[] {};
    }
}