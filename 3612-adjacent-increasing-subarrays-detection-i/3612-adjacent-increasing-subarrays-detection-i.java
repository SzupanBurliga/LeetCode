class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int prev = 0;
        int count = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i-1) < nums.get(i)) count++;
            else {
                prev = count;
                count = 1;
            }

            if (count / 2 >= k || prev / 2 >= k || Math.min(prev, count) >= k) 
                return true;
        }
        return false;
    }
}