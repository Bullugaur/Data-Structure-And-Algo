public class BuySell {

    public static void find(int price[]) {
        int buystock = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buystock < price[i]) {// profit

                int profit = price[i] - buystock;// today's profit

                MaxProfit = Math.max(MaxProfit, profit);

            } else {
                buystock = price[i];
                
            }
        }
        System.out.println("if you buy on " + buystock + " then you have profit of " + MaxProfit);
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        find(price);
    }
}
