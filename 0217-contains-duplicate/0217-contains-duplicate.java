class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ifDuplicate = false;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int singleNum : nums){
            if(hashMap.containsKey(singleNum)){
                ifDuplicate = true;
                break;
            }
            else{
                hashMap.put(singleNum,1);
            }
        }

        return ifDuplicate;
    }
}