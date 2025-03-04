class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] out = new int[n];
        List<Integer> before = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> after = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i] > pivot){
                after.add(nums[i]);
            }else if(nums[i] == pivot){
                equal.add(nums[i]);
            }else{
                before.add(nums[i]);
            }
        }
        before.addAll(equal);
        before.addAll(after);
        int i = 0;
        for(int x: before){
            out[i] = x;
            i++;
        }
        return out;
    }
}