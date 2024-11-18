class Solution {
    public String mergeAlternately(String word1, String word2) {
        String out = "";
        int n = word1.length() + word2.length();
        int x = word1.length();
        int y = word2.length();
        for(int i=0; i<n; i++){
            if(x>0){
                out += word1.charAt(i);
                x--;
            }
            if(y>0){
                out += word2.charAt(i);
                y--;
            }
        }

        return out;
    }   
}