package order;

public class OrderReceiver {
	//private Order order;

    public void receiveOrder(Order order){
    	//this.order = order;
    	MostFavoredCustomerOrderHandler mostFavoredCustomerOrderHandler = new MostFavoredCustomerOrderHandler();
		LargeOrderHandler largeOrderHandler = new LargeOrderHandler();
		InternationalOrderHandler internationalOrderHandler = new InternationalOrderHandler();
		DomesticOrderHandler domesticOrderHandler = new DomesticOrderHandler();
		
		mostFavoredCustomerOrderHandler.setNextHandler(largeOrderHandler);
		largeOrderHandler.setNextHandler(internationalOrderHandler);
		internationalOrderHandler.setNextHandler(domesticOrderHandler);
		mostFavoredCustomerOrderHandler.addMostFavoredCustomer("Julia");
		
		mostFavoredCustomerOrderHandler.handleOrder(order);
    }
}
