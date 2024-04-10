class Solution {
    public int lengthOfLastWord(String s) {
        int maxLen =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(s.length()-i-1) != ' '){
                maxLen++;
            }else if(maxLen>0 && s.charAt(s.length()-i-1) ==' '){
                return maxLen; 
            }
            
        }
        return maxLen;    
        
    }
}