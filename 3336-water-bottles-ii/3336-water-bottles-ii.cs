public class Solution {
    public int MaxBottlesDrunk(int numBottles, int numExchange) {
        int count = numBottles;      
        int empty = numBottles;      
        while (empty >= numExchange) {
            empty -= numExchange;
            count++;       
            empty++;       
            numExchange++; 
        }
        return count;
    }
}
