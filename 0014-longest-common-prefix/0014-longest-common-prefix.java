class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String key = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(key) != 0){
                key = key.substring(0, key.length() - 1);
            }
        }

        return key;
    }
}