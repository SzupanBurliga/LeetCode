class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean isFound = true;
        int num  = original;
        ArrayList<Integer> list = new ArrayList<>();
        for(int x: nums){
            list.add(x);
        }
        while(isFound){
            if(list.contains(num)){
                num = num * 2;
            }else{
                break;
            }
        }
        return num;
    }
}