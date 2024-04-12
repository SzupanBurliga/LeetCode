class Solution {
    public int hammingWeight(int n) {
        int count =0;
        String numToBinary = Integer.toBinaryString(n);
        for(int i=0; i<numToBinary.length();i++){
            if(numToBinary.charAt(i) =='1'){
                count++;
            }
        }
        return count;
    }
}