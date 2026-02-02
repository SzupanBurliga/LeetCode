import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int out = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int tmp = num;
                int cnt = 1;
                while (set.contains(tmp + 1)) {
                    tmp++;
                    cnt++;
                }
                out = Math.max(out, cnt);
            }
        }
        return out;
    }
}