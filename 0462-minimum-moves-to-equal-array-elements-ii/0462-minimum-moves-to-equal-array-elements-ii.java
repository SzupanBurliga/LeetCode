class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = 0;
        if(n % 2 == 0){
            median = (nums[n/2] + nums[(n-1)/2])/2;
        }else{
            median = nums[n/2];
        }
        int ans = 0;

        for(int x: nums){
            ans += Math.abs(x-median);
        }  
        return ans;
    }
}