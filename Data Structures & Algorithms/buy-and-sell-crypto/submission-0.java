class Solution {
    public int maxProfit(int[] prices) {
        //left → meilleur jour pour acheter (prix minimum trouvé)
        //right(i) → jour actuel où on regarde la vente
        int best=0;
        int Left=0;

       for (int i=1;i<prices.length;i++)  {


            if(prices[i]<prices[Left]){
                Left=i;
                continue;
            }
            if(prices[i]-prices[Left]>best){
                best=prices[i]-prices[Left];
            }

       }
        return best;
    }
}
