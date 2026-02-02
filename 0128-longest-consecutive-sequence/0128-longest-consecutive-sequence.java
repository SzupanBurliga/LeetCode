class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1)return 0;
        Set<Integer> set = new TreeSet<>();
        int cnt = 1;
        int out = 1;
        for(int x: nums){
            if(!set.contains(x)) set.add(x);
        }
        int temp = Integer.MAX_VALUE;
        for(int x: set){
            if(x == temp + 1){
                cnt++;
            }else{
                cnt = 1;
            }
            temp = x;
            out = Math.max(out,cnt);
        }
        return out;
    }
}
