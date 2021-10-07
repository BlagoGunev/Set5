package set7.stock;

public class StockTests {

    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setCurrentPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.printf("%.2f%n", stock.getChangePercent());

    }

}
