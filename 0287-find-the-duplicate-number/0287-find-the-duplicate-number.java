class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer,Integer> hashMap = new HashMap<>();
        int duplicateNum = 0;
        for(int i=0; i< nums.length ; i++){
            if(hashMap.containsKey(nums[i])){
                duplicateNum = nums[i];
                return duplicateNum;
            }
            else{
                hashMap.put(nums[i],1);
            }
        }
        return duplicateNum;
    }
}