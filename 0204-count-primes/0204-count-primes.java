class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n+1];
        int out = 0;
        for(int i=0; i<= n; i++)
                isPrime[i] = true;
        for(int i=2; i*i <= n; i++){
            if(isPrime[i] == true){
                for(int p = i*i; p<=n; p += i){
                    isPrime[p] = false;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(isPrime[i]) out++;
        }
        
        return out;
    }
}