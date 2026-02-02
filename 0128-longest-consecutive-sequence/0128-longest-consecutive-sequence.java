import java.util.TreeSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int out = 0;
        int curr = 0;
        Integer prev = null;
        for (int num : set) {
            if (prev != null && num == prev + 1) {
                curr++;
            } else {
                curr = 1; 
            }
            prev = num;
            out = Math.max(out, curr);
        }

        return out;
    }
}