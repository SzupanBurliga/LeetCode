class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];
        int[] merge = new int[nums.length];
        int j=0;
        int f=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                positive[j] = nums[i];
                j++;
            }
            else{
                negative[f] = nums[i];
                f++;
            }
          
        }
        j=0;
        f=0;
       for(int i=0; i<nums.length; i++){
           if(i%2==0){
            merge[i] = positive[j];
            j++;
           }else{
               merge[i] = negative[f];
               f++;
           }
           
       }

        return merge;
    }
}