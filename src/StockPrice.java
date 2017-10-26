public class StockPrice {
    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
        if (stockPricesYesterday.length < 2) throw new IllegalArgumentException("Need at least 2 prices");
        int base = stockPricesYesterday[0];
        int diff = stockPricesYesterday[1] - stockPricesYesterday[0];
        // loop through all possible bases
        for (int i = 2; i < stockPricesYesterday.length; i++) {
            int potential = stockPricesYesterday[i] - base;
            diff = diff > potential ? diff : potential;
            base = base < stockPricesYesterday[i] ? base : stockPricesYesterday[i];
        }
        System.out.println(diff);
    }
}
