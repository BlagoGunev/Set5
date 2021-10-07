package set7.stock;

public class Stock {

    public String symbol;
    public String name;
    private double previousClosingPrice = 1.0;
    private double currentPrice = 1.0;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        double change = currentPrice - previousClosingPrice;

        return change / previousClosingPrice * 100;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }
}
