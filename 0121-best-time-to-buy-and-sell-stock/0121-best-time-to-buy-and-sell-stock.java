// class Solution {
//     public int maxProfit(int[] prices) {
//         int max = 0;
//         int n=prices.length;
//         int l
//         // for(int i=0;i<n;i++){
//         //     for(int j=i+1;j<n;j++){
//         //         int profit = prices[j]-prices[i];
//         //         if(profit>max){
//         //             max=profit;
//         //         }
//         //     }
//         // }

//         // while(l<r){

//         // }
//         // return max;

        
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}