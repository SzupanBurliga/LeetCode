class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int num = x;
        boolean ex = false;
        if(x > 0){
            while(x != 0){
                int rem = x%10;
                rev = rev * 10 + rem;
                x = x/10;
             }
        }
        if(rev == num){
            ex = true;
        }
        return ex;
    }
}