class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avr, temp = 0;
        if(nums.length == 1)  avr = nums[0];
         for(int i=0; i<k; i++){
            temp += nums[i];
        } avr = temp/k;  
        for(int i=k; i<nums.length; i++){
            temp += nums[i] - nums[i-k];
                if((temp/k) > avr){
                    avr = temp/k;
                }
        }
        return avr;
    }
}