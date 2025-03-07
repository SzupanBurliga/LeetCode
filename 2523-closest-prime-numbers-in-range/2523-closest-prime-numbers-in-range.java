import java.util.*;

class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] check = new boolean[right + 1];
        Arrays.fill(check, true);
        check[0] = false;
        if (right >= 1) check[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (check[i]) {
                for (int j = i * i; j <= right; j += i) {
                    check[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = Math.max(left, 2); i <= right; i++) {
            if (check[i]) {
                primes.add(i);
            }
        }

        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int[] out = new int[]{-1, -1};
        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                out[0] = primes.get(i - 1);
                out[1] = primes.get(i);
            }
        }

        return out;
    }
}
