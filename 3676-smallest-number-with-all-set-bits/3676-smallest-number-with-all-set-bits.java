class Solution {
    public int smallestNumber(int n) {
        double out = 1;
        double i=1;
        while((int) out <= n){
            out = Math.pow(2,i);
            i++;
        }
        return (int) out - 1;
    }
}