class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        int empt=numBottles;
        while(empt>=numExchange){
            res+=(empt/numExchange);
            empt=(empt/numExchange)+(empt%numExchange);
        }
        return res;
    }
}