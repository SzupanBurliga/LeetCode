class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int temp =0;
        while(i < j){
            temp = Math.max(temp, (j-i)*Math.min(heights[i], heights[j]));
            if(heights[i] < heights[j]) i++;
            else j--;
        }
        return temp;
    }
}
