class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int pnt = 0;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        for(int i=0; i<str1.length(); i++){
            if(pnt == str2.length())return true;
            int temp = s1[i] - 'a';
            int x = s2[pnt] - 'a';
            if(temp == x || (temp+1)%26 == x)pnt++;
        }
        return pnt == str2.length();
    }
}