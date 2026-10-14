class Solution {
    public int maxDepth(String s) {
        int counter = 0;
        int temp = 0;
        for (char c : s.toCharArray()){
            if(c == '('){
                temp++;
            }
            counter = Math.max(temp,counter);
            if(c == ')'){
                temp--;
            }
        }
        return counter;
    }
}