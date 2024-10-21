package easy.best_time_to_buy;

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min_price=prices[0];
        for(int i=1; i<prices.length; i++){
            int current_price = prices[i];
            if(current_price - min_price > result){
                result = current_price - min_price;
            }

            if(current_price < min_price){
                min_price = current_price;
            }
        }

        return result;
    }
}
