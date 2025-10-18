import java.util.Arrays;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        
        Arrays.sort(nums);

        int out = 0;
        int last_y = Integer.MIN_VALUE; 

        for (int x : nums) {
            
            int y = Math.max(x - k, last_y + 1);
            
            if (y <= x + k) {
                last_y = y;
                out++;
            }
        }
        
        return out;
    }
}