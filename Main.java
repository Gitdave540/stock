
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // erstellen einen Stock-Objekt
        Stock aapl = new Stock("AAPL",
                "Apple Inc.",
                new BigDecimal("150.00"),
                Exchange.NASDAQ,
                Currency.USD);
        Stock basf = new Stock("BASF",
                "Basf Germany",
                new BigDecimal(45.21),
                Exchange.TSX,
                Currency.EUR);

        //erstellen eine StockPosition
        StockPosition applePosition = new StockPosition(aapl, 100, new BigDecimal(151.45));
        StockPosition basfPosition = new StockPosition(basf, 20, new BigDecimal(45.12));
        StockPosition apple1Position = new StockPosition(aapl, 100, new BigDecimal(151.45));

        // Create a list of StockPosition objects
        List<StockPosition> stockPositions = new ArrayList<>();
        stockPositions.add(applePosition);
        stockPositions.add(basfPosition);
        stockPositions.add(apple1Position);

        //erstellen eines Portfolios
        Portfolio myPortfolio = new Portfolio("Teck Portfolio", 2022,stockPositions);

        System.out.println("Portfolio Name: " + myPortfolio.getName());
        System.out.println("Initial Year: " + myPortfolio.getInitialYear());
        System.out.println("Stocks in Portfolio:");

        // for loop für die Ausgabe der einzelnen positionen
        for (StockPosition stockPosition : stockPositions) {
            System.out.println(stockPosition);
        }

    }

}