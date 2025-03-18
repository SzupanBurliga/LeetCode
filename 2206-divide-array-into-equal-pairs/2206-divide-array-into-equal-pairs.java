class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums)
            map.put(x, map.getOrDefault(x,0) + 1);
            
        for(int x: nums)
            if(map.get(x) % 2 != 0) return false;
        return true;
    }
}                                                                                                                                                                                                            