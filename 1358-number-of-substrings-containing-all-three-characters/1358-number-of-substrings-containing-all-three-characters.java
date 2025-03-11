class Solution {
    public int numberOfSubstrings(String s) {
        int out = 0, l = 0 , r = 0;
        int n = s.length();
        int[] check = new int[3];
        
        while(r < n){
            check[s.charAt(r) - 'a']++;
            while(check[0] > 0 && check[1] > 0 && check[2] > 0 ){
                out += n - r;
                check[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        

        return out;
    }
}