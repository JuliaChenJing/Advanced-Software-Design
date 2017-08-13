package order;

import java.util.ArrayList;
import java.util.List;

public class MostFavoredCustomerOrderHandler extends OrderHandler{
	private List<String> name = new ArrayList<>();

	@Override
	public void handleOrder(Order order) {
		
		if (name.contains(order.getCustomer().getName())) {
			System.out.println("this order is handled by MostFavoredCustomerOrderHandler");
		}
		else{
			if (this.nextHandler != null) {
				this.nextHandler.handleOrder(order);
			}
		}
	}
	
	public void addMostFavoredCustomer(String str)
	{
		name.add(str);
	}

}
