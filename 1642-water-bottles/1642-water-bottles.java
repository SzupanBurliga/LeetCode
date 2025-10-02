class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        int empties = numBottles;
        while (empties >= numExchange) {
            int newBottles = empties / numExchange;
            count += newBottles;
            empties = newBottles + (empties % numExchange);
        }
        return count;
    }
}
