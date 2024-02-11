class Solution {
    public void reverseString(char[] s) {
        int n =0;
        int l = s.length-1;

        while(n <= l){
            char bulb = s[n];
            s[n] = s[l];
            s[l] = bulb;
            n++;
            l--;
        } 
    }
}