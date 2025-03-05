class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n == 0) return true;
        
        while(n >= 2){
            if(n % 3 == 2){
                return false;
            }else{
                n = n/3;
            }
        }

        return true;
    }
}