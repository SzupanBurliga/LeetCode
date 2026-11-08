class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            boolean isValid = true;
            for(int j=arr2.length - 1;j >=0 ;j--){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                ans++;
            }
        }
        return ans;
    }
}