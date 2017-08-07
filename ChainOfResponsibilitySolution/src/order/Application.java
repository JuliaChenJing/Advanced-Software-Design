package order;

public class Application {


	public static void main(String[] args) {
		// build the chain
		DomesticOrderHandler domesticOrderHandler = new DomesticOrderHandler(null);
		InternationalOrderHandler internationalOrderHandler = new InternationalOrderHandler(domesticOrderHandler);
		LargeOrderHandler largeOrderHandler = new LargeOrderHandler(internationalOrderHandler);
		MostFavoredCustomerOrderHandler mostFavoredCustomerOrderHandler = new MostFavoredCustomerOrderHandler(largeOrderHandler);
		
		Order order1 = new Order ("1001", 30000, false,new Customer( "Frank Brown"));
		mostFavoredCustomerOrderHandler.handleOrder(order1);

		Order order2 = new Order ("1002", 30000, true,new Customer( "Mary Jones"));
		mostFavoredCustomerOrderHandler.handleOrder(order2);
		
		Order order3 = new Order ("1003", 300000, false,new Customer( "Frank Johnson"));
		mostFavoredCustomerOrderHandler.handleOrder(order3);
	}

}
