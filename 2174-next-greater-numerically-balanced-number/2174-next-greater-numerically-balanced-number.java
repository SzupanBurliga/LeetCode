class Solution {
    public int nextBeautifulNumber(int n) {
        int i = n + 1;
        while (true) {
            if (calculate(i)) {
                return i;
            }
            i++;
        }
    }
    public boolean calculate(int n) {
        String s = String.valueOf(n);
        int[] freq = new int[10];
        for (char c : s.toCharArray()) {
            freq[c - '0']++;
        }
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (digit == 0 || freq[digit] != digit) {
                return false;
            }
        }
        return true;
    }
}