package order;

import java.util.ArrayList;
import java.util.List;

public class MostFavoredCustomerOrderHandler extends OrderHandler{
	List<String> name = new ArrayList<>();
	@Override
	public void handleOrder(Order order) {
		// TODO Auto-generated method stub
		if (name.contains(order.name)) {
			//handle order
		}
		else{
			if (this.nextHandler != null) {
				this.nextHandler.handleOrder(order);
			}
		}
	}

}
