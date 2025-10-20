class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String xd: operations){
            if(xd.contains("+")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}