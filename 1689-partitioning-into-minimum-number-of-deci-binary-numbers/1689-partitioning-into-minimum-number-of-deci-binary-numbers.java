class Solution {
    public int minPartitions(String n) {
        int temp = 48;
        
        for(int i=0; i< n.length() ; i++){
            int num = n.charAt(i);
            if(num > temp){
                temp = num;
            }
        }
        temp = temp -48;
        return temp ;
    }
}