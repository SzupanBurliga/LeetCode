class Solution {

    public int findSmallestInteger(int[] nums, int value) {
        int[] arr = new int[value];
        int mex = 0;

        for (int x : nums) {
            int v = ((x % value) + value) % value;
            arr[v]++;
        }
        
        while (arr[mex % value] > 0) {
            arr[mex % value]--;
            mex++;
        }
        return mex;
    }
}