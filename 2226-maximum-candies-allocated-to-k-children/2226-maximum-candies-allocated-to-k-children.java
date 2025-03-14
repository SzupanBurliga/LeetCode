class Solution {
    public int maximumCandies(int[] candies, long k) {
        long left = 1;
        long rigth = 0;
        for(int x: candies)
            rigth = Math.max(rigth, x);

        while(left <= rigth){
            long mid = left + (rigth - left)/2;
            long cntr = 0;
            for(int x: candies)
                cntr += x/mid;
                if(cntr >= k){
                    left = mid + 1;
                }else{
                    rigth = mid -1;
                }
        }
        left--;
        return (int) left;
    }
}
