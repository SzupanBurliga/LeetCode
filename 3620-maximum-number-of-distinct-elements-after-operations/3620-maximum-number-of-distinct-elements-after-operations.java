import java.util.Arrays;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int out = 0;
        int last = Integer.MIN_VALUE; 

        for (int x : nums) {
            int y = Math.max(x - k, last + 1);
            if (y <= x + k) {
                last = y;
                out++;
            }
        }
        return out;
    }
}