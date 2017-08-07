package order;

import java.util.ArrayList;
import java.util.Collection;

public class MostFavoredCustomerOrderHandler extends OrderHandler{
    private Collection<Customer> customerlist = new ArrayList<Customer>();
    
	public MostFavoredCustomerOrderHandler(OrderHandler nexthandler) {
		super(nexthandler);
		customerlist.add(new Customer("Frank Brown"));
		customerlist.add(new Customer("John Doe"));
	}

	public void handleOrder(Order order) {
		boolean found = false;
		for (Customer cust : customerlist){
		   if (order.getCustomer().getName().equals(cust.getName())){
			   found=true;
			   System.out.println("MostFavoredCustomerOrderHandler handles order "+order.getOrderNumber());
		   }
		}
		if (!found)
			nexthandler.handleOrder(order);
	}

}
