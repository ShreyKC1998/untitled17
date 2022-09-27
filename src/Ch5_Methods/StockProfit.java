package Ch5_Methods;

public class StockProfit {
    public static void main(String[] args) {
        /**
         * NS - Number of Shares
         * PP - Purchase per price share
         * PC - Purchase Commission
         * SP - Sale Price per share
         * SC - Sale Commission paid
         * Profit = ((NS * SP)-SC)-((NS*PP)+PC)
         * Example:
         * 100 purchase Shares(NS) @ $15(PP) = $1500
         * Purchase commission(PC) = $7
         * Purchase total = $1507
         * Sale price per share is $20
         * 100 shares at $20 = $2000
         * Minus commision of $7
         * Equals $1993
         * Subtract Sell total minus Buy total and the profit should be $486.00
         */
        System.out.println(profitLoss(100,15,7,10,7));
    }

    public static double profitLoss(double ns,
                                    double pp,
                                    double pc,
                                    double sp,
                                    double sc){
        double profitorLoss;

        profitorLoss = ((ns*sp)-sc)-((ns*pp)+pc);
        return profitorLoss;
    }
}
