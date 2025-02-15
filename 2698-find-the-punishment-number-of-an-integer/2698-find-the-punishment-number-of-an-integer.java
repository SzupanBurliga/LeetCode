class Solution {
    public int punishmentNumber(int n) {
        int sum =0;
        for(int i=1; i <= n ; i++){
            int square = i*i;
            if(partSquare(square,i)) sum += square;
        }
        return sum;
    }
    public boolean partSquare(int num, int target){
        if(num < target || target < 0) return false;
        if(num == target) return true;

        return(partSquare(num/10, target - (num%10)) || partSquare(num/100, target - (num%100)) || partSquare(num/1000, target - (num%1000)));
    }
}