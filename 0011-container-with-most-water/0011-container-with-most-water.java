class Solution {
    public int maxArea(int[] height) {
        // 2 pointer 
        int left = 0;
        int right = height.length - 1;
        int maxSum = 0;
        while(left < right){
            int temp = Math.min(height[left], height[right]) * (right - left);
            maxSum = Math.max(maxSum,temp);
            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxSum;
    }
}