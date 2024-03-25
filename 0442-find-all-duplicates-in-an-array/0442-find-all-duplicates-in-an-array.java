class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> doubleNum = new ArrayList<>();
        HashMap <Integer, Integer> numsMap = new HashMap <>();
        for(int i=0; i < nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                numsMap.put(nums[i],2);
                doubleNum.add(nums[i]);
            }
            else{
                numsMap.put(nums[i],1);
            }
        }
        return doubleNum;
    }
}