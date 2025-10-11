import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int x : power) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> uniquePower = new ArrayList<>(map.keySet());
        int n = uniquePower.size();

        if (n == 0) {
            return 0;
        }

        long[] dp = new long[n];
        int first = uniquePower.get(0);
        dp[0] = (long) first * map.get(first);

        for (int i = 1; i < n; i++) {
            int currPow = uniquePower.get(i);
            long currDmg = (long) currPow * map.get(currPow);

            long damageIfNotTake = dp[i - 1];
            long damageIfTake = currDmg;
            
            int k = i - 1;
            while (k >= 0 && uniquePower.get(k) >= currPow - 2) {
                k--;
            }
            
            if (k >= 0) {
                damageIfTake += dp[k];
            }
            
            dp[i] = Math.max(damageIfNotTake, damageIfTake);
        }
        
        return dp[n - 1];
    }
}