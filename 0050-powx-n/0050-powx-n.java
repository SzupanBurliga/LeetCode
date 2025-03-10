class Solution {
    public double myPow(double x, int n) {
       
        if(n == 0) return 1;
        if(x == 1) return 1;
        long N = n;
        if(N < 0){ 
            N = -N;
            x = 1/x;
        }
        
        double num = 1;
        
        while(N > 0){
            if(N % 2 == 1){
                num *= x;
            }
            x *= x;
            N = N/2;
        }
        
        return num;
    }
}