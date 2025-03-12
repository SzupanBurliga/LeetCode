class Solution {
    public boolean isPowerOfThree(int n) {
        int num = 1;
        
        while(num <= Integer.MAX_VALUE/3){
            if(num == n) return true;
            num *= 3;
        }
        return num == n;
    }
}