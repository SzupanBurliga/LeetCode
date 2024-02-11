class Solution {
    public int[] runningSum(int[] nums) {
        int num =0;
        int[] ex = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            num += nums[i];
            ex[i] =  num;
        }
        return ex;
    }
}