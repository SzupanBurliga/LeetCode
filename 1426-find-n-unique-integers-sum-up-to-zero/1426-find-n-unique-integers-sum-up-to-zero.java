class Solution {
    public int[] sumZero(int n) {
       int arr[] = new int[n];
        int num = (-1) * n/2;
        if(n%2 == 0){
            for(int i=0; i<n; i++){
                if(num == 0){
                    num++;
                }
                arr[i] = num++;
            }
        }else{
            for(int i=0; i<n; i++){
                arr[i] = num++;
            }
        }
       return arr;
    }
}