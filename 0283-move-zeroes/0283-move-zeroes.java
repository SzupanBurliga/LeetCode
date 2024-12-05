class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int n = nums.length;
        if(n == 1){
            return;
        }
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index<n){
            nums[index] = 0;
            index++;
        }
        return;
    }
}