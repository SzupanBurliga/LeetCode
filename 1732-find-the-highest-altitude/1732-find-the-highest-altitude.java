class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int step =0;
        for(int i: gain){
            step = step + i;
            if(max < step ){
                max = step;
            }
        }
        return max;
    }
}