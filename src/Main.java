import com.am.Stock;

import java.util.ArrayList;

/**
 * Created by localadmin on 7/28/16.
 */
public class Main {
    public static void main (String[] args){
        Stock s1 = new Stock("AAPL", 103f, 100);
        Stock s2 = new Stock("AAL", 68f, 50);
        Stock s3 = new Stock("TSLA", 227.5f, 25);
        ArrayList<Stock> portfolio = new ArrayList<>();
        portfolio.add(s1);
        portfolio.add(s2);
        portfolio.add(s3);
        Float[] amounts = portfolio.stream().map(stock -> stock.getSharesOwned() * stock.getPrice()).toArray(size -> new Float[size]);
        Stock[] stocks2 = portfolio.stream().filter(stock -> stock.getStockSymbol() == "AAL").toArray(Stock[]::new);
        float position = portfolio.stream().parallel().reduce(0f, (acc, stock) -> {
            System.out.println("stock: " + stock);
            return acc + (stock.getPrice() * stock.getSharesOwned());
        }, (total, value) -> {
            System.out.println("total " + total + " value: " + value);
            return total + value;
        });
    }
}
