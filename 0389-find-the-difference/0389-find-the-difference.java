class Solution {
    public char findTheDifference(String s, String t) {
        int num1 = 0;
        int num2 = 0;
        int lastnum = 0;
        char letter = '0';
        for(int i = 0; i < s.length() ; i++){
            {
                 num1 += (int) s.charAt(i);
            }
        }
        for(int i = 0; i < t.length() ; i++){
            {
                num2 += (int) t.charAt(i);
            }
        }
        if(num1 > num2){
            lastnum = num1-num2;
        }
         if(num2 > num1){
            lastnum = num2-num1;
        }
        letter = (char) lastnum;
        return letter;
    }
}