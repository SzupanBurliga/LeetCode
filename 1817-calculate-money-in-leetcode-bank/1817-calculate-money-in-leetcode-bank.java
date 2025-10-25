class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int temp = 1; 
        for(int i = 1; i <= n; i++){
            if(i != 1 && i % 7 == 1){
                temp -= 6; 
            }
            sum += temp;
            temp++;
        }
        return sum;
    }
}