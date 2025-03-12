class Solution {
    public boolean isPowerOfTwo(int n) {
        int num = 1;
        while(num <= n/2){
            if(num == n) return true;
            num *= 2;
        }
        return num == n;
    }
}