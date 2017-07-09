import java.util.Iterator;
import java.util.Map;

public class StockViewer {
	private AbstractMarket stockMarket;

	public void update(Map<String, Double> stocklist) {
		System.out.println("StockViewer: stocklist is changed:");
		Iterator iter = stocklist.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			Double value = (Double) entry.getValue();
			System.out.println("StockViewer" + key + " - $" + value);
		}
	}
}