
public class StockMarket extends AbstractMarket {
	private StockBuyer buyer = new StockBuyer();
	private StockViewer viewer = new StockViewer();

	public void addStock(String stockSymbol, Double price) {
		stocklist.put(stockSymbol, price);
	}

	public void update(String stockSymbol, Double price) {
		stocklist.put(stockSymbol, price);
		buyer.update(stocklist);
		viewer.update(stocklist);
	}
}