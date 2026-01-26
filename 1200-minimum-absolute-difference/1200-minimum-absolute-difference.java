class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int diff = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            diff = Math.min(diff,arr[i+1] - arr[i]);
        }
        for(int i=0; i<arr.length-1; i++){
            List<Integer> tempList = new ArrayList<>();
            if(arr[i+1]-arr[i] == diff){
                tempList.add(arr[i]);
                tempList.add(arr[i+1]);
                list.add(tempList);
            }
        }
        return list;
    }
}