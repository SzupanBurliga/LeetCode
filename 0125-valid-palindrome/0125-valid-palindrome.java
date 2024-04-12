class Solution {
    public boolean isPalindrome(String s) {
        boolean ans = true;
        String newstr = s.replaceAll("[^a-zA-Z0-9]", "");
        String rdystr = newstr.toLowerCase();
        String revstr = new String();
        int len = rdystr.length();
        for(int i=0; i<len;i++){
            revstr += rdystr.charAt(len-1-i);
        }
        for(int i=0; i<len;i++){
            if((int) rdystr.charAt(i) == (int) revstr.charAt(i))
            {   
                ans = true;
            }else{
                ans = false;
                break;
            }            
        }

        return ans;
    }
}