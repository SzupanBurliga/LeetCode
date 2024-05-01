class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        char[] test = word.toCharArray();
        String newStr ="";
        for(int i=0; i<=index; i++){
            test[i] = word.charAt(index-i);
        }
        for(int i=0; i<word.length() ;i++){
            newStr += test[i];
        }
        return newStr;
    }
}