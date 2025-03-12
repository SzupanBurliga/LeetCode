class Solution {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int positive = 0;
        for(int x: nums){
            if(x < 0){
                negative++;
            }
            if(x > 0){
                positive++;
            }
        }
        return Math.max(negative,positive);
    }
}