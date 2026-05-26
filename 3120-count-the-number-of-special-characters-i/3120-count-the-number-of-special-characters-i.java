class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        int cnt = 0;
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lower[c - 'a'] = true;
            } else if (c >= 'A' && c <= 'Z') {
                upper[c - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (lower[i] == true && upper[i] == true) {
                cnt++;
            }
        }
        
        return cnt;
    }
}