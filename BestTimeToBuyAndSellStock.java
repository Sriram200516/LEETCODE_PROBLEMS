public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bts=new BestTimeToBuyAndSellStock();
        int[] prices={7,1,5,3,6,4};
        int maxProfit=bts.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
    
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else if(price-minPrice>maxProfit){
                maxProfit=price-minPrice;
            }
        }
        return maxProfit;
    }
    
}
