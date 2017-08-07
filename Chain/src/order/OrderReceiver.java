package order;

public class OrderReceiver {
	private Order order;

    public void receiveOrder(Order order){
    	this.order = order;
    	MostFavoredCustomerOrderHandler mostFavoredCustomerOrderHandler = new MostFavoredCustomerOrderHandler();
		LargeOrderHandler largeOrderHandler = new LargeOrderHandler();
		InternationalOrderHandler internationalOrderHandler = new InternationalOrderHandler();
		DomesticOrderHandler domesticOrderHandler = new DomesticOrderHandler();
		
		mostFavoredCustomerOrderHandler.setNextLeader(largeOrderHandler);
		largeOrderHandler.setNextLeader(internationalOrderHandler);
		internationalOrderHandler.setNextLeader(domesticOrderHandler);
		
		mostFavoredCustomerOrderHandler.handleOrder(order);
    }
}
