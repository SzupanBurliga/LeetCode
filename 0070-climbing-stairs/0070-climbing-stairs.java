class Solution {
    public int climbStairs(int n) {
        int num = 1;
        int num1 = 1 ;
        // fibonacci pattern
        for(int i=0; i < n-1 ; i++){
            int sum = num + num1;
            num = num1;
            num1 = sum;
        }
        return num1;
    }
}