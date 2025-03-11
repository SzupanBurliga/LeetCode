class Solution {
    public boolean isPalindrome(String s) {

        String newstr = s.replaceAll("[^a-zA-Z0-9]", "");
        String lower = newstr.toLowerCase();
        int n = lower.length();
        for(int i=0; i < n/2; i++){
            if(lower.charAt(i) != lower.charAt(n -1 -i)) return false;
        }
        return true;
    }
}