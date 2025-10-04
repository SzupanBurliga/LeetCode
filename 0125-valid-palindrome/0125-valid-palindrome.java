class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]+", "");
        t = t.toLowerCase();
        int temp = 0;
        for(int i=t.length() -1; i > 0; i--){
            if(t.charAt(i) != t.charAt(temp)) return false;
            temp++;
        }
        
        return true;
    }
    
}